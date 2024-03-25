
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckGTIN29Enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getCheckGTIN29Enum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_GTIN"/&gt;
 *     &lt;enumeration value="GTIN_IS_NOT_LIMITED_CIRCULATION"/&gt;
 *     &lt;enumeration value="GLN_DONT_EXIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getCheckGTIN29Enum")
@XmlEnum
public enum GetCheckGTIN29Enum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    GTIN_IS_NOT_LIMITED_CIRCULATION,
    GLN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static GetCheckGTIN29Enum fromValue(String v) {
        return valueOf(v);
    }

}
