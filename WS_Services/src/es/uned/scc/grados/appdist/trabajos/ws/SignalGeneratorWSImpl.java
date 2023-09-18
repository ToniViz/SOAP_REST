
package es.uned.scc.grados.appdist.trabajos.ws;

import es.uned.scc.grados.appdist.trabajos.signal.model.SignalGenerator;
import es.uned.scc.grados.appdist.trabajos.signal.model.SignalGeneratorThread;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.OperationInfo;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalData;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalParameters;

import javax.jws.WebService;


/**
 * This class implements the SignalgeneratorWS interface. It's the SOAP Services of the signal generator. Uses Apache CXF libraries
 */
@WebService(endpointInterface = "es.uned.scc.grados.appdist.trabajos.ws.SignalGeneratorWS", serviceName= "SignalGenerator")
public class SignalGeneratorWSImpl implements SignalGeneratorWS {
    
	//Signal generator thread to initialized the signal generator
    private SignalGeneratorThread signalGenerator;
    
    /**
     * SignalGenerator constructor with a only time parameter
     * @param sampleTime
     */
    public SignalGeneratorWSImpl(double sampleTime) {
        signalGenerator = new SignalGeneratorThread(sampleTime);
    }

    
    /**
     * Turn on the signal generator
     * @return: operation info
     */  
    @Override
    public OperationInfo start() {
        
        return signalGenerator.start();
    }
   
    /**
     * Turn off the signal generator
     * @return: operation info
     */
    @Override
    public OperationInfo stop() {
        
        return signalGenerator.stop();
        
    }

    /**
     * Check if the generator is working
     * @return: true if it's running and the otherwise return false
     */
    @Override
    public OperationInfo isRunning() {
        
        return signalGenerator.isThreadRunning();
    }

    /**
     * Get the signal value
     * @return: signal data
     */
    @Override
    public SignalData getSignalValue() {
        SignalData signalData = new SignalData();
        if(signalGenerator.isThreadRunning().isOk()){
            SignalGenerator sGenerator = signalGenerator.getSignalgenerator();
            signalData.setTime(sGenerator.getTime());
            signalData.setOutput(sGenerator.getOutput());
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
    public SignalParameters getSignalParameters() {
        SignalParameters signalParameters = new SignalParameters();
        SignalGenerator sGenerator = signalGenerator.getSignalgenerator();
        signalParameters.setType(sGenerator.getType());
        signalParameters.setFrequency(sGenerator.getFrequency());
        signalParameters.setAmplitude(sGenerator.getAmplitude());
        return signalParameters;
    }

    /**
     * Set the current signal parameters
     * @param signal_parameters
     */
    @Override
    public void setSignalParameters(SignalParameters signal_parameters) {
        SignalGenerator sGenerator = signalGenerator.getSignalgenerator();
        sGenerator.setAmplitude(signal_parameters.getAmplitude());
        sGenerator.setSignalType(signal_parameters.getType());
        sGenerator.setFrequency(signal_parameters.getFrequency());
        
    }
    
    
}
