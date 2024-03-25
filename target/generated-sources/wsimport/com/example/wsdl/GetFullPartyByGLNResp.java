
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFullPartyByGLNResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFullPartyByGLNResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getFullPartyByGLNEnum" minOccurs="0"/&gt;
 *         &lt;element name="fullparty" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFullPartyByGLNResp", propOrder = {
    "errorCode",
    "fullparty",
    "header"
})
public class GetFullPartyByGLNResp {

    @XmlSchemaType(name = "string")
    protected GetFullPartyByGLNEnum errorCode;
    protected Party fullparty;
    protected ApiHeaderResponse header;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetFullPartyByGLNEnum }
     *     
     */
    public GetFullPartyByGLNEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFullPartyByGLNEnum }
     *     
     */
    public void setErrorCode(GetFullPartyByGLNEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the fullparty property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getFullparty() {
        return fullparty;
    }

    /**
     * Sets the value of the fullparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setFullparty(Party value) {
        this.fullparty = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderResponse }
     *     
     */
    public ApiHeaderResponse getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderResponse }
     *     
     */
    public void setHeader(ApiHeaderResponse value) {
        this.header = value;
    }

}
