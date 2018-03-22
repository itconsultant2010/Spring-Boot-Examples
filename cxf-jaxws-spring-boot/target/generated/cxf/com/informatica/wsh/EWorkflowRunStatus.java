
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EWorkflowRunStatus.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EWorkflowRunStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SUCCEEDED"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="STOPPED"/&gt;
 *     &lt;enumeration value="ABORTED"/&gt;
 *     &lt;enumeration value="RUNNING"/&gt;
 *     &lt;enumeration value="SUSPENDING"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *     &lt;enumeration value="STOPPING"/&gt;
 *     &lt;enumeration value="ABORTING"/&gt;
 *     &lt;enumeration value="WAITING"/&gt;
 *     &lt;enumeration value="SCHEDULED"/&gt;
 *     &lt;enumeration value="UNSCHEDULED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="TERMINATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EWorkflowRunStatus")
@XmlEnum
public enum EWorkflowRunStatus {

    SUCCEEDED,
    FAILED,
    STOPPED,
    ABORTED,
    RUNNING,
    SUSPENDING,
    SUSPENDED,
    STOPPING,
    ABORTING,
    WAITING,
    SCHEDULED,
    UNSCHEDULED,
    UNKNOWN,
    TERMINATED;

    public String value() {
        return name();
    }

    public static EWorkflowRunStatus fromValue(String v) {
        return valueOf(v);
    }

}
