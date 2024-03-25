
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageNutrientInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageNutrientInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="preparationstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fatinmilkcontent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dailyvalueintakereference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="householdservingsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servingsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageNutrientInfo", propOrder = {
    "globaltradeitemnumber",
    "preparationstate",
    "fatinmilkcontent",
    "dailyvalueintakereference",
    "householdservingsize",
    "servingsize",
    "unitmeasure",
    "tradeitem"
})
public class FoodBeverageNutrientInfo {

    protected Long globaltradeitemnumber;
    protected String preparationstate;
    protected String fatinmilkcontent;
    protected String dailyvalueintakereference;
    protected String householdservingsize;
    protected String servingsize;
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
     * Gets the value of the preparationstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparationstate() {
        return preparationstate;
    }

    /**
     * Sets the value of the preparationstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparationstate(String value) {
        this.preparationstate = value;
    }

    /**
     * Gets the value of the fatinmilkcontent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatinmilkcontent() {
        return fatinmilkcontent;
    }

    /**
     * Sets the value of the fatinmilkcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatinmilkcontent(String value) {
        this.fatinmilkcontent = value;
    }

    /**
     * Gets the value of the dailyvalueintakereference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyvalueintakereference() {
        return dailyvalueintakereference;
    }

    /**
     * Sets the value of the dailyvalueintakereference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyvalueintakereference(String value) {
        this.dailyvalueintakereference = value;
    }

    /**
     * Gets the value of the householdservingsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdservingsize() {
        return householdservingsize;
    }

    /**
     * Sets the value of the householdservingsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdservingsize(String value) {
        this.householdservingsize = value;
    }

    /**
     * Gets the value of the servingsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServingsize() {
        return servingsize;
    }

    /**
     * Sets the value of the servingsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServingsize(String value) {
        this.servingsize = value;
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
