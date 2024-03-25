
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageMicrobiological complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageMicrobiological"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodBeverageMicrobiologicalPK" type="{http://globalservice.ws.bept.ids.by/}foodBeverageMicrobiologicalPK" minOccurs="0"/&gt;
 *         &lt;element name="microbiologicalorganismcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maximumvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="measurementvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageMicrobiological", propOrder = {
    "foodBeverageMicrobiologicalPK",
    "microbiologicalorganismcode",
    "maximumvalue",
    "measurementvalue",
    "unitmeasure",
    "tradeitem"
})
public class FoodBeverageMicrobiological {

    protected FoodBeverageMicrobiologicalPK foodBeverageMicrobiologicalPK;
    protected String microbiologicalorganismcode;
    protected String maximumvalue;
    protected String measurementvalue;
    protected String unitmeasure;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodBeverageMicrobiologicalPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageMicrobiologicalPK }
     *     
     */
    public FoodBeverageMicrobiologicalPK getFoodBeverageMicrobiologicalPK() {
        return foodBeverageMicrobiologicalPK;
    }

    /**
     * Sets the value of the foodBeverageMicrobiologicalPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageMicrobiologicalPK }
     *     
     */
    public void setFoodBeverageMicrobiologicalPK(FoodBeverageMicrobiologicalPK value) {
        this.foodBeverageMicrobiologicalPK = value;
    }

    /**
     * Gets the value of the microbiologicalorganismcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrobiologicalorganismcode() {
        return microbiologicalorganismcode;
    }

    /**
     * Sets the value of the microbiologicalorganismcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrobiologicalorganismcode(String value) {
        this.microbiologicalorganismcode = value;
    }

    /**
     * Gets the value of the maximumvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumvalue() {
        return maximumvalue;
    }

    /**
     * Sets the value of the maximumvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumvalue(String value) {
        this.maximumvalue = value;
    }

    /**
     * Gets the value of the measurementvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementvalue() {
        return measurementvalue;
    }

    /**
     * Sets the value of the measurementvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementvalue(String value) {
        this.measurementvalue = value;
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
