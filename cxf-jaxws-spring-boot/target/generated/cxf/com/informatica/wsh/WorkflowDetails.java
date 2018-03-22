
package com.informatica.wsh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WorkflowDetails complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WorkflowDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowRunStatus" type="{http://www.informatica.com/wsh}EWorkflowRunStatus"/&gt;
 *         &lt;element name="WorkflowRunType" type="{http://www.informatica.com/wsh}EWorkflowRunType"/&gt;
 *         &lt;element name="RunErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RunErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="EndTime" type="{http://www.informatica.com/wsh}DIServerDate"/&gt;
 *         &lt;element name="Attribute" type="{http://www.informatica.com/wsh}Attribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LogFileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LogFileCodePage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OSUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowDetails", propOrder = {
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "workflowRunStatus",
    "workflowRunType",
    "runErrorCode",
    "runErrorMessage",
    "startTime",
    "endTime",
    "attribute",
    "userName",
    "logFileName",
    "logFileCodePage",
    "osUser"
})
public class WorkflowDetails {

    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkflowRunId")
    protected int workflowRunId;
    @XmlElement(name = "WorkflowRunInstanceName", required = true, nillable = true)
    protected String workflowRunInstanceName;
    @XmlElement(name = "WorkflowRunStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EWorkflowRunStatus workflowRunStatus;
    @XmlElement(name = "WorkflowRunType", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EWorkflowRunType workflowRunType;
    @XmlElement(name = "RunErrorCode")
    protected int runErrorCode;
    @XmlElement(name = "RunErrorMessage", required = true, nillable = true)
    protected String runErrorMessage;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    protected DIServerDate startTime;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    protected DIServerDate endTime;
    @XmlElement(name = "Attribute")
    protected List<Attribute> attribute;
    @XmlElement(name = "UserName", required = true, nillable = true)
    protected String userName;
    @XmlElement(name = "LogFileName", required = true, nillable = true)
    protected String logFileName;
    @XmlElement(name = "LogFileCodePage")
    protected int logFileCodePage;
    @XmlElement(name = "OSUser", required = true, nillable = true)
    protected String osUser;

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
     * Obtient la valeur de la propriété workflowRunStatus.
     * 
     * @return
     *     possible object is
     *     {@link EWorkflowRunStatus }
     *     
     */
    public EWorkflowRunStatus getWorkflowRunStatus() {
        return workflowRunStatus;
    }

    /**
     * Définit la valeur de la propriété workflowRunStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EWorkflowRunStatus }
     *     
     */
    public void setWorkflowRunStatus(EWorkflowRunStatus value) {
        this.workflowRunStatus = value;
    }

    /**
     * Obtient la valeur de la propriété workflowRunType.
     * 
     * @return
     *     possible object is
     *     {@link EWorkflowRunType }
     *     
     */
    public EWorkflowRunType getWorkflowRunType() {
        return workflowRunType;
    }

    /**
     * Définit la valeur de la propriété workflowRunType.
     * 
     * @param value
     *     allowed object is
     *     {@link EWorkflowRunType }
     *     
     */
    public void setWorkflowRunType(EWorkflowRunType value) {
        this.workflowRunType = value;
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
     * Obtient la valeur de la propriété userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Définit la valeur de la propriété userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtient la valeur de la propriété logFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * Définit la valeur de la propriété logFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogFileName(String value) {
        this.logFileName = value;
    }

    /**
     * Obtient la valeur de la propriété logFileCodePage.
     * 
     */
    public int getLogFileCodePage() {
        return logFileCodePage;
    }

    /**
     * Définit la valeur de la propriété logFileCodePage.
     * 
     */
    public void setLogFileCodePage(int value) {
        this.logFileCodePage = value;
    }

    /**
     * Obtient la valeur de la propriété osUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSUser() {
        return osUser;
    }

    /**
     * Définit la valeur de la propriété osUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSUser(String value) {
        this.osUser = value;
    }

}
