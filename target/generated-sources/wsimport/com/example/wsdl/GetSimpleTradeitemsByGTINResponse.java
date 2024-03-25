
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimpleTradeitemsByGTINResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSimpleTradeitemsByGTINResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://globalservice.ws.bept.ids.by/}getSimpleTradeitemsByGTINResp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimpleTradeitemsByGTINResponse", propOrder = {
    "_return"
})
public class GetSimpleTradeitemsByGTINResponse {

    @XmlElement(name = "return")
    protected GetSimpleTradeitemsByGTINResp _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSimpleTradeitemsByGTINResp }
     *     
     */
    public GetSimpleTradeitemsByGTINResp getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSimpleTradeitemsByGTINResp }
     *     
     */
    public void setReturn(GetSimpleTradeitemsByGTINResp value) {
        this._return = value;
    }

}
