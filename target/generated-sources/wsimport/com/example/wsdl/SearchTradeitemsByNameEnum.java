
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchTradeitemsByNameEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="searchTradeitemsByNameEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_NAME"/&gt;
 *     &lt;enumeration value="INVALID_RECORD_COUNT"/&gt;
 *     &lt;enumeration value="INVALID_START_RECORD"/&gt;
 *     &lt;enumeration value="NO_RESULTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "searchTradeitemsByNameEnum")
@XmlEnum
public enum SearchTradeitemsByNameEnum {

    API_ERROR,
    OK,
    INVALID_NAME,
    INVALID_RECORD_COUNT,
    INVALID_START_RECORD,
    NO_RESULTS;

    public String value() {
        return name();
    }

    public static SearchTradeitemsByNameEnum fromValue(String v) {
        return valueOf(v);
    }

}
