
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemdescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemdescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeitemdescriptionPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemdescriptionPK" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemdescription", propOrder = {
    "tradeitemdescriptionPK",
    "tradeitemdescription",
    "tradeitem"
})
public class Tradeitemdescription {

    protected TradeitemdescriptionPK tradeitemdescriptionPK;
    protected String tradeitemdescription;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the tradeitemdescriptionPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemdescriptionPK }
     *     
     */
    public TradeitemdescriptionPK getTradeitemdescriptionPK() {
        return tradeitemdescriptionPK;
    }

    /**
     * Sets the value of the tradeitemdescriptionPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemdescriptionPK }
     *     
     */
    public void setTradeitemdescriptionPK(TradeitemdescriptionPK value) {
        this.tradeitemdescriptionPK = value;
    }

    /**
     * Gets the value of the tradeitemdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeitemdescription() {
        return tradeitemdescription;
    }

    /**
     * Sets the value of the tradeitemdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeitemdescription(String value) {
        this.tradeitemdescription = value;
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
