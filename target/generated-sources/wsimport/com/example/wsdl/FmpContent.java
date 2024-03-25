
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fmpContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fmpContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fmpContentPK" type="{http://globalservice.ws.bept.ids.by/}fmpContentPK" minOccurs="0"/&gt;
 *         &lt;element name="fmptypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minfmpcontent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitmeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "fmpContent", propOrder = {
    "fmpContentPK",
    "fmptypecode",
    "minfmpcontent",
    "unitmeasure",
    "tradeitem"
})
public class FmpContent {

    protected FmpContentPK fmpContentPK;
    protected String fmptypecode;
    protected String minfmpcontent;
    protected String unitmeasure;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the fmpContentPK property.
     * 
     * @return
     *     possible object is
     *     {@link FmpContentPK }
     *     
     */
    public FmpContentPK getFmpContentPK() {
        return fmpContentPK;
    }

    /**
     * Sets the value of the fmpContentPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FmpContentPK }
     *     
     */
    public void setFmpContentPK(FmpContentPK value) {
        this.fmpContentPK = value;
    }

    /**
     * Gets the value of the fmptypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmptypecode() {
        return fmptypecode;
    }

    /**
     * Sets the value of the fmptypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmptypecode(String value) {
        this.fmptypecode = value;
    }

    /**
     * Gets the value of the minfmpcontent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinfmpcontent() {
        return minfmpcontent;
    }

    /**
     * Sets the value of the minfmpcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinfmpcontent(String value) {
        this.minfmpcontent = value;
    }

    /**
     * Gets the value of the unitmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitmeasure() {
        return unitmeasure;
    }

    /**
     * Sets the value of the unitmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitmeasure(String value) {
        this.unitmeasure = value;
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
