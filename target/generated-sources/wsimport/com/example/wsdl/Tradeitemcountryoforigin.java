
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemcountryoforigin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemcountryoforigin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeitemcountryoforiginPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemcountryoforiginPK" minOccurs="0"/&gt;
 *         &lt;element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemcountryoforigin", propOrder = {
    "tradeitemcountryoforiginPK",
    "tpneutraltiinformation"
})
public class Tradeitemcountryoforigin {

    protected TradeitemcountryoforiginPK tradeitemcountryoforiginPK;
    protected Tpneutraltiinformation tpneutraltiinformation;

    /**
     * Gets the value of the tradeitemcountryoforiginPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemcountryoforiginPK }
     *     
     */
    public TradeitemcountryoforiginPK getTradeitemcountryoforiginPK() {
        return tradeitemcountryoforiginPK;
    }

    /**
     * Sets the value of the tradeitemcountryoforiginPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemcountryoforiginPK }
     *     
     */
    public void setTradeitemcountryoforiginPK(TradeitemcountryoforiginPK value) {
        this.tradeitemcountryoforiginPK = value;
    }

    /**
     * Gets the value of the tpneutraltiinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public Tpneutraltiinformation getTpneutraltiinformation() {
        return tpneutraltiinformation;
    }

    /**
     * Sets the value of the tpneutraltiinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public void setTpneutraltiinformation(Tpneutraltiinformation value) {
        this.tpneutraltiinformation = value;
    }

}
