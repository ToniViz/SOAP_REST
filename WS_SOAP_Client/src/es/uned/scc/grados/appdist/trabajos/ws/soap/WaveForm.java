
package es.uned.scc.grados.appdist.trabajos.ws.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para waveForm.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="waveForm"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SINE"/&gt;
 *     &lt;enumeration value="SQUARE"/&gt;
 *     &lt;enumeration value="TRIANGLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "waveForm")
@XmlEnum
public enum WaveForm {

    SINE,
    SQUARE,
    TRIANGLE;

    public String value() {
        return name();
    }

    public static WaveForm fromValue(String v) {
        return valueOf(v);
    }

}
