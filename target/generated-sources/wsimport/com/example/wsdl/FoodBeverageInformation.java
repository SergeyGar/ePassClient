
package com.example.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBeverageInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBeverageInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="productioneffectivedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="productiondescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productionfacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customersupportcentre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBeverageInformation", propOrder = {
    "globaltradeitemnumber",
    "productioneffectivedate",
    "productiondescription",
    "productionfacility",
    "customersupportcentre",
    "tradeitem"
})
public class FoodBeverageInformation {

    protected Long globaltradeitemnumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productioneffectivedate;
    protected String productiondescription;
    protected String productionfacility;
    protected String customersupportcentre;
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
     * Gets the value of the productioneffectivedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductioneffectivedate() {
        return productioneffectivedate;
    }

    /**
     * Sets the value of the productioneffectivedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductioneffectivedate(XMLGregorianCalendar value) {
        this.productioneffectivedate = value;
    }

    /**
     * Gets the value of the productiondescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductiondescription() {
        return productiondescription;
    }

    /**
     * Sets the value of the productiondescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductiondescription(String value) {
        this.productiondescription = value;
    }

    /**
     * Gets the value of the productionfacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionfacility() {
        return productionfacility;
    }

    /**
     * Sets the value of the productionfacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionfacility(String value) {
        this.productionfacility = value;
    }

    /**
     * Gets the value of the customersupportcentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomersupportcentre() {
        return customersupportcentre;
    }

    /**
     * Sets the value of the customersupportcentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomersupportcentre(String value) {
        this.customersupportcentre = value;
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
