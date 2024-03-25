
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiHeaderEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="apiHeaderEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *     &lt;enumeration value="SESSION_EXPIRED"/&gt;
 *     &lt;enumeration value="INVALID_HEADER"/&gt;
 *     &lt;enumeration value="INVALID_SESSIONTOKEN"/&gt;
 *     &lt;enumeration value="NO_SESSION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "apiHeaderEnum")
@XmlEnum
public enum ApiHeaderEnum {

    OK,
    INTERNAL_ERROR,
    SESSION_EXPIRED,
    INVALID_HEADER,
    INVALID_SESSIONTOKEN,
    NO_SESSION;

    public String value() {
        return name();
    }

    public static ApiHeaderEnum fromValue(String v) {
        return valueOf(v);
    }

}
