
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hazardousGoods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hazardousGoods"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="manufacturersnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="istransportationhazadousmater" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="transportationregulatiryagency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isairtransportforbidden" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="airtransportforbiddenreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isappropriateforaircargo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="aircargomaximumquantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aircargoquantitymeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isappropriateforairpassenger" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="airpassengermaximumquantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="airpassengequantitymeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iswatertransportforbidden" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="watertransportforbiddenreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marinepollutanttechnicalname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasflashpoint" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="flashpointtemperature" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="flashtemperaturemeasurememt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ishazardshippingpaperrequired" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="isclassifiedasormd" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="isexceptedquantity" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="hazardousclassordivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificationnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ishazardousmatvolumerequired" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ishazardoussubstancereportable" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="islimitedquantity" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="propershippingname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exemptionorapprovalreferencnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazardousmaterialadditionalinf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazardousmaterialtechnicalname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazardoussubstancetechnicname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packinggroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryclassdivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hazardousmaterialvolume" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="hazardousmaterialmeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="basicrisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="picturebasicrisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pictureextrarisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hazardousGoods", propOrder = {
    "globaltradeitemnumber",
    "manufacturersnumber",
    "istransportationhazadousmater",
    "transportationregulatiryagency",
    "isairtransportforbidden",
    "airtransportforbiddenreason",
    "isappropriateforaircargo",
    "aircargomaximumquantity",
    "aircargoquantitymeasurement",
    "isappropriateforairpassenger",
    "airpassengermaximumquantity",
    "airpassengequantitymeasurement",
    "iswatertransportforbidden",
    "watertransportforbiddenreason",
    "marinepollutanttechnicalname",
    "hasflashpoint",
    "flashpointtemperature",
    "flashtemperaturemeasurememt",
    "ishazardshippingpaperrequired",
    "isclassifiedasormd",
    "isexceptedquantity",
    "hazardousclassordivision",
    "identificationnumber",
    "ishazardousmatvolumerequired",
    "ishazardoussubstancereportable",
    "islimitedquantity",
    "propershippingname",
    "exemptionorapprovalreferencnum",
    "hazardousmaterialadditionalinf",
    "hazardousmaterialtechnicalname",
    "hazardoussubstancetechnicname",
    "packinggroup",
    "subsidiaryclassdivision",
    "hazardousmaterialvolume",
    "hazardousmaterialmeasurement",
    "basicrisk",
    "picturebasicrisk",
    "pictureextrarisk",
    "tradeitem"
})
public class HazardousGoods {

    protected Long globaltradeitemnumber;
    protected String manufacturersnumber;
    protected Short istransportationhazadousmater;
    protected String transportationregulatiryagency;
    protected Short isairtransportforbidden;
    protected String airtransportforbiddenreason;
    protected Short isappropriateforaircargo;
    protected Integer aircargomaximumquantity;
    protected String aircargoquantitymeasurement;
    protected Short isappropriateforairpassenger;
    protected Integer airpassengermaximumquantity;
    protected String airpassengequantitymeasurement;
    protected Short iswatertransportforbidden;
    protected String watertransportforbiddenreason;
    protected String marinepollutanttechnicalname;
    protected Short hasflashpoint;
    protected Integer flashpointtemperature;
    protected String flashtemperaturemeasurememt;
    protected Short ishazardshippingpaperrequired;
    protected Short isclassifiedasormd;
    protected Short isexceptedquantity;
    protected String hazardousclassordivision;
    protected String identificationnumber;
    protected Short ishazardousmatvolumerequired;
    protected Short ishazardoussubstancereportable;
    protected Short islimitedquantity;
    protected String propershippingname;
    protected String exemptionorapprovalreferencnum;
    protected String hazardousmaterialadditionalinf;
    protected String hazardousmaterialtechnicalname;
    protected String hazardoussubstancetechnicname;
    protected String packinggroup;
    protected String subsidiaryclassdivision;
    protected Integer hazardousmaterialvolume;
    protected String hazardousmaterialmeasurement;
    protected String basicrisk;
    protected String picturebasicrisk;
    protected String pictureextrarisk;
    protected Tradeitem tradeitem;

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
     * Gets the value of the manufacturersnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturersnumber() {
        return manufacturersnumber;
    }

    /**
     * Sets the value of the manufacturersnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturersnumber(String value) {
        this.manufacturersnumber = value;
    }

    /**
     * Gets the value of the istransportationhazadousmater property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIstransportationhazadousmater() {
        return istransportationhazadousmater;
    }

    /**
     * Sets the value of the istransportationhazadousmater property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIstransportationhazadousmater(Short value) {
        this.istransportationhazadousmater = value;
    }

    /**
     * Gets the value of the transportationregulatiryagency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationregulatiryagency() {
        return transportationregulatiryagency;
    }

    /**
     * Sets the value of the transportationregulatiryagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationregulatiryagency(String value) {
        this.transportationregulatiryagency = value;
    }

    /**
     * Gets the value of the isairtransportforbidden property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsairtransportforbidden() {
        return isairtransportforbidden;
    }

    /**
     * Sets the value of the isairtransportforbidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsairtransportforbidden(Short value) {
        this.isairtransportforbidden = value;
    }

    /**
     * Gets the value of the airtransportforbiddenreason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirtransportforbiddenreason() {
        return airtransportforbiddenreason;
    }

    /**
     * Sets the value of the airtransportforbiddenreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirtransportforbiddenreason(String value) {
        this.airtransportforbiddenreason = value;
    }

    /**
     * Gets the value of the isappropriateforaircargo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsappropriateforaircargo() {
        return isappropriateforaircargo;
    }

    /**
     * Sets the value of the isappropriateforaircargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsappropriateforaircargo(Short value) {
        this.isappropriateforaircargo = value;
    }

    /**
     * Gets the value of the aircargomaximumquantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAircargomaximumquantity() {
        return aircargomaximumquantity;
    }

    /**
     * Sets the value of the aircargomaximumquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAircargomaximumquantity(Integer value) {
        this.aircargomaximumquantity = value;
    }

    /**
     * Gets the value of the aircargoquantitymeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircargoquantitymeasurement() {
        return aircargoquantitymeasurement;
    }

    /**
     * Sets the value of the aircargoquantitymeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircargoquantitymeasurement(String value) {
        this.aircargoquantitymeasurement = value;
    }

    /**
     * Gets the value of the isappropriateforairpassenger property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsappropriateforairpassenger() {
        return isappropriateforairpassenger;
    }

    /**
     * Sets the value of the isappropriateforairpassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsappropriateforairpassenger(Short value) {
        this.isappropriateforairpassenger = value;
    }

    /**
     * Gets the value of the airpassengermaximumquantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirpassengermaximumquantity() {
        return airpassengermaximumquantity;
    }

    /**
     * Sets the value of the airpassengermaximumquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirpassengermaximumquantity(Integer value) {
        this.airpassengermaximumquantity = value;
    }

    /**
     * Gets the value of the airpassengequantitymeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirpassengequantitymeasurement() {
        return airpassengequantitymeasurement;
    }

    /**
     * Sets the value of the airpassengequantitymeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirpassengequantitymeasurement(String value) {
        this.airpassengequantitymeasurement = value;
    }

    /**
     * Gets the value of the iswatertransportforbidden property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIswatertransportforbidden() {
        return iswatertransportforbidden;
    }

    /**
     * Sets the value of the iswatertransportforbidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIswatertransportforbidden(Short value) {
        this.iswatertransportforbidden = value;
    }

    /**
     * Gets the value of the watertransportforbiddenreason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatertransportforbiddenreason() {
        return watertransportforbiddenreason;
    }

    /**
     * Sets the value of the watertransportforbiddenreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatertransportforbiddenreason(String value) {
        this.watertransportforbiddenreason = value;
    }

    /**
     * Gets the value of the marinepollutanttechnicalname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarinepollutanttechnicalname() {
        return marinepollutanttechnicalname;
    }

    /**
     * Sets the value of the marinepollutanttechnicalname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarinepollutanttechnicalname(String value) {
        this.marinepollutanttechnicalname = value;
    }

    /**
     * Gets the value of the hasflashpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHasflashpoint() {
        return hasflashpoint;
    }

    /**
     * Sets the value of the hasflashpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHasflashpoint(Short value) {
        this.hasflashpoint = value;
    }

    /**
     * Gets the value of the flashpointtemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlashpointtemperature() {
        return flashpointtemperature;
    }

    /**
     * Sets the value of the flashpointtemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlashpointtemperature(Integer value) {
        this.flashpointtemperature = value;
    }

    /**
     * Gets the value of the flashtemperaturemeasurememt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashtemperaturemeasurememt() {
        return flashtemperaturemeasurememt;
    }

    /**
     * Sets the value of the flashtemperaturemeasurememt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashtemperaturemeasurememt(String value) {
        this.flashtemperaturemeasurememt = value;
    }

    /**
     * Gets the value of the ishazardshippingpaperrequired property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIshazardshippingpaperrequired() {
        return ishazardshippingpaperrequired;
    }

    /**
     * Sets the value of the ishazardshippingpaperrequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIshazardshippingpaperrequired(Short value) {
        this.ishazardshippingpaperrequired = value;
    }

    /**
     * Gets the value of the isclassifiedasormd property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsclassifiedasormd() {
        return isclassifiedasormd;
    }

    /**
     * Sets the value of the isclassifiedasormd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsclassifiedasormd(Short value) {
        this.isclassifiedasormd = value;
    }

    /**
     * Gets the value of the isexceptedquantity property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIsexceptedquantity() {
        return isexceptedquantity;
    }

    /**
     * Sets the value of the isexceptedquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIsexceptedquantity(Short value) {
        this.isexceptedquantity = value;
    }

    /**
     * Gets the value of the hazardousclassordivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousclassordivision() {
        return hazardousclassordivision;
    }

    /**
     * Sets the value of the hazardousclassordivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousclassordivision(String value) {
        this.hazardousclassordivision = value;
    }

    /**
     * Gets the value of the identificationnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationnumber() {
        return identificationnumber;
    }

    /**
     * Sets the value of the identificationnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationnumber(String value) {
        this.identificationnumber = value;
    }

    /**
     * Gets the value of the ishazardousmatvolumerequired property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIshazardousmatvolumerequired() {
        return ishazardousmatvolumerequired;
    }

    /**
     * Sets the value of the ishazardousmatvolumerequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIshazardousmatvolumerequired(Short value) {
        this.ishazardousmatvolumerequired = value;
    }

    /**
     * Gets the value of the ishazardoussubstancereportable property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIshazardoussubstancereportable() {
        return ishazardoussubstancereportable;
    }

    /**
     * Sets the value of the ishazardoussubstancereportable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIshazardoussubstancereportable(Short value) {
        this.ishazardoussubstancereportable = value;
    }

    /**
     * Gets the value of the islimitedquantity property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIslimitedquantity() {
        return islimitedquantity;
    }

    /**
     * Sets the value of the islimitedquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIslimitedquantity(Short value) {
        this.islimitedquantity = value;
    }

    /**
     * Gets the value of the propershippingname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropershippingname() {
        return propershippingname;
    }

    /**
     * Sets the value of the propershippingname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropershippingname(String value) {
        this.propershippingname = value;
    }

    /**
     * Gets the value of the exemptionorapprovalreferencnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionorapprovalreferencnum() {
        return exemptionorapprovalreferencnum;
    }

    /**
     * Sets the value of the exemptionorapprovalreferencnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionorapprovalreferencnum(String value) {
        this.exemptionorapprovalreferencnum = value;
    }

    /**
     * Gets the value of the hazardousmaterialadditionalinf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousmaterialadditionalinf() {
        return hazardousmaterialadditionalinf;
    }

    /**
     * Sets the value of the hazardousmaterialadditionalinf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousmaterialadditionalinf(String value) {
        this.hazardousmaterialadditionalinf = value;
    }

    /**
     * Gets the value of the hazardousmaterialtechnicalname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousmaterialtechnicalname() {
        return hazardousmaterialtechnicalname;
    }

    /**
     * Sets the value of the hazardousmaterialtechnicalname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousmaterialtechnicalname(String value) {
        this.hazardousmaterialtechnicalname = value;
    }

    /**
     * Gets the value of the hazardoussubstancetechnicname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardoussubstancetechnicname() {
        return hazardoussubstancetechnicname;
    }

    /**
     * Sets the value of the hazardoussubstancetechnicname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardoussubstancetechnicname(String value) {
        this.hazardoussubstancetechnicname = value;
    }

    /**
     * Gets the value of the packinggroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackinggroup() {
        return packinggroup;
    }

    /**
     * Sets the value of the packinggroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackinggroup(String value) {
        this.packinggroup = value;
    }

    /**
     * Gets the value of the subsidiaryclassdivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidiaryclassdivision() {
        return subsidiaryclassdivision;
    }

    /**
     * Sets the value of the subsidiaryclassdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidiaryclassdivision(String value) {
        this.subsidiaryclassdivision = value;
    }

    /**
     * Gets the value of the hazardousmaterialvolume property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHazardousmaterialvolume() {
        return hazardousmaterialvolume;
    }

    /**
     * Sets the value of the hazardousmaterialvolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHazardousmaterialvolume(Integer value) {
        this.hazardousmaterialvolume = value;
    }

    /**
     * Gets the value of the hazardousmaterialmeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousmaterialmeasurement() {
        return hazardousmaterialmeasurement;
    }

    /**
     * Sets the value of the hazardousmaterialmeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousmaterialmeasurement(String value) {
        this.hazardousmaterialmeasurement = value;
    }

    /**
     * Gets the value of the basicrisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicrisk() {
        return basicrisk;
    }

    /**
     * Sets the value of the basicrisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicrisk(String value) {
        this.basicrisk = value;
    }

    /**
     * Gets the value of the picturebasicrisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicturebasicrisk() {
        return picturebasicrisk;
    }

    /**
     * Sets the value of the picturebasicrisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicturebasicrisk(String value) {
        this.picturebasicrisk = value;
    }

    /**
     * Gets the value of the pictureextrarisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureextrarisk() {
        return pictureextrarisk;
    }

    /**
     * Sets the value of the pictureextrarisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureextrarisk(String value) {
        this.pictureextrarisk = value;
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

}
