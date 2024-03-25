
package com.example.wsdl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="personordepartmentname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="communicaionchannelCollection" type="{http://globalservice.ws.bept.ids.by/}communicaionchannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gln" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact", propOrder = {
    "contactid",
    "personordepartmentname",
    "communicaionchannelCollection",
    "gln"
})
public class Contact {

    protected BigDecimal contactid;
    protected String personordepartmentname;
    @XmlElement(nillable = true)
    protected List<Communicaionchannel> communicaionchannelCollection;
    protected Party gln;

    /**
     * Gets the value of the contactid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContactid() {
        return contactid;
    }

    /**
     * Sets the value of the contactid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContactid(BigDecimal value) {
        this.contactid = value;
    }

    /**
     * Gets the value of the personordepartmentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonordepartmentname() {
        return personordepartmentname;
    }

    /**
     * Sets the value of the personordepartmentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonordepartmentname(String value) {
        this.personordepartmentname = value;
    }

    /**
     * Gets the value of the communicaionchannelCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the communicaionchannelCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicaionchannelCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Communicaionchannel }
     * 
     * 
     */
    public List<Communicaionchannel> getCommunicaionchannelCollection() {
        if (communicaionchannelCollection == null) {
            communicaionchannelCollection = new ArrayList<Communicaionchannel>();
        }
        return this.communicaionchannelCollection;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setGln(Party value) {
        this.gln = value;
    }

}
