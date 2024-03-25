
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for secondarygovernmentarea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secondarygovernmentarea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="secondarygovernmentareaPK" type="{http://globalservice.ws.bept.ids.by/}secondarygovernmentareaPK" minOccurs="0"/&gt;
 *         &lt;element name="secondarygovernmentarea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "secondarygovernmentarea", propOrder = {
    "secondarygovernmentareaPK",
    "secondarygovernmentarea",
    "party"
})
public class Secondarygovernmentarea {

    protected SecondarygovernmentareaPK secondarygovernmentareaPK;
    protected String secondarygovernmentarea;
    protected Party party;

    /**
     * Gets the value of the secondarygovernmentareaPK property.
     * 
     * @return
     *     possible object is
     *     {@link SecondarygovernmentareaPK }
     *     
     */
    public SecondarygovernmentareaPK getSecondarygovernmentareaPK() {
        return secondarygovernmentareaPK;
    }

    /**
     * Sets the value of the secondarygovernmentareaPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondarygovernmentareaPK }
     *     
     */
    public void setSecondarygovernmentareaPK(SecondarygovernmentareaPK value) {
        this.secondarygovernmentareaPK = value;
    }

    /**
     * Gets the value of the secondarygovernmentarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarygovernmentarea() {
        return secondarygovernmentarea;
    }

    /**
     * Sets the value of the secondarygovernmentarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarygovernmentarea(String value) {
        this.secondarygovernmentarea = value;
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
