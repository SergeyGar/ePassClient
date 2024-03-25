
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for audioVideoConnector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioVideoConnector"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioVideoConnectorPK" type="{http://globalservice.ws.bept.ids.by/}audioVideoConnectorPK" minOccurs="0"/&gt;
 *         &lt;element name="avconnectiontypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avconnectionlocationcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avconnectioninputdirectioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avconnectionquantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "audioVideoConnector", propOrder = {
    "audioVideoConnectorPK",
    "avconnectiontypecode",
    "avconnectionlocationcode",
    "avconnectioninputdirectioncode",
    "avconnectionquantity",
    "tradeitem"
})
public class AudioVideoConnector {

    protected AudioVideoConnectorPK audioVideoConnectorPK;
    protected String avconnectiontypecode;
    protected String avconnectionlocationcode;
    protected String avconnectioninputdirectioncode;
    protected Integer avconnectionquantity;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the audioVideoConnectorPK property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoConnectorPK }
     *     
     */
    public AudioVideoConnectorPK getAudioVideoConnectorPK() {
        return audioVideoConnectorPK;
    }

    /**
     * Sets the value of the audioVideoConnectorPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoConnectorPK }
     *     
     */
    public void setAudioVideoConnectorPK(AudioVideoConnectorPK value) {
        this.audioVideoConnectorPK = value;
    }

    /**
     * Gets the value of the avconnectiontypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvconnectiontypecode() {
        return avconnectiontypecode;
    }

    /**
     * Sets the value of the avconnectiontypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvconnectiontypecode(String value) {
        this.avconnectiontypecode = value;
    }

    /**
     * Gets the value of the avconnectionlocationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvconnectionlocationcode() {
        return avconnectionlocationcode;
    }

    /**
     * Sets the value of the avconnectionlocationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvconnectionlocationcode(String value) {
        this.avconnectionlocationcode = value;
    }

    /**
     * Gets the value of the avconnectioninputdirectioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvconnectioninputdirectioncode() {
        return avconnectioninputdirectioncode;
    }

    /**
     * Sets the value of the avconnectioninputdirectioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvconnectioninputdirectioncode(String value) {
        this.avconnectioninputdirectioncode = value;
    }

    /**
     * Gets the value of the avconnectionquantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvconnectionquantity() {
        return avconnectionquantity;
    }

    /**
     * Sets the value of the avconnectionquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvconnectionquantity(Integer value) {
        this.avconnectionquantity = value;
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
