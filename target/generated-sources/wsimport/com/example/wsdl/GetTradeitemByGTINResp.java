
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeitemByGTINResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTradeitemByGTINResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getTradeitemByGTINEnum" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/&gt;
 *         &lt;element name="quota" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ti" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTradeitemByGTINResp", propOrder = {
    "errorCode",
    "header",
    "quota",
    "ti"
})
public class GetTradeitemByGTINResp {

    @XmlSchemaType(name = "string")
    protected GetTradeitemByGTINEnum errorCode;
    protected ApiHeaderResponse header;
    protected long quota;
    protected Tradeitem ti;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetTradeitemByGTINEnum }
     *     
     */
    public GetTradeitemByGTINEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTradeitemByGTINEnum }
     *     
     */
    public void setErrorCode(GetTradeitemByGTINEnum value) {
        this.errorCode = value;
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

    /**
     * Gets the value of the quota property.
     * 
     */
    public long getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     */
    public void setQuota(long value) {
        this.quota = value;
    }

    /**
     * Gets the value of the ti property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitem }
     *     
     */
    public Tradeitem getTi() {
        return ti;
    }

    /**
     * Sets the value of the ti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitem }
     *     
     */
    public void setTi(Tradeitem value) {
        this.ti = value;
    }

}
