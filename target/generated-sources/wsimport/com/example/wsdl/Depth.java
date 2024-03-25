
package com.example.wsdl;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for depth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depthPK" type="{http://globalservice.ws.bept.ids.by/}depthPK" minOccurs="0"/&gt;
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
@XmlType(name = "depth", propOrder = {
    "depthPK",
    "value",
    "tradeitemmeasurements"
})
public class Depth {

    protected DepthPK depthPK;
    protected BigDecimal value;
    protected Tradeitemmeasurements tradeitemmeasurements;

    /**
     * Gets the value of the depthPK property.
     * 
     * @return
     *     possible object is
     *     {@link DepthPK }
     *     
     */
    public DepthPK getDepthPK() {
        return depthPK;
    }

    /**
     * Sets the value of the depthPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthPK }
     *     
     */
    public void setDepthPK(DepthPK value) {
        this.depthPK = value;
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
