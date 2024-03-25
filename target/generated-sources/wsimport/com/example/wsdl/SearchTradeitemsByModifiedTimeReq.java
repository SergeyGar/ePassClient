
package com.example.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchTradeitemsByModifiedTimeReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchTradeitemsByModifiedTimeReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderRequest" minOccurs="0"/&gt;
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="startRecord" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTradeitemsByModifiedTimeReq", propOrder = {
    "fromDate",
    "header",
    "recordCount",
    "startRecord",
    "toDate"
})
public class SearchTradeitemsByModifiedTimeReq {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    protected ApiHeaderRequest header;
    protected int recordCount;
    protected int startRecord;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

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

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

}
