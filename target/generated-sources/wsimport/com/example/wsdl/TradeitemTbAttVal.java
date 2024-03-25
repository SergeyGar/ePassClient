
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemTbAttVal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemTbAttVal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeitemTbAttValPK" type="{http://globalservice.ws.bept.ids.by/}tradeitemTbAttValPK" minOccurs="0"/&gt;
 *         &lt;element name="attVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemTbAttVal", propOrder = {
    "tradeitemTbAttValPK",
    "attVal",
    "tradeitem"
})
public class TradeitemTbAttVal {

    protected TradeitemTbAttValPK tradeitemTbAttValPK;
    protected String attVal;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the tradeitemTbAttValPK property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemTbAttValPK }
     *     
     */
    public TradeitemTbAttValPK getTradeitemTbAttValPK() {
        return tradeitemTbAttValPK;
    }

    /**
     * Sets the value of the tradeitemTbAttValPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemTbAttValPK }
     *     
     */
    public void setTradeitemTbAttValPK(TradeitemTbAttValPK value) {
        this.tradeitemTbAttValPK = value;
    }

    /**
     * Gets the value of the attVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttVal() {
        return attVal;
    }

    /**
     * Sets the value of the attVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttVal(String value) {
        this.attVal = value;
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
