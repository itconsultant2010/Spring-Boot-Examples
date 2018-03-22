
package com.informatica.wsh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DIServerDetails complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DIServerDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DIServerStatus" type="{http://www.informatica.com/wsh}EDIServerRunStatus"/&gt;
 *         &lt;element name="CurrentTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="StartupTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="ReferenceTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="WorkflowDetails" type="{http://www.informatica.com/wsh}WorkflowDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LinkDetails" type="{http://www.informatica.com/wsh}LinkDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaskDetails" type="{http://www.informatica.com/wsh}TaskDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIServerDetails", propOrder = {
    "diServerStatus",
    "currentTime",
    "startupTime",
    "referenceTime",
    "workflowDetails",
    "linkDetails",
    "taskDetails"
})
public class DIServerDetails {

    @XmlElement(name = "DIServerStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EDIServerRunStatus diServerStatus;
    @XmlElement(name = "CurrentTime", required = true, nillable = true)
    protected DIServerDate currentTime;
    @XmlElement(name = "StartupTime", required = true, nillable = true)
    protected DIServerDate startupTime;
    @XmlElement(name = "ReferenceTime", required = true, nillable = true)
    protected DIServerDate referenceTime;
    @XmlElement(name = "WorkflowDetails")
    protected List<WorkflowDetails> workflowDetails;
    @XmlElement(name = "LinkDetails")
    protected List<LinkDetails> linkDetails;
    @XmlElement(name = "TaskDetails")
    protected List<TaskDetails> taskDetails;

    /**
     * Obtient la valeur de la propriété diServerStatus.
     * 
     * @return
     *     possible object is
     *     {@link EDIServerRunStatus }
     *     
     */
    public EDIServerRunStatus getDIServerStatus() {
        return diServerStatus;
    }

    /**
     * Définit la valeur de la propriété diServerStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EDIServerRunStatus }
     *     
     */
    public void setDIServerStatus(EDIServerRunStatus value) {
        this.diServerStatus = value;
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
     * Obtient la valeur de la propriété referenceTime.
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getReferenceTime() {
        return referenceTime;
    }

    /**
     * Définit la valeur de la propriété referenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setReferenceTime(DIServerDate value) {
        this.referenceTime = value;
    }

    /**
     * Gets the value of the workflowDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowDetails }
     * 
     * 
     */
    public List<WorkflowDetails> getWorkflowDetails() {
        if (workflowDetails == null) {
            workflowDetails = new ArrayList<WorkflowDetails>();
        }
        return this.workflowDetails;
    }

    /**
     * Gets the value of the linkDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkDetails }
     * 
     * 
     */
    public List<LinkDetails> getLinkDetails() {
        if (linkDetails == null) {
            linkDetails = new ArrayList<LinkDetails>();
        }
        return this.linkDetails;
    }

    /**
     * Gets the value of the taskDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskDetails }
     * 
     * 
     */
    public List<TaskDetails> getTaskDetails() {
        if (taskDetails == null) {
            taskDetails = new ArrayList<TaskDetails>();
        }
        return this.taskDetails;
    }

}
