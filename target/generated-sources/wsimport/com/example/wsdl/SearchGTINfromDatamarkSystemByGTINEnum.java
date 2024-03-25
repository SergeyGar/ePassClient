
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchGTINfromDatamarkSystemByGTINEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="searchGTINfromDatamarkSystemByGTINEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_GTIN"/&gt;
 *     &lt;enumeration value="INVALID_ROLE"/&gt;
 *     &lt;enumeration value="GTIN_DONT_EXIST"/&gt;
 *     &lt;enumeration value="NO_RESULTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "searchGTINfromDatamarkSystemByGTINEnum")
@XmlEnum
public enum SearchGTINfromDatamarkSystemByGTINEnum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    INVALID_ROLE,
    GTIN_DONT_EXIST,
    NO_RESULTS;

    public String value() {
        return name();
    }

    public static SearchGTINfromDatamarkSystemByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
