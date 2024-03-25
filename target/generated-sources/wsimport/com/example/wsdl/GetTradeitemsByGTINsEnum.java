
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeitemsByGTINsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getTradeitemsByGTINsEnum"&gt;
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
@XmlType(name = "getTradeitemsByGTINsEnum")
@XmlEnum
public enum GetTradeitemsByGTINsEnum {

    API_ERROR,
    OK,
    NO_RESULTS,
    ENDED_QUOTA,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static GetTradeitemsByGTINsEnum fromValue(String v) {
        return valueOf(v);
    }

}
