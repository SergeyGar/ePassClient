
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageIngredient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageIngredient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodBeverageIngredientPK" type="{http://globalservice.ws.bept.ids.by/}foodBeverageIngredientPK" minOccurs="0"/&gt;
 *         &lt;element name="ingredientsequencs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ingredientname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryoforigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contentpercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fishcatchzone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grapevarientcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="growingmethodcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ingredientpurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ingredientsourceanimalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ingredientstatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageIngredient", propOrder = {
    "foodBeverageIngredientPK",
    "ingredientsequencs",
    "ingredientname",
    "countryoforigin",
    "contentpercentage",
    "fishcatchzone",
    "grapevarientcode",
    "growingmethodcode",
    "ingredientpurpose",
    "ingredientsourceanimalcode",
    "ingredientstatement",
    "tradeitem"
})
public class FoodBeverageIngredient {

    protected FoodBeverageIngredientPK foodBeverageIngredientPK;
    protected Integer ingredientsequencs;
    protected String ingredientname;
    protected String countryoforigin;
    protected String contentpercentage;
    protected String fishcatchzone;
    protected String grapevarientcode;
    protected String growingmethodcode;
    protected String ingredientpurpose;
    protected String ingredientsourceanimalcode;
    protected String ingredientstatement;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodBeverageIngredientPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageIngredientPK }
     *     
     */
    public FoodBeverageIngredientPK getFoodBeverageIngredientPK() {
        return foodBeverageIngredientPK;
    }

    /**
     * Sets the value of the foodBeverageIngredientPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageIngredientPK }
     *     
     */
    public void setFoodBeverageIngredientPK(FoodBeverageIngredientPK value) {
        this.foodBeverageIngredientPK = value;
    }

    /**
     * Gets the value of the ingredientsequencs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIngredientsequencs() {
        return ingredientsequencs;
    }

    /**
     * Sets the value of the ingredientsequencs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIngredientsequencs(Integer value) {
        this.ingredientsequencs = value;
    }

    /**
     * Gets the value of the ingredientname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientname() {
        return ingredientname;
    }

    /**
     * Sets the value of the ingredientname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientname(String value) {
        this.ingredientname = value;
    }

    /**
     * Gets the value of the countryoforigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryoforigin() {
        return countryoforigin;
    }

    /**
     * Sets the value of the countryoforigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryoforigin(String value) {
        this.countryoforigin = value;
    }

    /**
     * Gets the value of the contentpercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentpercentage() {
        return contentpercentage;
    }

    /**
     * Sets the value of the contentpercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentpercentage(String value) {
        this.contentpercentage = value;
    }

    /**
     * Gets the value of the fishcatchzone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFishcatchzone() {
        return fishcatchzone;
    }

    /**
     * Sets the value of the fishcatchzone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFishcatchzone(String value) {
        this.fishcatchzone = value;
    }

    /**
     * Gets the value of the grapevarientcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrapevarientcode() {
        return grapevarientcode;
    }

    /**
     * Sets the value of the grapevarientcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrapevarientcode(String value) {
        this.grapevarientcode = value;
    }

    /**
     * Gets the value of the growingmethodcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrowingmethodcode() {
        return growingmethodcode;
    }

    /**
     * Sets the value of the growingmethodcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrowingmethodcode(String value) {
        this.growingmethodcode = value;
    }

    /**
     * Gets the value of the ingredientpurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientpurpose() {
        return ingredientpurpose;
    }

    /**
     * Sets the value of the ingredientpurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientpurpose(String value) {
        this.ingredientpurpose = value;
    }

    /**
     * Gets the value of the ingredientsourceanimalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientsourceanimalcode() {
        return ingredientsourceanimalcode;
    }

    /**
     * Sets the value of the ingredientsourceanimalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientsourceanimalcode(String value) {
        this.ingredientsourceanimalcode = value;
    }

    /**
     * Gets the value of the ingredientstatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientstatement() {
        return ingredientstatement;
    }

    /**
     * Sets the value of the ingredientstatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientstatement(String value) {
        this.ingredientstatement = value;
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
