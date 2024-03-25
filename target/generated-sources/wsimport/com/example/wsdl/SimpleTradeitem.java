
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleTradeitem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleTradeitem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderRequest" minOccurs="0"/&gt;
 *         &lt;element name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subbrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tnvedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleTradeitem", propOrder = {
    "brand",
    "dateFlag",
    "description",
    "header",
    "lastModificationDate",
    "manufactor",
    "name",
    "subbrand",
    "tnvedCode"
})
public class SimpleTradeitem {

    protected String brand;
    protected String dateFlag;
    protected String description;
    protected ApiHeaderRequest header;
    protected String lastModificationDate;
    protected String manufactor;
    protected String name;
    protected String subbrand;
    protected String tnvedCode;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the dateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFlag() {
        return dateFlag;
    }

    /**
     * Sets the value of the dateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFlag(String value) {
        this.dateFlag = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

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
     * Gets the value of the lastModificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Sets the value of the lastModificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationDate(String value) {
        this.lastModificationDate = value;
    }

    /**
     * Gets the value of the manufactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufactor() {
        return manufactor;
    }

    /**
     * Sets the value of the manufactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufactor(String value) {
        this.manufactor = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the subbrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubbrand() {
        return subbrand;
    }

    /**
     * Sets the value of the subbrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubbrand(String value) {
        this.subbrand = value;
    }

    /**
     * Gets the value of the tnvedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnvedCode() {
        return tnvedCode;
    }

    /**
     * Sets the value of the tnvedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnvedCode(String value) {
        this.tnvedCode = value;
    }

}
