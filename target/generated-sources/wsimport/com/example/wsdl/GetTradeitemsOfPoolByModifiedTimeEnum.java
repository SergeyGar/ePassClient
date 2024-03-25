
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeitemsOfPoolByModifiedTimeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getTradeitemsOfPoolByModifiedTimeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="NO_RESULTS"/&gt;
 *     &lt;enumeration value="ENDED_QUOTA"/&gt;
 *     &lt;enumeration value="INVALID_DATE"/&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getTradeitemsOfPoolByModifiedTimeEnum")
@XmlEnum
public enum GetTradeitemsOfPoolByModifiedTimeEnum {

    API_ERROR,
    OK,
    NO_RESULTS,
    ENDED_QUOTA,
    INVALID_DATE,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static GetTradeitemsOfPoolByModifiedTimeEnum fromValue(String v) {
        return valueOf(v);
    }

}
