
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTradeitemsByGLNAndModifiedTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchTradeitemsByGLNAndModifiedTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://globalservice.ws.bept.ids.by/}searchTradeitemsByGLNAndModifiedTimeReq" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchTradeitemsByGLNAndModifiedTime", propOrder = {
    "request"
})
public class SearchTradeitemsByGLNAndModifiedTime {

    protected SearchTradeitemsByGLNAndModifiedTimeReq request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTradeitemsByGLNAndModifiedTimeReq }
     *     
     */
    public SearchTradeitemsByGLNAndModifiedTimeReq getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTradeitemsByGLNAndModifiedTimeReq }
     *     
     */
    public void setRequest(SearchTradeitemsByGLNAndModifiedTimeReq value) {
        this.request = value;
    }

}
