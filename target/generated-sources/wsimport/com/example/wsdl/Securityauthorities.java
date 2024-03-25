
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for securityauthorities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityauthorities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="securityauthoritiesPK" type="{http://globalservice.ws.bept.ids.by/}securityauthoritiesPK" minOccurs="0"/&gt;
 *         &lt;element name="securityusers" type="{http://globalservice.ws.bept.ids.by/}securityusers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityauthorities", propOrder = {
    "securityauthoritiesPK",
    "securityusers"
})
public class Securityauthorities {

    protected SecurityauthoritiesPK securityauthoritiesPK;
    protected Securityusers securityusers;

    /**
     * Gets the value of the securityauthoritiesPK property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityauthoritiesPK }
     *     
     */
    public SecurityauthoritiesPK getSecurityauthoritiesPK() {
        return securityauthoritiesPK;
    }

    /**
     * Sets the value of the securityauthoritiesPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityauthoritiesPK }
     *     
     */
    public void setSecurityauthoritiesPK(SecurityauthoritiesPK value) {
        this.securityauthoritiesPK = value;
    }

    /**
     * Gets the value of the securityusers property.
     * 
     * @return
     *     possible object is
     *     {@link Securityusers }
     *     
     */
    public Securityusers getSecurityusers() {
        return securityusers;
    }

    /**
     * Sets the value of the securityusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Securityusers }
     *     
     */
    public void setSecurityusers(Securityusers value) {
        this.securityusers = value;
    }

}
