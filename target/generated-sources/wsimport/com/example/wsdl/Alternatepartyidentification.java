
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alternatepartyidentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alternatepartyidentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternatepartyidentificationPK" type="{http://globalservice.ws.bept.ids.by/}alternatepartyidentificationPK" minOccurs="0"/&gt;
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
@XmlType(name = "alternatepartyidentification", propOrder = {
    "alternatepartyidentificationPK",
    "party"
})
public class Alternatepartyidentification {

    protected AlternatepartyidentificationPK alternatepartyidentificationPK;
    protected Party party;

    /**
     * Gets the value of the alternatepartyidentificationPK property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatepartyidentificationPK }
     *     
     */
    public AlternatepartyidentificationPK getAlternatepartyidentificationPK() {
        return alternatepartyidentificationPK;
    }

    /**
     * Sets the value of the alternatepartyidentificationPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatepartyidentificationPK }
     *     
     */
    public void setAlternatepartyidentificationPK(AlternatepartyidentificationPK value) {
        this.alternatepartyidentificationPK = value;
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
