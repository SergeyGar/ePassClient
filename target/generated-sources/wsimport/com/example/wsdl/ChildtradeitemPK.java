
package com.example.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childtradeitemPK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="childtradeitemPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="globaltradeitemnumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="gtinofnextlowerlevelti" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childtradeitemPK", propOrder = {
    "globaltradeitemnumber",
    "gtinofnextlowerlevelti"
})
public class ChildtradeitemPK {

    protected long globaltradeitemnumber;
    protected long gtinofnextlowerlevelti;

    /**
     * Gets the value of the globaltradeitemnumber property.
     * 
     */
    public long getGlobaltradeitemnumber() {
        return globaltradeitemnumber;
    }

    /**
     * Sets the value of the globaltradeitemnumber property.
     * 
     */
    public void setGlobaltradeitemnumber(long value) {
        this.globaltradeitemnumber = value;
    }

    /**
     * Gets the value of the gtinofnextlowerlevelti property.
     * 
     */
    public long getGtinofnextlowerlevelti() {
        return gtinofnextlowerlevelti;
    }

    /**
     * Sets the value of the gtinofnextlowerlevelti property.
     * 
     */
    public void setGtinofnextlowerlevelti(long value) {
        this.gtinofnextlowerlevelti = value;
    }

}
