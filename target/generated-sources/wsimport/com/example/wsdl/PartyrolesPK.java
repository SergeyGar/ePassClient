
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyrolesPK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyrolesPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="partyrole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyrolesPK", propOrder = {
    "gln",
    "partyrole"
})
public class PartyrolesPK {

    protected long gln;
    protected String partyrole;

    /**
     * Gets the value of the gln property.
     * 
     */
    public long getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     */
    public void setGln(long value) {
        this.gln = value;
    }

    /**
     * Gets the value of the partyrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyrole() {
        return partyrole;
    }

    /**
     * Sets the value of the partyrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyrole(String value) {
        this.partyrole = value;
    }

}
