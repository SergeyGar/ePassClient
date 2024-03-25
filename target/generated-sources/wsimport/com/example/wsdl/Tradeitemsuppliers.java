
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemsuppliers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemsuppliers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeitemsuppliersPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemsuppliersPK" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemsuppliers", propOrder = {
    "tradeitemsuppliersPK",
    "tradeitem"
})
public class Tradeitemsuppliers {

    protected TradeitemsuppliersPK tradeitemsuppliersPK;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the tradeitemsuppliersPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemsuppliersPK }
     *     
     */
    public TradeitemsuppliersPK getTradeitemsuppliersPK() {
        return tradeitemsuppliersPK;
    }

    /**
     * Sets the value of the tradeitemsuppliersPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemsuppliersPK }
     *     
     */
    public void setTradeitemsuppliersPK(TradeitemsuppliersPK value) {
        this.tradeitemsuppliersPK = value;
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
