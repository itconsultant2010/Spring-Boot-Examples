
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TableStatistics complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TableStatistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WidgetName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WidgetType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WidgetInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LastErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="EndTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="NumAppliedRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumAffectedRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumRejectedRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Throughput" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PartitionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableStatistics", propOrder = {
    "widgetName",
    "widgetType",
    "widgetInstanceName",
    "lastErrorCode",
    "lastErrorMessage",
    "startTime",
    "endTime",
    "numAppliedRows",
    "numAffectedRows",
    "numRejectedRows",
    "throughput",
    "partitionName",
    "groupName"
})
public class TableStatistics {

    @XmlElement(name = "WidgetName", required = true, nillable = true)
    protected String widgetName;
    @XmlElement(name = "WidgetType", required = true, nillable = true)
    protected String widgetType;
    @XmlElement(name = "WidgetInstanceName", required = true, nillable = true)
    protected String widgetInstanceName;
    @XmlElement(name = "LastErrorCode")
    protected int lastErrorCode;
    @XmlElement(name = "LastErrorMessage", required = true, nillable = true)
    protected String lastErrorMessage;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    protected DIServerDate startTime;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    protected DIServerDate endTime;
    @XmlElement(name = "NumAppliedRows")
    protected int numAppliedRows;
    @XmlElement(name = "NumAffectedRows")
    protected int numAffectedRows;
    @XmlElement(name = "NumRejectedRows")
    protected int numRejectedRows;
    @XmlElement(name = "Throughput")
    protected int throughput;
    @XmlElement(name = "PartitionName", required = true, nillable = true)
    protected String partitionName;
    @XmlElement(name = "GroupName", required = true, nillable = true)
    protected String groupName;

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
     * Obtient la valeur de la propriété widgetType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetType() {
        return widgetType;
    }

    /**
     * Définit la valeur de la propriété widgetType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetType(String value) {
        this.widgetType = value;
    }

    /**
     * Obtient la valeur de la propriété widgetInstanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetInstanceName() {
        return widgetInstanceName;
    }

    /**
     * Définit la valeur de la propriété widgetInstanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetInstanceName(String value) {
        this.widgetInstanceName = value;
    }

    /**
     * Obtient la valeur de la propriété lastErrorCode.
     * 
     */
    public int getLastErrorCode() {
        return lastErrorCode;
    }

    /**
     * Définit la valeur de la propriété lastErrorCode.
     * 
     */
    public void setLastErrorCode(int value) {
        this.lastErrorCode = value;
    }

    /**
     * Obtient la valeur de la propriété lastErrorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    /**
     * Définit la valeur de la propriété lastErrorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastErrorMessage(String value) {
        this.lastErrorMessage = value;
    }

    /**
     * Obtient la valeur de la propriété startTime.
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getStartTime() {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setStartTime(DIServerDate value) {
        this.startTime = value;
    }

    /**
     * Obtient la valeur de la propriété endTime.
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getEndTime() {
        return endTime;
    }

    /**
     * Définit la valeur de la propriété endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setEndTime(DIServerDate value) {
        this.endTime = value;
    }

    /**
     * Obtient la valeur de la propriété numAppliedRows.
     * 
     */
    public int getNumAppliedRows() {
        return numAppliedRows;
    }

    /**
     * Définit la valeur de la propriété numAppliedRows.
     * 
     */
    public void setNumAppliedRows(int value) {
        this.numAppliedRows = value;
    }

    /**
     * Obtient la valeur de la propriété numAffectedRows.
     * 
     */
    public int getNumAffectedRows() {
        return numAffectedRows;
    }

    /**
     * Définit la valeur de la propriété numAffectedRows.
     * 
     */
    public void setNumAffectedRows(int value) {
        this.numAffectedRows = value;
    }

    /**
     * Obtient la valeur de la propriété numRejectedRows.
     * 
     */
    public int getNumRejectedRows() {
        return numRejectedRows;
    }

    /**
     * Définit la valeur de la propriété numRejectedRows.
     * 
     */
    public void setNumRejectedRows(int value) {
        this.numRejectedRows = value;
    }

    /**
     * Obtient la valeur de la propriété throughput.
     * 
     */
    public int getThroughput() {
        return throughput;
    }

    /**
     * Définit la valeur de la propriété throughput.
     * 
     */
    public void setThroughput(int value) {
        this.throughput = value;
    }

    /**
     * Obtient la valeur de la propriété partitionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * Définit la valeur de la propriété partitionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionName(String value) {
        this.partitionName = value;
    }

    /**
     * Obtient la valeur de la propriété groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Définit la valeur de la propriété groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

}
