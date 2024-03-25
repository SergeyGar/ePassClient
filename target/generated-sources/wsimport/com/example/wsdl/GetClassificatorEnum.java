
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClassificatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getClassificatorEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_CLASSIFICATOR"/&gt;
 *     &lt;enumeration value="INVALID_PATH"/&gt;
 *     &lt;enumeration value="INVALID_POSITION"/&gt;
 *     &lt;enumeration value="SERVICE_DISABLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getClassificatorEnum")
@XmlEnum
public enum GetClassificatorEnum {

    API_ERROR,
    OK,
    INVALID_CLASSIFICATOR,
    INVALID_PATH,
    INVALID_POSITION,
    SERVICE_DISABLED;

    public String value() {
        return name();
    }

    public static GetClassificatorEnum fromValue(String v) {
        return valueOf(v);
    }

}
