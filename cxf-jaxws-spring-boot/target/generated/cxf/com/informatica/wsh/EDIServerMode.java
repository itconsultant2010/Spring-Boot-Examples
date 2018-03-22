
package com.informatica.wsh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EDIServerMode.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EDIServerMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ASCII"/&gt;
 *     &lt;enumeration value="UNICODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EDIServerMode")
@XmlEnum
public enum EDIServerMode {

    ASCII,
    UNICODE;

    public String value() {
        return name();
    }

    public static EDIServerMode fromValue(String v) {
        return valueOf(v);
    }

}
