package es.uned.scc.grados.appdist.trabajos.ws.soap.gui;

import es.uned.scc.grados.appdist.trabajos.plot.ClientGUI;
import es.uned.scc.grados.appdist.trabajos.plot.ClientPlot;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalData;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalParameters;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.WaveForm;
import es.uned.scc.grados.appdist.trabajos.ws.soap.SignalGeneratorWS;

/**
 * This class is a SOAP client of a signal generator. The signal generator sends a wave in which the frequency, amplitude and type can be changed. 
 */
public class UserGui implements ClientPlot {
	
	//Signal generator 
    SignalGeneratorWS signalGenerator = null;
    //Graphic interface
    ClientGUI client = null;
    
    /**
     * UserGui constructor to receive signals from the signal generator with a graphical interface
     * @param client
     */
    public UserGui(SignalGeneratorWS client) {
        this.signalGenerator = client;
        this.client = new ClientGUI(this);

    }
    
    /**
     * Show the graphical interface of the signal generator
     */
    public void show() {
        this.client.getFrame().setVisible(true);
    }

    /**
     * Start the signal generator
     * @return: true if it's running and the otherwise is false 
     */
    @Override
    public boolean start() {
        boolean boleano = false;
        try {
            boleano = this.signalGenerator.start().isOk();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return boleano;
    }
    
    /**
     * Stop the signal generator
     * @return: true if it's ok and the otherwise is false
     */
    @Override
    public boolean stop() {
        boolean boleano = false;
        try {
            boleano = this.signalGenerator.stop().isOk();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return boleano;
    }
    
    /**
     * Get the signal value of the signal generator
     * @return: signal data
     */
    @Override
    public SignalData getSignalValue() {
        SignalData signal = new SignalData();
        try {
            es.uned.scc.grados.appdist.trabajos.ws.soap.SignalData signalD = this.signalGenerator.getSignalValue();
            signal.setTime(signalD.getTime());
            signal.setOutput(signalD.getOutput());
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return signal;
    }
    
    /**
     * Get the current signal parameters
     * @return: signal parameters
     */
    @Override
    public SignalParameters getSignalParameters() {
        SignalParameters signal = new SignalParameters();
        try {
            es.uned.scc.grados.appdist.trabajos.ws.soap.SignalParameters signalP = this.signalGenerator.getSignalParameters();
            signal = signalPlot(signalP);
        } catch (Exception e) {
            signal = new SignalParameters(WaveForm.SINE, 1.0D, -1.0D);
            e.printStackTrace();
        }
        return signal;
    }


    /**
     * Set the current signal parameters
     * @param: signal parameters
     */
    @Override
    public void setSignalParameters(SignalParameters signalP) {
        es.uned.scc.grados.appdist.trabajos.ws.soap.SignalParameters signal = signalWS(signalP);
        try {
            this.signalGenerator.setSignalParameters(signal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Convert the original signal parameters Jar's type to the current type
     * @param signal parameters
     * @return: signal parameters
     */
    private SignalParameters signalPlot(es.uned.scc.grados.appdist.trabajos.ws.soap.SignalParameters signalP) {
        SignalParameters signal = new SignalParameters();
        signal.setAmplitude(signalP.getAmplitude());
        signal.setFrequency(signalP.getFrequency());
        signal.setType(WaveForm.SINE);
        if (signalP.getType() == es.uned.scc.grados.appdist.trabajos.ws.soap.WaveForm.SQUARE) {
            signal.setType(WaveForm.SQUARE);
        } else if (signalP.getType() == es.uned.scc.grados.appdist.trabajos.ws.soap.WaveForm.TRIANGLE) {
            signal.setType(WaveForm.TRIANGLE);
        }
        return signal;
    }
    
    /**
     * Convert the current signal parameters type to signal parameters Jar's type 
     * @param signalP
     * @return: signal parameters
     */
    private es.uned.scc.grados.appdist.trabajos.ws.soap.SignalParameters signalWS(SignalParameters signalP) {
        es.uned.scc.grados.appdist.trabajos.ws.soap.SignalParameters signal = new es.uned.scc.grados.appdist.trabajos.ws.soap.SignalParameters();
        signal.setAmplitude(signalP.getAmplitude());
        signal.setFrequency(signalP.getFrequency());
        signal.setType(es.uned.scc.grados.appdist.trabajos.ws.soap.WaveForm.SINE);
        if (signalP.getType() == WaveForm.TRIANGLE) {
            signal.setType(es.uned.scc.grados.appdist.trabajos.ws.soap.WaveForm.TRIANGLE);
        } else if (signalP.getType() == WaveForm.SQUARE) {
            signal.setType(es.uned.scc.grados.appdist.trabajos.ws.soap.WaveForm.SQUARE);
        } 
        return signal;
    }
}
