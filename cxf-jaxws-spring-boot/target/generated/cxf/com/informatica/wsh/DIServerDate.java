
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DIServerDate complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DIServerDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="NanoSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Seconds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Minutes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Hours" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UTCTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIServerDate", propOrder = {
    "date",
    "nanoSeconds",
    "seconds",
    "minutes",
    "hours",
    "month",
    "year",
    "utcTime"
})
public class DIServerDate {

    @XmlElement(name = "Date")
    protected int date;
    @XmlElement(name = "NanoSeconds")
    protected int nanoSeconds;
    @XmlElement(name = "Seconds")
    protected int seconds;
    @XmlElement(name = "Minutes")
    protected int minutes;
    @XmlElement(name = "Hours")
    protected int hours;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "UTCTime")
    protected int utcTime;

    /**
     * Obtient la valeur de la propriété date.
     * 
     */
    public int getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     */
    public void setDate(int value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propriété nanoSeconds.
     * 
     */
    public int getNanoSeconds() {
        return nanoSeconds;
    }

    /**
     * Définit la valeur de la propriété nanoSeconds.
     * 
     */
    public void setNanoSeconds(int value) {
        this.nanoSeconds = value;
    }

    /**
     * Obtient la valeur de la propriété seconds.
     * 
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Définit la valeur de la propriété seconds.
     * 
     */
    public void setSeconds(int value) {
        this.seconds = value;
    }

    /**
     * Obtient la valeur de la propriété minutes.
     * 
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Définit la valeur de la propriété minutes.
     * 
     */
    public void setMinutes(int value) {
        this.minutes = value;
    }

    /**
     * Obtient la valeur de la propriété hours.
     * 
     */
    public int getHours() {
        return hours;
    }

    /**
     * Définit la valeur de la propriété hours.
     * 
     */
    public void setHours(int value) {
        this.hours = value;
    }

    /**
     * Obtient la valeur de la propriété month.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Définit la valeur de la propriété month.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Obtient la valeur de la propriété year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Définit la valeur de la propriété year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Obtient la valeur de la propriété utcTime.
     * 
     */
    public int getUTCTime() {
        return utcTime;
    }

    /**
     * Définit la valeur de la propriété utcTime.
     * 
     */
    public void setUTCTime(int value) {
        this.utcTime = value;
    }

}
