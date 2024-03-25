
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packagemarksethical complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packagemarksethical"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagemarksethicalPK" type="{http://globalservice.ws.bept.ids.by/}packagemarksethicalPK" minOccurs="0"/&gt;
 *         &lt;element name="packagingmarking" type="{http://globalservice.ws.bept.ids.by/}packagingmarking" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packagemarksethical", propOrder = {
    "packagemarksethicalPK",
    "packagingmarking"
})
public class Packagemarksethical {

    protected PackagemarksethicalPK packagemarksethicalPK;
    protected Packagingmarking packagingmarking;

    /**
     * Gets the value of the packagemarksethicalPK property.
     * 
     * @return
     *     possible object is
     *     {@link PackagemarksethicalPK }
     *     
     */
    public PackagemarksethicalPK getPackagemarksethicalPK() {
        return packagemarksethicalPK;
    }

    /**
     * Sets the value of the packagemarksethicalPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagemarksethicalPK }
     *     
     */
    public void setPackagemarksethicalPK(PackagemarksethicalPK value) {
        this.packagemarksethicalPK = value;
    }

    /**
     * Gets the value of the packagingmarking property.
     * 
     * @return
     *     possible object is
     *     {@link Packagingmarking }
     *     
     */
    public Packagingmarking getPackagingmarking() {
        return packagingmarking;
    }

    /**
     * Sets the value of the packagingmarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packagingmarking }
     *     
     */
    public void setPackagingmarking(Packagingmarking value) {
        this.packagingmarking = value;
    }

}
