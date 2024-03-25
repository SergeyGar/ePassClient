
package com.example.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchTradeitemsByGLNAndModifiedTimeResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchTradeitemsByGLNAndModifiedTimeResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://globalservice.ws.bept.ids.by/}searchTradeitemsByGLNAndModifiedTimeEnum" minOccurs="0"/&gt;
 *         &lt;element name="header" type="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse" minOccurs="0"/&gt;
 *         &lt;element name="totalRecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tradeitems" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchTradeitemsByGLNAndModifiedTimeResp", propOrder = {
    "errorCode",
    "header",
    "totalRecordCount",
    "tradeitems"
})
public class SearchTradeitemsByGLNAndModifiedTimeResp {

    @XmlSchemaType(name = "string")
    protected SearchTradeitemsByGLNAndModifiedTimeEnum errorCode;
    protected ApiHeaderResponse header;
    protected int totalRecordCount;
    @XmlElement(nillable = true)
    protected List<Long> tradeitems;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTradeitemsByGLNAndModifiedTimeEnum }
     *     
     */
    public SearchTradeitemsByGLNAndModifiedTimeEnum getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTradeitemsByGLNAndModifiedTimeEnum }
     *     
     */
    public void setErrorCode(SearchTradeitemsByGLNAndModifiedTimeEnum value) {
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
     * Gets the value of the totalRecordCount property.
     * 
     */
    public int getTotalRecordCount() {
        return totalRecordCount;
    }

    /**
     * Sets the value of the totalRecordCount property.
     * 
     */
    public void setTotalRecordCount(int value) {
        this.totalRecordCount = value;
    }

    /**
     * Gets the value of the tradeitems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradeitems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeitems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTradeitems() {
        if (tradeitems == null) {
            tradeitems = new ArrayList<Long>();
        }
        return this.tradeitems;
    }

}
