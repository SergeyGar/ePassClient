
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streetaddressone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streetaddressone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="streetaddressonePK" type="{http://globalservice.ws.bept.ids.by/}streetaddressonePK" minOccurs="0"/&gt;
 *         &lt;element name="streetaddressone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streetaddressone", propOrder = {
    "streetaddressonePK",
    "streetaddressone",
    "party"
})
public class Streetaddressone {

    protected StreetaddressonePK streetaddressonePK;
    protected String streetaddressone;
    protected Party party;

    /**
     * Gets the value of the streetaddressonePK property.
     * 
     * @return
     *     possible object is
     *     {@link StreetaddressonePK }
     *     
     */
    public StreetaddressonePK getStreetaddressonePK() {
        return streetaddressonePK;
    }

    /**
     * Sets the value of the streetaddressonePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetaddressonePK }
     *     
     */
    public void setStreetaddressonePK(StreetaddressonePK value) {
        this.streetaddressonePK = value;
    }

    /**
     * Gets the value of the streetaddressone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetaddressone() {
        return streetaddressone;
    }

    /**
     * Sets the value of the streetaddressone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetaddressone(String value) {
        this.streetaddressone = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

}
