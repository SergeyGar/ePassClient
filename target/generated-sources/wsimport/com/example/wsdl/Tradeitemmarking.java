
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemmarking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemmarking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="hasbatchnumber" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="isnonsoldtradeitemreturnable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemmarkedasrecyclable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemmarking", propOrder = {
    "globaltradeitemnumber",
    "hasbatchnumber",
    "isnonsoldtradeitemreturnable",
    "istradeitemmarkedasrecyclable",
    "tpneutraltiinformation"
})
public class Tradeitemmarking {

    protected Long globaltradeitemnumber;
    protected Short hasbatchnumber;
    protected Short isnonsoldtradeitemreturnable;
    protected Short istradeitemmarkedasrecyclable;
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
     * Gets the value of the hasbatchnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHasbatchnumber() {
        return hasbatchnumber;
    }

    /**
     * Sets the value of the hasbatchnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHasbatchnumber(Short value) {
        this.hasbatchnumber = value;
    }

    /**
     * Gets the value of the isnonsoldtradeitemreturnable property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsnonsoldtradeitemreturnable() {
        return isnonsoldtradeitemreturnable;
    }

    /**
     * Sets the value of the isnonsoldtradeitemreturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsnonsoldtradeitemreturnable(Short value) {
        this.isnonsoldtradeitemreturnable = value;
    }

    /**
     * Gets the value of the istradeitemmarkedasrecyclable property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemmarkedasrecyclable() {
        return istradeitemmarkedasrecyclable;
    }

    /**
     * Sets the value of the istradeitemmarkedasrecyclable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemmarkedasrecyclable(Short value) {
        this.istradeitemmarkedasrecyclable = value;
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
