
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getQuotaImportInfoResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getQuotaImportInfoResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alienImportGTIN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="alienImportGTINforDEL" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}getQuotaImportInfoEnum" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/&gt;
 *         &lt;element name="importGTIN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quotaImportBalance" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quotaImportSet" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuotaImportInfoResp", propOrder = {
    "alienImportGTIN",
    "alienImportGTINforDEL",
    "errorCode",
    "header",
    "importGTIN",
    "quotaImportBalance",
    "quotaImportSet"
})
public class GetQuotaImportInfoResp {

    protected int alienImportGTIN;
    protected int alienImportGTINforDEL;
    @XmlSchemaType(name = "string")
    protected GetQuotaImportInfoEnum errorCode;
    protected ApiHeaderResponse header;
    protected int importGTIN;
    protected int quotaImportBalance;
    protected int quotaImportSet;

    /**
     * Gets the value of the alienImportGTIN property.
     * 
     */
    public int getAlienImportGTIN() {
        return alienImportGTIN;
    }

    /**
     * Sets the value of the alienImportGTIN property.
     * 
     */
    public void setAlienImportGTIN(int value) {
        this.alienImportGTIN = value;
    }

    /**
     * Gets the value of the alienImportGTINforDEL property.
     * 
     */
    public int getAlienImportGTINforDEL() {
        return alienImportGTINforDEL;
    }

    /**
     * Sets the value of the alienImportGTINforDEL property.
     * 
     */
    public void setAlienImportGTINforDEL(int value) {
        this.alienImportGTINforDEL = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link GetQuotaImportInfoEnum }
     *     
     */
    public GetQuotaImportInfoEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetQuotaImportInfoEnum }
     *     
     */
    public void setErrorCode(GetQuotaImportInfoEnum value) {
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
     * Gets the value of the importGTIN property.
     * 
     */
    public int getImportGTIN() {
        return importGTIN;
    }

    /**
     * Sets the value of the importGTIN property.
     * 
     */
    public void setImportGTIN(int value) {
        this.importGTIN = value;
    }

    /**
     * Gets the value of the quotaImportBalance property.
     * 
     */
    public int getQuotaImportBalance() {
        return quotaImportBalance;
    }

    /**
     * Sets the value of the quotaImportBalance property.
     * 
     */
    public void setQuotaImportBalance(int value) {
        this.quotaImportBalance = value;
    }

    /**
     * Gets the value of the quotaImportSet property.
     * 
     */
    public int getQuotaImportSet() {
        return quotaImportSet;
    }

    /**
     * Sets the value of the quotaImportSet property.
     * 
     */
    public void setQuotaImportSet(int value) {
        this.quotaImportSet = value;
    }

}
