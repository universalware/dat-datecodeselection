
package de.dat.datecodeselection.vehicleidentificationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r nationalCodeAustriaSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="nationalCodeAustriaSelectionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locale" type="{http://sphinx.dat.de/services/VehicleIdentificationService}locale" minOccurs="0"/>
 *         &lt;element name="nationalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restriction" type="{http://sphinx.dat.de/services/VehicleIdentificationService}releaseRestriction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nationalCodeAustriaSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "locale",
    "nationalCode",
    "restriction"
})
public class NationalCodeAustriaSelectionRequest {

    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;
    @XmlElement(namespace = "", required = true)
    protected String nationalCode;
    @XmlElementRef(name = "restriction", type = JAXBElement.class, required = false)
    protected JAXBElement<ReleaseRestriction> restriction;

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public JAXBElement<Locale> getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public void setLocale(JAXBElement<Locale> value) {
        this.locale = value;
    }

    /**
     * Ruft den Wert der nationalCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalCode() {
        return nationalCode;
    }

    /**
     * Legt den Wert der nationalCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalCode(String value) {
        this.nationalCode = value;
    }

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReleaseRestriction }{@code >}
     *     
     */
    public JAXBElement<ReleaseRestriction> getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReleaseRestriction }{@code >}
     *     
     */
    public void setRestriction(JAXBElement<ReleaseRestriction> value) {
        this.restriction = value;
    }

}
