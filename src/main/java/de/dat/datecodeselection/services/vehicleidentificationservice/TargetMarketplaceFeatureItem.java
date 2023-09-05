
package de.dat.datecodeselection.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TMName" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TMType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="TMCheckbox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="TMFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0" form="qualified"/>
 *         &lt;element name="TMToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tmName",
    "tmType",
    "tmCheckbox",
    "tmFromDate",
    "tmToDate"
})
@XmlRootElement(name = "TargetMarketplaceFeatureItem")
public class TargetMarketplaceFeatureItem {

    @XmlElement(name = "TMName")
    protected FieldString tmName;
    @XmlElement(name = "TMType")
    protected String tmType;
    @XmlElement(name = "TMCheckbox")
    protected Boolean tmCheckbox;
    @XmlElement(name = "TMFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tmFromDate;
    @XmlElement(name = "TMToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tmToDate;

    /**
     * Ruft den Wert der tmName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTMName() {
        return tmName;
    }

    /**
     * Legt den Wert der tmName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTMName(FieldString value) {
        this.tmName = value;
    }

    /**
     * Ruft den Wert der tmType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMType() {
        return tmType;
    }

    /**
     * Legt den Wert der tmType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMType(String value) {
        this.tmType = value;
    }

    /**
     * Ruft den Wert der tmCheckbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTMCheckbox() {
        return tmCheckbox;
    }

    /**
     * Legt den Wert der tmCheckbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTMCheckbox(Boolean value) {
        this.tmCheckbox = value;
    }

    /**
     * Ruft den Wert der tmFromDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTMFromDate() {
        return tmFromDate;
    }

    /**
     * Legt den Wert der tmFromDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTMFromDate(XMLGregorianCalendar value) {
        this.tmFromDate = value;
    }

    /**
     * Ruft den Wert der tmToDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTMToDate() {
        return tmToDate;
    }

    /**
     * Legt den Wert der tmToDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTMToDate(XMLGregorianCalendar value) {
        this.tmToDate = value;
    }

}
