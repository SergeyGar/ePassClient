
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemhierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemhierarchy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="qcompletelayerscontainedinti" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="quantityoflayersperpallet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="qticontainedinacompletelayer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="quantityoftradeitemsperpallet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="qtiperpalletlayer" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="quantityofinnerpack" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="qnextleveltiwithininnerpack" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemhierarchy", propOrder = {
    "globaltradeitemnumber",
    "qcompletelayerscontainedinti",
    "quantityoflayersperpallet",
    "qticontainedinacompletelayer",
    "quantityoftradeitemsperpallet",
    "qtiperpalletlayer",
    "quantityofinnerpack",
    "qnextleveltiwithininnerpack",
    "tpneutraltiinformation"
})
public class Tradeitemhierarchy {

    protected Long globaltradeitemnumber;
    protected Long qcompletelayerscontainedinti;
    protected Long quantityoflayersperpallet;
    protected Long qticontainedinacompletelayer;
    protected Long quantityoftradeitemsperpallet;
    protected Long qtiperpalletlayer;
    protected Long quantityofinnerpack;
    protected Long qnextleveltiwithininnerpack;
    protected Tpneutraltiinformation tpneutraltiinformation;

    /**
     * Gets the value of the globaltradeitemnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGlobaltradeitemnumber() {
        return globaltradeitemnumber;
    }

    /**
     * Sets the value of the globaltradeitemnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGlobaltradeitemnumber(Long value) {
        this.globaltradeitemnumber = value;
    }

    /**
     * Gets the value of the qcompletelayerscontainedinti property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQcompletelayerscontainedinti() {
        return qcompletelayerscontainedinti;
    }

    /**
     * Sets the value of the qcompletelayerscontainedinti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQcompletelayerscontainedinti(Long value) {
        this.qcompletelayerscontainedinti = value;
    }

    /**
     * Gets the value of the quantityoflayersperpallet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantityoflayersperpallet() {
        return quantityoflayersperpallet;
    }

    /**
     * Sets the value of the quantityoflayersperpallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantityoflayersperpallet(Long value) {
        this.quantityoflayersperpallet = value;
    }

    /**
     * Gets the value of the qticontainedinacompletelayer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQticontainedinacompletelayer() {
        return qticontainedinacompletelayer;
    }

    /**
     * Sets the value of the qticontainedinacompletelayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQticontainedinacompletelayer(Long value) {
        this.qticontainedinacompletelayer = value;
    }

    /**
     * Gets the value of the quantityoftradeitemsperpallet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantityoftradeitemsperpallet() {
        return quantityoftradeitemsperpallet;
    }

    /**
     * Sets the value of the quantityoftradeitemsperpallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantityoftradeitemsperpallet(Long value) {
        this.quantityoftradeitemsperpallet = value;
    }

    /**
     * Gets the value of the qtiperpalletlayer property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtiperpalletlayer() {
        return qtiperpalletlayer;
    }

    /**
     * Sets the value of the qtiperpalletlayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtiperpalletlayer(Long value) {
        this.qtiperpalletlayer = value;
    }

    /**
     * Gets the value of the quantityofinnerpack property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantityofinnerpack() {
        return quantityofinnerpack;
    }

    /**
     * Sets the value of the quantityofinnerpack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantityofinnerpack(Long value) {
        this.quantityofinnerpack = value;
    }

    /**
     * Gets the value of the qnextleveltiwithininnerpack property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQnextleveltiwithininnerpack() {
        return qnextleveltiwithininnerpack;
    }

    /**
     * Sets the value of the qnextleveltiwithininnerpack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQnextleveltiwithininnerpack(Long value) {
        this.qnextleveltiwithininnerpack = value;
    }

    /**
     * Gets the value of the tpneutraltiinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public Tpneutraltiinformation getTpneutraltiinformation() {
        return tpneutraltiinformation;
    }

    /**
     * Sets the value of the tpneutraltiinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tpneutraltiinformation }
     *     
     */
    public void setTpneutraltiinformation(Tpneutraltiinformation value) {
        this.tpneutraltiinformation = value;
    }

}
