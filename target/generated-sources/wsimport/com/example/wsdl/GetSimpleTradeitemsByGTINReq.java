
package com.example.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimpleTradeitemsByGTINReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSimpleTradeitemsByGTINReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderRequest" minOccurs="0"/&gt;
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listOfGTIN" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimpleTradeitemsByGTINReq", propOrder = {
    "header",
    "lang",
    "listOfGTIN"
})
public class GetSimpleTradeitemsByGTINReq {

    protected ApiHeaderRequest header;
    protected String lang;
    @XmlElement(nillable = true)
    protected List<Long> listOfGTIN;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderRequest }
     *     
     */
    public ApiHeaderRequest getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderRequest }
     *     
     */
    public void setHeader(ApiHeaderRequest value) {
        this.header = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the listOfGTIN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listOfGTIN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfGTIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getListOfGTIN() {
        if (listOfGTIN == null) {
            listOfGTIN = new ArrayList<Long>();
        }
        return this.listOfGTIN;
    }

}
