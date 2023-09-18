/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uned.scc.grados.appdist.trabajos.ws.server;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.uned.scc.grados.appdist.trabajos.ws.RESTSignalGeneratorWSImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;



/**
 * This class initializes the REST signal generator services on a local server using apache cxf libraries
 * @author Toni
 */
public class RESTWSServer {
    
    
    /**
     * Main REST services method
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
        sf.setResourceClasses(RESTSignalGeneratorWSImpl.class);    
        sf.setResourceProvider(new SingletonResourceProvider(new RESTSignalGeneratorWSImpl()));
        sf.setAddress("http://localhost:9000/");
        sf.create();
        
        
    }
}