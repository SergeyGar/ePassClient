
package com.example.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packagingmarking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packagingmarking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ispackagingmarkedreturnable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ispckgmarkedwithingredients" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ispriceonpack" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="offeronpack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pckgmarkedrecyclablescheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packagemarksdietallergenCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksdietallergen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pckgmarkedexpirationdatetypeCollection" type="{http://globalservice.ws.bept.ids.by/}pckgmarkedexpirationdatetype" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/&gt;
 *         &lt;element name="packagemarkshygienicCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarkshygienic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagemarksethicalCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksethical" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagemarksfreefromCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksfreefrom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="packagemarksenvironmentCollection" type="{http://globalservice.ws.bept.ids.by/}packagemarksenvironment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packagingmarking", propOrder = {
    "globaltradeitemnumber",
    "ispackagingmarkedreturnable",
    "ispckgmarkedwithingredients",
    "ispriceonpack",
    "offeronpack",
    "pckgmarkedrecyclablescheme",
    "packagemarksdietallergenCollection",
    "pckgmarkedexpirationdatetypeCollection",
    "tpneutraltiinformation",
    "packagemarkshygienicCollection",
    "packagemarksethicalCollection",
    "packagemarksfreefromCollection",
    "packagemarksenvironmentCollection"
})
public class Packagingmarking {

    protected Long globaltradeitemnumber;
    protected Short ispackagingmarkedreturnable;
    protected Short ispckgmarkedwithingredients;
    protected Short ispriceonpack;
    protected String offeronpack;
    protected String pckgmarkedrecyclablescheme;
    @XmlElement(nillable = true)
    protected List<Packagemarksdietallergen> packagemarksdietallergenCollection;
    @XmlElement(nillable = true)
    protected List<Pckgmarkedexpirationdatetype> pckgmarkedexpirationdatetypeCollection;
    protected Tpneutraltiinformation tpneutraltiinformation;
    @XmlElement(nillable = true)
    protected List<Packagemarkshygienic> packagemarkshygienicCollection;
    @XmlElement(nillable = true)
    protected List<Packagemarksethical> packagemarksethicalCollection;
    @XmlElement(nillable = true)
    protected List<Packagemarksfreefrom> packagemarksfreefromCollection;
    @XmlElement(nillable = true)
    protected List<Packagemarksenvironment> packagemarksenvironmentCollection;

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
     * Gets the value of the ispackagingmarkedreturnable property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIspackagingmarkedreturnable() {
        return ispackagingmarkedreturnable;
    }

    /**
     * Sets the value of the ispackagingmarkedreturnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIspackagingmarkedreturnable(Short value) {
        this.ispackagingmarkedreturnable = value;
    }

    /**
     * Gets the value of the ispckgmarkedwithingredients property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIspckgmarkedwithingredients() {
        return ispckgmarkedwithingredients;
    }

    /**
     * Sets the value of the ispckgmarkedwithingredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIspckgmarkedwithingredients(Short value) {
        this.ispckgmarkedwithingredients = value;
    }

    /**
     * Gets the value of the ispriceonpack property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIspriceonpack() {
        return ispriceonpack;
    }

    /**
     * Sets the value of the ispriceonpack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIspriceonpack(Short value) {
        this.ispriceonpack = value;
    }

    /**
     * Gets the value of the offeronpack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferonpack() {
        return offeronpack;
    }

    /**
     * Sets the value of the offeronpack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferonpack(String value) {
        this.offeronpack = value;
    }

    /**
     * Gets the value of the pckgmarkedrecyclablescheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPckgmarkedrecyclablescheme() {
        return pckgmarkedrecyclablescheme;
    }

    /**
     * Sets the value of the pckgmarkedrecyclablescheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPckgmarkedrecyclablescheme(String value) {
        this.pckgmarkedrecyclablescheme = value;
    }

    /**
     * Gets the value of the packagemarksdietallergenCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksdietallergenCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagemarksdietallergenCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksdietallergen }
     * 
     * 
     */
    public List<Packagemarksdietallergen> getPackagemarksdietallergenCollection() {
        if (packagemarksdietallergenCollection == null) {
            packagemarksdietallergenCollection = new ArrayList<Packagemarksdietallergen>();
        }
        return this.packagemarksdietallergenCollection;
    }

    /**
     * Gets the value of the pckgmarkedexpirationdatetypeCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pckgmarkedexpirationdatetypeCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPckgmarkedexpirationdatetypeCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pckgmarkedexpirationdatetype }
     * 
     * 
     */
    public List<Pckgmarkedexpirationdatetype> getPckgmarkedexpirationdatetypeCollection() {
        if (pckgmarkedexpirationdatetypeCollection == null) {
            pckgmarkedexpirationdatetypeCollection = new ArrayList<Pckgmarkedexpirationdatetype>();
        }
        return this.pckgmarkedexpirationdatetypeCollection;
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

    /**
     * Gets the value of the packagemarkshygienicCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarkshygienicCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagemarkshygienicCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarkshygienic }
     * 
     * 
     */
    public List<Packagemarkshygienic> getPackagemarkshygienicCollection() {
        if (packagemarkshygienicCollection == null) {
            packagemarkshygienicCollection = new ArrayList<Packagemarkshygienic>();
        }
        return this.packagemarkshygienicCollection;
    }

    /**
     * Gets the value of the packagemarksethicalCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksethicalCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagemarksethicalCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksethical }
     * 
     * 
     */
    public List<Packagemarksethical> getPackagemarksethicalCollection() {
        if (packagemarksethicalCollection == null) {
            packagemarksethicalCollection = new ArrayList<Packagemarksethical>();
        }
        return this.packagemarksethicalCollection;
    }

    /**
     * Gets the value of the packagemarksfreefromCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksfreefromCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagemarksfreefromCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksfreefrom }
     * 
     * 
     */
    public List<Packagemarksfreefrom> getPackagemarksfreefromCollection() {
        if (packagemarksfreefromCollection == null) {
            packagemarksfreefromCollection = new ArrayList<Packagemarksfreefrom>();
        }
        return this.packagemarksfreefromCollection;
    }

    /**
     * Gets the value of the packagemarksenvironmentCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packagemarksenvironmentCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagemarksenvironmentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packagemarksenvironment }
     * 
     * 
     */
    public List<Packagemarksenvironment> getPackagemarksenvironmentCollection() {
        if (packagemarksenvironmentCollection == null) {
            packagemarksenvironmentCollection = new ArrayList<Packagemarksenvironment>();
        }
        return this.packagemarksenvironmentCollection;
    }

}
