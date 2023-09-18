package es.uned.scc.grados.appdist.trabajos.ws;

import es.uned.scc.grados.appdist.trabajos.signal.model.data.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * This is a SOAP services interface of the Signal Generator
 */
@WebService
public interface SignalGeneratorWS {
	/**
     * Turn on the signal generator
     * @return: operation info
     */
    @WebMethod
    public OperationInfo start();
    /**
     * Turn off the signal generator
     * @return: operation info
     */
    @WebMethod
    public OperationInfo stop();
    /**
     * Check if the generator is working
     * @return: true if it's running and the otherwise return false
     */
    @WebMethod
    public OperationInfo isRunning();
    /**
     * Get the signal value
     * @return: signal data
     */
    @WebMethod
    public SignalData getSignalValue();
    /**
     * Get the signal parameters
     * @return: signal parameters
     */
    @WebMethod
    public SignalParameters getSignalParameters();
    /**
     * Set the current signal parameters
     * @param signal_parameters
     */
    @WebMethod
    public void setSignalParameters(@WebParam(name = "signal_parameters")SignalParameters signal_parameters);
}
