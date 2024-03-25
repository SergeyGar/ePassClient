
package com.example.wsdl;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quotaimport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quotaimport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://globalservice.ws.bept.ids.by/}quotaimportAddos"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="quota" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="restquota" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="creationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="creationauthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastmodificationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="authoroflastmodification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="party" type="{http://globalservice.ws.bept.ids.by/}party" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quotaimport", propOrder = {
    "gln",
    "quota",
    "restquota",
    "creationdate",
    "creationauthor",
    "lastmodificationdate",
    "authoroflastmodification",
    "party"
})
public class Quotaimport
    extends QuotaimportAddos
{

    protected BigDecimal gln;
    protected Long quota;
    protected Long restquota;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdate;
    protected String creationauthor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastmodificationdate;
    protected String authoroflastmodification;
    protected Party party;

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGln() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGln(BigDecimal value) {
        this.gln = value;
    }

    /**
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuota(Long value) {
        this.quota = value;
    }

    /**
     * Gets the value of the restquota property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestquota() {
        return restquota;
    }

    /**
     * Sets the value of the restquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestquota(Long value) {
        this.restquota = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationdate() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationdate(XMLGregorianCalendar value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the creationauthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationauthor() {
        return creationauthor;
    }

    /**
     * Sets the value of the creationauthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationauthor(String value) {
        this.creationauthor = value;
    }

    /**
     * Gets the value of the lastmodificationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastmodificationdate() {
        return lastmodificationdate;
    }

    /**
     * Sets the value of the lastmodificationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastmodificationdate(XMLGregorianCalendar value) {
        this.lastmodificationdate = value;
    }

    /**
     * Gets the value of the authoroflastmodification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoroflastmodification() {
        return authoroflastmodification;
    }

    /**
     * Sets the value of the authoroflastmodification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoroflastmodification(String value) {
        this.authoroflastmodification = value;
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
