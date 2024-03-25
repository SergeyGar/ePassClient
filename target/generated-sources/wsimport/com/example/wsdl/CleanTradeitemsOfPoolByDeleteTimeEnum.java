
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cleanTradeitemsOfPoolByDeleteTimeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="cleanTradeitemsOfPoolByDeleteTimeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NO_RESULTS"/&gt;
 *     &lt;enumeration value="ENDED_QUOTA"/&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "cleanTradeitemsOfPoolByDeleteTimeEnum")
@XmlEnum
public enum CleanTradeitemsOfPoolByDeleteTimeEnum {

    API_ERROR,
    OK,
    NO_RESULTS,
    ENDED_QUOTA,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static CleanTradeitemsOfPoolByDeleteTimeEnum fromValue(String v) {
        return valueOf(v);
    }

}
