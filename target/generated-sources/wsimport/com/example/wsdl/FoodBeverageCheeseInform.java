
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageCheeseInform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageCheeseInform"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="isrindedible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isripenedinrind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rennettypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ripeningtimeperiod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitmeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageCheeseInform", propOrder = {
    "globaltradeitemnumber",
    "isrindedible",
    "isripenedinrind",
    "rennettypecode",
    "ripeningtimeperiod",
    "unitmeasure",
    "tradeitem"
})
public class FoodBeverageCheeseInform {

    protected Long globaltradeitemnumber;
    protected String isrindedible;
    protected String isripenedinrind;
    protected String rennettypecode;
    protected String ripeningtimeperiod;
    protected String unitmeasure;
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
     * Gets the value of the isrindedible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsrindedible() {
        return isrindedible;
    }

    /**
     * Sets the value of the isrindedible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsrindedible(String value) {
        this.isrindedible = value;
    }

    /**
     * Gets the value of the isripenedinrind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsripenedinrind() {
        return isripenedinrind;
    }

    /**
     * Sets the value of the isripenedinrind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsripenedinrind(String value) {
        this.isripenedinrind = value;
    }

    /**
     * Gets the value of the rennettypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRennettypecode() {
        return rennettypecode;
    }

    /**
     * Sets the value of the rennettypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRennettypecode(String value) {
        this.rennettypecode = value;
    }

    /**
     * Gets the value of the ripeningtimeperiod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRipeningtimeperiod() {
        return ripeningtimeperiod;
    }

    /**
     * Sets the value of the ripeningtimeperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRipeningtimeperiod(String value) {
        this.ripeningtimeperiod = value;
    }

    /**
     * Gets the value of the unitmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitmeasure() {
        return unitmeasure;
    }

    /**
     * Sets the value of the unitmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitmeasure(String value) {
        this.unitmeasure = value;
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
