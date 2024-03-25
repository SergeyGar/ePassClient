
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
 * <p>Java class for tradeitem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeitem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://globalservice.ws.bept.ids.by/}tradeitemAddons"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemunitdescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="informationprovidergln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nameofinformationprovider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tigroupidentificationcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="effectivechangedata" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="istimarkedpublishable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istimarkedinwork" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="istimarkedreviewed" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tsdproduct" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tsdtargetmarket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordCreatedDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageInformation" type="{http://globalservice.ws.bept.ids.by/}foodBeverageInformation" minOccurs="0"/&gt;
 *         &lt;element name="hazardousGoods" type="{http://globalservice.ws.bept.ids.by/}hazardousGoods" minOccurs="0"/&gt;
 *         &lt;element name="brandnameCollection" type="{http://globalservice.ws.bept.ids.by/}brandname" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fmpContentCollection" type="{http://globalservice.ws.bept.ids.by/}fmpContent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="specTechnicalCharacteristicsCollection" type="{http://globalservice.ws.bept.ids.by/}specTechnicalCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageMicrobiologicalCollection" type="{http://globalservice.ws.bept.ids.by/}foodBeverageMicrobiological" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemTbAttValCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemTbAttVal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageDietRelated" type="{http://globalservice.ws.bept.ids.by/}foodBeverageDietRelated" minOccurs="0"/&gt;
 *         &lt;element name="foodPhysiochemicalCharactCollection" type="{http://globalservice.ws.bept.ids.by/}foodPhysiochemicalCharact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemTbSpec" type="{http://globalservice.ws.bept.ids.by/}tradeitemTbSpec" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemsuppliersCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemsuppliers" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageNutrientCollection" type="{http://globalservice.ws.bept.ids.by/}foodBeverageNutrient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemformdescriptionCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemformdescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audioVideoConnectorCollection" type="{http://globalservice.ws.bept.ids.by/}audioVideoConnector" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageServingInfo" type="{http://globalservice.ws.bept.ids.by/}foodBeverageServingInfo" minOccurs="0"/&gt;
 *         &lt;element name="nextlowerleveltiinformation" type="{http://globalservice.ws.bept.ids.by/}nextlowerleveltiinformation" minOccurs="0"/&gt;
 *         &lt;element name="variantCollection" type="{http://globalservice.ws.bept.ids.by/}variant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fmpContentInformation" type="{http://globalservice.ws.bept.ids.by/}fmpContentInformation" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageAllergyRelatedCollection" type="{http://globalservice.ws.bept.ids.by/}foodBeverageAllergyRelated" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodCertificationInformation" type="{http://globalservice.ws.bept.ids.by/}foodCertificationInformation" minOccurs="0"/&gt;
 *         &lt;element name="subbrandCollection" type="{http://globalservice.ws.bept.ids.by/}subbrand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBevergeAdditiveInfoCollection" type="{http://globalservice.ws.bept.ids.by/}foodBevergeAdditiveInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemdescriptionCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemdescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemrb" type="{http://globalservice.ws.bept.ids.by/}tradeitemrb" minOccurs="0"/&gt;
 *         &lt;element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/&gt;
 *         &lt;element name="functionalnameCollection" type="{http://globalservice.ws.bept.ids.by/}functionalname" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemrbspec" type="{http://globalservice.ws.bept.ids.by/}tradeitemrbspec" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemtradechannelCollection" type="{http://globalservice.ws.bept.ids.by/}tradeitemtradechannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gdsntradeitemclassification" type="{http://globalservice.ws.bept.ids.by/}gdsntradeitemclassification" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageNutrientInfo" type="{http://globalservice.ws.bept.ids.by/}foodBeverageNutrientInfo" minOccurs="0"/&gt;
 *         &lt;element name="tvFeatureCollection" type="{http://globalservice.ws.bept.ids.by/}tvFeature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageCheeseInform" type="{http://globalservice.ws.bept.ids.by/}foodBeverageCheeseInform" minOccurs="0"/&gt;
 *         &lt;element name="foodBevergeIngredientInform" type="{http://globalservice.ws.bept.ids.by/}foodBevergeIngredientInform" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageIngredientCollection" type="{http://globalservice.ws.bept.ids.by/}foodBeverageIngredient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="audioVideoPhoto" type="{http://globalservice.ws.bept.ids.by/}audioVideoPhoto" minOccurs="0"/&gt;
 *         &lt;element name="productYieldInformationCollection" type="{http://globalservice.ws.bept.ids.by/}productYieldInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productrangeCollection" type="{http://globalservice.ws.bept.ids.by/}productrange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBeverageMarketingInformCollection" type="{http://globalservice.ws.bept.ids.by/}foodBeverageMarketingInform" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targetmarketinformationCollection" type="{http://globalservice.ws.bept.ids.by/}targetmarketinformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="foodBeveragePreparationCollection" type="{http://globalservice.ws.bept.ids.by/}foodBeveragePreparation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeitem", propOrder = {
    "globaltradeitemnumber",
    "tradeitemunitdescriptor",
    "informationprovidergln",
    "nameofinformationprovider",
    "tigroupidentificationcode",
    "timeCreated",
    "effectivechangedata",
    "gln",
    "istimarkedpublishable",
    "istimarkedinwork",
    "istimarkedreviewed",
    "tsdproduct",
    "tsdtargetmarket",
    "recordCreatedDate",
    "foodBeverageInformation",
    "hazardousGoods",
    "brandnameCollection",
    "fmpContentCollection",
    "specTechnicalCharacteristicsCollection",
    "foodBeverageMicrobiologicalCollection",
    "tradeitemTbAttValCollection",
    "foodBeverageDietRelated",
    "foodPhysiochemicalCharactCollection",
    "tradeitemTbSpec",
    "tradeitemsuppliersCollection",
    "foodBeverageNutrientCollection",
    "tradeitemformdescriptionCollection",
    "audioVideoConnectorCollection",
    "foodBeverageServingInfo",
    "nextlowerleveltiinformation",
    "variantCollection",
    "fmpContentInformation",
    "foodBeverageAllergyRelatedCollection",
    "foodCertificationInformation",
    "subbrandCollection",
    "foodBevergeAdditiveInfoCollection",
    "tradeitemdescriptionCollection",
    "tradeitemrb",
    "tpneutraltiinformation",
    "functionalnameCollection",
    "tradeitemrbspec",
    "tradeitemtradechannelCollection",
    "gdsntradeitemclassification",
    "foodBeverageNutrientInfo",
    "tvFeatureCollection",
    "foodBeverageCheeseInform",
    "foodBevergeIngredientInform",
    "foodBeverageIngredientCollection",
    "audioVideoPhoto",
    "productYieldInformationCollection",
    "productrangeCollection",
    "foodBeverageMarketingInformCollection",
    "targetmarketinformationCollection",
    "foodBeveragePreparationCollection"
})
public class Tradeitem
    extends TradeitemAddons
{

    protected Long globaltradeitemnumber;
    protected String tradeitemunitdescriptor;
    protected Long informationprovidergln;
    protected String nameofinformationprovider;
    protected String tigroupidentificationcode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeCreated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectivechangedata;
    protected Long gln;
    protected Short istimarkedpublishable;
    protected Short istimarkedinwork;
    protected Short istimarkedreviewed;
    protected Short tsdproduct;
    protected String tsdtargetmarket;
    protected Long recordCreatedDate;
    protected FoodBeverageInformation foodBeverageInformation;
    protected HazardousGoods hazardousGoods;
    @XmlElement(nillable = true)
    protected List<Brandname> brandnameCollection;
    @XmlElement(nillable = true)
    protected List<FmpContent> fmpContentCollection;
    @XmlElement(nillable = true)
    protected List<SpecTechnicalCharacteristics> specTechnicalCharacteristicsCollection;
    @XmlElement(nillable = true)
    protected List<FoodBeverageMicrobiological> foodBeverageMicrobiologicalCollection;
    @XmlElement(nillable = true)
    protected List<TradeitemTbAttVal> tradeitemTbAttValCollection;
    protected FoodBeverageDietRelated foodBeverageDietRelated;
    @XmlElement(nillable = true)
    protected List<FoodPhysiochemicalCharact> foodPhysiochemicalCharactCollection;
    protected TradeitemTbSpec tradeitemTbSpec;
    @XmlElement(nillable = true)
    protected List<Tradeitemsuppliers> tradeitemsuppliersCollection;
    @XmlElement(nillable = true)
    protected List<FoodBeverageNutrient> foodBeverageNutrientCollection;
    @XmlElement(nillable = true)
    protected List<Tradeitemformdescription> tradeitemformdescriptionCollection;
    @XmlElement(nillable = true)
    protected List<AudioVideoConnector> audioVideoConnectorCollection;
    protected FoodBeverageServingInfo foodBeverageServingInfo;
    protected Nextlowerleveltiinformation nextlowerleveltiinformation;
    @XmlElement(nillable = true)
    protected List<Variant> variantCollection;
    protected FmpContentInformation fmpContentInformation;
    @XmlElement(nillable = true)
    protected List<FoodBeverageAllergyRelated> foodBeverageAllergyRelatedCollection;
    protected FoodCertificationInformation foodCertificationInformation;
    @XmlElement(nillable = true)
    protected List<Subbrand> subbrandCollection;
    @XmlElement(nillable = true)
    protected List<FoodBevergeAdditiveInfo> foodBevergeAdditiveInfoCollection;
    @XmlElement(nillable = true)
    protected List<Tradeitemdescription> tradeitemdescriptionCollection;
    protected Tradeitemrb tradeitemrb;
    protected Tpneutraltiinformation tpneutraltiinformation;
    @XmlElement(nillable = true)
    protected List<Functionalname> functionalnameCollection;
    protected Tradeitemrbspec tradeitemrbspec;
    @XmlElement(nillable = true)
    protected List<Tradeitemtradechannel> tradeitemtradechannelCollection;
    protected Gdsntradeitemclassification gdsntradeitemclassification;
    protected FoodBeverageNutrientInfo foodBeverageNutrientInfo;
    @XmlElement(nillable = true)
    protected List<TvFeature> tvFeatureCollection;
    protected FoodBeverageCheeseInform foodBeverageCheeseInform;
    protected FoodBevergeIngredientInform foodBevergeIngredientInform;
    @XmlElement(nillable = true)
    protected List<FoodBeverageIngredient> foodBeverageIngredientCollection;
    protected AudioVideoPhoto audioVideoPhoto;
    @XmlElement(nillable = true)
    protected List<ProductYieldInformation> productYieldInformationCollection;
    @XmlElement(nillable = true)
    protected List<Productrange> productrangeCollection;
    @XmlElement(nillable = true)
    protected List<FoodBeverageMarketingInform> foodBeverageMarketingInformCollection;
    @XmlElement(nillable = true)
    protected List<Targetmarketinformation> targetmarketinformationCollection;
    @XmlElement(nillable = true)
    protected List<FoodBeveragePreparation> foodBeveragePreparationCollection;

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
     * Gets the value of the tradeitemunitdescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeitemunitdescriptor() {
        return tradeitemunitdescriptor;
    }

    /**
     * Sets the value of the tradeitemunitdescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeitemunitdescriptor(String value) {
        this.tradeitemunitdescriptor = value;
    }

    /**
     * Gets the value of the informationprovidergln property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInformationprovidergln() {
        return informationprovidergln;
    }

    /**
     * Sets the value of the informationprovidergln property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInformationprovidergln(Long value) {
        this.informationprovidergln = value;
    }

    /**
     * Gets the value of the nameofinformationprovider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameofinformationprovider() {
        return nameofinformationprovider;
    }

    /**
     * Sets the value of the nameofinformationprovider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameofinformationprovider(String value) {
        this.nameofinformationprovider = value;
    }

    /**
     * Gets the value of the tigroupidentificationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTigroupidentificationcode() {
        return tigroupidentificationcode;
    }

    /**
     * Sets the value of the tigroupidentificationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTigroupidentificationcode(String value) {
        this.tigroupidentificationcode = value;
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
     * Gets the value of the istimarkedpublishable property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstimarkedpublishable() {
        return istimarkedpublishable;
    }

    /**
     * Sets the value of the istimarkedpublishable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstimarkedpublishable(Short value) {
        this.istimarkedpublishable = value;
    }

    /**
     * Gets the value of the istimarkedinwork property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstimarkedinwork() {
        return istimarkedinwork;
    }

    /**
     * Sets the value of the istimarkedinwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstimarkedinwork(Short value) {
        this.istimarkedinwork = value;
    }

    /**
     * Gets the value of the istimarkedreviewed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstimarkedreviewed() {
        return istimarkedreviewed;
    }

    /**
     * Sets the value of the istimarkedreviewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstimarkedreviewed(Short value) {
        this.istimarkedreviewed = value;
    }

    /**
     * Gets the value of the tsdproduct property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTsdproduct() {
        return tsdproduct;
    }

    /**
     * Sets the value of the tsdproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTsdproduct(Short value) {
        this.tsdproduct = value;
    }

    /**
     * Gets the value of the tsdtargetmarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsdtargetmarket() {
        return tsdtargetmarket;
    }

    /**
     * Sets the value of the tsdtargetmarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsdtargetmarket(String value) {
        this.tsdtargetmarket = value;
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
     * Gets the value of the foodBeverageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageInformation }
     *     
     */
    public FoodBeverageInformation getFoodBeverageInformation() {
        return foodBeverageInformation;
    }

    /**
     * Sets the value of the foodBeverageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageInformation }
     *     
     */
    public void setFoodBeverageInformation(FoodBeverageInformation value) {
        this.foodBeverageInformation = value;
    }

    /**
     * Gets the value of the hazardousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousGoods }
     *     
     */
    public HazardousGoods getHazardousGoods() {
        return hazardousGoods;
    }

    /**
     * Sets the value of the hazardousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousGoods }
     *     
     */
    public void setHazardousGoods(HazardousGoods value) {
        this.hazardousGoods = value;
    }

    /**
     * Gets the value of the brandnameCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the brandnameCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandnameCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Brandname }
     * 
     * 
     */
    public List<Brandname> getBrandnameCollection() {
        if (brandnameCollection == null) {
            brandnameCollection = new ArrayList<Brandname>();
        }
        return this.brandnameCollection;
    }

    /**
     * Gets the value of the fmpContentCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fmpContentCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFmpContentCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FmpContent }
     * 
     * 
     */
    public List<FmpContent> getFmpContentCollection() {
        if (fmpContentCollection == null) {
            fmpContentCollection = new ArrayList<FmpContent>();
        }
        return this.fmpContentCollection;
    }

    /**
     * Gets the value of the specTechnicalCharacteristicsCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specTechnicalCharacteristicsCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecTechnicalCharacteristicsCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecTechnicalCharacteristics }
     * 
     * 
     */
    public List<SpecTechnicalCharacteristics> getSpecTechnicalCharacteristicsCollection() {
        if (specTechnicalCharacteristicsCollection == null) {
            specTechnicalCharacteristicsCollection = new ArrayList<SpecTechnicalCharacteristics>();
        }
        return this.specTechnicalCharacteristicsCollection;
    }

    /**
     * Gets the value of the foodBeverageMicrobiologicalCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodBeverageMicrobiologicalCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBeverageMicrobiologicalCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBeverageMicrobiological }
     * 
     * 
     */
    public List<FoodBeverageMicrobiological> getFoodBeverageMicrobiologicalCollection() {
        if (foodBeverageMicrobiologicalCollection == null) {
            foodBeverageMicrobiologicalCollection = new ArrayList<FoodBeverageMicrobiological>();
        }
        return this.foodBeverageMicrobiologicalCollection;
    }

    /**
     * Gets the value of the tradeitemTbAttValCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemTbAttValCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemTbAttValCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeitemTbAttVal }
     * 
     * 
     */
    public List<TradeitemTbAttVal> getTradeitemTbAttValCollection() {
        if (tradeitemTbAttValCollection == null) {
            tradeitemTbAttValCollection = new ArrayList<TradeitemTbAttVal>();
        }
        return this.tradeitemTbAttValCollection;
    }

    /**
     * Gets the value of the foodBeverageDietRelated property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageDietRelated }
     *     
     */
    public FoodBeverageDietRelated getFoodBeverageDietRelated() {
        return foodBeverageDietRelated;
    }

    /**
     * Sets the value of the foodBeverageDietRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageDietRelated }
     *     
     */
    public void setFoodBeverageDietRelated(FoodBeverageDietRelated value) {
        this.foodBeverageDietRelated = value;
    }

    /**
     * Gets the value of the foodPhysiochemicalCharactCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodPhysiochemicalCharactCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodPhysiochemicalCharactCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodPhysiochemicalCharact }
     * 
     * 
     */
    public List<FoodPhysiochemicalCharact> getFoodPhysiochemicalCharactCollection() {
        if (foodPhysiochemicalCharactCollection == null) {
            foodPhysiochemicalCharactCollection = new ArrayList<FoodPhysiochemicalCharact>();
        }
        return this.foodPhysiochemicalCharactCollection;
    }

    /**
     * Gets the value of the tradeitemTbSpec property.
     * 
     * @return
     *     possible object is
     *     {@link TradeitemTbSpec }
     *     
     */
    public TradeitemTbSpec getTradeitemTbSpec() {
        return tradeitemTbSpec;
    }

    /**
     * Sets the value of the tradeitemTbSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeitemTbSpec }
     *     
     */
    public void setTradeitemTbSpec(TradeitemTbSpec value) {
        this.tradeitemTbSpec = value;
    }

    /**
     * Gets the value of the tradeitemsuppliersCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemsuppliersCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemsuppliersCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitemsuppliers }
     * 
     * 
     */
    public List<Tradeitemsuppliers> getTradeitemsuppliersCollection() {
        if (tradeitemsuppliersCollection == null) {
            tradeitemsuppliersCollection = new ArrayList<Tradeitemsuppliers>();
        }
        return this.tradeitemsuppliersCollection;
    }

    /**
     * Gets the value of the foodBeverageNutrientCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodBeverageNutrientCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBeverageNutrientCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBeverageNutrient }
     * 
     * 
     */
    public List<FoodBeverageNutrient> getFoodBeverageNutrientCollection() {
        if (foodBeverageNutrientCollection == null) {
            foodBeverageNutrientCollection = new ArrayList<FoodBeverageNutrient>();
        }
        return this.foodBeverageNutrientCollection;
    }

    /**
     * Gets the value of the tradeitemformdescriptionCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemformdescriptionCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemformdescriptionCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitemformdescription }
     * 
     * 
     */
    public List<Tradeitemformdescription> getTradeitemformdescriptionCollection() {
        if (tradeitemformdescriptionCollection == null) {
            tradeitemformdescriptionCollection = new ArrayList<Tradeitemformdescription>();
        }
        return this.tradeitemformdescriptionCollection;
    }

    /**
     * Gets the value of the audioVideoConnectorCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the audioVideoConnectorCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioVideoConnectorCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoConnector }
     * 
     * 
     */
    public List<AudioVideoConnector> getAudioVideoConnectorCollection() {
        if (audioVideoConnectorCollection == null) {
            audioVideoConnectorCollection = new ArrayList<AudioVideoConnector>();
        }
        return this.audioVideoConnectorCollection;
    }

    /**
     * Gets the value of the foodBeverageServingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageServingInfo }
     *     
     */
    public FoodBeverageServingInfo getFoodBeverageServingInfo() {
        return foodBeverageServingInfo;
    }

    /**
     * Sets the value of the foodBeverageServingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageServingInfo }
     *     
     */
    public void setFoodBeverageServingInfo(FoodBeverageServingInfo value) {
        this.foodBeverageServingInfo = value;
    }

    /**
     * Gets the value of the nextlowerleveltiinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Nextlowerleveltiinformation }
     *     
     */
    public Nextlowerleveltiinformation getNextlowerleveltiinformation() {
        return nextlowerleveltiinformation;
    }

    /**
     * Sets the value of the nextlowerleveltiinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nextlowerleveltiinformation }
     *     
     */
    public void setNextlowerleveltiinformation(Nextlowerleveltiinformation value) {
        this.nextlowerleveltiinformation = value;
    }

    /**
     * Gets the value of the variantCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the variantCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariantCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variant }
     * 
     * 
     */
    public List<Variant> getVariantCollection() {
        if (variantCollection == null) {
            variantCollection = new ArrayList<Variant>();
        }
        return this.variantCollection;
    }

    /**
     * Gets the value of the fmpContentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FmpContentInformation }
     *     
     */
    public FmpContentInformation getFmpContentInformation() {
        return fmpContentInformation;
    }

    /**
     * Sets the value of the fmpContentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FmpContentInformation }
     *     
     */
    public void setFmpContentInformation(FmpContentInformation value) {
        this.fmpContentInformation = value;
    }

    /**
     * Gets the value of the foodBeverageAllergyRelatedCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodBeverageAllergyRelatedCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBeverageAllergyRelatedCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBeverageAllergyRelated }
     * 
     * 
     */
    public List<FoodBeverageAllergyRelated> getFoodBeverageAllergyRelatedCollection() {
        if (foodBeverageAllergyRelatedCollection == null) {
            foodBeverageAllergyRelatedCollection = new ArrayList<FoodBeverageAllergyRelated>();
        }
        return this.foodBeverageAllergyRelatedCollection;
    }

    /**
     * Gets the value of the foodCertificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FoodCertificationInformation }
     *     
     */
    public FoodCertificationInformation getFoodCertificationInformation() {
        return foodCertificationInformation;
    }

    /**
     * Sets the value of the foodCertificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodCertificationInformation }
     *     
     */
    public void setFoodCertificationInformation(FoodCertificationInformation value) {
        this.foodCertificationInformation = value;
    }

    /**
     * Gets the value of the subbrandCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subbrandCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubbrandCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subbrand }
     * 
     * 
     */
    public List<Subbrand> getSubbrandCollection() {
        if (subbrandCollection == null) {
            subbrandCollection = new ArrayList<Subbrand>();
        }
        return this.subbrandCollection;
    }

    /**
     * Gets the value of the foodBevergeAdditiveInfoCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodBevergeAdditiveInfoCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBevergeAdditiveInfoCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBevergeAdditiveInfo }
     * 
     * 
     */
    public List<FoodBevergeAdditiveInfo> getFoodBevergeAdditiveInfoCollection() {
        if (foodBevergeAdditiveInfoCollection == null) {
            foodBevergeAdditiveInfoCollection = new ArrayList<FoodBevergeAdditiveInfo>();
        }
        return this.foodBevergeAdditiveInfoCollection;
    }

    /**
     * Gets the value of the tradeitemdescriptionCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemdescriptionCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemdescriptionCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitemdescription }
     * 
     * 
     */
    public List<Tradeitemdescription> getTradeitemdescriptionCollection() {
        if (tradeitemdescriptionCollection == null) {
            tradeitemdescriptionCollection = new ArrayList<Tradeitemdescription>();
        }
        return this.tradeitemdescriptionCollection;
    }

    /**
     * Gets the value of the tradeitemrb property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemrb }
     *     
     */
    public Tradeitemrb getTradeitemrb() {
        return tradeitemrb;
    }

    /**
     * Sets the value of the tradeitemrb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemrb }
     *     
     */
    public void setTradeitemrb(Tradeitemrb value) {
        this.tradeitemrb = value;
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
     * Gets the value of the functionalnameCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the functionalnameCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionalnameCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Functionalname }
     * 
     * 
     */
    public List<Functionalname> getFunctionalnameCollection() {
        if (functionalnameCollection == null) {
            functionalnameCollection = new ArrayList<Functionalname>();
        }
        return this.functionalnameCollection;
    }

    /**
     * Gets the value of the tradeitemrbspec property.
     * 
     * @return
     *     possible object is
     *     {@link Tradeitemrbspec }
     *     
     */
    public Tradeitemrbspec getTradeitemrbspec() {
        return tradeitemrbspec;
    }

    /**
     * Sets the value of the tradeitemrbspec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tradeitemrbspec }
     *     
     */
    public void setTradeitemrbspec(Tradeitemrbspec value) {
        this.tradeitemrbspec = value;
    }

    /**
     * Gets the value of the tradeitemtradechannelCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitemtradechannelCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitemtradechannelCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tradeitemtradechannel }
     * 
     * 
     */
    public List<Tradeitemtradechannel> getTradeitemtradechannelCollection() {
        if (tradeitemtradechannelCollection == null) {
            tradeitemtradechannelCollection = new ArrayList<Tradeitemtradechannel>();
        }
        return this.tradeitemtradechannelCollection;
    }

    /**
     * Gets the value of the gdsntradeitemclassification property.
     * 
     * @return
     *     possible object is
     *     {@link Gdsntradeitemclassification }
     *     
     */
    public Gdsntradeitemclassification getGdsntradeitemclassification() {
        return gdsntradeitemclassification;
    }

    /**
     * Sets the value of the gdsntradeitemclassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gdsntradeitemclassification }
     *     
     */
    public void setGdsntradeitemclassification(Gdsntradeitemclassification value) {
        this.gdsntradeitemclassification = value;
    }

    /**
     * Gets the value of the foodBeverageNutrientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageNutrientInfo }
     *     
     */
    public FoodBeverageNutrientInfo getFoodBeverageNutrientInfo() {
        return foodBeverageNutrientInfo;
    }

    /**
     * Sets the value of the foodBeverageNutrientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageNutrientInfo }
     *     
     */
    public void setFoodBeverageNutrientInfo(FoodBeverageNutrientInfo value) {
        this.foodBeverageNutrientInfo = value;
    }

    /**
     * Gets the value of the tvFeatureCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tvFeatureCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTvFeatureCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TvFeature }
     * 
     * 
     */
    public List<TvFeature> getTvFeatureCollection() {
        if (tvFeatureCollection == null) {
            tvFeatureCollection = new ArrayList<TvFeature>();
        }
        return this.tvFeatureCollection;
    }

    /**
     * Gets the value of the foodBeverageCheeseInform property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBeverageCheeseInform }
     *     
     */
    public FoodBeverageCheeseInform getFoodBeverageCheeseInform() {
        return foodBeverageCheeseInform;
    }

    /**
     * Sets the value of the foodBeverageCheeseInform property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBeverageCheeseInform }
     *     
     */
    public void setFoodBeverageCheeseInform(FoodBeverageCheeseInform value) {
        this.foodBeverageCheeseInform = value;
    }

    /**
     * Gets the value of the foodBevergeIngredientInform property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBevergeIngredientInform }
     *     
     */
    public FoodBevergeIngredientInform getFoodBevergeIngredientInform() {
        return foodBevergeIngredientInform;
    }

    /**
     * Sets the value of the foodBevergeIngredientInform property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBevergeIngredientInform }
     *     
     */
    public void setFoodBevergeIngredientInform(FoodBevergeIngredientInform value) {
        this.foodBevergeIngredientInform = value;
    }

    /**
     * Gets the value of the foodBeverageIngredientCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodBeverageIngredientCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBeverageIngredientCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBeverageIngredient }
     * 
     * 
     */
    public List<FoodBeverageIngredient> getFoodBeverageIngredientCollection() {
        if (foodBeverageIngredientCollection == null) {
            foodBeverageIngredientCollection = new ArrayList<FoodBeverageIngredient>();
        }
        return this.foodBeverageIngredientCollection;
    }

    /**
     * Gets the value of the audioVideoPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link AudioVideoPhoto }
     *     
     */
    public AudioVideoPhoto getAudioVideoPhoto() {
        return audioVideoPhoto;
    }

    /**
     * Sets the value of the audioVideoPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioVideoPhoto }
     *     
     */
    public void setAudioVideoPhoto(AudioVideoPhoto value) {
        this.audioVideoPhoto = value;
    }

    /**
     * Gets the value of the productYieldInformationCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the productYieldInformationCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductYieldInformationCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductYieldInformation }
     * 
     * 
     */
    public List<ProductYieldInformation> getProductYieldInformationCollection() {
        if (productYieldInformationCollection == null) {
            productYieldInformationCollection = new ArrayList<ProductYieldInformation>();
        }
        return this.productYieldInformationCollection;
    }

    /**
     * Gets the value of the productrangeCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the productrangeCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductrangeCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Productrange }
     * 
     * 
     */
    public List<Productrange> getProductrangeCollection() {
        if (productrangeCollection == null) {
            productrangeCollection = new ArrayList<Productrange>();
        }
        return this.productrangeCollection;
    }

    /**
     * Gets the value of the foodBeverageMarketingInformCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodBeverageMarketingInformCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBeverageMarketingInformCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBeverageMarketingInform }
     * 
     * 
     */
    public List<FoodBeverageMarketingInform> getFoodBeverageMarketingInformCollection() {
        if (foodBeverageMarketingInformCollection == null) {
            foodBeverageMarketingInformCollection = new ArrayList<FoodBeverageMarketingInform>();
        }
        return this.foodBeverageMarketingInformCollection;
    }

    /**
     * Gets the value of the targetmarketinformationCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the targetmarketinformationCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetmarketinformationCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Targetmarketinformation }
     * 
     * 
     */
    public List<Targetmarketinformation> getTargetmarketinformationCollection() {
        if (targetmarketinformationCollection == null) {
            targetmarketinformationCollection = new ArrayList<Targetmarketinformation>();
        }
        return this.targetmarketinformationCollection;
    }

    /**
     * Gets the value of the foodBeveragePreparationCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foodBeveragePreparationCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodBeveragePreparationCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodBeveragePreparation }
     * 
     * 
     */
    public List<FoodBeveragePreparation> getFoodBeveragePreparationCollection() {
        if (foodBeveragePreparationCollection == null) {
            foodBeveragePreparationCollection = new ArrayList<FoodBeveragePreparation>();
        }
        return this.foodBeveragePreparationCollection;
    }

}
