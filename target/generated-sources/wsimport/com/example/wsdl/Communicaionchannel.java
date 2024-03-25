
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for communicaionchannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="communicaionchannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="communicaionchannelPK" type="{http://globalservice.ws.bept.ids.by/}communicaionchannelPK" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://globalservice.ws.bept.ids.by/}contact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "communicaionchannel", propOrder = {
    "communicaionchannelPK",
    "contact"
})
public class Communicaionchannel {

    protected CommunicaionchannelPK communicaionchannelPK;
    protected Contact contact;

    /**
     * Gets the value of the communicaionchannelPK property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicaionchannelPK }
     *     
     */
    public CommunicaionchannelPK getCommunicaionchannelPK() {
        return communicaionchannelPK;
    }

    /**
     * Sets the value of the communicaionchannelPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicaionchannelPK }
     *     
     */
    public void setCommunicaionchannelPK(CommunicaionchannelPK value) {
        this.communicaionchannelPK = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

}
