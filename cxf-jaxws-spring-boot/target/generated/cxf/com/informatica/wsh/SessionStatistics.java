
package com.informatica.wsh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SessionStatistics complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SessionStatistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/&gt;
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MappingName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaskRunStatus" type="{http://www.informatica.com/wsh}ETaskRunStatus"/&gt;
 *         &lt;element name="WorkletRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LogFileCodePage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumSrcSuccessRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumTgtSuccessRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumSrcFailedRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumTgtFailedRows" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumTransErrors" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NumTables" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LogFileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FirstErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TableStatistics" type="{http://www.informatica.com/wsh}TableStatistics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionStatistics", propOrder = {
    "diServiceInfo",
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "instanceName",
    "mappingName",
    "taskRunStatus",
    "workletRunId",
    "logFileCodePage",
    "numSrcSuccessRows",
    "numTgtSuccessRows",
    "numSrcFailedRows",
    "numTgtFailedRows",
    "numTransErrors",
    "numTables",
    "logFileName",
    "firstErrorCode",
    "firstErrorMessage",
    "tableStatistics"
})
public class SessionStatistics {

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
    @XmlElement(name = "InstanceName", required = true, nillable = true)
    protected String instanceName;
    @XmlElement(name = "MappingName", required = true, nillable = true)
    protected String mappingName;
    @XmlElement(name = "TaskRunStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskRunStatus taskRunStatus;
    @XmlElement(name = "WorkletRunId")
    protected int workletRunId;
    @XmlElement(name = "LogFileCodePage")
    protected int logFileCodePage;
    @XmlElement(name = "NumSrcSuccessRows")
    protected int numSrcSuccessRows;
    @XmlElement(name = "NumTgtSuccessRows")
    protected int numTgtSuccessRows;
    @XmlElement(name = "NumSrcFailedRows")
    protected int numSrcFailedRows;
    @XmlElement(name = "NumTgtFailedRows")
    protected int numTgtFailedRows;
    @XmlElement(name = "NumTransErrors")
    protected int numTransErrors;
    @XmlElement(name = "NumTables")
    protected int numTables;
    @XmlElement(name = "LogFileName", required = true, nillable = true)
    protected String logFileName;
    @XmlElement(name = "FirstErrorCode")
    protected int firstErrorCode;
    @XmlElement(name = "FirstErrorMessage", required = true, nillable = true)
    protected String firstErrorMessage;
    @XmlElement(name = "TableStatistics")
    protected List<TableStatistics> tableStatistics;

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
     * Obtient la valeur de la propriété mappingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingName() {
        return mappingName;
    }

    /**
     * Définit la valeur de la propriété mappingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingName(String value) {
        this.mappingName = value;
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
     * Obtient la valeur de la propriété numSrcSuccessRows.
     * 
     */
    public int getNumSrcSuccessRows() {
        return numSrcSuccessRows;
    }

    /**
     * Définit la valeur de la propriété numSrcSuccessRows.
     * 
     */
    public void setNumSrcSuccessRows(int value) {
        this.numSrcSuccessRows = value;
    }

    /**
     * Obtient la valeur de la propriété numTgtSuccessRows.
     * 
     */
    public int getNumTgtSuccessRows() {
        return numTgtSuccessRows;
    }

    /**
     * Définit la valeur de la propriété numTgtSuccessRows.
     * 
     */
    public void setNumTgtSuccessRows(int value) {
        this.numTgtSuccessRows = value;
    }

    /**
     * Obtient la valeur de la propriété numSrcFailedRows.
     * 
     */
    public int getNumSrcFailedRows() {
        return numSrcFailedRows;
    }

    /**
     * Définit la valeur de la propriété numSrcFailedRows.
     * 
     */
    public void setNumSrcFailedRows(int value) {
        this.numSrcFailedRows = value;
    }

    /**
     * Obtient la valeur de la propriété numTgtFailedRows.
     * 
     */
    public int getNumTgtFailedRows() {
        return numTgtFailedRows;
    }

    /**
     * Définit la valeur de la propriété numTgtFailedRows.
     * 
     */
    public void setNumTgtFailedRows(int value) {
        this.numTgtFailedRows = value;
    }

    /**
     * Obtient la valeur de la propriété numTransErrors.
     * 
     */
    public int getNumTransErrors() {
        return numTransErrors;
    }

    /**
     * Définit la valeur de la propriété numTransErrors.
     * 
     */
    public void setNumTransErrors(int value) {
        this.numTransErrors = value;
    }

    /**
     * Obtient la valeur de la propriété numTables.
     * 
     */
    public int getNumTables() {
        return numTables;
    }

    /**
     * Définit la valeur de la propriété numTables.
     * 
     */
    public void setNumTables(int value) {
        this.numTables = value;
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
     * Obtient la valeur de la propriété firstErrorCode.
     * 
     */
    public int getFirstErrorCode() {
        return firstErrorCode;
    }

    /**
     * Définit la valeur de la propriété firstErrorCode.
     * 
     */
    public void setFirstErrorCode(int value) {
        this.firstErrorCode = value;
    }

    /**
     * Obtient la valeur de la propriété firstErrorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstErrorMessage() {
        return firstErrorMessage;
    }

    /**
     * Définit la valeur de la propriété firstErrorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstErrorMessage(String value) {
        this.firstErrorMessage = value;
    }

    /**
     * Gets the value of the tableStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableStatistics }
     * 
     * 
     */
    public List<TableStatistics> getTableStatistics() {
        if (tableStatistics == null) {
            tableStatistics = new ArrayList<TableStatistics>();
        }
        return this.tableStatistics;
    }

}
