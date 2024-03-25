
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partygcpPK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partygcpPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="gcp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partygcpPK", propOrder = {
    "gln",
    "gcp"
})
public class PartygcpPK {

    protected long gln;
    protected int gcp;

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
     * Gets the value of the gcp property.
     * 
     */
    public int getGcp() {
        return gcp;
    }

    /**
     * Sets the value of the gcp property.
     * 
     */
    public void setGcp(int value) {
        this.gcp = value;
    }

}
