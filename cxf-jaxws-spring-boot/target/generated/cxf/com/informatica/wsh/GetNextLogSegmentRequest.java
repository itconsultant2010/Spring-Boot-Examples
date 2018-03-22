
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetNextLogSegmentRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetNextLogSegmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogHandle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TimeOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNextLogSegmentRequest", propOrder = {
    "logHandle",
    "timeOut"
})
public class GetNextLogSegmentRequest {

    @XmlElement(name = "LogHandle")
    protected int logHandle;
    @XmlElement(name = "TimeOut")
    protected int timeOut;

    /**
     * Obtient la valeur de la propriété logHandle.
     * 
     */
    public int getLogHandle() {
        return logHandle;
    }

    /**
     * Définit la valeur de la propriété logHandle.
     * 
     */
    public void setLogHandle(int value) {
        this.logHandle = value;
    }

    /**
     * Obtient la valeur de la propriété timeOut.
     * 
     */
    public int getTimeOut() {
        return timeOut;
    }

    /**
     * Définit la valeur de la propriété timeOut.
     * 
     */
    public void setTimeOut(int value) {
        this.timeOut = value;
    }

}
