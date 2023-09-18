package es.uned.scc.grados.appdist.trabajos.ws;

import es.uned.scc.grados.appdist.trabajos.signal.model.data.*;



/**
 * This is a REST services interface of the Signal Generator
 */
public interface RestSignalGenerator {
    /**
     * Turn on the signal generator
     * @return: operation info
     */
    public OperationInfo start();
    /**
     * Turn off the signal generator
     * @return: operation info
     */
    public OperationInfo stop();
    /**
     * Check if the generator is working
     * @return: true if it's running and the otherwise return false
     */
    public OperationInfo isRunning();
    
    /**
     * Get the signal value
     * @return: signal data
     */
    public SignalData getSignalValue();
    /**
     * Get the signal parameters
     * @return: signal parameters
     */
    public SignalParameters getSignalParameters();
    /**
     * Set the current signal parameters
     * @param signal_parameters
     */
    public void setSignalParameters(SignalParameters signal_parameters);
}