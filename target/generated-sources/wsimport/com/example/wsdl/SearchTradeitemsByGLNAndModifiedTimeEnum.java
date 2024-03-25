
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchTradeitemsByGLNAndModifiedTimeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="searchTradeitemsByGLNAndModifiedTimeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_GLN"/&gt;
 *     &lt;enumeration value="INVALID_FROMDATE"/&gt;
 *     &lt;enumeration value="INVALID_TODATE"/&gt;
 *     &lt;enumeration value="INVALID_RECORD_COUNT"/&gt;
 *     &lt;enumeration value="INVALID_START_RECORD"/&gt;
 *     &lt;enumeration value="NO_RESULTS"/&gt;
 *     &lt;enumeration value="GLN_DONT_EXIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "searchTradeitemsByGLNAndModifiedTimeEnum")
@XmlEnum
public enum SearchTradeitemsByGLNAndModifiedTimeEnum {

    API_ERROR,
    OK,
    INVALID_GLN,
    INVALID_FROMDATE,
    INVALID_TODATE,
    INVALID_RECORD_COUNT,
    INVALID_START_RECORD,
    NO_RESULTS,
    GLN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static SearchTradeitemsByGLNAndModifiedTimeEnum fromValue(String v) {
        return valueOf(v);
    }

}
