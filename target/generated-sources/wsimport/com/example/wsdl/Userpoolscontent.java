
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userpoolscontent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userpoolscontent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userpoolscontentPK" type="{http://globalservice.ws.bept.ids.by/}userpoolscontentPK" minOccurs="0"/&gt;
 *         &lt;element name="userpools" type="{http://globalservice.ws.bept.ids.by/}userpools" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userpoolscontent", propOrder = {
    "userpoolscontentPK",
    "userpools"
})
public class Userpoolscontent {

    protected UserpoolscontentPK userpoolscontentPK;
    protected Userpools userpools;

    /**
     * Gets the value of the userpoolscontentPK property.
     * 
     * @return
     *     possible object is
     *     {@link UserpoolscontentPK }
     *     
     */
    public UserpoolscontentPK getUserpoolscontentPK() {
        return userpoolscontentPK;
    }

    /**
     * Sets the value of the userpoolscontentPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserpoolscontentPK }
     *     
     */
    public void setUserpoolscontentPK(UserpoolscontentPK value) {
        this.userpoolscontentPK = value;
    }

    /**
     * Gets the value of the userpools property.
     * 
     * @return
     *     possible object is
     *     {@link Userpools }
     *     
     */
    public Userpools getUserpools() {
        return userpools;
    }

    /**
     * Sets the value of the userpools property.
     * 
     * @param value
     *     allowed object is
     *     {@link Userpools }
     *     
     */
    public void setUserpools(Userpools value) {
        this.userpools = value;
    }

}
