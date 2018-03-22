
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TaskRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TaskRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/&gt;
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ParameterFileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Parameters" type="{http://www.informatica.com/wsh}ParameterArray"/&gt;
 *         &lt;element name="RequestMode" type="{http://www.informatica.com/wsh}ETaskRunMode"/&gt;
 *         &lt;element name="TaskInstancePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsAbort" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskRequest", propOrder = {
    "diServiceInfo",
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "parameterFileName",
    "parameters",
    "requestMode",
    "taskInstancePath",
    "isAbort"
})
public class TaskRequest {

    @XmlElement(name = "DIServiceInfo", required = true, nillable = true)
    protected DIServiceInfo diServiceInfo;
    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkflowRunId", required = true, type = Integer.class, nillable = true)
    protected Integer workflowRunId;
    @XmlElement(name = "WorkflowRunInstanceName", required = true, nillable = true)
    protected String workflowRunInstanceName;
    @XmlElement(name = "ParameterFileName", required = true, nillable = true)
    protected String parameterFileName;
    @XmlElement(name = "Parameters", required = true, nillable = true)
    protected ParameterArray parameters;
    @XmlElement(name = "RequestMode", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskRunMode requestMode;
    @XmlElement(name = "TaskInstancePath", required = true, nillable = true)
    protected String taskInstancePath;
    @XmlElement(name = "IsAbort")
    protected boolean isAbort;

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkflowRunId() {
        return workflowRunId;
    }

    /**
     * Définit la valeur de la propriété workflowRunId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkflowRunId(Integer value) {
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
     * Obtient la valeur de la propriété parameterFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterFileName() {
        return parameterFileName;
    }

    /**
     * Définit la valeur de la propriété parameterFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterFileName(String value) {
        this.parameterFileName = value;
    }

    /**
     * Obtient la valeur de la propriété parameters.
     * 
     * @return
     *     possible object is
     *     {@link ParameterArray }
     *     
     */
    public ParameterArray getParameters() {
        return parameters;
    }

    /**
     * Définit la valeur de la propriété parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterArray }
     *     
     */
    public void setParameters(ParameterArray value) {
        this.parameters = value;
    }

    /**
     * Obtient la valeur de la propriété requestMode.
     * 
     * @return
     *     possible object is
     *     {@link ETaskRunMode }
     *     
     */
    public ETaskRunMode getRequestMode() {
        return requestMode;
    }

    /**
     * Définit la valeur de la propriété requestMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ETaskRunMode }
     *     
     */
    public void setRequestMode(ETaskRunMode value) {
        this.requestMode = value;
    }

    /**
     * Obtient la valeur de la propriété taskInstancePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInstancePath() {
        return taskInstancePath;
    }

    /**
     * Définit la valeur de la propriété taskInstancePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInstancePath(String value) {
        this.taskInstancePath = value;
    }

    /**
     * Obtient la valeur de la propriété isAbort.
     * 
     */
    public boolean isIsAbort() {
        return isAbort;
    }

    /**
     * Définit la valeur de la propriété isAbort.
     * 
     */
    public void setIsAbort(boolean value) {
        this.isAbort = value;
    }

}
