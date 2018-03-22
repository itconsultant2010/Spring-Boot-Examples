
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DIServerProperties complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DIServerProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DIServerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Repositoryname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CanInfaServerDebugMapping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DIServerMode" type="{http://www.informatica.com/wsh}EDIServerMode"/&gt;
 *         &lt;element name="DIServerVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrentTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="StartupTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIServerProperties", propOrder = {
    "diServerName",
    "repositoryname",
    "canInfaServerDebugMapping",
    "diServerMode",
    "diServerVersion",
    "currentTime",
    "startupTime",
    "productName"
})
public class DIServerProperties {

    @XmlElement(name = "DIServerName", required = true, nillable = true)
    protected String diServerName;
    @XmlElement(name = "Repositoryname", required = true, nillable = true)
    protected String repositoryname;
    @XmlElement(name = "CanInfaServerDebugMapping")
    protected boolean canInfaServerDebugMapping;
    @XmlElement(name = "DIServerMode", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EDIServerMode diServerMode;
    @XmlElement(name = "DIServerVersion", required = true, nillable = true)
    protected String diServerVersion;
    @XmlElement(name = "CurrentTime", required = true, nillable = true)
    protected DIServerDate currentTime;
    @XmlElement(name = "StartupTime", required = true, nillable = true)
    protected DIServerDate startupTime;
    @XmlElement(name = "ProductName", required = true, nillable = true)
    protected String productName;

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
     * Obtient la valeur de la propriété repositoryname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryname() {
        return repositoryname;
    }

    /**
     * Définit la valeur de la propriété repositoryname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryname(String value) {
        this.repositoryname = value;
    }

    /**
     * Obtient la valeur de la propriété canInfaServerDebugMapping.
     * 
     */
    public boolean isCanInfaServerDebugMapping() {
        return canInfaServerDebugMapping;
    }

    /**
     * Définit la valeur de la propriété canInfaServerDebugMapping.
     * 
     */
    public void setCanInfaServerDebugMapping(boolean value) {
        this.canInfaServerDebugMapping = value;
    }

    /**
     * Obtient la valeur de la propriété diServerMode.
     * 
     * @return
     *     possible object is
     *     {@link EDIServerMode }
     *     
     */
    public EDIServerMode getDIServerMode() {
        return diServerMode;
    }

    /**
     * Définit la valeur de la propriété diServerMode.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIServerMode }
     *     
     */
    public void setDIServerMode(EDIServerMode value) {
        this.diServerMode = value;
    }

    /**
     * Obtient la valeur de la propriété diServerVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIServerVersion() {
        return diServerVersion;
    }

    /**
     * Définit la valeur de la propriété diServerVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIServerVersion(String value) {
        this.diServerVersion = value;
    }

    /**
     * Obtient la valeur de la propriété currentTime.
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getCurrentTime() {
        return currentTime;
    }

    /**
     * Définit la valeur de la propriété currentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setCurrentTime(DIServerDate value) {
        this.currentTime = value;
    }

    /**
     * Obtient la valeur de la propriété startupTime.
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getStartupTime() {
        return startupTime;
    }

    /**
     * Définit la valeur de la propriété startupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setStartupTime(DIServerDate value) {
        this.startupTime = value;
    }

    /**
     * Obtient la valeur de la propriété productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Définit la valeur de la propriété productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
