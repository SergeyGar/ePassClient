
package com.example.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpneutraltiinformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpneutraltiinformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="isbconpckgvariablemeasurebc" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="rfidtaggedcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticountryoflastprocessing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemmarking" type="{http://globalservice.ws.bept.ids.by/}tradeitemmarking" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemhierarchy" type="{http://globalservice.ws.bept.ids.by/}tradeitemhierarchy" minOccurs="0"/&gt;
 *         &lt;element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/&gt;
 *         &lt;element name="suggestedretailprice" type="{http://globalservice.ws.bept.ids.by/}suggestedretailprice" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemcountryoforiginCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemcountryoforigin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="barcodetypeCollection" type="{http://globalservice.ws.bept.ids.by/}barcodetype" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemmeasurements" type="{http://globalservice.ws.bept.ids.by/}tradeitemmeasurements" minOccurs="0"/&gt;
 *         &lt;element name="catalogueprice" type="{http://globalservice.ws.bept.ids.by/}catalogueprice" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemcountryofassemblyCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemcountryofassembly" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemunitindicator" type="{http://globalservice.ws.bept.ids.by/}tradeitemunitindicator" minOccurs="0"/&gt;
 *         &lt;element name="packagingmarking" type="{http://globalservice.ws.bept.ids.by/}packagingmarking" minOccurs="0"/&gt;
 *         &lt;element name="classcomplianceregulationcodeCollection" type="{http://globalservice.ws.bept.ids.by/}classcomplianceregulationcode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemdateinformation" type="{http://globalservice.ws.bept.ids.by/}tradeitemdateinformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpneutraltiinformation", propOrder = {
    "globaltradeitemnumber",
    "isbconpckgvariablemeasurebc",
    "rfidtaggedcode",
    "ticountryoflastprocessing",
    "tradeitemmarking",
    "tradeitemhierarchy",
    "tradeitem",
    "suggestedretailprice",
    "tradeitemcountryoforiginCollection",
    "barcodetypeCollection",
    "tradeitemmeasurements",
    "catalogueprice",
    "tradeitemcountryofassemblyCollection",
    "tradeitemunitindicator",
    "packagingmarking",
    "classcomplianceregulationcodeCollection",
    "tradeitemdateinformation"
})
public class Tpneutraltiinformation {

    protected Long globaltradeitemnumber;
    protected Short isbconpckgvariablemeasurebc;
    protected String rfidtaggedcode;
    protected String ticountryoflastprocessing;
    protected Tradeitemmarking tradeitemmarking;
    protected Tradeitemhierarchy tradeitemhierarchy;
    protected Tradeitem tradeitem;
    protected Suggestedretailprice suggestedretailprice;
    @XmlElement(nillable = true)
    protected List<Tradeitemcountryoforigin> tradeitemcountryoforiginCollection;
    @XmlElement(nillable = true)
    protected List<Barcodetype> barcodetypeCollection;
    protected Tradeitemmeasurements tradeitemmeasurements;
    protected Catalogueprice catalogueprice;
    @XmlElement(nillable = true)
    protected List<Tradeitemcountryofassembly> tradeitemcountryofassemblyCollection;
    protected Tradeitemunitindicator tradeitemunitindicator;
    protected Packagingmarking packagingmarking;
    @XmlElement(nillable = true)
    protected List<Classcomplianceregulationcode> classcomplianceregulationcodeCollection;
    protected Tradeitemdateinformation tradeitemdateinformation;

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
     * Gets the value of the isbconpckgvariablemeasurebc property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsbconpckgvariablemeasurebc() {
        return isbconpckgvariablemeasurebc;
    }

    /**
     * Sets the value of the isbconpckgvariablemeasurebc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsbconpckgvariablemeasurebc(Short value) {
        this.isbconpckgvariablemeasurebc = value;
    }

    /**
     * Gets the value of the rfidtaggedcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfidtaggedcode() {
        return rfidtaggedcode;
    }

    /**
     * Sets the value of the rfidtaggedcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfidtaggedcode(String value) {
        this.rfidtaggedcode = value;
    }

    /**
     * Gets the value of the ticountryoflastprocessing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicountryoflastprocessing() {
        return ticountryoflastprocessing;
    }

    /**
     * Sets the value of the ticountryoflastprocessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicountryoflastprocessing(String value) {
        this.ticountryoflastprocessing = value;
    }

    /**
     * Gets the value of the tradeitemmarking property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemmarking }
     *     
     */
    public Tradeitemmarking getTradeitemmarking() {
        return tradeitemmarking;
    }

    /**
     * Sets the value of the tradeitemmarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemmarking }
     *     
     */
    public void setTradeitemmarking(Tradeitemmarking value) {
        this.tradeitemmarking = value;
    }

    /**
     * Gets the value of the tradeitemhierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemhierarchy }
     *     
     */
    public Tradeitemhierarchy getTradeitemhierarchy() {
        return tradeitemhierarchy;
    }

    /**
     * Sets the value of the tradeitemhierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemhierarchy }
     *     
     */
    public void setTradeitemhierarchy(Tradeitemhierarchy value) {
        this.tradeitemhierarchy = value;
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
     * Gets the value of the suggestedretailprice property.
     * 
     * @return
     *     possible object is
     *     {@link Suggestedretailprice }
     *     
     */
    public Suggestedretailprice getSuggestedretailprice() {
        return suggestedretailprice;
    }

    /**
     * Sets the value of the suggestedretailprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Suggestedretailprice }
     *     
     */
    public void setSuggestedretailprice(Suggestedretailprice value) {
        this.suggestedretailprice = value;
    }

    /**
     * Gets the value of the tradeitemcountryoforiginCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemcountryoforiginCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemcountryoforiginCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitemcountryoforigin }
     * 
     * 
     */
    public List<Tradeitemcountryoforigin> getTradeitemcountryoforiginCollection() {
        if (tradeitemcountryoforiginCollection == null) {
            tradeitemcountryoforiginCollection = new ArrayList<Tradeitemcountryoforigin>();
        }
        return this.tradeitemcountryoforiginCollection;
    }

    /**
     * Gets the value of the barcodetypeCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the barcodetypeCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcodetypeCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Barcodetype }
     * 
     * 
     */
    public List<Barcodetype> getBarcodetypeCollection() {
        if (barcodetypeCollection == null) {
            barcodetypeCollection = new ArrayList<Barcodetype>();
        }
        return this.barcodetypeCollection;
    }

    /**
     * Gets the value of the tradeitemmeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemmeasurements }
     *     
     */
    public Tradeitemmeasurements getTradeitemmeasurements() {
        return tradeitemmeasurements;
    }

    /**
     * Sets the value of the tradeitemmeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemmeasurements }
     *     
     */
    public void setTradeitemmeasurements(Tradeitemmeasurements value) {
        this.tradeitemmeasurements = value;
    }

    /**
     * Gets the value of the catalogueprice property.
     * 
     * @return
     *     possible object is
     *     {@link Catalogueprice }
     *     
     */
    public Catalogueprice getCatalogueprice() {
        return catalogueprice;
    }

    /**
     * Sets the value of the catalogueprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalogueprice }
     *     
     */
    public void setCatalogueprice(Catalogueprice value) {
        this.catalogueprice = value;
    }

    /**
     * Gets the value of the tradeitemcountryofassemblyCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemcountryofassemblyCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemcountryofassemblyCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitemcountryofassembly }
     * 
     * 
     */
    public List<Tradeitemcountryofassembly> getTradeitemcountryofassemblyCollection() {
        if (tradeitemcountryofassemblyCollection == null) {
            tradeitemcountryofassemblyCollection = new ArrayList<Tradeitemcountryofassembly>();
        }
        return this.tradeitemcountryofassemblyCollection;
    }

    /**
     * Gets the value of the tradeitemunitindicator property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemunitindicator }
     *     
     */
    public Tradeitemunitindicator getTradeitemunitindicator() {
        return tradeitemunitindicator;
    }

    /**
     * Sets the value of the tradeitemunitindicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemunitindicator }
     *     
     */
    public void setTradeitemunitindicator(Tradeitemunitindicator value) {
        this.tradeitemunitindicator = value;
    }

    /**
     * Gets the value of the packagingmarking property.
     * 
     * @return
     *     possible object is
     *     {@link Packagingmarking }
     *     
     */
    public Packagingmarking getPackagingmarking() {
        return packagingmarking;
    }

    /**
     * Sets the value of the packagingmarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packagingmarking }
     *     
     */
    public void setPackagingmarking(Packagingmarking value) {
        this.packagingmarking = value;
    }

    /**
     * Gets the value of the classcomplianceregulationcodeCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the classcomplianceregulationcodeCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasscomplianceregulationcodeCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Classcomplianceregulationcode }
     * 
     * 
     */
    public List<Classcomplianceregulationcode> getClasscomplianceregulationcodeCollection() {
        if (classcomplianceregulationcodeCollection == null) {
            classcomplianceregulationcodeCollection = new ArrayList<Classcomplianceregulationcode>();
        }
        return this.classcomplianceregulationcodeCollection;
    }

    /**
     * Gets the value of the tradeitemdateinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemdateinformation }
     *     
     */
    public Tradeitemdateinformation getTradeitemdateinformation() {
        return tradeitemdateinformation;
    }

    /**
     * Sets the value of the tradeitemdateinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemdateinformation }
     *     
     */
    public void setTradeitemdateinformation(Tradeitemdateinformation value) {
        this.tradeitemdateinformation = value;
    }

}
