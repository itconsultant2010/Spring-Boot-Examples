
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour InitializeDIServerConnectionRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InitializeDIServerConnectionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoginHandle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DIServerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DIServerDomain" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeDIServerConnectionRequest", propOrder = {
    "loginHandle",
    "diServerName",
    "diServerDomain"
})
public class InitializeDIServerConnectionRequest {

    @XmlElement(name = "LoginHandle", required = true, nillable = true)
    protected String loginHandle;
    @XmlElement(name = "DIServerName", required = true)
    protected String diServerName;
    @XmlElement(name = "DIServerDomain", required = true, nillable = true)
    protected String diServerDomain;

    /**
     * Obtient la valeur de la propriété loginHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginHandle() {
        return loginHandle;
    }

    /**
     * Définit la valeur de la propriété loginHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginHandle(String value) {
        this.loginHandle = value;
    }

    /**
     * Obtient la valeur de la propriété diServerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIServerName() {
        return diServerName;
    }

    /**
     * Définit la valeur de la propriété diServerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIServerName(String value) {
        this.diServerName = value;
    }

    /**
     * Obtient la valeur de la propriété diServerDomain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIServerDomain() {
        return diServerDomain;
    }

    /**
     * Définit la valeur de la propriété diServerDomain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIServerDomain(String value) {
        this.diServerDomain = value;
    }

}
