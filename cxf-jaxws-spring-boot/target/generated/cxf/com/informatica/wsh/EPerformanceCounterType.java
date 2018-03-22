
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EPerformanceCounterType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EPerformanceCounterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="INTEGER"/&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EPerformanceCounterType")
@XmlEnum
public enum EPerformanceCounterType {

    INTEGER,
    STRING;

    public String value() {
        return name();
    }

    public static EPerformanceCounterType fromValue(String v) {
        return valueOf(v);
    }

}
