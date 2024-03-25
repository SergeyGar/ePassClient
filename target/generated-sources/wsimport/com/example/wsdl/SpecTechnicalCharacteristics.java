
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specTechnicalCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specTechnicalCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specTechnicalCharacteristicsPK" type="{http://globalservice.ws.bept.ids.by/}specTechnicalCharacteristicsPK" minOccurs="0"/&gt;
 *         &lt;element name="categoryagencycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="characteristicscategorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="characteristicsmeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="characteristicscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="characteristicsvaluecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="characteristicsdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "specTechnicalCharacteristics", propOrder = {
    "specTechnicalCharacteristicsPK",
    "categoryagencycode",
    "characteristicscategorycode",
    "characteristicsmeasurement",
    "characteristicscode",
    "characteristicsvaluecode",
    "characteristicsdescription",
    "tradeitem"
})
public class SpecTechnicalCharacteristics {

    protected SpecTechnicalCharacteristicsPK specTechnicalCharacteristicsPK;
    protected String categoryagencycode;
    protected String characteristicscategorycode;
    protected String characteristicsmeasurement;
    protected String characteristicscode;
    protected String characteristicsvaluecode;
    protected String characteristicsdescription;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the specTechnicalCharacteristicsPK property.
     * 
     * @return
     *     possible object is
     *     {@link SpecTechnicalCharacteristicsPK }
     *     
     */
    public SpecTechnicalCharacteristicsPK getSpecTechnicalCharacteristicsPK() {
        return specTechnicalCharacteristicsPK;
    }

    /**
     * Sets the value of the specTechnicalCharacteristicsPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecTechnicalCharacteristicsPK }
     *     
     */
    public void setSpecTechnicalCharacteristicsPK(SpecTechnicalCharacteristicsPK value) {
        this.specTechnicalCharacteristicsPK = value;
    }

    /**
     * Gets the value of the categoryagencycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryagencycode() {
        return categoryagencycode;
    }

    /**
     * Sets the value of the categoryagencycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryagencycode(String value) {
        this.categoryagencycode = value;
    }

    /**
     * Gets the value of the characteristicscategorycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicscategorycode() {
        return characteristicscategorycode;
    }

    /**
     * Sets the value of the characteristicscategorycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicscategorycode(String value) {
        this.characteristicscategorycode = value;
    }

    /**
     * Gets the value of the characteristicsmeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicsmeasurement() {
        return characteristicsmeasurement;
    }

    /**
     * Sets the value of the characteristicsmeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicsmeasurement(String value) {
        this.characteristicsmeasurement = value;
    }

    /**
     * Gets the value of the characteristicscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicscode() {
        return characteristicscode;
    }

    /**
     * Sets the value of the characteristicscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicscode(String value) {
        this.characteristicscode = value;
    }

    /**
     * Gets the value of the characteristicsvaluecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicsvaluecode() {
        return characteristicsvaluecode;
    }

    /**
     * Sets the value of the characteristicsvaluecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicsvaluecode(String value) {
        this.characteristicsvaluecode = value;
    }

    /**
     * Gets the value of the characteristicsdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicsdescription() {
        return characteristicsdescription;
    }

    /**
     * Sets the value of the characteristicsdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicsdescription(String value) {
        this.characteristicsdescription = value;
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
