
package com.example.wsdl;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemrbspec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemrbspec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="consist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calorificvalue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nutritionalvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="expirationtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minstoragetemperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxstoragetemperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calorificvaluej" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemrbspec", propOrder = {
    "globaltradeitemnumber",
    "consist",
    "calorificvalue",
    "nutritionalvalue",
    "expirationdate",
    "expirationtype",
    "minstoragetemperature",
    "maxstoragetemperature",
    "calorificvaluej",
    "tradeitem"
})
public class Tradeitemrbspec {

    protected Long globaltradeitemnumber;
    protected String consist;
    protected BigDecimal calorificvalue;
    protected String nutritionalvalue;
    protected Short expirationdate;
    protected String expirationtype;
    protected String minstoragetemperature;
    protected String maxstoragetemperature;
    protected BigDecimal calorificvaluej;
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
     * Gets the value of the consist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsist() {
        return consist;
    }

    /**
     * Sets the value of the consist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsist(String value) {
        this.consist = value;
    }

    /**
     * Gets the value of the calorificvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalorificvalue() {
        return calorificvalue;
    }

    /**
     * Sets the value of the calorificvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalorificvalue(BigDecimal value) {
        this.calorificvalue = value;
    }

    /**
     * Gets the value of the nutritionalvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutritionalvalue() {
        return nutritionalvalue;
    }

    /**
     * Sets the value of the nutritionalvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutritionalvalue(String value) {
        this.nutritionalvalue = value;
    }

    /**
     * Gets the value of the expirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getExpirationdate() {
        return expirationdate;
    }

    /**
     * Sets the value of the expirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setExpirationdate(Short value) {
        this.expirationdate = value;
    }

    /**
     * Gets the value of the expirationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationtype() {
        return expirationtype;
    }

    /**
     * Sets the value of the expirationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationtype(String value) {
        this.expirationtype = value;
    }

    /**
     * Gets the value of the minstoragetemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinstoragetemperature() {
        return minstoragetemperature;
    }

    /**
     * Sets the value of the minstoragetemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinstoragetemperature(String value) {
        this.minstoragetemperature = value;
    }

    /**
     * Gets the value of the maxstoragetemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxstoragetemperature() {
        return maxstoragetemperature;
    }

    /**
     * Sets the value of the maxstoragetemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxstoragetemperature(String value) {
        this.maxstoragetemperature = value;
    }

    /**
     * Gets the value of the calorificvaluej property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalorificvaluej() {
        return calorificvaluej;
    }

    /**
     * Sets the value of the calorificvaluej property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalorificvaluej(BigDecimal value) {
        this.calorificvaluej = value;
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
