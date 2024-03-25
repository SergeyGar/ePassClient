
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for brandname complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="brandname"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brandnamePK" type="{http://globalservice.ws.bept.ids.by/}brandnamePK" minOccurs="0"/&gt;
 *         &lt;element name="brandname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "brandname", propOrder = {
    "brandnamePK",
    "brandname",
    "tradeitem"
})
public class Brandname {

    protected BrandnamePK brandnamePK;
    protected String brandname;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the brandnamePK property.
     * 
     * @return
     *     possible object is
     *     {@link BrandnamePK }
     *     
     */
    public BrandnamePK getBrandnamePK() {
        return brandnamePK;
    }

    /**
     * Sets the value of the brandnamePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandnamePK }
     *     
     */
    public void setBrandnamePK(BrandnamePK value) {
        this.brandnamePK = value;
    }

    /**
     * Gets the value of the brandname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * Sets the value of the brandname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandname(String value) {
        this.brandname = value;
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
