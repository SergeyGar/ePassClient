
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legalNamePK" type="{http://globalservice.ws.bept.ids.by/}legalNamePK" minOccurs="0"/&gt;
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "legalName", propOrder = {
    "legalNamePK",
    "legalName",
    "party"
})
public class LegalName {

    protected LegalNamePK legalNamePK;
    protected String legalName;
    protected Party party;

    /**
     * Gets the value of the legalNamePK property.
     * 
     * @return
     *     possible object is
     *     {@link LegalNamePK }
     *     
     */
    public LegalNamePK getLegalNamePK() {
        return legalNamePK;
    }

    /**
     * Sets the value of the legalNamePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalNamePK }
     *     
     */
    public void setLegalNamePK(LegalNamePK value) {
        this.legalNamePK = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
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
