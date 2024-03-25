
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for poolscontent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="poolscontent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poolscontentPK" type="{http://globalservice.ws.bept.ids.by/}poolscontentPK" minOccurs="0"/&gt;
 *         &lt;element name="pools" type="{http://globalservice.ws.bept.ids.by/}pools" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "poolscontent", propOrder = {
    "poolscontentPK",
    "pools"
})
public class Poolscontent {

    protected PoolscontentPK poolscontentPK;
    protected Pools pools;

    /**
     * Gets the value of the poolscontentPK property.
     * 
     * @return
     *     possible object is
     *     {@link PoolscontentPK }
     *     
     */
    public PoolscontentPK getPoolscontentPK() {
        return poolscontentPK;
    }

    /**
     * Sets the value of the poolscontentPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolscontentPK }
     *     
     */
    public void setPoolscontentPK(PoolscontentPK value) {
        this.poolscontentPK = value;
    }

    /**
     * Gets the value of the pools property.
     * 
     * @return
     *     possible object is
     *     {@link Pools }
     *     
     */
    public Pools getPools() {
        return pools;
    }

    /**
     * Sets the value of the pools property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pools }
     *     
     */
    public void setPools(Pools value) {
        this.pools = value;
    }

}
