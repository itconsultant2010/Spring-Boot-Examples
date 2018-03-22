
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TypeStartWorkflowExResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TypeStartWorkflowExResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RunId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeStartWorkflowExResponse", propOrder = {
    "runId"
})
public class TypeStartWorkflowExResponse {

    @XmlElement(name = "RunId")
    protected int runId;

    /**
     * Obtient la valeur de la propriété runId.
     * 
     */
    public int getRunId() {
        return runId;
    }

    /**
     * Définit la valeur de la propriété runId.
     * 
     */
    public void setRunId(int value) {
        this.runId = value;
    }

}
