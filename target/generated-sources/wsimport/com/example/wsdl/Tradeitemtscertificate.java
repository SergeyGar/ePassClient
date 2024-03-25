
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
 * <p>Java class for tradeitemtscertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemtscertificate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificatenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeorganisation" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="productname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="declarant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inspectioncontrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificatedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="prdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="pradate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sentdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lasteditor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemrbCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemrb" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemtscertificate", propOrder = {
    "certificatenumber",
    "codeorganisation",
    "productname",
    "manufacturer",
    "declarant",
    "inspectioncontrol",
    "certificatedate",
    "term",
    "prdate",
    "pradate",
    "status",
    "reason",
    "sentdate",
    "lastdate",
    "lasteditor",
    "gln",
    "tradeitemrbCollection"
})
public class Tradeitemtscertificate {

    protected String certificatenumber;
    protected Short codeorganisation;
    protected String productname;
    protected String manufacturer;
    protected String declarant;
    protected String inspectioncontrol;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certificatedate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar term;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pradate;
    protected String status;
    protected String reason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastdate;
    protected String lasteditor;
    protected Long gln;
    @XmlElement(nillable = true)
    protected List<Tradeitemrb> tradeitemrbCollection;

    /**
     * Gets the value of the certificatenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificatenumber() {
        return certificatenumber;
    }

    /**
     * Sets the value of the certificatenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificatenumber(String value) {
        this.certificatenumber = value;
    }

    /**
     * Gets the value of the codeorganisation property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCodeorganisation() {
        return codeorganisation;
    }

    /**
     * Sets the value of the codeorganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCodeorganisation(Short value) {
        this.codeorganisation = value;
    }

    /**
     * Gets the value of the productname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductname() {
        return productname;
    }

    /**
     * Sets the value of the productname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductname(String value) {
        this.productname = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the declarant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarant() {
        return declarant;
    }

    /**
     * Sets the value of the declarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarant(String value) {
        this.declarant = value;
    }

    /**
     * Gets the value of the inspectioncontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectioncontrol() {
        return inspectioncontrol;
    }

    /**
     * Sets the value of the inspectioncontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInspectioncontrol(String value) {
        this.inspectioncontrol = value;
    }

    /**
     * Gets the value of the certificatedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificatedate() {
        return certificatedate;
    }

    /**
     * Sets the value of the certificatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificatedate(XMLGregorianCalendar value) {
        this.certificatedate = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerm(XMLGregorianCalendar value) {
        this.term = value;
    }

    /**
     * Gets the value of the prdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrdate() {
        return prdate;
    }

    /**
     * Sets the value of the prdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrdate(XMLGregorianCalendar value) {
        this.prdate = value;
    }

    /**
     * Gets the value of the pradate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPradate() {
        return pradate;
    }

    /**
     * Sets the value of the pradate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPradate(XMLGregorianCalendar value) {
        this.pradate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the sentdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentdate() {
        return sentdate;
    }

    /**
     * Sets the value of the sentdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentdate(XMLGregorianCalendar value) {
        this.sentdate = value;
    }

    /**
     * Gets the value of the lastdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastdate() {
        return lastdate;
    }

    /**
     * Sets the value of the lastdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastdate(XMLGregorianCalendar value) {
        this.lastdate = value;
    }

    /**
     * Gets the value of the lasteditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLasteditor() {
        return lasteditor;
    }

    /**
     * Sets the value of the lasteditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLasteditor(String value) {
        this.lasteditor = value;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGln(Long value) {
        this.gln = value;
    }

    /**
     * Gets the value of the tradeitemrbCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemrbCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemrbCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitemrb }
     * 
     * 
     */
    public List<Tradeitemrb> getTradeitemrbCollection() {
        if (tradeitemrbCollection == null) {
            tradeitemrbCollection = new ArrayList<Tradeitemrb>();
        }
        return this.tradeitemrbCollection;
    }

}
