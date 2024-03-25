
package com.example.wsdl;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for banks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="banks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="banksPK" type="{http://globalservice.ws.bept.ids.by/}banksPK" minOccurs="0"/&gt;
 *         &lt;element name="bankid" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="bankname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankbranchcode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="bankaccounts" type="{http://globalservice.ws.bept.ids.by/}bankaccounts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "banks", propOrder = {
    "banksPK",
    "bankid",
    "bankname",
    "bankaddress",
    "bic",
    "bankbranchcode",
    "bankaccounts"
})
public class Banks {

    protected BanksPK banksPK;
    protected BigInteger bankid;
    protected String bankname;
    protected String bankaddress;
    protected String bic;
    protected Short bankbranchcode;
    protected Bankaccounts bankaccounts;

    /**
     * Gets the value of the banksPK property.
     * 
     * @return
     *     possible object is
     *     {@link BanksPK }
     *     
     */
    public BanksPK getBanksPK() {
        return banksPK;
    }

    /**
     * Sets the value of the banksPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BanksPK }
     *     
     */
    public void setBanksPK(BanksPK value) {
        this.banksPK = value;
    }

    /**
     * Gets the value of the bankid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBankid() {
        return bankid;
    }

    /**
     * Sets the value of the bankid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBankid(BigInteger value) {
        this.bankid = value;
    }

    /**
     * Gets the value of the bankname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * Sets the value of the bankname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankname(String value) {
        this.bankname = value;
    }

    /**
     * Gets the value of the bankaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankaddress() {
        return bankaddress;
    }

    /**
     * Sets the value of the bankaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankaddress(String value) {
        this.bankaddress = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the bankbranchcode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBankbranchcode() {
        return bankbranchcode;
    }

    /**
     * Sets the value of the bankbranchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBankbranchcode(Short value) {
        this.bankbranchcode = value;
    }

    /**
     * Gets the value of the bankaccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Bankaccounts }
     *     
     */
    public Bankaccounts getBankaccounts() {
        return bankaccounts;
    }

    /**
     * Sets the value of the bankaccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bankaccounts }
     *     
     */
    public void setBankaccounts(Bankaccounts value) {
        this.bankaccounts = value;
    }

}
