
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gdsntradeitemclassification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gdsntradeitemclassification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="classificationcategorycode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassatttypecode1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassattvaluecode1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassatttypecode2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassattvaluecode2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassatttypecode3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassattvaluecode3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassatttypecode4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassattvaluecode4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassatttypecode5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassattvaluecode5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassatttypecode6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassattvaluecode6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassatttypecode7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="eanuccclassattvaluecode7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="classificationcategorypath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "gdsntradeitemclassification", propOrder = {
    "globaltradeitemnumber",
    "classificationcategorycode",
    "eanuccclassatttypecode1",
    "eanuccclassattvaluecode1",
    "eanuccclassatttypecode2",
    "eanuccclassattvaluecode2",
    "eanuccclassatttypecode3",
    "eanuccclassattvaluecode3",
    "eanuccclassatttypecode4",
    "eanuccclassattvaluecode4",
    "eanuccclassatttypecode5",
    "eanuccclassattvaluecode5",
    "eanuccclassatttypecode6",
    "eanuccclassattvaluecode6",
    "eanuccclassatttypecode7",
    "eanuccclassattvaluecode7",
    "classificationcategorypath",
    "tradeitem"
})
public class Gdsntradeitemclassification {

    protected Long globaltradeitemnumber;
    protected Integer classificationcategorycode;
    protected Integer eanuccclassatttypecode1;
    protected Integer eanuccclassattvaluecode1;
    protected Integer eanuccclassatttypecode2;
    protected Integer eanuccclassattvaluecode2;
    protected Integer eanuccclassatttypecode3;
    protected Integer eanuccclassattvaluecode3;
    protected Integer eanuccclassatttypecode4;
    protected Integer eanuccclassattvaluecode4;
    protected Integer eanuccclassatttypecode5;
    protected Integer eanuccclassattvaluecode5;
    protected Integer eanuccclassatttypecode6;
    protected Integer eanuccclassattvaluecode6;
    protected Integer eanuccclassatttypecode7;
    protected Integer eanuccclassattvaluecode7;
    protected String classificationcategorypath;
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
     * Gets the value of the classificationcategorycode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassificationcategorycode() {
        return classificationcategorycode;
    }

    /**
     * Sets the value of the classificationcategorycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassificationcategorycode(Integer value) {
        this.classificationcategorycode = value;
    }

    /**
     * Gets the value of the eanuccclassatttypecode1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassatttypecode1() {
        return eanuccclassatttypecode1;
    }

    /**
     * Sets the value of the eanuccclassatttypecode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassatttypecode1(Integer value) {
        this.eanuccclassatttypecode1 = value;
    }

    /**
     * Gets the value of the eanuccclassattvaluecode1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassattvaluecode1() {
        return eanuccclassattvaluecode1;
    }

    /**
     * Sets the value of the eanuccclassattvaluecode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassattvaluecode1(Integer value) {
        this.eanuccclassattvaluecode1 = value;
    }

    /**
     * Gets the value of the eanuccclassatttypecode2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassatttypecode2() {
        return eanuccclassatttypecode2;
    }

    /**
     * Sets the value of the eanuccclassatttypecode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassatttypecode2(Integer value) {
        this.eanuccclassatttypecode2 = value;
    }

    /**
     * Gets the value of the eanuccclassattvaluecode2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassattvaluecode2() {
        return eanuccclassattvaluecode2;
    }

    /**
     * Sets the value of the eanuccclassattvaluecode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassattvaluecode2(Integer value) {
        this.eanuccclassattvaluecode2 = value;
    }

    /**
     * Gets the value of the eanuccclassatttypecode3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassatttypecode3() {
        return eanuccclassatttypecode3;
    }

    /**
     * Sets the value of the eanuccclassatttypecode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassatttypecode3(Integer value) {
        this.eanuccclassatttypecode3 = value;
    }

    /**
     * Gets the value of the eanuccclassattvaluecode3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassattvaluecode3() {
        return eanuccclassattvaluecode3;
    }

    /**
     * Sets the value of the eanuccclassattvaluecode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassattvaluecode3(Integer value) {
        this.eanuccclassattvaluecode3 = value;
    }

    /**
     * Gets the value of the eanuccclassatttypecode4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassatttypecode4() {
        return eanuccclassatttypecode4;
    }

    /**
     * Sets the value of the eanuccclassatttypecode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassatttypecode4(Integer value) {
        this.eanuccclassatttypecode4 = value;
    }

    /**
     * Gets the value of the eanuccclassattvaluecode4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassattvaluecode4() {
        return eanuccclassattvaluecode4;
    }

    /**
     * Sets the value of the eanuccclassattvaluecode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassattvaluecode4(Integer value) {
        this.eanuccclassattvaluecode4 = value;
    }

    /**
     * Gets the value of the eanuccclassatttypecode5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassatttypecode5() {
        return eanuccclassatttypecode5;
    }

    /**
     * Sets the value of the eanuccclassatttypecode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassatttypecode5(Integer value) {
        this.eanuccclassatttypecode5 = value;
    }

    /**
     * Gets the value of the eanuccclassattvaluecode5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassattvaluecode5() {
        return eanuccclassattvaluecode5;
    }

    /**
     * Sets the value of the eanuccclassattvaluecode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassattvaluecode5(Integer value) {
        this.eanuccclassattvaluecode5 = value;
    }

    /**
     * Gets the value of the eanuccclassatttypecode6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassatttypecode6() {
        return eanuccclassatttypecode6;
    }

    /**
     * Sets the value of the eanuccclassatttypecode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassatttypecode6(Integer value) {
        this.eanuccclassatttypecode6 = value;
    }

    /**
     * Gets the value of the eanuccclassattvaluecode6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassattvaluecode6() {
        return eanuccclassattvaluecode6;
    }

    /**
     * Sets the value of the eanuccclassattvaluecode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassattvaluecode6(Integer value) {
        this.eanuccclassattvaluecode6 = value;
    }

    /**
     * Gets the value of the eanuccclassatttypecode7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassatttypecode7() {
        return eanuccclassatttypecode7;
    }

    /**
     * Sets the value of the eanuccclassatttypecode7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassatttypecode7(Integer value) {
        this.eanuccclassatttypecode7 = value;
    }

    /**
     * Gets the value of the eanuccclassattvaluecode7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEanuccclassattvaluecode7() {
        return eanuccclassattvaluecode7;
    }

    /**
     * Sets the value of the eanuccclassattvaluecode7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEanuccclassattvaluecode7(Integer value) {
        this.eanuccclassattvaluecode7 = value;
    }

    /**
     * Gets the value of the classificationcategorypath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationcategorypath() {
        return classificationcategorypath;
    }

    /**
     * Sets the value of the classificationcategorypath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationcategorypath(String value) {
        this.classificationcategorypath = value;
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
