
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageServingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageServingInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numberofservingsperpackage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numberofsmallestunitperpackage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maximumnumberofsmallestunits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageServingInfo", propOrder = {
    "globaltradeitemnumber",
    "numberofservingsperpackage",
    "numberofsmallestunitperpackage",
    "maximumnumberofsmallestunits",
    "tradeitem"
})
public class FoodBeverageServingInfo {

    protected Long globaltradeitemnumber;
    protected Integer numberofservingsperpackage;
    protected Integer numberofsmallestunitperpackage;
    protected Integer maximumnumberofsmallestunits;
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
     * Gets the value of the numberofservingsperpackage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberofservingsperpackage() {
        return numberofservingsperpackage;
    }

    /**
     * Sets the value of the numberofservingsperpackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberofservingsperpackage(Integer value) {
        this.numberofservingsperpackage = value;
    }

    /**
     * Gets the value of the numberofsmallestunitperpackage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberofsmallestunitperpackage() {
        return numberofsmallestunitperpackage;
    }

    /**
     * Sets the value of the numberofsmallestunitperpackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberofsmallestunitperpackage(Integer value) {
        this.numberofsmallestunitperpackage = value;
    }

    /**
     * Gets the value of the maximumnumberofsmallestunits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumnumberofsmallestunits() {
        return maximumnumberofsmallestunits;
    }

    /**
     * Sets the value of the maximumnumberofsmallestunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumnumberofsmallestunits(Integer value) {
        this.maximumnumberofsmallestunits = value;
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
