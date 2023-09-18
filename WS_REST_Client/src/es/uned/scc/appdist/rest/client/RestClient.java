/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uned.scc.appdist.rest.client;

import org.apache.cxf.jaxrs.client.WebClient;

import es.uned.scc.grados.appdist.trabajos.plot.ClientPlot;
import es.uned.scc.grados.appdist.trabajos.plot.ClientGUI;
import javax.ws.rs.core.Response;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.*;
import javax.ws.rs.core.Response.StatusType;
import javax.ws.rs.core.MediaType;
/**
 * The class is a REST client of a signal generator. The signal generator sends a wave in which the frequency, amplitude and type can be changed. 
 * @author Toni
 */
public class RestClient implements ClientPlot {
	//Start
    private static final String START = "/SignalGenerator/start";
    //Stop
    private static final String STOP = "/SignalGenerator/stop";
    //Is running
    private static final String ISRUNNING = "/SignalGenerator/isrunning";
    //Get parameters of signal generator
    private static final String GETPARAMS = "/SignalGenerator/getParams";
    //Set parameters
    private static final String SETPARAMS = "/SignalGenerator/setParams";
    //Get values
    private static final String GET = "/SignalGenerator/get";
    //Web Client
    private final WebClient client;
    
    
    /**
     * WebClient constructor to initialize the client on the localhost and port 8080 
     */
    public RestClient() {
        
        this.client = WebClient.create("http://localhost:9000");
    }
    
    /**
     * Initialize the client with its graphical interface
     * @param args
     */
    public static void main(String[] args) {
       RestClient cliente = new RestClient();           
            ClientGUI client = new ClientGUI(cliente);
            client.getFrame().setVisible(true);       
    }
    
    
    /**
     * Start the signal generator 
     * @return: operation info
     */
    @Override
    public boolean start() {
        this.client.replacePath(START);
        this.client.type(MediaType.APPLICATION_XML);
        Response response = this.client.get();
        OperationInfo ope = (OperationInfo)response.readEntity(OperationInfo.class);       
        System.out.println("Respuesta: "+ ope.getMessage());
        return ope.isOk();
    }

    /**
     * Stop the signal generator
     * @return: operation info
     */
    @Override
    public boolean stop() {
        this.client.replacePath(STOP);
        this.client.accept(MediaType.TEXT_XML);
        Response response = this.client.get();
        OperationInfo ope = (OperationInfo)response.readEntity(OperationInfo.class);
        System.out.println("Respuesta: "+ ope.getMessage());
        return ope.isOk();
    }

    /**
     * Returns the current values of the signal generator
     * @return. signal data
     */
    @Override
    public SignalData getSignalValue() {
        this.client.replacePath(GET);
        this.client.accept(MediaType.TEXT_XML);
        Response response = this.client.get();
        SignalData signal = (SignalData)response.readEntity(SignalData.class);
        
        return signal;
        
    }

    /**
     * Returns the signal parameters of the signal generator
     * @return: signal parameters
     */
    @Override
    public SignalParameters getSignalParameters() {
        this.client.replacePath(GETPARAMS);
        this.client.accept(MediaType.TEXT_XML);
        Response response = this.client.get();
        SignalParameters signal = (SignalParameters)response.readEntity(SignalParameters.class);
        
        return signal;
    }

    /**
     * Set the current signal parameters 
     * @param sp
     */
    @Override
    public void setSignalParameters(SignalParameters sp) {
        this.client.replacePath(SETPARAMS);
        this.client.accept(MediaType.TEXT_XML);
        Response response = this.client.post(sp);
        StatusType status = response.getStatusInfo();
        String estado = status.getReasonPhrase();
        System.out.println(estado);
    }
    
    /**
     * Returns a value to know if the signal generator is working
     * @return: true if it's working and the otherwise is false
     */
    public boolean isRunning(){
        this.client.replacePath(ISRUNNING);
        this.client.type(MediaType.APPLICATION_XML);
        Response response = this.client.get();
        OperationInfo op = (OperationInfo)response.readEntity(OperationInfo.class);
        System.out.println("Response: " + op.getMessage());
        return op.isOk();
    }
    
}
