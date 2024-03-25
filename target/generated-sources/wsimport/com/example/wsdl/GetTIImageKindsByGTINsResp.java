
package com.example.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTIImageKindsByGTINsResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTIImageKindsByGTINsResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getTIImageKindsByGTINEnum" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/&gt;
 *         &lt;element name="tiik" type="{http://globalservice.ws.bept.ids.by/}tiImageKinds" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTIImageKindsByGTINsResp", propOrder = {
    "errorCode",
    "header",
    "tiik"
})
public class GetTIImageKindsByGTINsResp {

    @XmlSchemaType(name = "string")
    protected GetTIImageKindsByGTINEnum errorCode;
    protected ApiHeaderResponse header;
    @XmlElement(nillable = true)
    protected List<TiImageKinds> tiik;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetTIImageKindsByGTINEnum }
     *     
     */
    public GetTIImageKindsByGTINEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTIImageKindsByGTINEnum }
     *     
     */
    public void setErrorCode(GetTIImageKindsByGTINEnum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderResponse }
     *     
     */
    public ApiHeaderResponse getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderResponse }
     *     
     */
    public void setHeader(ApiHeaderResponse value) {
        this.header = value;
    }

    /**
     * Gets the value of the tiik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tiik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiImageKinds }
     * 
     * 
     */
    public List<TiImageKinds> getTiik() {
        if (tiik == null) {
            tiik = new ArrayList<TiImageKinds>();
        }
        return this.tiik;
    }

}
