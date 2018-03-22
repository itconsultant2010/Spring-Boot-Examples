
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PerformanceCounter complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PerformanceCounter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CounterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CounterValue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WidgetName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CounterStringValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CounterType" type="{http://www.informatica.com/wsh}EPerformanceCounterType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceCounter", propOrder = {
    "counterName",
    "counterValue",
    "widgetName",
    "counterStringValue",
    "counterType"
})
public class PerformanceCounter {

    @XmlElement(name = "CounterName", required = true, nillable = true)
    protected String counterName;
    @XmlElement(name = "CounterValue")
    protected int counterValue;
    @XmlElement(name = "WidgetName", required = true, nillable = true)
    protected String widgetName;
    @XmlElement(name = "CounterStringValue", required = true, nillable = true)
    protected String counterStringValue;
    @XmlElement(name = "CounterType", required = true)
    @XmlSchemaType(name = "token")
    protected EPerformanceCounterType counterType;

    /**
     * Obtient la valeur de la propriété counterName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterName() {
        return counterName;
    }

    /**
     * Définit la valeur de la propriété counterName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterName(String value) {
        this.counterName = value;
    }

    /**
     * Obtient la valeur de la propriété counterValue.
     * 
     */
    public int getCounterValue() {
        return counterValue;
    }

    /**
     * Définit la valeur de la propriété counterValue.
     * 
     */
    public void setCounterValue(int value) {
        this.counterValue = value;
    }

    /**
     * Obtient la valeur de la propriété widgetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetName() {
        return widgetName;
    }

    /**
     * Définit la valeur de la propriété widgetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetName(String value) {
        this.widgetName = value;
    }

    /**
     * Obtient la valeur de la propriété counterStringValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterStringValue() {
        return counterStringValue;
    }

    /**
     * Définit la valeur de la propriété counterStringValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterStringValue(String value) {
        this.counterStringValue = value;
    }

    /**
     * Obtient la valeur de la propriété counterType.
     * 
     * @return
     *     possible object is
     *     {@link EPerformanceCounterType }
     *     
     */
    public EPerformanceCounterType getCounterType() {
        return counterType;
    }

    /**
     * Définit la valeur de la propriété counterType.
     * 
     * @param value
     *     allowed object is
     *     {@link EPerformanceCounterType }
     *     
     */
    public void setCounterType(EPerformanceCounterType value) {
        this.counterType = value;
    }

}
