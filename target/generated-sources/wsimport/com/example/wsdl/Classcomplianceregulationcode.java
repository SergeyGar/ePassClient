
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classcomplianceregulationcode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classcomplianceregulationcode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classcomplianceregulationcodePK" type="{http://globalservice.ws.bept.ids.by/}classcomplianceregulationcodePK" minOccurs="0"/&gt;
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
@XmlType(name = "classcomplianceregulationcode", propOrder = {
    "classcomplianceregulationcodePK",
    "tpneutraltiinformation"
})
public class Classcomplianceregulationcode {

    protected ClasscomplianceregulationcodePK classcomplianceregulationcodePK;
    protected Tpneutraltiinformation tpneutraltiinformation;

    /**
     * Gets the value of the classcomplianceregulationcodePK property.
     * 
     * @return
     *     possible object is
     *     {@link ClasscomplianceregulationcodePK }
     *     
     */
    public ClasscomplianceregulationcodePK getClasscomplianceregulationcodePK() {
        return classcomplianceregulationcodePK;
    }

    /**
     * Sets the value of the classcomplianceregulationcodePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClasscomplianceregulationcodePK }
     *     
     */
    public void setClasscomplianceregulationcodePK(ClasscomplianceregulationcodePK value) {
        this.classcomplianceregulationcodePK = value;
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
