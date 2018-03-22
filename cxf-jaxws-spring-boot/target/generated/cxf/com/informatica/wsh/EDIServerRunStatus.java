
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EDIServerRunStatus.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EDIServerRunStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="INITIALIZING"/&gt;
 *     &lt;enumeration value="RUNNING"/&gt;
 *     &lt;enumeration value="SHUTTING_DOWN"/&gt;
 *     &lt;enumeration value="STOPPING"/&gt;
 *     &lt;enumeration value="ABORTING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EDIServerRunStatus")
@XmlEnum
public enum EDIServerRunStatus {

    INITIALIZING,
    RUNNING,
    SHUTTING_DOWN,
    STOPPING,
    ABORTING;

    public String value() {
        return name();
    }

    public static EDIServerRunStatus fromValue(String v) {
        return valueOf(v);
    }

}
