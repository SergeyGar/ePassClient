
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageMarketingInform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageMarketingInform"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodBeverageMarketingInformPK" type="{http://globalservice.ws.bept.ids.by/}foodBeverageMarketingInformPK" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalclaimcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalprogramcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servingsuggestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalclaim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="healthclaim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageMarketingInform", propOrder = {
    "foodBeverageMarketingInformPK",
    "nutritionalclaimcode",
    "nutritionalprogramcode",
    "servingsuggestion",
    "nutritionalclaim",
    "healthclaim",
    "tradeitem"
})
public class FoodBeverageMarketingInform {

    protected FoodBeverageMarketingInformPK foodBeverageMarketingInformPK;
    protected String nutritionalclaimcode;
    protected String nutritionalprogramcode;
    protected String servingsuggestion;
    protected String nutritionalclaim;
    protected String healthclaim;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodBeverageMarketingInformPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageMarketingInformPK }
     *     
     */
    public FoodBeverageMarketingInformPK getFoodBeverageMarketingInformPK() {
        return foodBeverageMarketingInformPK;
    }

    /**
     * Sets the value of the foodBeverageMarketingInformPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageMarketingInformPK }
     *     
     */
    public void setFoodBeverageMarketingInformPK(FoodBeverageMarketingInformPK value) {
        this.foodBeverageMarketingInformPK = value;
    }

    /**
     * Gets the value of the nutritionalclaimcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionalclaimcode() {
        return nutritionalclaimcode;
    }

    /**
     * Sets the value of the nutritionalclaimcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionalclaimcode(String value) {
        this.nutritionalclaimcode = value;
    }

    /**
     * Gets the value of the nutritionalprogramcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionalprogramcode() {
        return nutritionalprogramcode;
    }

    /**
     * Sets the value of the nutritionalprogramcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionalprogramcode(String value) {
        this.nutritionalprogramcode = value;
    }

    /**
     * Gets the value of the servingsuggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServingsuggestion() {
        return servingsuggestion;
    }

    /**
     * Sets the value of the servingsuggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServingsuggestion(String value) {
        this.servingsuggestion = value;
    }

    /**
     * Gets the value of the nutritionalclaim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionalclaim() {
        return nutritionalclaim;
    }

    /**
     * Sets the value of the nutritionalclaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionalclaim(String value) {
        this.nutritionalclaim = value;
    }

    /**
     * Gets the value of the healthclaim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthclaim() {
        return healthclaim;
    }

    /**
     * Sets the value of the healthclaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthclaim(String value) {
        this.healthclaim = value;
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
