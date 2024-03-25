
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemcertificatePK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemcertificatePK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificatetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificatenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemcertificatePK", propOrder = {
    "certificatetype",
    "certificatenumber"
})
public class TradeitemcertificatePK {

    protected String certificatetype;
    protected String certificatenumber;

    /**
     * Gets the value of the certificatetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificatetype() {
        return certificatetype;
    }

    /**
     * Sets the value of the certificatetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificatetype(String value) {
        this.certificatetype = value;
    }

    /**
     * Gets the value of the certificatenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificatenumber() {
        return certificatenumber;
    }

    /**
     * Sets the value of the certificatenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificatenumber(String value) {
        this.certificatenumber = value;
    }

}
