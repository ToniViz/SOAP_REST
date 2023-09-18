
package es.uned.scc.grados.appdist.trabajos.ws;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import es.uned.scc.grados.appdist.trabajos.signal.model.SignalGenerator;
import es.uned.scc.grados.appdist.trabajos.signal.model.SignalGeneratorThread;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.OperationInfo;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalData;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalParameters;


/**
 * This class implements the RestSignalgenerator interface. It's the REST Services of the signal generator. Uses Apache CXF libraries
 */
@Path("SignalGenerator")
public class RESTSignalGeneratorWSImpl implements RestSignalGenerator {
	//Is the only parameter to configure the signal generator
    private static final double TIEMPO = 0.01D;
    //Initialize the signal generator thread
    private static final SignalGeneratorThread signalGenerator = new SignalGeneratorThread(TIEMPO);
    //Signal generator
    private static final SignalGenerator signalG = signalGenerator.getSignalgenerator();
    
     /**
     * Turn on the signal generator
     * @return: operation info
     */       
    @Override
    @Produces({"text/xml"})
    @Path("start")
    @GET
    public OperationInfo start() {
        System.out.println("Arrancando generador....");
        OperationInfo op = signalGenerator.start();
        System.out.println(op.getMessage());
        return op;
    }

    /**
     * Turn off the signal generator
     * @return: operation info
     */
    @Override  
    @Produces({"text/xml"})
    @Path("stop")
    @GET
    public OperationInfo stop() {
        
        System.out.println("Deteniendo generador");
        OperationInfo info = signalGenerator.stop();
        System.out.println(info.getMessage());
        return info;
    }

    /**
     * Check if the generator is working
     * @return: true if it's running and the otherwise return false
     */
    @Override  
    @Produces({"text/xml"})
    @Path("isrunning")
    @GET
    public OperationInfo isRunning() {
        OperationInfo op = signalGenerator.isThreadRunning();
        System.out.println(op.getMessage());
        return op;
    }

    /**
     * Get the signal value
     * @return: signal data
     */
    @Override
    @Produces({"text/xml"})
    @Path("get")
    @GET
    public SignalData getSignalValue() {
        SignalData signalData = new SignalData();
        if(signalGenerator.isThreadRunning().isOk()){
            
            signalData.setTime(signalG.getTime());
            signalData.setOutput(signalG.getOutput());
        }else{
            signalData.setTime(-1.0D);
            signalData.setOutput(0.0D);
        }
        return signalData;
    }

    /**
     * Get the signal parameters
     * @return: signal parameters
     */
    @Override 
    @Produces({"text/xml"})
    @Path("getParams")
    @GET
    public SignalParameters getSignalParameters() {
        SignalParameters signalParameters = new SignalParameters();
        signalParameters.setType(signalG.getType());
        signalParameters.setFrequency(signalG.getFrequency());
        signalParameters.setAmplitude(signalG.getAmplitude());
        return signalParameters;
    }

    /**
     * Set the current signal parameters
     * @param signal_parameters
     */
    @Override
    @Produces({"text/xml"})
    @Path("setParams")
    @POST
    public void setSignalParameters(SignalParameters signal_parameters) {
   
        signalG.setAmplitude(signal_parameters.getAmplitude());
        signalG.setSignalType(signal_parameters.getType());
        signalG.setFrequency(signal_parameters.getFrequency());
        
    }
    
    
}
