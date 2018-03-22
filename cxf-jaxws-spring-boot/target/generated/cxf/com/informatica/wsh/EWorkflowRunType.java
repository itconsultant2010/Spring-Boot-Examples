
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EWorkflowRunType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EWorkflowRunType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SCHEDULE"/&gt;
 *     &lt;enumeration value="USER_REQUEST"/&gt;
 *     &lt;enumeration value="DEBUG_SESSION"/&gt;
 *     &lt;enumeration value="SERVER_INIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EWorkflowRunType")
@XmlEnum
public enum EWorkflowRunType {

    SCHEDULE,
    USER_REQUEST,
    DEBUG_SESSION,
    SERVER_INIT;

    public String value() {
        return name();
    }

    public static EWorkflowRunType fromValue(String v) {
        return valueOf(v);
    }

}
