
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getQuotaImportInfoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="getQuotaImportInfoEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="API_ERROR"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="GLN_NOT_EXIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "getQuotaImportInfoEnum")
@XmlEnum
public enum GetQuotaImportInfoEnum {

    API_ERROR,
    OK,
    GLN_NOT_EXIST;

    public String value() {
        return name();
    }

    public static GetQuotaImportInfoEnum fromValue(String v) {
        return valueOf(v);
    }

}
