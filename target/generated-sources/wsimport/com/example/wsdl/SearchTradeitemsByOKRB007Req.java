
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchTradeitemsByOKRB007Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchTradeitemsByOKRB007Req"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderRequest" minOccurs="0"/&gt;
 *         &lt;element name="okrb007Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="okrb007Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTradeitemsByOKRB007Req", propOrder = {
    "header",
    "okrb007Code",
    "okrb007Version",
    "recordCount",
    "startRecord"
})
public class SearchTradeitemsByOKRB007Req {

    protected ApiHeaderRequest header;
    protected String okrb007Code;
    protected String okrb007Version;
    protected int recordCount;
    protected int startRecord;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ApiHeaderRequest }
     *     
     */
    public ApiHeaderRequest getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiHeaderRequest }
     *     
     */
    public void setHeader(ApiHeaderRequest value) {
        this.header = value;
    }

    /**
     * Gets the value of the okrb007Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkrb007Code() {
        return okrb007Code;
    }

    /**
     * Sets the value of the okrb007Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkrb007Code(String value) {
        this.okrb007Code = value;
    }

    /**
     * Gets the value of the okrb007Version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkrb007Version() {
        return okrb007Version;
    }

    /**
     * Sets the value of the okrb007Version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkrb007Version(String value) {
        this.okrb007Version = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the startRecord property.
     * 
     */
    public int getStartRecord() {
        return startRecord;
    }

    /**
     * Sets the value of the startRecord property.
     * 
     */
    public void setStartRecord(int value) {
        this.startRecord = value;
    }

}
