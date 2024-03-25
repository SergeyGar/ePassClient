
package com.example.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemdateinformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemdateinformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="effectivedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastchangedatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="publicationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startavailabilitydatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="canceleddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="consumeravailabilitydatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="discontinueddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endavailabilitydatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enddatemaximumbuyingquantity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enddateminimumbuyingquantity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enddatetimeofexclusivity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstorderdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstshipdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastorderdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastshipdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startdatemaxbuyingquantity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="startdateminbuyingquantity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "tradeitemdateinformation", propOrder = {
    "globaltradeitemnumber",
    "effectivedate",
    "lastchangedatetime",
    "publicationdate",
    "startavailabilitydatetime",
    "canceleddate",
    "consumeravailabilitydatetime",
    "discontinueddate",
    "endavailabilitydatetime",
    "enddatemaximumbuyingquantity",
    "enddateminimumbuyingquantity",
    "enddatetimeofexclusivity",
    "firstorderdate",
    "firstshipdate",
    "lastorderdate",
    "lastshipdate",
    "startdatemaxbuyingquantity",
    "startdateminbuyingquantity",
    "tpneutraltiinformation"
})
public class Tradeitemdateinformation {

    protected Long globaltradeitemnumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectivedate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastchangedatetime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startavailabilitydatetime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar canceleddate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar consumeravailabilitydatetime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discontinueddate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endavailabilitydatetime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddatemaximumbuyingquantity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddateminimumbuyingquantity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddatetimeofexclusivity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstorderdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstshipdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastorderdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastshipdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startdatemaxbuyingquantity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startdateminbuyingquantity;
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
     * Gets the value of the effectivedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivedate() {
        return effectivedate;
    }

    /**
     * Sets the value of the effectivedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectivedate(XMLGregorianCalendar value) {
        this.effectivedate = value;
    }

    /**
     * Gets the value of the lastchangedatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastchangedatetime() {
        return lastchangedatetime;
    }

    /**
     * Sets the value of the lastchangedatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastchangedatetime(XMLGregorianCalendar value) {
        this.lastchangedatetime = value;
    }

    /**
     * Gets the value of the publicationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationdate() {
        return publicationdate;
    }

    /**
     * Sets the value of the publicationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationdate(XMLGregorianCalendar value) {
        this.publicationdate = value;
    }

    /**
     * Gets the value of the startavailabilitydatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartavailabilitydatetime() {
        return startavailabilitydatetime;
    }

    /**
     * Sets the value of the startavailabilitydatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartavailabilitydatetime(XMLGregorianCalendar value) {
        this.startavailabilitydatetime = value;
    }

    /**
     * Gets the value of the canceleddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCanceleddate() {
        return canceleddate;
    }

    /**
     * Sets the value of the canceleddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCanceleddate(XMLGregorianCalendar value) {
        this.canceleddate = value;
    }

    /**
     * Gets the value of the consumeravailabilitydatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsumeravailabilitydatetime() {
        return consumeravailabilitydatetime;
    }

    /**
     * Sets the value of the consumeravailabilitydatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsumeravailabilitydatetime(XMLGregorianCalendar value) {
        this.consumeravailabilitydatetime = value;
    }

    /**
     * Gets the value of the discontinueddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscontinueddate() {
        return discontinueddate;
    }

    /**
     * Sets the value of the discontinueddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscontinueddate(XMLGregorianCalendar value) {
        this.discontinueddate = value;
    }

    /**
     * Gets the value of the endavailabilitydatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndavailabilitydatetime() {
        return endavailabilitydatetime;
    }

    /**
     * Sets the value of the endavailabilitydatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndavailabilitydatetime(XMLGregorianCalendar value) {
        this.endavailabilitydatetime = value;
    }

    /**
     * Gets the value of the enddatemaximumbuyingquantity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddatemaximumbuyingquantity() {
        return enddatemaximumbuyingquantity;
    }

    /**
     * Sets the value of the enddatemaximumbuyingquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddatemaximumbuyingquantity(XMLGregorianCalendar value) {
        this.enddatemaximumbuyingquantity = value;
    }

    /**
     * Gets the value of the enddateminimumbuyingquantity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddateminimumbuyingquantity() {
        return enddateminimumbuyingquantity;
    }

    /**
     * Sets the value of the enddateminimumbuyingquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddateminimumbuyingquantity(XMLGregorianCalendar value) {
        this.enddateminimumbuyingquantity = value;
    }

    /**
     * Gets the value of the enddatetimeofexclusivity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddatetimeofexclusivity() {
        return enddatetimeofexclusivity;
    }

    /**
     * Sets the value of the enddatetimeofexclusivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddatetimeofexclusivity(XMLGregorianCalendar value) {
        this.enddatetimeofexclusivity = value;
    }

    /**
     * Gets the value of the firstorderdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstorderdate() {
        return firstorderdate;
    }

    /**
     * Sets the value of the firstorderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstorderdate(XMLGregorianCalendar value) {
        this.firstorderdate = value;
    }

    /**
     * Gets the value of the firstshipdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstshipdate() {
        return firstshipdate;
    }

    /**
     * Sets the value of the firstshipdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstshipdate(XMLGregorianCalendar value) {
        this.firstshipdate = value;
    }

    /**
     * Gets the value of the lastorderdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastorderdate() {
        return lastorderdate;
    }

    /**
     * Sets the value of the lastorderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastorderdate(XMLGregorianCalendar value) {
        this.lastorderdate = value;
    }

    /**
     * Gets the value of the lastshipdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastshipdate() {
        return lastshipdate;
    }

    /**
     * Sets the value of the lastshipdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastshipdate(XMLGregorianCalendar value) {
        this.lastshipdate = value;
    }

    /**
     * Gets the value of the startdatemaxbuyingquantity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdatemaxbuyingquantity() {
        return startdatemaxbuyingquantity;
    }

    /**
     * Sets the value of the startdatemaxbuyingquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartdatemaxbuyingquantity(XMLGregorianCalendar value) {
        this.startdatemaxbuyingquantity = value;
    }

    /**
     * Gets the value of the startdateminbuyingquantity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdateminbuyingquantity() {
        return startdateminbuyingquantity;
    }

    /**
     * Sets the value of the startdateminbuyingquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartdateminbuyingquantity(XMLGregorianCalendar value) {
        this.startdateminbuyingquantity = value;
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
