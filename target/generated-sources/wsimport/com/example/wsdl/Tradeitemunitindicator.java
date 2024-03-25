
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemunitindicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemunitindicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemabaseunit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemaconsumerunit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemadespatchunit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemaninvoiceunit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemanorderableunit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemavariableunit" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="pricebymeasuretype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="variabletradeitemtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemunitindicator", propOrder = {
    "globaltradeitemnumber",
    "istradeitemabaseunit",
    "istradeitemaconsumerunit",
    "istradeitemadespatchunit",
    "istradeitemaninvoiceunit",
    "istradeitemanorderableunit",
    "istradeitemavariableunit",
    "pricebymeasuretype",
    "variabletradeitemtype",
    "tpneutraltiinformation"
})
public class Tradeitemunitindicator {

    protected Long globaltradeitemnumber;
    protected Short istradeitemabaseunit;
    protected Short istradeitemaconsumerunit;
    protected Short istradeitemadespatchunit;
    protected Short istradeitemaninvoiceunit;
    protected Short istradeitemanorderableunit;
    protected Short istradeitemavariableunit;
    protected String pricebymeasuretype;
    protected String variabletradeitemtype;
    protected Tpneutraltiinformation tpneutraltiinformation;

    /**
     * Gets the value of the globaltradeitemnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGlobaltradeitemnumber() {
        return globaltradeitemnumber;
    }

    /**
     * Sets the value of the globaltradeitemnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGlobaltradeitemnumber(Long value) {
        this.globaltradeitemnumber = value;
    }

    /**
     * Gets the value of the istradeitemabaseunit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemabaseunit() {
        return istradeitemabaseunit;
    }

    /**
     * Sets the value of the istradeitemabaseunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemabaseunit(Short value) {
        this.istradeitemabaseunit = value;
    }

    /**
     * Gets the value of the istradeitemaconsumerunit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemaconsumerunit() {
        return istradeitemaconsumerunit;
    }

    /**
     * Sets the value of the istradeitemaconsumerunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemaconsumerunit(Short value) {
        this.istradeitemaconsumerunit = value;
    }

    /**
     * Gets the value of the istradeitemadespatchunit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemadespatchunit() {
        return istradeitemadespatchunit;
    }

    /**
     * Sets the value of the istradeitemadespatchunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemadespatchunit(Short value) {
        this.istradeitemadespatchunit = value;
    }

    /**
     * Gets the value of the istradeitemaninvoiceunit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemaninvoiceunit() {
        return istradeitemaninvoiceunit;
    }

    /**
     * Sets the value of the istradeitemaninvoiceunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemaninvoiceunit(Short value) {
        this.istradeitemaninvoiceunit = value;
    }

    /**
     * Gets the value of the istradeitemanorderableunit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemanorderableunit() {
        return istradeitemanorderableunit;
    }

    /**
     * Sets the value of the istradeitemanorderableunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemanorderableunit(Short value) {
        this.istradeitemanorderableunit = value;
    }

    /**
     * Gets the value of the istradeitemavariableunit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemavariableunit() {
        return istradeitemavariableunit;
    }

    /**
     * Sets the value of the istradeitemavariableunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemavariableunit(Short value) {
        this.istradeitemavariableunit = value;
    }

    /**
     * Gets the value of the pricebymeasuretype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricebymeasuretype() {
        return pricebymeasuretype;
    }

    /**
     * Sets the value of the pricebymeasuretype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricebymeasuretype(String value) {
        this.pricebymeasuretype = value;
    }

    /**
     * Gets the value of the variabletradeitemtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariabletradeitemtype() {
        return variabletradeitemtype;
    }

    /**
     * Sets the value of the variabletradeitemtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariabletradeitemtype(String value) {
        this.variabletradeitemtype = value;
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
