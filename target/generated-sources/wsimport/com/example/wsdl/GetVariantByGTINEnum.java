
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVariantByGTINEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getVariantByGTINEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="INVALID_GTIN"/&gt;
 *     &lt;enumeration value="INVALID_LANG"/&gt;
 *     &lt;enumeration value="LANG_DONT_EXIST"/&gt;
 *     &lt;enumeration value="GTIN_DONT_EXIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getVariantByGTINEnum")
@XmlEnum
public enum GetVariantByGTINEnum {

    API_ERROR,
    OK,
    INVALID_GTIN,
    INVALID_LANG,
    LANG_DONT_EXIST,
    GTIN_DONT_EXIST;

    public String value() {
        return name();
    }

    public static GetVariantByGTINEnum fromValue(String v) {
        return valueOf(v);
    }

}
