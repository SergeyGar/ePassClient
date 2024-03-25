
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeveragePreparation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeveragePreparation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodBeveragePreparationPK" type="{http://globalservice.ws.bept.ids.by/}foodBeveragePreparationPK" minOccurs="0"/&gt;
 *         &lt;element name="preparationtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conveniencelevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precautions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preparationinstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mintemperatureconsumption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxtemperatureconsumption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preservationtechniquecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeveragePreparation", propOrder = {
    "foodBeveragePreparationPK",
    "preparationtype",
    "conveniencelevel",
    "precautions",
    "preparationinstructions",
    "mintemperatureconsumption",
    "maxtemperatureconsumption",
    "preservationtechniquecode",
    "tradeitem"
})
public class FoodBeveragePreparation {

    protected FoodBeveragePreparationPK foodBeveragePreparationPK;
    protected String preparationtype;
    protected String conveniencelevel;
    protected String precautions;
    protected String preparationinstructions;
    protected String mintemperatureconsumption;
    protected String maxtemperatureconsumption;
    protected String preservationtechniquecode;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodBeveragePreparationPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeveragePreparationPK }
     *     
     */
    public FoodBeveragePreparationPK getFoodBeveragePreparationPK() {
        return foodBeveragePreparationPK;
    }

    /**
     * Sets the value of the foodBeveragePreparationPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeveragePreparationPK }
     *     
     */
    public void setFoodBeveragePreparationPK(FoodBeveragePreparationPK value) {
        this.foodBeveragePreparationPK = value;
    }

    /**
     * Gets the value of the preparationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparationtype() {
        return preparationtype;
    }

    /**
     * Sets the value of the preparationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparationtype(String value) {
        this.preparationtype = value;
    }

    /**
     * Gets the value of the conveniencelevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConveniencelevel() {
        return conveniencelevel;
    }

    /**
     * Sets the value of the conveniencelevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConveniencelevel(String value) {
        this.conveniencelevel = value;
    }

    /**
     * Gets the value of the precautions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecautions() {
        return precautions;
    }

    /**
     * Sets the value of the precautions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecautions(String value) {
        this.precautions = value;
    }

    /**
     * Gets the value of the preparationinstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparationinstructions() {
        return preparationinstructions;
    }

    /**
     * Sets the value of the preparationinstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparationinstructions(String value) {
        this.preparationinstructions = value;
    }

    /**
     * Gets the value of the mintemperatureconsumption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMintemperatureconsumption() {
        return mintemperatureconsumption;
    }

    /**
     * Sets the value of the mintemperatureconsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMintemperatureconsumption(String value) {
        this.mintemperatureconsumption = value;
    }

    /**
     * Gets the value of the maxtemperatureconsumption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxtemperatureconsumption() {
        return maxtemperatureconsumption;
    }

    /**
     * Sets the value of the maxtemperatureconsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxtemperatureconsumption(String value) {
        this.maxtemperatureconsumption = value;
    }

    /**
     * Gets the value of the preservationtechniquecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreservationtechniquecode() {
        return preservationtechniquecode;
    }

    /**
     * Sets the value of the preservationtechniquecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreservationtechniquecode(String value) {
        this.preservationtechniquecode = value;
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
