
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
 * <p>Java class for party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="party"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://globalservice.ws.bept.ids.by/}partyAddons"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="partystartdata" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="effectivechangedata" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="partyenddata" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryisocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="languageoftheparty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poboxnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetaddressone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetaddresstwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isfirstgln" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="firstgln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordCreatedDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="securityusersCollection" type="{http://globalservice.ws.bept.ids.by/}securityusers" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="postAddressCollection" type="{http://globalservice.ws.bept.ids.by/}postAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="streetaddressoneCollection" type="{http://globalservice.ws.bept.ids.by/}streetaddressone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alternatepartyidentificationCollection" type="{http://globalservice.ws.bept.ids.by/}alternatepartyidentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="quotaimport" type="{http://globalservice.ws.bept.ids.by/}quotaimport" minOccurs="0"/&gt;
 *         &lt;element name="partyrolesCollection" type="{http://globalservice.ws.bept.ids.by/}partyroles" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bankaccountsCollection" type="{http://globalservice.ws.bept.ids.by/}bankaccounts" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="legalNameCollection" type="{http://globalservice.ws.bept.ids.by/}legalName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactnameCollection" type="{http://globalservice.ws.bept.ids.by/}contactname" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chiefnameCollection" type="{http://globalservice.ws.bept.ids.by/}chiefname" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partyrb" type="{http://globalservice.ws.bept.ids.by/}partyrb" minOccurs="0"/&gt;
 *         &lt;element name="partytaxinformationCollection" type="{http://globalservice.ws.bept.ids.by/}partytaxinformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="partygcpCollection" type="{http://globalservice.ws.bept.ids.by/}partygcp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cityCollection" type="{http://globalservice.ws.bept.ids.by/}city" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="streetaddresstwoCollection" type="{http://globalservice.ws.bept.ids.by/}streetaddresstwo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="legalShortNameCollection" type="{http://globalservice.ws.bept.ids.by/}legalShortName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactCollection" type="{http://globalservice.ws.bept.ids.by/}contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="secondarygovernmentareaCollection" type="{http://globalservice.ws.bept.ids.by/}secondarygovernmentarea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "party", propOrder = {
    "gln",
    "partystartdata",
    "effectivechangedata",
    "partyenddata",
    "city",
    "countryisocode",
    "languageoftheparty",
    "name",
    "currency",
    "poboxnumber",
    "postalcode",
    "provincecode",
    "state",
    "streetaddressone",
    "streetaddresstwo",
    "timeCreated",
    "isfirstgln",
    "firstgln",
    "description",
    "recordCreatedDate",
    "securityusersCollection",
    "postAddressCollection",
    "streetaddressoneCollection",
    "alternatepartyidentificationCollection",
    "quotaimport",
    "partyrolesCollection",
    "bankaccountsCollection",
    "legalNameCollection",
    "contactnameCollection",
    "chiefnameCollection",
    "partyrb",
    "partytaxinformationCollection",
    "partygcpCollection",
    "cityCollection",
    "streetaddresstwoCollection",
    "legalShortNameCollection",
    "contactCollection",
    "secondarygovernmentareaCollection"
})
public class Party
    extends PartyAddons
{

    protected Long gln;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar partystartdata;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectivechangedata;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar partyenddata;
    protected String city;
    protected String countryisocode;
    protected String languageoftheparty;
    protected String name;
    protected String currency;
    protected String poboxnumber;
    protected String postalcode;
    protected String provincecode;
    protected String state;
    protected String streetaddressone;
    protected String streetaddresstwo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeCreated;
    protected Short isfirstgln;
    protected Long firstgln;
    protected String description;
    protected Long recordCreatedDate;
    @XmlElement(nillable = true)
    protected List<Securityusers> securityusersCollection;
    @XmlElement(nillable = true)
    protected List<PostAddress> postAddressCollection;
    @XmlElement(nillable = true)
    protected List<Streetaddressone> streetaddressoneCollection;
    @XmlElement(nillable = true)
    protected List<Alternatepartyidentification> alternatepartyidentificationCollection;
    protected Quotaimport quotaimport;
    @XmlElement(nillable = true)
    protected List<Partyroles> partyrolesCollection;
    @XmlElement(nillable = true)
    protected List<Bankaccounts> bankaccountsCollection;
    @XmlElement(nillable = true)
    protected List<LegalName> legalNameCollection;
    @XmlElement(nillable = true)
    protected List<Contactname> contactnameCollection;
    @XmlElement(nillable = true)
    protected List<Chiefname> chiefnameCollection;
    protected Partyrb partyrb;
    @XmlElement(nillable = true)
    protected List<Partytaxinformation> partytaxinformationCollection;
    @XmlElement(nillable = true)
    protected List<Partygcp> partygcpCollection;
    @XmlElement(nillable = true)
    protected List<City> cityCollection;
    @XmlElement(nillable = true)
    protected List<Streetaddresstwo> streetaddresstwoCollection;
    @XmlElement(nillable = true)
    protected List<LegalShortName> legalShortNameCollection;
    @XmlElement(nillable = true)
    protected List<Contact> contactCollection;
    @XmlElement(nillable = true)
    protected List<Secondarygovernmentarea> secondarygovernmentareaCollection;

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
     * Gets the value of the partystartdata property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPartystartdata() {
        return partystartdata;
    }

    /**
     * Sets the value of the partystartdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPartystartdata(XMLGregorianCalendar value) {
        this.partystartdata = value;
    }

    /**
     * Gets the value of the effectivechangedata property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivechangedata() {
        return effectivechangedata;
    }

    /**
     * Sets the value of the effectivechangedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectivechangedata(XMLGregorianCalendar value) {
        this.effectivechangedata = value;
    }

    /**
     * Gets the value of the partyenddata property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPartyenddata() {
        return partyenddata;
    }

    /**
     * Sets the value of the partyenddata property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPartyenddata(XMLGregorianCalendar value) {
        this.partyenddata = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryisocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryisocode() {
        return countryisocode;
    }

    /**
     * Sets the value of the countryisocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryisocode(String value) {
        this.countryisocode = value;
    }

    /**
     * Gets the value of the languageoftheparty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageoftheparty() {
        return languageoftheparty;
    }

    /**
     * Sets the value of the languageoftheparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageoftheparty(String value) {
        this.languageoftheparty = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the poboxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoboxnumber() {
        return poboxnumber;
    }

    /**
     * Sets the value of the poboxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoboxnumber(String value) {
        this.poboxnumber = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalcode(String value) {
        this.postalcode = value;
    }

    /**
     * Gets the value of the provincecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * Sets the value of the provincecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincecode(String value) {
        this.provincecode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the streetaddressone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetaddressone() {
        return streetaddressone;
    }

    /**
     * Sets the value of the streetaddressone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetaddressone(String value) {
        this.streetaddressone = value;
    }

    /**
     * Gets the value of the streetaddresstwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetaddresstwo() {
        return streetaddresstwo;
    }

    /**
     * Sets the value of the streetaddresstwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetaddresstwo(String value) {
        this.streetaddresstwo = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeCreated(XMLGregorianCalendar value) {
        this.timeCreated = value;
    }

    /**
     * Gets the value of the isfirstgln property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsfirstgln() {
        return isfirstgln;
    }

    /**
     * Sets the value of the isfirstgln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsfirstgln(Short value) {
        this.isfirstgln = value;
    }

    /**
     * Gets the value of the firstgln property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFirstgln() {
        return firstgln;
    }

    /**
     * Sets the value of the firstgln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFirstgln(Long value) {
        this.firstgln = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the recordCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordCreatedDate() {
        return recordCreatedDate;
    }

    /**
     * Sets the value of the recordCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordCreatedDate(Long value) {
        this.recordCreatedDate = value;
    }

    /**
     * Gets the value of the securityusersCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the securityusersCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityusersCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Securityusers }
     * 
     * 
     */
    public List<Securityusers> getSecurityusersCollection() {
        if (securityusersCollection == null) {
            securityusersCollection = new ArrayList<Securityusers>();
        }
        return this.securityusersCollection;
    }

    /**
     * Gets the value of the postAddressCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the postAddressCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostAddressCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostAddress }
     * 
     * 
     */
    public List<PostAddress> getPostAddressCollection() {
        if (postAddressCollection == null) {
            postAddressCollection = new ArrayList<PostAddress>();
        }
        return this.postAddressCollection;
    }

    /**
     * Gets the value of the streetaddressoneCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the streetaddressoneCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetaddressoneCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Streetaddressone }
     * 
     * 
     */
    public List<Streetaddressone> getStreetaddressoneCollection() {
        if (streetaddressoneCollection == null) {
            streetaddressoneCollection = new ArrayList<Streetaddressone>();
        }
        return this.streetaddressoneCollection;
    }

    /**
     * Gets the value of the alternatepartyidentificationCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alternatepartyidentificationCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternatepartyidentificationCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alternatepartyidentification }
     * 
     * 
     */
    public List<Alternatepartyidentification> getAlternatepartyidentificationCollection() {
        if (alternatepartyidentificationCollection == null) {
            alternatepartyidentificationCollection = new ArrayList<Alternatepartyidentification>();
        }
        return this.alternatepartyidentificationCollection;
    }

    /**
     * Gets the value of the quotaimport property.
     * 
     * @return
     *     possible object is
     *     {@link Quotaimport }
     *     
     */
    public Quotaimport getQuotaimport() {
        return quotaimport;
    }

    /**
     * Sets the value of the quotaimport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quotaimport }
     *     
     */
    public void setQuotaimport(Quotaimport value) {
        this.quotaimport = value;
    }

    /**
     * Gets the value of the partyrolesCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the partyrolesCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyrolesCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Partyroles }
     * 
     * 
     */
    public List<Partyroles> getPartyrolesCollection() {
        if (partyrolesCollection == null) {
            partyrolesCollection = new ArrayList<Partyroles>();
        }
        return this.partyrolesCollection;
    }

    /**
     * Gets the value of the bankaccountsCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bankaccountsCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankaccountsCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bankaccounts }
     * 
     * 
     */
    public List<Bankaccounts> getBankaccountsCollection() {
        if (bankaccountsCollection == null) {
            bankaccountsCollection = new ArrayList<Bankaccounts>();
        }
        return this.bankaccountsCollection;
    }

    /**
     * Gets the value of the legalNameCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the legalNameCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalNameCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalName }
     * 
     * 
     */
    public List<LegalName> getLegalNameCollection() {
        if (legalNameCollection == null) {
            legalNameCollection = new ArrayList<LegalName>();
        }
        return this.legalNameCollection;
    }

    /**
     * Gets the value of the contactnameCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactnameCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactnameCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contactname }
     * 
     * 
     */
    public List<Contactname> getContactnameCollection() {
        if (contactnameCollection == null) {
            contactnameCollection = new ArrayList<Contactname>();
        }
        return this.contactnameCollection;
    }

    /**
     * Gets the value of the chiefnameCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chiefnameCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChiefnameCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chiefname }
     * 
     * 
     */
    public List<Chiefname> getChiefnameCollection() {
        if (chiefnameCollection == null) {
            chiefnameCollection = new ArrayList<Chiefname>();
        }
        return this.chiefnameCollection;
    }

    /**
     * Gets the value of the partyrb property.
     * 
     * @return
     *     possible object is
     *     {@link Partyrb }
     *     
     */
    public Partyrb getPartyrb() {
        return partyrb;
    }

    /**
     * Sets the value of the partyrb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partyrb }
     *     
     */
    public void setPartyrb(Partyrb value) {
        this.partyrb = value;
    }

    /**
     * Gets the value of the partytaxinformationCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the partytaxinformationCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartytaxinformationCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Partytaxinformation }
     * 
     * 
     */
    public List<Partytaxinformation> getPartytaxinformationCollection() {
        if (partytaxinformationCollection == null) {
            partytaxinformationCollection = new ArrayList<Partytaxinformation>();
        }
        return this.partytaxinformationCollection;
    }

    /**
     * Gets the value of the partygcpCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the partygcpCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartygcpCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Partygcp }
     * 
     * 
     */
    public List<Partygcp> getPartygcpCollection() {
        if (partygcpCollection == null) {
            partygcpCollection = new ArrayList<Partygcp>();
        }
        return this.partygcpCollection;
    }

    /**
     * Gets the value of the cityCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cityCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link City }
     * 
     * 
     */
    public List<City> getCityCollection() {
        if (cityCollection == null) {
            cityCollection = new ArrayList<City>();
        }
        return this.cityCollection;
    }

    /**
     * Gets the value of the streetaddresstwoCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the streetaddresstwoCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetaddresstwoCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Streetaddresstwo }
     * 
     * 
     */
    public List<Streetaddresstwo> getStreetaddresstwoCollection() {
        if (streetaddresstwoCollection == null) {
            streetaddresstwoCollection = new ArrayList<Streetaddresstwo>();
        }
        return this.streetaddresstwoCollection;
    }

    /**
     * Gets the value of the legalShortNameCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the legalShortNameCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalShortNameCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalShortName }
     * 
     * 
     */
    public List<LegalShortName> getLegalShortNameCollection() {
        if (legalShortNameCollection == null) {
            legalShortNameCollection = new ArrayList<LegalShortName>();
        }
        return this.legalShortNameCollection;
    }

    /**
     * Gets the value of the contactCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContactCollection() {
        if (contactCollection == null) {
            contactCollection = new ArrayList<Contact>();
        }
        return this.contactCollection;
    }

    /**
     * Gets the value of the secondarygovernmentareaCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the secondarygovernmentareaCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondarygovernmentareaCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Secondarygovernmentarea }
     * 
     * 
     */
    public List<Secondarygovernmentarea> getSecondarygovernmentareaCollection() {
        if (secondarygovernmentareaCollection == null) {
            secondarygovernmentareaCollection = new ArrayList<Secondarygovernmentarea>();
        }
        return this.secondarygovernmentareaCollection;
    }

}
