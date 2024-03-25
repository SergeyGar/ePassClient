
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packagemarkshygienic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packagemarkshygienic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packagemarkshygienicPK" type="{http://globalservice.ws.bept.ids.by/}packagemarkshygienicPK" minOccurs="0"/&gt;
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
@XmlType(name = "packagemarkshygienic", propOrder = {
    "packagemarkshygienicPK",
    "packagingmarking"
})
public class Packagemarkshygienic {

    protected PackagemarkshygienicPK packagemarkshygienicPK;
    protected Packagingmarking packagingmarking;

    /**
     * Gets the value of the packagemarkshygienicPK property.
     * 
     * @return
     *     possible object is
     *     {@link PackagemarkshygienicPK }
     *     
     */
    public PackagemarkshygienicPK getPackagemarkshygienicPK() {
        return packagemarkshygienicPK;
    }

    /**
     * Sets the value of the packagemarkshygienicPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagemarkshygienicPK }
     *     
     */
    public void setPackagemarkshygienicPK(PackagemarkshygienicPK value) {
        this.packagemarkshygienicPK = value;
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
