
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for barcodetype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barcodetype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barcodetypePK" type="{http://globalservice.ws.bept.ids.by/}barcodetypePK" minOccurs="0"/&gt;
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
@XmlType(name = "barcodetype", propOrder = {
    "barcodetypePK",
    "tpneutraltiinformation"
})
public class Barcodetype {

    protected BarcodetypePK barcodetypePK;
    protected Tpneutraltiinformation tpneutraltiinformation;

    /**
     * Gets the value of the barcodetypePK property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodetypePK }
     *     
     */
    public BarcodetypePK getBarcodetypePK() {
        return barcodetypePK;
    }

    /**
     * Sets the value of the barcodetypePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodetypePK }
     *     
     */
    public void setBarcodetypePK(BarcodetypePK value) {
        this.barcodetypePK = value;
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
