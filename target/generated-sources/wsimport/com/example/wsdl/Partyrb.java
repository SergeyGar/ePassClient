
package com.example.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyrb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyrb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="okrb005code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="okrb005path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastbcdsyncdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="unpcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isiccode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="entrydate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chieftel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contacttel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="temporarylockeddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="exclusiondate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateSvid" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="legalform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyrb", propOrder = {
    "gln",
    "okrb005Code",
    "okrb005Path",
    "lastbcdsyncdate",
    "unpcode",
    "isiccode",
    "entrydate",
    "tel",
    "fax",
    "email",
    "chieftel",
    "contacttel",
    "temporarylockeddate",
    "exclusiondate",
    "dateSvid",
    "legalform",
    "website",
    "party"
})
public class Partyrb {

    protected Long gln;
    @XmlElement(name = "okrb005code")
    protected Integer okrb005Code;
    @XmlElement(name = "okrb005path")
    protected String okrb005Path;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastbcdsyncdate;
    protected Integer unpcode;
    protected Short isiccode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entrydate;
    protected String tel;
    protected String fax;
    protected String email;
    protected String chieftel;
    protected String contacttel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar temporarylockeddate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exclusiondate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSvid;
    protected String legalform;
    protected String website;
    protected Party party;

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
     * Gets the value of the okrb005Code property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOkrb005Code() {
        return okrb005Code;
    }

    /**
     * Sets the value of the okrb005Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOkrb005Code(Integer value) {
        this.okrb005Code = value;
    }

    /**
     * Gets the value of the okrb005Path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkrb005Path() {
        return okrb005Path;
    }

    /**
     * Sets the value of the okrb005Path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkrb005Path(String value) {
        this.okrb005Path = value;
    }

    /**
     * Gets the value of the lastbcdsyncdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastbcdsyncdate() {
        return lastbcdsyncdate;
    }

    /**
     * Sets the value of the lastbcdsyncdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastbcdsyncdate(XMLGregorianCalendar value) {
        this.lastbcdsyncdate = value;
    }

    /**
     * Gets the value of the unpcode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnpcode() {
        return unpcode;
    }

    /**
     * Sets the value of the unpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnpcode(Integer value) {
        this.unpcode = value;
    }

    /**
     * Gets the value of the isiccode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsiccode() {
        return isiccode;
    }

    /**
     * Sets the value of the isiccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsiccode(Short value) {
        this.isiccode = value;
    }

    /**
     * Gets the value of the entrydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntrydate() {
        return entrydate;
    }

    /**
     * Sets the value of the entrydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntrydate(XMLGregorianCalendar value) {
        this.entrydate = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the chieftel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChieftel() {
        return chieftel;
    }

    /**
     * Sets the value of the chieftel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChieftel(String value) {
        this.chieftel = value;
    }

    /**
     * Gets the value of the contacttel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacttel() {
        return contacttel;
    }

    /**
     * Sets the value of the contacttel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacttel(String value) {
        this.contacttel = value;
    }

    /**
     * Gets the value of the temporarylockeddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTemporarylockeddate() {
        return temporarylockeddate;
    }

    /**
     * Sets the value of the temporarylockeddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTemporarylockeddate(XMLGregorianCalendar value) {
        this.temporarylockeddate = value;
    }

    /**
     * Gets the value of the exclusiondate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExclusiondate() {
        return exclusiondate;
    }

    /**
     * Sets the value of the exclusiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExclusiondate(XMLGregorianCalendar value) {
        this.exclusiondate = value;
    }

    /**
     * Gets the value of the dateSvid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSvid() {
        return dateSvid;
    }

    /**
     * Sets the value of the dateSvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSvid(XMLGregorianCalendar value) {
        this.dateSvid = value;
    }

    /**
     * Gets the value of the legalform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalform() {
        return legalform;
    }

    /**
     * Sets the value of the legalform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalform(String value) {
        this.legalform = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setParty(Party value) {
        this.party = value;
    }

}
