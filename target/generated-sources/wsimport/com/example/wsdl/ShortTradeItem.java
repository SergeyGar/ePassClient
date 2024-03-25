
package com.example.wsdl;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shortTradeItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shortTradeItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brandname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="brick_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateflag" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="functionalname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gdsntradeitemclassification" type="{http://globalservice.ws.bept.ids.by/}gdsntradeitemclassification" minOccurs="0"/&gt;
 *         &lt;element name="gln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="informationprovidergln" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lastmodificationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nameofinformationprovider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="netcontent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="okrb007code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordcreateddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subbrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ticountryoflastprocessing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tnvedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemcountryofassemblys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeitemcountryoforigins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitofmeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unpcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="variant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shortTradeItem", propOrder = {
    "addinfo",
    "addmark",
    "brandname",
    "brickCode",
    "dateflag",
    "functionalname",
    "gdsntradeitemclassification",
    "gln",
    "gtin",
    "informationprovidergln",
    "lastmodificationdate",
    "nameofinformationprovider",
    "netcontent",
    "okrb007Code",
    "recordcreateddate",
    "subbrand",
    "ticountryoflastprocessing",
    "tnvedCode",
    "tradeitemcountryofassemblys",
    "tradeitemcountryoforigins",
    "unitofmeasure",
    "unpcode",
    "variant"
})
public class ShortTradeItem {

    protected String addinfo;
    protected String addmark;
    protected String brandname;
    @XmlElement(name = "brick_code")
    protected String brickCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateflag;
    protected String functionalname;
    protected Gdsntradeitemclassification gdsntradeitemclassification;
    protected Long gln;
    protected Long gtin;
    protected Long informationprovidergln;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastmodificationdate;
    protected String nameofinformationprovider;
    protected BigDecimal netcontent;
    @XmlElement(name = "okrb007code")
    protected String okrb007Code;
    protected String recordcreateddate;
    protected String subbrand;
    protected String ticountryoflastprocessing;
    protected String tnvedCode;
    protected String tradeitemcountryofassemblys;
    protected String tradeitemcountryoforigins;
    protected String unitofmeasure;
    protected String unpcode;
    protected String variant;

    /**
     * Gets the value of the addinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddinfo() {
        return addinfo;
    }

    /**
     * Sets the value of the addinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddinfo(String value) {
        this.addinfo = value;
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
     * Gets the value of the brandname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * Sets the value of the brandname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandname(String value) {
        this.brandname = value;
    }

    /**
     * Gets the value of the brickCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrickCode() {
        return brickCode;
    }

    /**
     * Sets the value of the brickCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrickCode(String value) {
        this.brickCode = value;
    }

    /**
     * Gets the value of the dateflag property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateflag() {
        return dateflag;
    }

    /**
     * Sets the value of the dateflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateflag(XMLGregorianCalendar value) {
        this.dateflag = value;
    }

    /**
     * Gets the value of the functionalname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalname() {
        return functionalname;
    }

    /**
     * Sets the value of the functionalname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalname(String value) {
        this.functionalname = value;
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
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGtin(Long value) {
        this.gtin = value;
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
     * Gets the value of the netcontent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetcontent() {
        return netcontent;
    }

    /**
     * Sets the value of the netcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetcontent(BigDecimal value) {
        this.netcontent = value;
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
     * Gets the value of the recordcreateddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordcreateddate() {
        return recordcreateddate;
    }

    /**
     * Sets the value of the recordcreateddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordcreateddate(String value) {
        this.recordcreateddate = value;
    }

    /**
     * Gets the value of the subbrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubbrand() {
        return subbrand;
    }

    /**
     * Sets the value of the subbrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubbrand(String value) {
        this.subbrand = value;
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
     * Gets the value of the tnvedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnvedCode() {
        return tnvedCode;
    }

    /**
     * Sets the value of the tnvedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnvedCode(String value) {
        this.tnvedCode = value;
    }

    /**
     * Gets the value of the tradeitemcountryofassemblys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeitemcountryofassemblys() {
        return tradeitemcountryofassemblys;
    }

    /**
     * Sets the value of the tradeitemcountryofassemblys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeitemcountryofassemblys(String value) {
        this.tradeitemcountryofassemblys = value;
    }

    /**
     * Gets the value of the tradeitemcountryoforigins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeitemcountryoforigins() {
        return tradeitemcountryoforigins;
    }

    /**
     * Sets the value of the tradeitemcountryoforigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeitemcountryoforigins(String value) {
        this.tradeitemcountryoforigins = value;
    }

    /**
     * Gets the value of the unitofmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofmeasure() {
        return unitofmeasure;
    }

    /**
     * Sets the value of the unitofmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofmeasure(String value) {
        this.unitofmeasure = value;
    }

    /**
     * Gets the value of the unpcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnpcode() {
        return unpcode;
    }

    /**
     * Sets the value of the unpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnpcode(String value) {
        this.unpcode = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
    }

}
