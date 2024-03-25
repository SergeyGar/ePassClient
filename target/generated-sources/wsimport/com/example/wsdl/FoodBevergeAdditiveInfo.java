
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodBevergeAdditiveInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodBevergeAdditiveInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foodBevergeAdditiveInfoPK" type="{http://globalservice.ws.bept.ids.by/}foodBevergeAdditiveInfoPK" minOccurs="0"/&gt;
 *         &lt;element name="additivename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="levelofcontainment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "foodBevergeAdditiveInfo", propOrder = {
    "foodBevergeAdditiveInfoPK",
    "additivename",
    "levelofcontainment",
    "tradeitem"
})
public class FoodBevergeAdditiveInfo {

    protected FoodBevergeAdditiveInfoPK foodBevergeAdditiveInfoPK;
    protected String additivename;
    protected String levelofcontainment;
    protected Tradeitem tradeitem;

    /**
     * Gets the value of the foodBevergeAdditiveInfoPK property.
     * 
     * @return
     *     possible object is
     *     {@link FoodBevergeAdditiveInfoPK }
     *     
     */
    public FoodBevergeAdditiveInfoPK getFoodBevergeAdditiveInfoPK() {
        return foodBevergeAdditiveInfoPK;
    }

    /**
     * Sets the value of the foodBevergeAdditiveInfoPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodBevergeAdditiveInfoPK }
     *     
     */
    public void setFoodBevergeAdditiveInfoPK(FoodBevergeAdditiveInfoPK value) {
        this.foodBevergeAdditiveInfoPK = value;
    }

    /**
     * Gets the value of the additivename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditivename() {
        return additivename;
    }

    /**
     * Sets the value of the additivename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditivename(String value) {
        this.additivename = value;
    }

    /**
     * Gets the value of the levelofcontainment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelofcontainment() {
        return levelofcontainment;
    }

    /**
     * Sets the value of the levelofcontainment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelofcontainment(String value) {
        this.levelofcontainment = value;
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
