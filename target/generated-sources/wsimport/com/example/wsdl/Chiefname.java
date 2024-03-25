
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chiefname complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chiefname"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chiefnamePK" type="{http://globalservice.ws.bept.ids.by/}chiefnamePK" minOccurs="0"/&gt;
 *         &lt;element name="chiefname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "chiefname", propOrder = {
    "chiefnamePK",
    "chiefname",
    "party"
})
public class Chiefname {

    protected ChiefnamePK chiefnamePK;
    protected String chiefname;
    protected Party party;

    /**
     * Gets the value of the chiefnamePK property.
     * 
     * @return
     *     possible object is
     *     {@link ChiefnamePK }
     *     
     */
    public ChiefnamePK getChiefnamePK() {
        return chiefnamePK;
    }

    /**
     * Sets the value of the chiefnamePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChiefnamePK }
     *     
     */
    public void setChiefnamePK(ChiefnamePK value) {
        this.chiefnamePK = value;
    }

    /**
     * Gets the value of the chiefname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChiefname() {
        return chiefname;
    }

    /**
     * Sets the value of the chiefname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChiefname(String value) {
        this.chiefname = value;
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
