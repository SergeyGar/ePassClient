
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemtradechannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemtradechannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeitemtradechannelPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemtradechannelPK" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemtradechannel", propOrder = {
    "tradeitemtradechannelPK",
    "tradeitem"
})
public class Tradeitemtradechannel {

    protected TradeitemtradechannelPK tradeitemtradechannelPK;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the tradeitemtradechannelPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemtradechannelPK }
     *     
     */
    public TradeitemtradechannelPK getTradeitemtradechannelPK() {
        return tradeitemtradechannelPK;
    }

    /**
     * Sets the value of the tradeitemtradechannelPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemtradechannelPK }
     *     
     */
    public void setTradeitemtradechannelPK(TradeitemtradechannelPK value) {
        this.tradeitemtradechannelPK = value;
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
