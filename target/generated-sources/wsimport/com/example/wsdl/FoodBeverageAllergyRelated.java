
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageAllergyRelated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageAllergyRelated"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodBeverageAllergyRelatedPK" type="{http://globalservice.ws.bept.ids.by/}foodBeverageAllergyRelatedPK" minOccurs="0"/&gt;
 *         &lt;element name="allergenspecificationname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allergentypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="levelofcontainment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allergenspecificationagency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="allergenstatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageAllergyRelated", propOrder = {
    "foodBeverageAllergyRelatedPK",
    "allergenspecificationname",
    "allergentypecode",
    "levelofcontainment",
    "allergenspecificationagency",
    "allergenstatement",
    "tradeitem"
})
public class FoodBeverageAllergyRelated {

    protected FoodBeverageAllergyRelatedPK foodBeverageAllergyRelatedPK;
    protected String allergenspecificationname;
    protected String allergentypecode;
    protected String levelofcontainment;
    protected String allergenspecificationagency;
    protected String allergenstatement;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodBeverageAllergyRelatedPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageAllergyRelatedPK }
     *     
     */
    public FoodBeverageAllergyRelatedPK getFoodBeverageAllergyRelatedPK() {
        return foodBeverageAllergyRelatedPK;
    }

    /**
     * Sets the value of the foodBeverageAllergyRelatedPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageAllergyRelatedPK }
     *     
     */
    public void setFoodBeverageAllergyRelatedPK(FoodBeverageAllergyRelatedPK value) {
        this.foodBeverageAllergyRelatedPK = value;
    }

    /**
     * Gets the value of the allergenspecificationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergenspecificationname() {
        return allergenspecificationname;
    }

    /**
     * Sets the value of the allergenspecificationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenspecificationname(String value) {
        this.allergenspecificationname = value;
    }

    /**
     * Gets the value of the allergentypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergentypecode() {
        return allergentypecode;
    }

    /**
     * Sets the value of the allergentypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergentypecode(String value) {
        this.allergentypecode = value;
    }

    /**
     * Gets the value of the levelofcontainment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelofcontainment() {
        return levelofcontainment;
    }

    /**
     * Sets the value of the levelofcontainment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelofcontainment(String value) {
        this.levelofcontainment = value;
    }

    /**
     * Gets the value of the allergenspecificationagency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergenspecificationagency() {
        return allergenspecificationagency;
    }

    /**
     * Sets the value of the allergenspecificationagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenspecificationagency(String value) {
        this.allergenspecificationagency = value;
    }

    /**
     * Gets the value of the allergenstatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergenstatement() {
        return allergenstatement;
    }

    /**
     * Sets the value of the allergenstatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergenstatement(String value) {
        this.allergenstatement = value;
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
