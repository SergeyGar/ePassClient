
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalShortName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalShortName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legalShortNamePK" type="{http://globalservice.ws.bept.ids.by/}legalShortNamePK" minOccurs="0"/&gt;
 *         &lt;element name="legalShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "legalShortName", propOrder = {
    "legalShortNamePK",
    "legalShortName",
    "party"
})
public class LegalShortName {

    protected LegalShortNamePK legalShortNamePK;
    protected String legalShortName;
    protected Party party;

    /**
     * Gets the value of the legalShortNamePK property.
     * 
     * @return
     *     possible object is
     *     {@link LegalShortNamePK }
     *     
     */
    public LegalShortNamePK getLegalShortNamePK() {
        return legalShortNamePK;
    }

    /**
     * Sets the value of the legalShortNamePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalShortNamePK }
     *     
     */
    public void setLegalShortNamePK(LegalShortNamePK value) {
        this.legalShortNamePK = value;
    }

    /**
     * Gets the value of the legalShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalShortName() {
        return legalShortName;
    }

    /**
     * Sets the value of the legalShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalShortName(String value) {
        this.legalShortName = value;
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
