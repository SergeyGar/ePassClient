
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for audioVideoPhoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audioVideoPhoto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="hdmitestingagency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supportedhdmifeature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availablechannelstationquantit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="electronicprogrammingguidedays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="signalprocessingtypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tunertypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detachablespeakertypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fixedspeakerlocationcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surroundsounddigitaldecodertyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalaudiopoweroutput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availablebrightnessvalues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="combfiltertechnologytypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dynamiccontrastratio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="multipicturedisplaycapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenrefreshrate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="staticcontrastratio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="televisioninformationservice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tvtextmemorypagequantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="displayscreentypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horizontalviewingangle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="verticalviewingangle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aspectratiodescriptioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aspectratiodimensioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeiteminstallationoption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vesawallmounttypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remotecontroltypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalmemorytypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalmemorytypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="charactermeasurebrightness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availablebrightnessmeasurement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "audioVideoPhoto", propOrder = {
    "globaltradeitemnumber",
    "hdmitestingagency",
    "supportedhdmifeature",
    "availablechannelstationquantit",
    "electronicprogrammingguidedays",
    "signalprocessingtypecode",
    "tunertypecode",
    "detachablespeakertypecode",
    "fixedspeakerlocationcode",
    "surroundsounddigitaldecodertyp",
    "totalaudiopoweroutput",
    "availablebrightnessvalues",
    "combfiltertechnologytypecode",
    "dynamiccontrastratio",
    "multipicturedisplaycapability",
    "screenrefreshrate",
    "staticcontrastratio",
    "televisioninformationservice",
    "tvtextmemorypagequantity",
    "displayscreentypecode",
    "horizontalviewingangle",
    "verticalviewingangle",
    "aspectratiodescriptioncode",
    "aspectratiodimensioncode",
    "tradeiteminstallationoption",
    "vesawallmounttypecode",
    "remotecontroltypecode",
    "externalmemorytypecode",
    "internalmemorytypecode",
    "charactermeasurebrightness",
    "availablebrightnessmeasurement",
    "tradeitem"
})
public class AudioVideoPhoto {

    protected Long globaltradeitemnumber;
    protected String hdmitestingagency;
    protected String supportedhdmifeature;
    protected Integer availablechannelstationquantit;
    protected Integer electronicprogrammingguidedays;
    protected String signalprocessingtypecode;
    protected String tunertypecode;
    protected String detachablespeakertypecode;
    protected String fixedspeakerlocationcode;
    protected String surroundsounddigitaldecodertyp;
    protected String totalaudiopoweroutput;
    protected String availablebrightnessvalues;
    protected String combfiltertechnologytypecode;
    protected Integer dynamiccontrastratio;
    protected String multipicturedisplaycapability;
    protected Integer screenrefreshrate;
    protected Integer staticcontrastratio;
    protected String televisioninformationservice;
    protected Integer tvtextmemorypagequantity;
    protected String displayscreentypecode;
    protected Integer horizontalviewingangle;
    protected Integer verticalviewingangle;
    protected String aspectratiodescriptioncode;
    protected String aspectratiodimensioncode;
    protected String tradeiteminstallationoption;
    protected String vesawallmounttypecode;
    protected String remotecontroltypecode;
    protected String externalmemorytypecode;
    protected String internalmemorytypecode;
    protected String charactermeasurebrightness;
    protected String availablebrightnessmeasurement;
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
     * Gets the value of the hdmitestingagency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdmitestingagency() {
        return hdmitestingagency;
    }

    /**
     * Sets the value of the hdmitestingagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdmitestingagency(String value) {
        this.hdmitestingagency = value;
    }

    /**
     * Gets the value of the supportedhdmifeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedhdmifeature() {
        return supportedhdmifeature;
    }

    /**
     * Sets the value of the supportedhdmifeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedhdmifeature(String value) {
        this.supportedhdmifeature = value;
    }

    /**
     * Gets the value of the availablechannelstationquantit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailablechannelstationquantit() {
        return availablechannelstationquantit;
    }

    /**
     * Sets the value of the availablechannelstationquantit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailablechannelstationquantit(Integer value) {
        this.availablechannelstationquantit = value;
    }

    /**
     * Gets the value of the electronicprogrammingguidedays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElectronicprogrammingguidedays() {
        return electronicprogrammingguidedays;
    }

    /**
     * Sets the value of the electronicprogrammingguidedays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElectronicprogrammingguidedays(Integer value) {
        this.electronicprogrammingguidedays = value;
    }

    /**
     * Gets the value of the signalprocessingtypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalprocessingtypecode() {
        return signalprocessingtypecode;
    }

    /**
     * Sets the value of the signalprocessingtypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalprocessingtypecode(String value) {
        this.signalprocessingtypecode = value;
    }

    /**
     * Gets the value of the tunertypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunertypecode() {
        return tunertypecode;
    }

    /**
     * Sets the value of the tunertypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunertypecode(String value) {
        this.tunertypecode = value;
    }

    /**
     * Gets the value of the detachablespeakertypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetachablespeakertypecode() {
        return detachablespeakertypecode;
    }

    /**
     * Sets the value of the detachablespeakertypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetachablespeakertypecode(String value) {
        this.detachablespeakertypecode = value;
    }

    /**
     * Gets the value of the fixedspeakerlocationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedspeakerlocationcode() {
        return fixedspeakerlocationcode;
    }

    /**
     * Sets the value of the fixedspeakerlocationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedspeakerlocationcode(String value) {
        this.fixedspeakerlocationcode = value;
    }

    /**
     * Gets the value of the surroundsounddigitaldecodertyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurroundsounddigitaldecodertyp() {
        return surroundsounddigitaldecodertyp;
    }

    /**
     * Sets the value of the surroundsounddigitaldecodertyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurroundsounddigitaldecodertyp(String value) {
        this.surroundsounddigitaldecodertyp = value;
    }

    /**
     * Gets the value of the totalaudiopoweroutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalaudiopoweroutput() {
        return totalaudiopoweroutput;
    }

    /**
     * Sets the value of the totalaudiopoweroutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalaudiopoweroutput(String value) {
        this.totalaudiopoweroutput = value;
    }

    /**
     * Gets the value of the availablebrightnessvalues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailablebrightnessvalues() {
        return availablebrightnessvalues;
    }

    /**
     * Sets the value of the availablebrightnessvalues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailablebrightnessvalues(String value) {
        this.availablebrightnessvalues = value;
    }

    /**
     * Gets the value of the combfiltertechnologytypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombfiltertechnologytypecode() {
        return combfiltertechnologytypecode;
    }

    /**
     * Sets the value of the combfiltertechnologytypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombfiltertechnologytypecode(String value) {
        this.combfiltertechnologytypecode = value;
    }

    /**
     * Gets the value of the dynamiccontrastratio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDynamiccontrastratio() {
        return dynamiccontrastratio;
    }

    /**
     * Sets the value of the dynamiccontrastratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDynamiccontrastratio(Integer value) {
        this.dynamiccontrastratio = value;
    }

    /**
     * Gets the value of the multipicturedisplaycapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipicturedisplaycapability() {
        return multipicturedisplaycapability;
    }

    /**
     * Sets the value of the multipicturedisplaycapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipicturedisplaycapability(String value) {
        this.multipicturedisplaycapability = value;
    }

    /**
     * Gets the value of the screenrefreshrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScreenrefreshrate() {
        return screenrefreshrate;
    }

    /**
     * Sets the value of the screenrefreshrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScreenrefreshrate(Integer value) {
        this.screenrefreshrate = value;
    }

    /**
     * Gets the value of the staticcontrastratio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStaticcontrastratio() {
        return staticcontrastratio;
    }

    /**
     * Sets the value of the staticcontrastratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStaticcontrastratio(Integer value) {
        this.staticcontrastratio = value;
    }

    /**
     * Gets the value of the televisioninformationservice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelevisioninformationservice() {
        return televisioninformationservice;
    }

    /**
     * Sets the value of the televisioninformationservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelevisioninformationservice(String value) {
        this.televisioninformationservice = value;
    }

    /**
     * Gets the value of the tvtextmemorypagequantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTvtextmemorypagequantity() {
        return tvtextmemorypagequantity;
    }

    /**
     * Sets the value of the tvtextmemorypagequantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTvtextmemorypagequantity(Integer value) {
        this.tvtextmemorypagequantity = value;
    }

    /**
     * Gets the value of the displayscreentypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayscreentypecode() {
        return displayscreentypecode;
    }

    /**
     * Sets the value of the displayscreentypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayscreentypecode(String value) {
        this.displayscreentypecode = value;
    }

    /**
     * Gets the value of the horizontalviewingangle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorizontalviewingangle() {
        return horizontalviewingangle;
    }

    /**
     * Sets the value of the horizontalviewingangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorizontalviewingangle(Integer value) {
        this.horizontalviewingangle = value;
    }

    /**
     * Gets the value of the verticalviewingangle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerticalviewingangle() {
        return verticalviewingangle;
    }

    /**
     * Sets the value of the verticalviewingangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerticalviewingangle(Integer value) {
        this.verticalviewingangle = value;
    }

    /**
     * Gets the value of the aspectratiodescriptioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectratiodescriptioncode() {
        return aspectratiodescriptioncode;
    }

    /**
     * Sets the value of the aspectratiodescriptioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectratiodescriptioncode(String value) {
        this.aspectratiodescriptioncode = value;
    }

    /**
     * Gets the value of the aspectratiodimensioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectratiodimensioncode() {
        return aspectratiodimensioncode;
    }

    /**
     * Sets the value of the aspectratiodimensioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectratiodimensioncode(String value) {
        this.aspectratiodimensioncode = value;
    }

    /**
     * Gets the value of the tradeiteminstallationoption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeiteminstallationoption() {
        return tradeiteminstallationoption;
    }

    /**
     * Sets the value of the tradeiteminstallationoption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeiteminstallationoption(String value) {
        this.tradeiteminstallationoption = value;
    }

    /**
     * Gets the value of the vesawallmounttypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesawallmounttypecode() {
        return vesawallmounttypecode;
    }

    /**
     * Sets the value of the vesawallmounttypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesawallmounttypecode(String value) {
        this.vesawallmounttypecode = value;
    }

    /**
     * Gets the value of the remotecontroltypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemotecontroltypecode() {
        return remotecontroltypecode;
    }

    /**
     * Sets the value of the remotecontroltypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemotecontroltypecode(String value) {
        this.remotecontroltypecode = value;
    }

    /**
     * Gets the value of the externalmemorytypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalmemorytypecode() {
        return externalmemorytypecode;
    }

    /**
     * Sets the value of the externalmemorytypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalmemorytypecode(String value) {
        this.externalmemorytypecode = value;
    }

    /**
     * Gets the value of the internalmemorytypecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalmemorytypecode() {
        return internalmemorytypecode;
    }

    /**
     * Sets the value of the internalmemorytypecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalmemorytypecode(String value) {
        this.internalmemorytypecode = value;
    }

    /**
     * Gets the value of the charactermeasurebrightness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharactermeasurebrightness() {
        return charactermeasurebrightness;
    }

    /**
     * Sets the value of the charactermeasurebrightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharactermeasurebrightness(String value) {
        this.charactermeasurebrightness = value;
    }

    /**
     * Gets the value of the availablebrightnessmeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailablebrightnessmeasurement() {
        return availablebrightnessmeasurement;
    }

    /**
     * Sets the value of the availablebrightnessmeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailablebrightnessmeasurement(String value) {
        this.availablebrightnessmeasurement = value;
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
