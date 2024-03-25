
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimpleTradeitemsByGTINEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getSimpleTradeitemsByGTINEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="PARTLY_OK"/&gt;
 *     &lt;enumeration value="INVALID_LIST"/&gt;
 *     &lt;enumeration value="INVALID_LANG"/&gt;
 *     &lt;enumeration value="ENDED_QUOTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getSimpleTradeitemsByGTINEnum")
@XmlEnum
public enum GetSimpleTradeitemsByGTINEnum {

    API_ERROR,
    OK,
    PARTLY_OK,
    INVALID_LIST,
    INVALID_LANG,
    ENDED_QUOTA;

    public String value() {
        return name();
    }

    public static GetSimpleTradeitemsByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
