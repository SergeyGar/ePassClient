
package com.example.wsdl;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for catalogueprice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catalogueprice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="effectivestartdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="effectiveenddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeitempricebasisquantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipbquom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpneutraltiinformation" type="{http://globalservice.ws.bept.ids.by/}tpneutraltiinformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogueprice", propOrder = {
    "globaltradeitemnumber",
    "effectivestartdate",
    "effectiveenddate",
    "value",
    "currency",
    "tradeitempricebasisquantity",
    "tipbquom",
    "tpneutraltiinformation"
})
public class Catalogueprice {

    protected Long globaltradeitemnumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectivestartdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveenddate;
    protected BigDecimal value;
    protected String currency;
    protected BigDecimal tradeitempricebasisquantity;
    protected String tipbquom;
    protected Tpneutraltiinformation tpneutraltiinformation;

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
     * Gets the value of the effectivestartdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivestartdate() {
        return effectivestartdate;
    }

    /**
     * Sets the value of the effectivestartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectivestartdate(XMLGregorianCalendar value) {
        this.effectivestartdate = value;
    }

    /**
     * Gets the value of the effectiveenddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveenddate() {
        return effectiveenddate;
    }

    /**
     * Sets the value of the effectiveenddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveenddate(XMLGregorianCalendar value) {
        this.effectiveenddate = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
     * Gets the value of the tradeitempricebasisquantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradeitempricebasisquantity() {
        return tradeitempricebasisquantity;
    }

    /**
     * Sets the value of the tradeitempricebasisquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradeitempricebasisquantity(BigDecimal value) {
        this.tradeitempricebasisquantity = value;
    }

    /**
     * Gets the value of the tipbquom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipbquom() {
        return tipbquom;
    }

    /**
     * Sets the value of the tipbquom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipbquom(String value) {
        this.tipbquom = value;
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

}
