/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uned.scc.grados.appdist.trabajos.ws.soap;


import es.uned.scc.grados.appdist.trabajos.ws.soap.gui.UserGui;

/**
 * This class initialized the signal generator 
 */
public class WSClient {
    public static void main(String[] args) {
            SignalGeneratorWS signalGenerator = new SignalGenerator().getSignalGeneratorWSImplPort();
            UserGui gui = new UserGui(signalGenerator);
            gui.show();
    }
    
}
