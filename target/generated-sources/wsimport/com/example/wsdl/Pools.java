
package com.example.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pools complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pools"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poolsPK" type="{http://globalservice.ws.bept.ids.by/}poolsPK" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastmodified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datesync" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="poolscontentCollection" type="{http://globalservice.ws.bept.ids.by/}poolscontent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="securityusers" type="{http://globalservice.ws.bept.ids.by/}securityusers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pools", propOrder = {
    "poolsPK",
    "type",
    "created",
    "lastmodified",
    "datesync",
    "poolscontentCollection",
    "securityusers"
})
public class Pools {

    protected PoolsPK poolsPK;
    protected Short type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastmodified;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datesync;
    @XmlElement(nillable = true)
    protected List<Poolscontent> poolscontentCollection;
    protected Securityusers securityusers;

    /**
     * Gets the value of the poolsPK property.
     * 
     * @return
     *     possible object is
     *     {@link PoolsPK }
     *     
     */
    public PoolsPK getPoolsPK() {
        return poolsPK;
    }

    /**
     * Sets the value of the poolsPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolsPK }
     *     
     */
    public void setPoolsPK(PoolsPK value) {
        this.poolsPK = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setType(Short value) {
        this.type = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastmodified() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastmodified(XMLGregorianCalendar value) {
        this.lastmodified = value;
    }

    /**
     * Gets the value of the datesync property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatesync() {
        return datesync;
    }

    /**
     * Sets the value of the datesync property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatesync(XMLGregorianCalendar value) {
        this.datesync = value;
    }

    /**
     * Gets the value of the poolscontentCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poolscontentCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoolscontentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Poolscontent }
     * 
     * 
     */
    public List<Poolscontent> getPoolscontentCollection() {
        if (poolscontentCollection == null) {
            poolscontentCollection = new ArrayList<Poolscontent>();
        }
        return this.poolscontentCollection;
    }

    /**
     * Gets the value of the securityusers property.
     * 
     * @return
     *     possible object is
     *     {@link Securityusers }
     *     
     */
    public Securityusers getSecurityusers() {
        return securityusers;
    }

    /**
     * Sets the value of the securityusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Securityusers }
     *     
     */
    public void setSecurityusers(Securityusers value) {
        this.securityusers = value;
    }

}
