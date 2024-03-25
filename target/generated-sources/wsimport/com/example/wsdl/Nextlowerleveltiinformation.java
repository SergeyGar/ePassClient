
package com.example.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nextlowerleveltiinformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nextlowerleveltiinformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="quantityofchildren" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="totalquantitynextlowerlevelti" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tradeitem" type="{http://globalservice.ws.bept.ids.by/}tradeitem" minOccurs="0"/&gt;
 *         &lt;element name="childtradeitemCollection" type="{http://globalservice.ws.bept.ids.by/}childtradeitem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nextlowerleveltiinformation", propOrder = {
    "globaltradeitemnumber",
    "quantityofchildren",
    "totalquantitynextlowerlevelti",
    "tradeitem",
    "childtradeitemCollection"
})
public class Nextlowerleveltiinformation {

    protected Long globaltradeitemnumber;
    protected Long quantityofchildren;
    protected Long totalquantitynextlowerlevelti;
    protected Tradeitem tradeitem;
    @XmlElement(nillable = true)
    protected List<Childtradeitem> childtradeitemCollection;

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
     * Gets the value of the quantityofchildren property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantityofchildren() {
        return quantityofchildren;
    }

    /**
     * Sets the value of the quantityofchildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantityofchildren(Long value) {
        this.quantityofchildren = value;
    }

    /**
     * Gets the value of the totalquantitynextlowerlevelti property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalquantitynextlowerlevelti() {
        return totalquantitynextlowerlevelti;
    }

    /**
     * Sets the value of the totalquantitynextlowerlevelti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalquantitynextlowerlevelti(Long value) {
        this.totalquantitynextlowerlevelti = value;
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

    /**
     * Gets the value of the childtradeitemCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the childtradeitemCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildtradeitemCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Childtradeitem }
     * 
     * 
     */
    public List<Childtradeitem> getChildtradeitemCollection() {
        if (childtradeitemCollection == null) {
            childtradeitemCollection = new ArrayList<Childtradeitem>();
        }
        return this.childtradeitemCollection;
    }

}
