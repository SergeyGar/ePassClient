
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="variantPK" type="{http://globalservice.ws.bept.ids.by/}variantPK" minOccurs="0"/&gt;
 *         &lt;element name="variant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "variant", propOrder = {
    "variantPK",
    "variant",
    "tradeitem"
})
public class Variant {

    protected VariantPK variantPK;
    protected String variant;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the variantPK property.
     * 
     * @return
     *     possible object is
     *     {@link VariantPK }
     *     
     */
    public VariantPK getVariantPK() {
        return variantPK;
    }

    /**
     * Sets the value of the variantPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantPK }
     *     
     */
    public void setVariantPK(VariantPK value) {
        this.variantPK = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
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
