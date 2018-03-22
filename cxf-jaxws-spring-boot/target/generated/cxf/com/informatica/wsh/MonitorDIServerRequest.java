
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MonitorDIServerRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MonitorDIServerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/&gt;
 *         &lt;element name="MonitorMode" type="{http://www.informatica.com/wsh}EDIServerMonitorMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorDIServerRequest", propOrder = {
    "diServiceInfo",
    "monitorMode"
})
public class MonitorDIServerRequest {

    @XmlElement(name = "DIServiceInfo", required = true, nillable = true)
    protected DIServiceInfo diServiceInfo;
    @XmlElement(name = "MonitorMode", required = true)
    @XmlSchemaType(name = "token")
    protected EDIServerMonitorMode monitorMode;

    /**
     * Obtient la valeur de la propriété diServiceInfo.
     * 
     * @return
     *     possible object is
     *     {@link DIServiceInfo }
     *     
     */
    public DIServiceInfo getDIServiceInfo() {
        return diServiceInfo;
    }

    /**
     * Définit la valeur de la propriété diServiceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link DIServiceInfo }
     *     
     */
    public void setDIServiceInfo(DIServiceInfo value) {
        this.diServiceInfo = value;
    }

    /**
     * Obtient la valeur de la propriété monitorMode.
     * 
     * @return
     *     possible object is
     *     {@link EDIServerMonitorMode }
     *     
     */
    public EDIServerMonitorMode getMonitorMode() {
        return monitorMode;
    }

    /**
     * Définit la valeur de la propriété monitorMode.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIServerMonitorMode }
     *     
     */
    public void setMonitorMode(EDIServerMonitorMode value) {
        this.monitorMode = value;
    }

}
