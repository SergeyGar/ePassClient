
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodPhysiochemicalCharact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodPhysiochemicalCharact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodPhysiochemicalCharactPK" type="{http://globalservice.ws.bept.ids.by/}foodPhysiochemicalCharactPK" minOccurs="0"/&gt;
 *         &lt;element name="characteristiccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="characteristicvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitmeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodPhysiochemicalCharact", propOrder = {
    "foodPhysiochemicalCharactPK",
    "characteristiccode",
    "characteristicvalue",
    "unitmeasure",
    "tradeitem"
})
public class FoodPhysiochemicalCharact {

    protected FoodPhysiochemicalCharactPK foodPhysiochemicalCharactPK;
    protected String characteristiccode;
    protected String characteristicvalue;
    protected String unitmeasure;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodPhysiochemicalCharactPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodPhysiochemicalCharactPK }
     *     
     */
    public FoodPhysiochemicalCharactPK getFoodPhysiochemicalCharactPK() {
        return foodPhysiochemicalCharactPK;
    }

    /**
     * Sets the value of the foodPhysiochemicalCharactPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodPhysiochemicalCharactPK }
     *     
     */
    public void setFoodPhysiochemicalCharactPK(FoodPhysiochemicalCharactPK value) {
        this.foodPhysiochemicalCharactPK = value;
    }

    /**
     * Gets the value of the characteristiccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristiccode() {
        return characteristiccode;
    }

    /**
     * Sets the value of the characteristiccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristiccode(String value) {
        this.characteristiccode = value;
    }

    /**
     * Gets the value of the characteristicvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicvalue() {
        return characteristicvalue;
    }

    /**
     * Sets the value of the characteristicvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicvalue(String value) {
        this.characteristicvalue = value;
    }

    /**
     * Gets the value of the unitmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitmeasure() {
        return unitmeasure;
    }

    /**
     * Sets the value of the unitmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitmeasure(String value) {
        this.unitmeasure = value;
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
