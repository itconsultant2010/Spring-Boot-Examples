
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Log complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Log"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Buffer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CodePage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Log", propOrder = {
    "fileSize",
    "buffer",
    "codePage"
})
public class Log {

    @XmlElement(name = "FileSize")
    protected int fileSize;
    @XmlElement(name = "Buffer", required = true, nillable = true)
    protected String buffer;
    @XmlElement(name = "CodePage")
    protected int codePage;

    /**
     * Obtient la valeur de la propriété fileSize.
     * 
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Définit la valeur de la propriété fileSize.
     * 
     */
    public void setFileSize(int value) {
        this.fileSize = value;
    }

    /**
     * Obtient la valeur de la propriété buffer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuffer() {
        return buffer;
    }

    /**
     * Définit la valeur de la propriété buffer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuffer(String value) {
        this.buffer = value;
    }

    /**
     * Obtient la valeur de la propriété codePage.
     * 
     */
    public int getCodePage() {
        return codePage;
    }

    /**
     * Définit la valeur de la propriété codePage.
     * 
     */
    public void setCodePage(int value) {
        this.codePage = value;
    }

}
