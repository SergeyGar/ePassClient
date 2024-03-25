
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classificatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="classificatorEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLASSIFICATOR005"/&gt;
 *     &lt;enumeration value="CLASSIFICATOR007"/&gt;
 *     &lt;enumeration value="TNVED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "classificatorEnum")
@XmlEnum
public enum ClassificatorEnum {

    @XmlEnumValue("CLASSIFICATOR005")
    CLASSIFICATOR_005("CLASSIFICATOR005"),
    @XmlEnumValue("CLASSIFICATOR007")
    CLASSIFICATOR_007("CLASSIFICATOR007"),
    TNVED("TNVED");
    private final String value;

    ClassificatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassificatorEnum fromValue(String v) {
        for (ClassificatorEnum c: ClassificatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
