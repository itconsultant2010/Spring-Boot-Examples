
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TaskTopLevelParent complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TaskTopLevelParent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WorkflowId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaskInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TaskInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TopLevelParentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TopLevelParentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTopLevelParent", propOrder = {
    "folderId",
    "folderName",
    "workflowId",
    "workflowName",
    "taskInstanceId",
    "taskInstanceName",
    "topLevelParentId",
    "topLevelParentName"
})
public class TaskTopLevelParent {

    @XmlElement(name = "FolderId")
    protected int folderId;
    @XmlElement(name = "FolderName", required = true)
    protected String folderName;
    @XmlElement(name = "WorkflowId")
    protected int workflowId;
    @XmlElement(name = "WorkflowName", required = true)
    protected String workflowName;
    @XmlElement(name = "TaskInstanceId")
    protected int taskInstanceId;
    @XmlElement(name = "TaskInstanceName", required = true)
    protected String taskInstanceName;
    @XmlElement(name = "TopLevelParentId")
    protected int topLevelParentId;
    @XmlElement(name = "TopLevelParentName", required = true)
    protected String topLevelParentName;

    /**
     * Obtient la valeur de la propriété folderId.
     * 
     */
    public int getFolderId() {
        return folderId;
    }

    /**
     * Définit la valeur de la propriété folderId.
     * 
     */
    public void setFolderId(int value) {
        this.folderId = value;
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
     * Obtient la valeur de la propriété workflowId.
     * 
     */
    public int getWorkflowId() {
        return workflowId;
    }

    /**
     * Définit la valeur de la propriété workflowId.
     * 
     */
    public void setWorkflowId(int value) {
        this.workflowId = value;
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
     * Obtient la valeur de la propriété taskInstanceId.
     * 
     */
    public int getTaskInstanceId() {
        return taskInstanceId;
    }

    /**
     * Définit la valeur de la propriété taskInstanceId.
     * 
     */
    public void setTaskInstanceId(int value) {
        this.taskInstanceId = value;
    }

    /**
     * Obtient la valeur de la propriété taskInstanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInstanceName() {
        return taskInstanceName;
    }

    /**
     * Définit la valeur de la propriété taskInstanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInstanceName(String value) {
        this.taskInstanceName = value;
    }

    /**
     * Obtient la valeur de la propriété topLevelParentId.
     * 
     */
    public int getTopLevelParentId() {
        return topLevelParentId;
    }

    /**
     * Définit la valeur de la propriété topLevelParentId.
     * 
     */
    public void setTopLevelParentId(int value) {
        this.topLevelParentId = value;
    }

    /**
     * Obtient la valeur de la propriété topLevelParentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopLevelParentName() {
        return topLevelParentName;
    }

    /**
     * Définit la valeur de la propriété topLevelParentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopLevelParentName(String value) {
        this.topLevelParentName = value;
    }

}
