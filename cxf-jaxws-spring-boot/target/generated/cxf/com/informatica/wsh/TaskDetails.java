
package com.informatica.wsh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TaskDetails complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TaskDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/&gt;
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaskRunStatus" type="{http://www.informatica.com/wsh}ETaskRunStatus"/&gt;
 *         &lt;element name="TaskType" type="{http://www.informatica.com/wsh}ETaskType"/&gt;
 *         &lt;element name="RunErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RunErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="EndTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="WorkletInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Attribute" type="{http://www.informatica.com/wsh}Attribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChildRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsSessionTask" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "TaskDetails", propOrder = {
    "diServiceInfo",
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "taskRunStatus",
    "taskType",
    "runErrorCode",
    "runErrorMessage",
    "startTime",
    "endTime",
    "workletInstanceName",
    "attribute",
    "childRunId",
    "instanceName",
    "isSessionTask",
    "workletRunId"
})
public class TaskDetails {

    @XmlElement(name = "DIServiceInfo", required = true, nillable = true)
    protected DIServiceInfo diServiceInfo;
    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkflowRunId")
    protected int workflowRunId;
    @XmlElement(name = "WorkflowRunInstanceName", required = true, nillable = true)
    protected String workflowRunInstanceName;
    @XmlElement(name = "TaskRunStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskRunStatus taskRunStatus;
    @XmlElement(name = "TaskType", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskType taskType;
    @XmlElement(name = "RunErrorCode")
    protected int runErrorCode;
    @XmlElement(name = "RunErrorMessage", required = true, nillable = true)
    protected String runErrorMessage;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    protected DIServerDate startTime;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    protected DIServerDate endTime;
    @XmlElement(name = "WorkletInstanceName", required = true, nillable = true)
    protected String workletInstanceName;
    @XmlElement(name = "Attribute")
    protected List<Attribute> attribute;
    @XmlElement(name = "ChildRunId")
    protected int childRunId;
    @XmlElement(name = "InstanceName", required = true, nillable = true)
    protected String instanceName;
    @XmlElement(name = "IsSessionTask")
    protected boolean isSessionTask;
    @XmlElement(name = "WorkletRunId")
    protected int workletRunId;

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
     * Obtient la valeur de la propriété workflowRunInstanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowRunInstanceName() {
        return workflowRunInstanceName;
    }

    /**
     * Définit la valeur de la propriété workflowRunInstanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowRunInstanceName(String value) {
        this.workflowRunInstanceName = value;
    }

    /**
     * Obtient la valeur de la propriété taskRunStatus.
     * 
     * @return
     *     possible object is
     *     {@link ETaskRunStatus }
     *     
     */
    public ETaskRunStatus getTaskRunStatus() {
        return taskRunStatus;
    }

    /**
     * Définit la valeur de la propriété taskRunStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ETaskRunStatus }
     *     
     */
    public void setTaskRunStatus(ETaskRunStatus value) {
        this.taskRunStatus = value;
    }

    /**
     * Obtient la valeur de la propriété taskType.
     * 
     * @return
     *     possible object is
     *     {@link ETaskType }
     *     
     */
    public ETaskType getTaskType() {
        return taskType;
    }

    /**
     * Définit la valeur de la propriété taskType.
     * 
     * @param value
     *     allowed object is
     *     {@link ETaskType }
     *     
     */
    public void setTaskType(ETaskType value) {
        this.taskType = value;
    }

    /**
     * Obtient la valeur de la propriété runErrorCode.
     * 
     */
    public int getRunErrorCode() {
        return runErrorCode;
    }

    /**
     * Définit la valeur de la propriété runErrorCode.
     * 
     */
    public void setRunErrorCode(int value) {
        this.runErrorCode = value;
    }

    /**
     * Obtient la valeur de la propriété runErrorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunErrorMessage() {
        return runErrorMessage;
    }

    /**
     * Définit la valeur de la propriété runErrorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunErrorMessage(String value) {
        this.runErrorMessage = value;
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
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<Attribute>();
        }
        return this.attribute;
    }

    /**
     * Obtient la valeur de la propriété childRunId.
     * 
     */
    public int getChildRunId() {
        return childRunId;
    }

    /**
     * Définit la valeur de la propriété childRunId.
     * 
     */
    public void setChildRunId(int value) {
        this.childRunId = value;
    }

    /**
     * Obtient la valeur de la propriété instanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Définit la valeur de la propriété instanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

    /**
     * Obtient la valeur de la propriété isSessionTask.
     * 
     */
    public boolean isIsSessionTask() {
        return isSessionTask;
    }

    /**
     * Définit la valeur de la propriété isSessionTask.
     * 
     */
    public void setIsSessionTask(boolean value) {
        this.isSessionTask = value;
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
