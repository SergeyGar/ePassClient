
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPartyByUNPEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getPartyByUNPEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_UNP"/&gt;
 *     &lt;enumeration value="UNP_NOT_EXIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getPartyByUNPEnum")
@XmlEnum
public enum GetPartyByUNPEnum {

    API_ERROR,
    OK,
    INVALID_UNP,
    UNP_NOT_EXIST;

    public String value() {
        return name();
    }

    public static GetPartyByUNPEnum fromValue(String v) {
        return valueOf(v);
    }

}
