
package es.uned.scc.grados.appdist.trabajos.ws.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SignalGenerator", targetNamespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", wsdlLocation = "http://localhost:9000/SignalGenerator?wsdl")
public class SignalGenerator
    extends Service
{

    private final static URL SIGNALGENERATOR_WSDL_LOCATION;
    private final static WebServiceException SIGNALGENERATOR_EXCEPTION;
    private final static QName SIGNALGENERATOR_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "SignalGenerator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/SignalGenerator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIGNALGENERATOR_WSDL_LOCATION = url;
        SIGNALGENERATOR_EXCEPTION = e;
    }

    public SignalGenerator() {
        super(__getWsdlLocation(), SIGNALGENERATOR_QNAME);
    }

    public SignalGenerator(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIGNALGENERATOR_QNAME, features);
    }

    public SignalGenerator(URL wsdlLocation) {
        super(wsdlLocation, SIGNALGENERATOR_QNAME);
    }

    public SignalGenerator(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIGNALGENERATOR_QNAME, features);
    }

    public SignalGenerator(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SignalGenerator(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SignalGeneratorWS
     */
    @WebEndpoint(name = "SignalGeneratorWSImplPort")
    public SignalGeneratorWS getSignalGeneratorWSImplPort() {
        return super.getPort(new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "SignalGeneratorWSImplPort"), SignalGeneratorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SignalGeneratorWS
     */
    @WebEndpoint(name = "SignalGeneratorWSImplPort")
    public SignalGeneratorWS getSignalGeneratorWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "SignalGeneratorWSImplPort"), SignalGeneratorWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIGNALGENERATOR_EXCEPTION!= null) {
            throw SIGNALGENERATOR_EXCEPTION;
        }
        return SIGNALGENERATOR_WSDL_LOCATION;
    }

}
