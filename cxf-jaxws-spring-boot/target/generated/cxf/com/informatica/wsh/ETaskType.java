
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ETaskType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ETaskType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="COMMAND_TASK"/&gt;
 *     &lt;enumeration value="DECISION_TASK"/&gt;
 *     &lt;enumeration value="EVENTWAIT_TASK"/&gt;
 *     &lt;enumeration value="EVENTRAISE_TASK"/&gt;
 *     &lt;enumeration value="STARTWORKFLOW_TASK"/&gt;
 *     &lt;enumeration value="ABORTWORKFLOW_TASK"/&gt;
 *     &lt;enumeration value="STOPWORKFLOW_TASK"/&gt;
 *     &lt;enumeration value="EMAIL_TASK"/&gt;
 *     &lt;enumeration value="TIMER_TASK"/&gt;
 *     &lt;enumeration value="ASSIGNMENT_TASK"/&gt;
 *     &lt;enumeration value="SESSION_TASK"/&gt;
 *     &lt;enumeration value="WORKLET_TASK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ETaskType")
@XmlEnum
public enum ETaskType {

    COMMAND_TASK,
    DECISION_TASK,
    EVENTWAIT_TASK,
    EVENTRAISE_TASK,
    STARTWORKFLOW_TASK,
    ABORTWORKFLOW_TASK,
    STOPWORKFLOW_TASK,
    EMAIL_TASK,
    TIMER_TASK,
    ASSIGNMENT_TASK,
    SESSION_TASK,
    WORKLET_TASK;

    public String value() {
        return name();
    }

    public static ETaskType fromValue(String v) {
        return valueOf(v);
    }

}
