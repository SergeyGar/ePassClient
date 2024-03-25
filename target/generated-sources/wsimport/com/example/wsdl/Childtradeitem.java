
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childtradeitem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="childtradeitem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="childtradeitemPK" type="{http://globalservice.ws.bept.ids.by/}childtradeitemPK" minOccurs="0"/&gt;
 *         &lt;element name="quantityofnextlowerlevelti" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nextlowerleveltiinformation" type="{http://globalservice.ws.bept.ids.by/}nextlowerleveltiinformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childtradeitem", propOrder = {
    "childtradeitemPK",
    "quantityofnextlowerlevelti",
    "nextlowerleveltiinformation"
})
public class Childtradeitem {

    protected ChildtradeitemPK childtradeitemPK;
    protected Long quantityofnextlowerlevelti;
    protected Nextlowerleveltiinformation nextlowerleveltiinformation;

    /**
     * Gets the value of the childtradeitemPK property.
     * 
     * @return
     *     possible object is
     *     {@link ChildtradeitemPK }
     *     
     */
    public ChildtradeitemPK getChildtradeitemPK() {
        return childtradeitemPK;
    }

    /**
     * Sets the value of the childtradeitemPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildtradeitemPK }
     *     
     */
    public void setChildtradeitemPK(ChildtradeitemPK value) {
        this.childtradeitemPK = value;
    }

    /**
     * Gets the value of the quantityofnextlowerlevelti property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantityofnextlowerlevelti() {
        return quantityofnextlowerlevelti;
    }

    /**
     * Sets the value of the quantityofnextlowerlevelti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantityofnextlowerlevelti(Long value) {
        this.quantityofnextlowerlevelti = value;
    }

    /**
     * Gets the value of the nextlowerleveltiinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Nextlowerleveltiinformation }
     *     
     */
    public Nextlowerleveltiinformation getNextlowerleveltiinformation() {
        return nextlowerleveltiinformation;
    }

    /**
     * Sets the value of the nextlowerleveltiinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nextlowerleveltiinformation }
     *     
     */
    public void setNextlowerleveltiinformation(Nextlowerleveltiinformation value) {
        this.nextlowerleveltiinformation = value;
    }

}
