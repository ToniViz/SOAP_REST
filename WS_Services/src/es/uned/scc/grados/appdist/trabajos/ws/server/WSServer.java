
package es.uned.scc.grados.appdist.trabajos.ws.server;

import es.uned.scc.grados.appdist.trabajos.ws.SignalGeneratorWSImpl;
import javax.xml.ws.Endpoint;







/**
 * This class initializes the SOAP signal generator services on a local server using apache cxf libraries
 * @author Toni
 */
public class WSServer {
    
    
    /**
     * Main SOAP services method. If there is not parameters, initializes the signal generator with a default value
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        double sampleTime;
        try {
            String sample = args[0];
            sampleTime = Double.parseDouble(sample);
        }catch(Exception ex){
            sampleTime = 0.01;
            ex.printStackTrace();
        }
        
        
        SignalGeneratorWSImpl implementation = new SignalGeneratorWSImpl(sampleTime);
        
        Endpoint.publish("http://localhost:9000/SignalGenerator", implementation);
        
    }
}
