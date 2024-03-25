
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="loginEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_USERNAME"/&gt;
 *     &lt;enumeration value="INVALID_PASSWORD"/&gt;
 *     &lt;enumeration value="INVALID_USERNAME_OR_PASSWORD"/&gt;
 *     &lt;enumeration value="NO_ACCESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "loginEnum")
@XmlEnum
public enum LoginEnum {

    OK,
    INVALID_USERNAME,
    INVALID_PASSWORD,
    INVALID_USERNAME_OR_PASSWORD,
    NO_ACCESS;

    public String value() {
        return name();
    }

    public static LoginEnum fromValue(String v) {
        return valueOf(v);
    }

}
