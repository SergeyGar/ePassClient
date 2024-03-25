
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productYieldInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productYieldInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productYieldInformationPK" type="{http://globalservice.ws.bept.ids.by/}productYieldInformationPK" minOccurs="0"/&gt;
 *         &lt;element name="productyieldtypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productyieldvariation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productyield" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productyieldunitofmeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "productYieldInformation", propOrder = {
    "productYieldInformationPK",
    "productyieldtypecode",
    "productyieldvariation",
    "productyield",
    "productyieldunitofmeasure",
    "tradeitem"
})
public class ProductYieldInformation {

    protected ProductYieldInformationPK productYieldInformationPK;
    protected String productyieldtypecode;
    protected String productyieldvariation;
    protected String productyield;
    protected String productyieldunitofmeasure;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the productYieldInformationPK property.
     * 
     * @return
     *     possible object is
     *     {@link ProductYieldInformationPK }
     *     
     */
    public ProductYieldInformationPK getProductYieldInformationPK() {
        return productYieldInformationPK;
    }

    /**
     * Sets the value of the productYieldInformationPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductYieldInformationPK }
     *     
     */
    public void setProductYieldInformationPK(ProductYieldInformationPK value) {
        this.productYieldInformationPK = value;
    }

    /**
     * Gets the value of the productyieldtypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductyieldtypecode() {
        return productyieldtypecode;
    }

    /**
     * Sets the value of the productyieldtypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductyieldtypecode(String value) {
        this.productyieldtypecode = value;
    }

    /**
     * Gets the value of the productyieldvariation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductyieldvariation() {
        return productyieldvariation;
    }

    /**
     * Sets the value of the productyieldvariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductyieldvariation(String value) {
        this.productyieldvariation = value;
    }

    /**
     * Gets the value of the productyield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductyield() {
        return productyield;
    }

    /**
     * Sets the value of the productyield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductyield(String value) {
        this.productyield = value;
    }

    /**
     * Gets the value of the productyieldunitofmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductyieldunitofmeasure() {
        return productyieldunitofmeasure;
    }

    /**
     * Sets the value of the productyieldunitofmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductyieldunitofmeasure(String value) {
        this.productyieldunitofmeasure = value;
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
