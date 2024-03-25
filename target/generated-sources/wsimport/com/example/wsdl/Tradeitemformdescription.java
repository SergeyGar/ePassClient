
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemformdescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemformdescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeitemformdescriptionPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemformdescriptionPK" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemformdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemformdescription", propOrder = {
    "tradeitemformdescriptionPK",
    "tradeitemformdescription",
    "tradeitem"
})
public class Tradeitemformdescription {

    protected TradeitemformdescriptionPK tradeitemformdescriptionPK;
    protected String tradeitemformdescription;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the tradeitemformdescriptionPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemformdescriptionPK }
     *     
     */
    public TradeitemformdescriptionPK getTradeitemformdescriptionPK() {
        return tradeitemformdescriptionPK;
    }

    /**
     * Sets the value of the tradeitemformdescriptionPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemformdescriptionPK }
     *     
     */
    public void setTradeitemformdescriptionPK(TradeitemformdescriptionPK value) {
        this.tradeitemformdescriptionPK = value;
    }

    /**
     * Gets the value of the tradeitemformdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeitemformdescription() {
        return tradeitemformdescription;
    }

    /**
     * Sets the value of the tradeitemformdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeitemformdescription(String value) {
        this.tradeitemformdescription = value;
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
