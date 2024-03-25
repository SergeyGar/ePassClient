
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBevergeIngredientInform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBevergeIngredientInform"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="geneticallymodifieddeclaration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ishomogenised" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weightmaterialused" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weightmaterialmeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multidescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBevergeIngredientInform", propOrder = {
    "globaltradeitemnumber",
    "geneticallymodifieddeclaration",
    "ishomogenised",
    "weightmaterialused",
    "weightmaterialmeasurement",
    "multidescription",
    "tradeitem"
})
public class FoodBevergeIngredientInform {

    protected Long globaltradeitemnumber;
    protected String geneticallymodifieddeclaration;
    protected String ishomogenised;
    protected String weightmaterialused;
    protected String weightmaterialmeasurement;
    protected String multidescription;
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
     * Gets the value of the geneticallymodifieddeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneticallymodifieddeclaration() {
        return geneticallymodifieddeclaration;
    }

    /**
     * Sets the value of the geneticallymodifieddeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneticallymodifieddeclaration(String value) {
        this.geneticallymodifieddeclaration = value;
    }

    /**
     * Gets the value of the ishomogenised property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIshomogenised() {
        return ishomogenised;
    }

    /**
     * Sets the value of the ishomogenised property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIshomogenised(String value) {
        this.ishomogenised = value;
    }

    /**
     * Gets the value of the weightmaterialused property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightmaterialused() {
        return weightmaterialused;
    }

    /**
     * Sets the value of the weightmaterialused property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightmaterialused(String value) {
        this.weightmaterialused = value;
    }

    /**
     * Gets the value of the weightmaterialmeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightmaterialmeasurement() {
        return weightmaterialmeasurement;
    }

    /**
     * Sets the value of the weightmaterialmeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightmaterialmeasurement(String value) {
        this.weightmaterialmeasurement = value;
    }

    /**
     * Gets the value of the multidescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultidescription() {
        return multidescription;
    }

    /**
     * Sets the value of the multidescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultidescription(String value) {
        this.multidescription = value;
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
