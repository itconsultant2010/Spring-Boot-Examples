
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EDIServerMonitorMode.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EDIServerMonitorMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="RUNNING"/&gt;
 *     &lt;enumeration value="SCHEDULED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EDIServerMonitorMode")
@XmlEnum
public enum EDIServerMonitorMode {

    ALL,
    RUNNING,
    SCHEDULED;

    public String value() {
        return name();
    }

    public static EDIServerMonitorMode fromValue(String v) {
        return valueOf(v);
    }

}
