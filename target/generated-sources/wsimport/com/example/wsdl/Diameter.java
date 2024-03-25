
package com.example.wsdl;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="diameterPK" type="{http://globalservice.ws.bept.ids.by/}diameterPK" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemmeasurements" type="{http://globalservice.ws.bept.ids.by/}tradeitemmeasurements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diameter", propOrder = {
    "diameterPK",
    "value",
    "tradeitemmeasurements"
})
public class Diameter {

    protected DiameterPK diameterPK;
    protected BigDecimal value;
    protected Tradeitemmeasurements tradeitemmeasurements;

    /**
     * Gets the value of the diameterPK property.
     * 
     * @return
     *     possible object is
     *     {@link DiameterPK }
     *     
     */
    public DiameterPK getDiameterPK() {
        return diameterPK;
    }

    /**
     * Sets the value of the diameterPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiameterPK }
     *     
     */
    public void setDiameterPK(DiameterPK value) {
        this.diameterPK = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the tradeitemmeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemmeasurements }
     *     
     */
    public Tradeitemmeasurements getTradeitemmeasurements() {
        return tradeitemmeasurements;
    }

    /**
     * Sets the value of the tradeitemmeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemmeasurements }
     *     
     */
    public void setTradeitemmeasurements(Tradeitemmeasurements value) {
        this.tradeitemmeasurements = value;
    }

}
