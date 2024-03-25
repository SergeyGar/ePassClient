
package com.example.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tradeitemrb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitemrb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="namettn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="okrb007code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tnvedcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplierarticlenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="okrb007path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tnvedpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastbcdsyncdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="gtinblockdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateFlag" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateStartblock" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateEndblock" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="istradeitemimported" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemcertificate" type="{http://globalservice.ws.bept.ids.by/}tradeitemcertificate" minOccurs="0"/&gt;
 *         &lt;element name="certificatenumberggr" type="{http://globalservice.ws.bept.ids.by/}tradeitemggr" minOccurs="0"/&gt;
 *         &lt;element name="tscertificatenumber" type="{http://globalservice.ws.bept.ids.by/}tradeitemtscertificate" minOccurs="0"/&gt;
 *         &lt;element name="tsdeclarationnumber" type="{http://globalservice.ws.bept.ids.by/}tradeitemtsdeclaration" minOccurs="0"/&gt;
 *         &lt;element name="tsggrnumber" type="{http://globalservice.ws.bept.ids.by/}tradeitemtsggr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitemrb", propOrder = {
    "globaltradeitemnumber",
    "namettn",
    "okrb007Code",
    "tnvedcode",
    "supplierarticlenum",
    "okrb007Path",
    "tnvedpath",
    "addmark",
    "lastbcdsyncdate",
    "gtinblockdate",
    "dateFlag",
    "dateStartblock",
    "dateEndblock",
    "istradeitemimported",
    "tradeitem",
    "tradeitemcertificate",
    "certificatenumberggr",
    "tscertificatenumber",
    "tsdeclarationnumber",
    "tsggrnumber"
})
public class Tradeitemrb {

    protected Long globaltradeitemnumber;
    protected String namettn;
    @XmlElement(name = "okrb007code")
    protected String okrb007Code;
    protected String tnvedcode;
    protected String supplierarticlenum;
    @XmlElement(name = "okrb007path")
    protected String okrb007Path;
    protected String tnvedpath;
    protected String addmark;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastbcdsyncdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gtinblockdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateStartblock;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEndblock;
    protected Short istradeitemimported;
    protected Tradeitem tradeitem;
    protected Tradeitemcertificate tradeitemcertificate;
    protected Tradeitemggr certificatenumberggr;
    protected Tradeitemtscertificate tscertificatenumber;
    protected Tradeitemtsdeclaration tsdeclarationnumber;
    protected Tradeitemtsggr tsggrnumber;

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
     * Gets the value of the namettn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamettn() {
        return namettn;
    }

    /**
     * Sets the value of the namettn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamettn(String value) {
        this.namettn = value;
    }

    /**
     * Gets the value of the okrb007Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkrb007Code() {
        return okrb007Code;
    }

    /**
     * Sets the value of the okrb007Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkrb007Code(String value) {
        this.okrb007Code = value;
    }

    /**
     * Gets the value of the tnvedcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnvedcode() {
        return tnvedcode;
    }

    /**
     * Sets the value of the tnvedcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnvedcode(String value) {
        this.tnvedcode = value;
    }

    /**
     * Gets the value of the supplierarticlenum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierarticlenum() {
        return supplierarticlenum;
    }

    /**
     * Sets the value of the supplierarticlenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierarticlenum(String value) {
        this.supplierarticlenum = value;
    }

    /**
     * Gets the value of the okrb007Path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkrb007Path() {
        return okrb007Path;
    }

    /**
     * Sets the value of the okrb007Path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkrb007Path(String value) {
        this.okrb007Path = value;
    }

    /**
     * Gets the value of the tnvedpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnvedpath() {
        return tnvedpath;
    }

    /**
     * Sets the value of the tnvedpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnvedpath(String value) {
        this.tnvedpath = value;
    }

    /**
     * Gets the value of the addmark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddmark() {
        return addmark;
    }

    /**
     * Sets the value of the addmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddmark(String value) {
        this.addmark = value;
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
     * Gets the value of the gtinblockdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGtinblockdate() {
        return gtinblockdate;
    }

    /**
     * Sets the value of the gtinblockdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGtinblockdate(XMLGregorianCalendar value) {
        this.gtinblockdate = value;
    }

    /**
     * Gets the value of the dateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFlag() {
        return dateFlag;
    }

    /**
     * Sets the value of the dateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFlag(XMLGregorianCalendar value) {
        this.dateFlag = value;
    }

    /**
     * Gets the value of the dateStartblock property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStartblock() {
        return dateStartblock;
    }

    /**
     * Sets the value of the dateStartblock property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStartblock(XMLGregorianCalendar value) {
        this.dateStartblock = value;
    }

    /**
     * Gets the value of the dateEndblock property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEndblock() {
        return dateEndblock;
    }

    /**
     * Sets the value of the dateEndblock property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEndblock(XMLGregorianCalendar value) {
        this.dateEndblock = value;
    }

    /**
     * Gets the value of the istradeitemimported property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstradeitemimported() {
        return istradeitemimported;
    }

    /**
     * Sets the value of the istradeitemimported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstradeitemimported(Short value) {
        this.istradeitemimported = value;
    }

    /**
     * Gets the value of the tradeitem property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitem }
     *     
     */
    public Tradeitem getTradeitem() {
        return tradeitem;
    }

    /**
     * Sets the value of the tradeitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitem }
     *     
     */
    public void setTradeitem(Tradeitem value) {
        this.tradeitem = value;
    }

    /**
     * Gets the value of the tradeitemcertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemcertificate }
     *     
     */
    public Tradeitemcertificate getTradeitemcertificate() {
        return tradeitemcertificate;
    }

    /**
     * Sets the value of the tradeitemcertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemcertificate }
     *     
     */
    public void setTradeitemcertificate(Tradeitemcertificate value) {
        this.tradeitemcertificate = value;
    }

    /**
     * Gets the value of the certificatenumberggr property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemggr }
     *     
     */
    public Tradeitemggr getCertificatenumberggr() {
        return certificatenumberggr;
    }

    /**
     * Sets the value of the certificatenumberggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemggr }
     *     
     */
    public void setCertificatenumberggr(Tradeitemggr value) {
        this.certificatenumberggr = value;
    }

    /**
     * Gets the value of the tscertificatenumber property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemtscertificate }
     *     
     */
    public Tradeitemtscertificate getTscertificatenumber() {
        return tscertificatenumber;
    }

    /**
     * Sets the value of the tscertificatenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemtscertificate }
     *     
     */
    public void setTscertificatenumber(Tradeitemtscertificate value) {
        this.tscertificatenumber = value;
    }

    /**
     * Gets the value of the tsdeclarationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemtsdeclaration }
     *     
     */
    public Tradeitemtsdeclaration getTsdeclarationnumber() {
        return tsdeclarationnumber;
    }

    /**
     * Sets the value of the tsdeclarationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemtsdeclaration }
     *     
     */
    public void setTsdeclarationnumber(Tradeitemtsdeclaration value) {
        this.tsdeclarationnumber = value;
    }

    /**
     * Gets the value of the tsggrnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemtsggr }
     *     
     */
    public Tradeitemtsggr getTsggrnumber() {
        return tsggrnumber;
    }

    /**
     * Sets the value of the tsggrnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemtsggr }
     *     
     */
    public void setTsggrnumber(Tradeitemtsggr value) {
        this.tsggrnumber = value;
    }

}
