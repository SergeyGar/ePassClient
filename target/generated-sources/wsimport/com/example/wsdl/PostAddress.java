
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for postAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="postAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postAddressPK" type="{http://globalservice.ws.bept.ids.by/}postAddressPK" minOccurs="0"/&gt;
 *         &lt;element name="postAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "postAddress", propOrder = {
    "postAddressPK",
    "postAddress",
    "party"
})
public class PostAddress {

    protected PostAddressPK postAddressPK;
    protected String postAddress;
    protected Party party;

    /**
     * Gets the value of the postAddressPK property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddressPK }
     *     
     */
    public PostAddressPK getPostAddressPK() {
        return postAddressPK;
    }

    /**
     * Sets the value of the postAddressPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddressPK }
     *     
     */
    public void setPostAddressPK(PostAddressPK value) {
        this.postAddressPK = value;
    }

    /**
     * Gets the value of the postAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * Sets the value of the postAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddress(String value) {
        this.postAddress = value;
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
