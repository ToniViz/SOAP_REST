
package es.uned.scc.grados.appdist.trabajos.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para setSignalParameters complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="setSignalParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signal_parameters" type="{http://ws.trabajos.appdist.grados.scc.uned.es/}signalParameters" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSignalParameters", propOrder = {
    "signalParameters"
})
public class SetSignalParameters {

    @XmlElement(name = "signal_parameters")
    protected SignalParameters signalParameters;

    /**
     * Obtiene el valor de la propiedad signalParameters.
     * 
     * @return
     *     possible object is
     *     {@link SignalParameters }
     *     
     */
    public SignalParameters getSignalParameters() {
        return signalParameters;
    }

    /**
     * Define el valor de la propiedad signalParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalParameters }
     *     
     */
    public void setSignalParameters(SignalParameters value) {
        this.signalParameters = value;
    }

}
