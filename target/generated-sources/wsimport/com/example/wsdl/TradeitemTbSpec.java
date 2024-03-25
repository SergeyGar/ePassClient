
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemTbSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemTbSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="storageconditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childproducts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="catId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="subcatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cat007" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxhumidity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemTbSpec", propOrder = {
    "globaltradeitemnumber",
    "humidity",
    "storageconditions",
    "childproducts",
    "addinfo",
    "packCode",
    "catId",
    "subcatId",
    "cat007",
    "maxhumidity",
    "tradeitem"
})
public class TradeitemTbSpec {

    protected Long globaltradeitemnumber;
    protected Double humidity;
    protected String storageconditions;
    protected String childproducts;
    protected String addinfo;
    protected String packCode;
    protected Long catId;
    protected Long subcatId;
    protected String cat007;
    protected Double maxhumidity;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the globaltradeitemnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGlobaltradeitemnumber() {
        return globaltradeitemnumber;
    }

    /**
     * Sets the value of the globaltradeitemnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGlobaltradeitemnumber(Long value) {
        this.globaltradeitemnumber = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHumidity(Double value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the storageconditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageconditions() {
        return storageconditions;
    }

    /**
     * Sets the value of the storageconditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageconditions(String value) {
        this.storageconditions = value;
    }

    /**
     * Gets the value of the childproducts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildproducts() {
        return childproducts;
    }

    /**
     * Sets the value of the childproducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildproducts(String value) {
        this.childproducts = value;
    }

    /**
     * Gets the value of the addinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddinfo() {
        return addinfo;
    }

    /**
     * Sets the value of the addinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddinfo(String value) {
        this.addinfo = value;
    }

    /**
     * Gets the value of the packCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackCode() {
        return packCode;
    }

    /**
     * Sets the value of the packCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackCode(String value) {
        this.packCode = value;
    }

    /**
     * Gets the value of the catId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatId() {
        return catId;
    }

    /**
     * Sets the value of the catId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatId(Long value) {
        this.catId = value;
    }

    /**
     * Gets the value of the subcatId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubcatId() {
        return subcatId;
    }

    /**
     * Sets the value of the subcatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubcatId(Long value) {
        this.subcatId = value;
    }

    /**
     * Gets the value of the cat007 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCat007() {
        return cat007;
    }

    /**
     * Sets the value of the cat007 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCat007(String value) {
        this.cat007 = value;
    }

    /**
     * Gets the value of the maxhumidity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxhumidity() {
        return maxhumidity;
    }

    /**
     * Sets the value of the maxhumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxhumidity(Double value) {
        this.maxhumidity = value;
    }

    /**
     * Gets the value of the tradeitem property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitem }
     *     
     */
    public Tradeitem getTradeitem() {
        return tradeitem;
    }

    /**
     * Sets the value of the tradeitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitem }
     *     
     */
    public void setTradeitem(Tradeitem value) {
        this.tradeitem = value;
    }

}
