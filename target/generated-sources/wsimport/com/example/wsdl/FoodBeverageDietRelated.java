
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageDietRelated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageDietRelated"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dietcertificationagency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dietcertificationnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diettypedescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diettypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diettypesubcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageDietRelated", propOrder = {
    "globaltradeitemnumber",
    "dietcertificationagency",
    "dietcertificationnumber",
    "diettypedescription",
    "diettypecode",
    "diettypesubcode",
    "tradeitem"
})
public class FoodBeverageDietRelated {

    protected Long globaltradeitemnumber;
    protected String dietcertificationagency;
    protected String dietcertificationnumber;
    protected String diettypedescription;
    protected String diettypecode;
    protected String diettypesubcode;
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
     * Gets the value of the dietcertificationagency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDietcertificationagency() {
        return dietcertificationagency;
    }

    /**
     * Sets the value of the dietcertificationagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDietcertificationagency(String value) {
        this.dietcertificationagency = value;
    }

    /**
     * Gets the value of the dietcertificationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDietcertificationnumber() {
        return dietcertificationnumber;
    }

    /**
     * Sets the value of the dietcertificationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDietcertificationnumber(String value) {
        this.dietcertificationnumber = value;
    }

    /**
     * Gets the value of the diettypedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiettypedescription() {
        return diettypedescription;
    }

    /**
     * Sets the value of the diettypedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiettypedescription(String value) {
        this.diettypedescription = value;
    }

    /**
     * Gets the value of the diettypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiettypecode() {
        return diettypecode;
    }

    /**
     * Sets the value of the diettypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiettypecode(String value) {
        this.diettypecode = value;
    }

    /**
     * Gets the value of the diettypesubcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiettypesubcode() {
        return diettypesubcode;
    }

    /**
     * Sets the value of the diettypesubcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiettypesubcode(String value) {
        this.diettypesubcode = value;
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
