
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
 * <p>Java class for securityusers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="securityusers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://globalservice.ws.bept.ids.by/}securityusersAddons"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="epassquota" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="epasstransactions" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="creationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="creationauthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastmodificationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="authoroflastmodification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="totalquota" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="glncomment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyCollection" type="{http://globalservice.ws.bept.ids.by/}party" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="userpoolsCollection" type="{http://globalservice.ws.bept.ids.by/}userpools" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="securityauthoritiesCollection" type="{http://globalservice.ws.bept.ids.by/}securityauthorities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="poolsCollection" type="{http://globalservice.ws.bept.ids.by/}pools" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityusers", propOrder = {
    "username",
    "password",
    "enabled",
    "fio",
    "post",
    "mail",
    "epassquota",
    "epasstransactions",
    "creationdate",
    "creationauthor",
    "lastmodificationdate",
    "authoroflastmodification",
    "expirationdate",
    "totalquota",
    "glncomment",
    "partyCollection",
    "userpoolsCollection",
    "securityauthoritiesCollection",
    "poolsCollection"
})
public class Securityusers
    extends SecurityusersAddons
{

    protected String username;
    protected String password;
    protected short enabled;
    protected String fio;
    protected String post;
    protected String mail;
    protected Long epassquota;
    protected long epasstransactions;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdate;
    protected String creationauthor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastmodificationdate;
    protected String authoroflastmodification;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationdate;
    protected Long totalquota;
    protected String glncomment;
    @XmlElement(nillable = true)
    protected List<Party> partyCollection;
    @XmlElement(nillable = true)
    protected List<Userpools> userpoolsCollection;
    @XmlElement(nillable = true)
    protected List<Securityauthorities> securityauthoritiesCollection;
    @XmlElement(nillable = true)
    protected List<Pools> poolsCollection;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public short getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(short value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFio(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPost(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the epassquota property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEpassquota() {
        return epassquota;
    }

    /**
     * Sets the value of the epassquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEpassquota(Long value) {
        this.epassquota = value;
    }

    /**
     * Gets the value of the epasstransactions property.
     * 
     */
    public long getEpasstransactions() {
        return epasstransactions;
    }

    /**
     * Sets the value of the epasstransactions property.
     * 
     */
    public void setEpasstransactions(long value) {
        this.epasstransactions = value;
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
     * Gets the value of the expirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationdate() {
        return expirationdate;
    }

    /**
     * Sets the value of the expirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationdate(XMLGregorianCalendar value) {
        this.expirationdate = value;
    }

    /**
     * Gets the value of the totalquota property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalquota() {
        return totalquota;
    }

    /**
     * Sets the value of the totalquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalquota(Long value) {
        this.totalquota = value;
    }

    /**
     * Gets the value of the glncomment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlncomment() {
        return glncomment;
    }

    /**
     * Sets the value of the glncomment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlncomment(String value) {
        this.glncomment = value;
    }

    /**
     * Gets the value of the partyCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the partyCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getPartyCollection() {
        if (partyCollection == null) {
            partyCollection = new ArrayList<Party>();
        }
        return this.partyCollection;
    }

    /**
     * Gets the value of the userpoolsCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the userpoolsCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserpoolsCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Userpools }
     * 
     * 
     */
    public List<Userpools> getUserpoolsCollection() {
        if (userpoolsCollection == null) {
            userpoolsCollection = new ArrayList<Userpools>();
        }
        return this.userpoolsCollection;
    }

    /**
     * Gets the value of the securityauthoritiesCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the securityauthoritiesCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityauthoritiesCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Securityauthorities }
     * 
     * 
     */
    public List<Securityauthorities> getSecurityauthoritiesCollection() {
        if (securityauthoritiesCollection == null) {
            securityauthoritiesCollection = new ArrayList<Securityauthorities>();
        }
        return this.securityauthoritiesCollection;
    }

    /**
     * Gets the value of the poolsCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poolsCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoolsCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pools }
     * 
     * 
     */
    public List<Pools> getPoolsCollection() {
        if (poolsCollection == null) {
            poolsCollection = new ArrayList<Pools>();
        }
        return this.poolsCollection;
    }

}
