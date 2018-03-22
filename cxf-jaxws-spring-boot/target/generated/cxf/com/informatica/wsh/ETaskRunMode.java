
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ETaskRunMode.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ETaskRunMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="RECOVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ETaskRunMode")
@XmlEnum
public enum ETaskRunMode {

    NORMAL,
    RECOVERY;

    public String value() {
        return name();
    }

    public static ETaskRunMode fromValue(String v) {
        return valueOf(v);
    }

}
