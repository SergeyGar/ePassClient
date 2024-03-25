
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCheckGTIN29Resp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCheckGTIN29Resp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getCheckGTIN29Enum" minOccurs="0"/&gt;
 *         &lt;element name="GLNStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCheckGTIN29Resp", propOrder = {
    "errorCode",
    "glnStatus",
    "header"
})
public class GetCheckGTIN29Resp {

    @XmlSchemaType(name = "string")
    protected GetCheckGTIN29Enum errorCode;
    @XmlElement(name = "GLNStatus")
    protected String glnStatus;
    protected ApiHeaderResponse header;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetCheckGTIN29Enum }
     *     
     */
    public GetCheckGTIN29Enum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCheckGTIN29Enum }
     *     
     */
    public void setErrorCode(GetCheckGTIN29Enum value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the glnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLNStatus() {
        return glnStatus;
    }

    /**
     * Sets the value of the glnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLNStatus(String value) {
        this.glnStatus = value;
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

}
