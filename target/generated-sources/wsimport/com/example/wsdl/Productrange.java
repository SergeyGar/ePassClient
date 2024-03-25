
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productrange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productrange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productrangePK" type="{http://globalservice.ws.bept.ids.by/}productrangePK" minOccurs="0"/&gt;
 *         &lt;element name="productrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "productrange", propOrder = {
    "productrangePK",
    "productrange",
    "tradeitem"
})
public class Productrange {

    protected ProductrangePK productrangePK;
    protected String productrange;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the productrangePK property.
     * 
     * @return
     *     possible object is
     *     {@link ProductrangePK }
     *     
     */
    public ProductrangePK getProductrangePK() {
        return productrangePK;
    }

    /**
     * Sets the value of the productrangePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductrangePK }
     *     
     */
    public void setProductrangePK(ProductrangePK value) {
        this.productrangePK = value;
    }

    /**
     * Gets the value of the productrange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductrange() {
        return productrange;
    }

    /**
     * Sets the value of the productrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductrange(String value) {
        this.productrange = value;
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
