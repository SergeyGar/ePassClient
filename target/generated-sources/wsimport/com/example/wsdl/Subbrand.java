
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subbrand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subbrand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subbrandPK" type="{http://globalservice.ws.bept.ids.by/}subbrandPK" minOccurs="0"/&gt;
 *         &lt;element name="subbrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "subbrand", propOrder = {
    "subbrandPK",
    "subbrand",
    "tradeitem"
})
public class Subbrand {

    protected SubbrandPK subbrandPK;
    protected String subbrand;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the subbrandPK property.
     * 
     * @return
     *     possible object is
     *     {@link SubbrandPK }
     *     
     */
    public SubbrandPK getSubbrandPK() {
        return subbrandPK;
    }

    /**
     * Sets the value of the subbrandPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubbrandPK }
     *     
     */
    public void setSubbrandPK(SubbrandPK value) {
        this.subbrandPK = value;
    }

    /**
     * Gets the value of the subbrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubbrand() {
        return subbrand;
    }

    /**
     * Sets the value of the subbrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubbrand(String value) {
        this.subbrand = value;
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
