
package es.uned.scc.grados.appdist.trabajos.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para signalParameters complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="signalParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amplitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="type" type="{http://ws.trabajos.appdist.grados.scc.uned.es/}waveForm" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signalParameters", propOrder = {
    "amplitude",
    "frequency",
    "type"
})
public class SignalParameters {

    protected double amplitude;
    protected double frequency;
    @XmlSchemaType(name = "string")
    protected WaveForm type;

    /**
     * Obtiene el valor de la propiedad amplitude.
     * 
     */
    public double getAmplitude() {
        return amplitude;
    }

    /**
     * Define el valor de la propiedad amplitude.
     * 
     */
    public void setAmplitude(double value) {
        this.amplitude = value;
    }

    /**
     * Obtiene el valor de la propiedad frequency.
     * 
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     */
    public void setFrequency(double value) {
        this.frequency = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link WaveForm }
     *     
     */
    public WaveForm getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link WaveForm }
     *     
     */
    public void setType(WaveForm value) {
        this.type = value;
    }

}
