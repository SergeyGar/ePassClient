
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeitemByGTINEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getTradeitemByGTINEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_GTIN"/&gt;
 *     &lt;enumeration value="ENDED_QUOTA"/&gt;
 *     &lt;enumeration value="GTIN_DONT_EXIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getTradeitemByGTINEnum")
@XmlEnum
public enum GetTradeitemByGTINEnum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    ENDED_QUOTA,
    GTIN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static GetTradeitemByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
