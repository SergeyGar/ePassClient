
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTradeitemByGTIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTradeitemByGTIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://globalservice.ws.bept.ids.by/}getTradeitemByGTINReq" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTradeitemByGTIN", propOrder = {
    "request"
})
public class GetTradeitemByGTIN {

    protected GetTradeitemByGTINReq request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetTradeitemByGTINReq }
     *     
     */
    public GetTradeitemByGTINReq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTradeitemByGTINReq }
     *     
     */
    public void setRequest(GetTradeitemByGTINReq value) {
        this.request = value;
    }

}
