
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LinkDetails complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LinkDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkletInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FromTaskInstanceDetails" type="{http://www.informatica.com/wsh}TaskDetails"/&gt;
 *         &lt;element name="ToTaskInstanceDetails" type="{http://www.informatica.com/wsh}TaskDetails"/&gt;
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkletRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkDetails", propOrder = {
    "folderName",
    "workflowName",
    "workletInstanceName",
    "fromTaskInstanceDetails",
    "toTaskInstanceDetails",
    "workflowRunId",
    "workletRunId"
})
public class LinkDetails {

    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkletInstanceName", required = true, nillable = true)
    protected String workletInstanceName;
    @XmlElement(name = "FromTaskInstanceDetails", required = true, nillable = true)
    protected TaskDetails fromTaskInstanceDetails;
    @XmlElement(name = "ToTaskInstanceDetails", required = true, nillable = true)
    protected TaskDetails toTaskInstanceDetails;
    @XmlElement(name = "WorkflowRunId")
    protected int workflowRunId;
    @XmlElement(name = "WorkletRunId")
    protected int workletRunId;

    /**
     * Obtient la valeur de la propriété folderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Définit la valeur de la propriété folderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

    /**
     * Obtient la valeur de la propriété workflowName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * Définit la valeur de la propriété workflowName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowName(String value) {
        this.workflowName = value;
    }

    /**
     * Obtient la valeur de la propriété workletInstanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkletInstanceName() {
        return workletInstanceName;
    }

    /**
     * Définit la valeur de la propriété workletInstanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkletInstanceName(String value) {
        this.workletInstanceName = value;
    }

    /**
     * Obtient la valeur de la propriété fromTaskInstanceDetails.
     * 
     * @return
     *     possible object is
     *     {@link TaskDetails }
     *     
     */
    public TaskDetails getFromTaskInstanceDetails() {
        return fromTaskInstanceDetails;
    }

    /**
     * Définit la valeur de la propriété fromTaskInstanceDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDetails }
     *     
     */
    public void setFromTaskInstanceDetails(TaskDetails value) {
        this.fromTaskInstanceDetails = value;
    }

    /**
     * Obtient la valeur de la propriété toTaskInstanceDetails.
     * 
     * @return
     *     possible object is
     *     {@link TaskDetails }
     *     
     */
    public TaskDetails getToTaskInstanceDetails() {
        return toTaskInstanceDetails;
    }

    /**
     * Définit la valeur de la propriété toTaskInstanceDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDetails }
     *     
     */
    public void setToTaskInstanceDetails(TaskDetails value) {
        this.toTaskInstanceDetails = value;
    }

    /**
     * Obtient la valeur de la propriété workflowRunId.
     * 
     */
    public int getWorkflowRunId() {
        return workflowRunId;
    }

    /**
     * Définit la valeur de la propriété workflowRunId.
     * 
     */
    public void setWorkflowRunId(int value) {
        this.workflowRunId = value;
    }

    /**
     * Obtient la valeur de la propriété workletRunId.
     * 
     */
    public int getWorkletRunId() {
        return workletRunId;
    }

    /**
     * Définit la valeur de la propriété workletRunId.
     * 
     */
    public void setWorkletRunId(int value) {
        this.workletRunId = value;
    }

}
