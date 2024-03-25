
package com.example.wsdl;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partytaxinformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partytaxinformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partytaxinformationid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxauthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxpercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="taxregistrationnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeoftaxragistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gln" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partytaxinformation", propOrder = {
    "partytaxinformationid",
    "taxamount",
    "taxauthority",
    "taxpercent",
    "taxregistrationnumber",
    "typeoftaxragistration",
    "gln"
})
public class Partytaxinformation {

    protected BigDecimal partytaxinformationid;
    protected String taxamount;
    protected String taxauthority;
    protected BigDecimal taxpercent;
    protected String taxregistrationnumber;
    protected String typeoftaxragistration;
    protected Party gln;

    /**
     * Gets the value of the partytaxinformationid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartytaxinformationid() {
        return partytaxinformationid;
    }

    /**
     * Sets the value of the partytaxinformationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartytaxinformationid(BigDecimal value) {
        this.partytaxinformationid = value;
    }

    /**
     * Gets the value of the taxamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxamount() {
        return taxamount;
    }

    /**
     * Sets the value of the taxamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxamount(String value) {
        this.taxamount = value;
    }

    /**
     * Gets the value of the taxauthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxauthority() {
        return taxauthority;
    }

    /**
     * Sets the value of the taxauthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxauthority(String value) {
        this.taxauthority = value;
    }

    /**
     * Gets the value of the taxpercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxpercent() {
        return taxpercent;
    }

    /**
     * Sets the value of the taxpercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxpercent(BigDecimal value) {
        this.taxpercent = value;
    }

    /**
     * Gets the value of the taxregistrationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxregistrationnumber() {
        return taxregistrationnumber;
    }

    /**
     * Sets the value of the taxregistrationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxregistrationnumber(String value) {
        this.taxregistrationnumber = value;
    }

    /**
     * Gets the value of the typeoftaxragistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeoftaxragistration() {
        return typeoftaxragistration;
    }

    /**
     * Sets the value of the typeoftaxragistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeoftaxragistration(String value) {
        this.typeoftaxragistration = value;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setGln(Party value) {
        this.gln = value;
    }

}
