
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiHeaderResponseWithDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiHeaderResponseWithDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://globalservice.ws.bept.ids.by/}apiHeaderResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiHeaderResponseWithDataSource", propOrder = {
    "dataSource"
})
public class ApiHeaderResponseWithDataSource
    extends ApiHeaderResponse
{

    protected String dataSource;

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

}
