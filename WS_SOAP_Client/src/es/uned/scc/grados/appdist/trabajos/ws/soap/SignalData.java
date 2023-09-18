
package es.uned.scc.grados.appdist.trabajos.ws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para signalData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="signalData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signalData", propOrder = {
    "output",
    "time"
})
public class SignalData {

    protected double output;
    protected double time;

    /**
     * Obtiene el valor de la propiedad output.
     * 
     */
    public double getOutput() {
        return output;
    }

    /**
     * Define el valor de la propiedad output.
     * 
     */
    public void setOutput(double value) {
        this.output = value;
    }

    /**
     * Obtiene el valor de la propiedad time.
     * 
     */
    public double getTime() {
        return time;
    }

    /**
     * Define el valor de la propiedad time.
     * 
     */
    public void setTime(double value) {
        this.time = value;
    }

}
