
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTIImageKindsByGTINEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getTIImageKindsByGTINEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_LIST_OF_GTINS"/&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getTIImageKindsByGTINEnum")
@XmlEnum
public enum GetTIImageKindsByGTINEnum {

    API_ERROR,
    OK,
    INVALID_LIST_OF_GTINS,
    INTERNAL_ERROR;

    public String value() {
        return name();
    }

    public static GetTIImageKindsByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
