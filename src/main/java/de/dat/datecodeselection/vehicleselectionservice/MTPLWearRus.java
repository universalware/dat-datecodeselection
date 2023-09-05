
package de.dat.datecodeselection.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MTPLWearRus complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MTPLWearRus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="WearGroup" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearAge" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearMileage" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearAdditional" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearPercent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WearPrice" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTPLWearRus", propOrder = {

})
public class MTPLWearRus {

    @XmlElement(name = "WearGroup")
    protected FieldString wearGroup;
    @XmlElement(name = "WearAge")
    protected FieldDecimal wearAge;
    @XmlElement(name = "WearMileage")
    protected FieldInteger wearMileage;
    @XmlElement(name = "WearAdditional")
    protected FieldDecimal wearAdditional;
    @XmlElement(name = "WearPercent")
    protected FieldDecimal wearPercent;
    @XmlElement(name = "WearPrice")
    protected FieldDecimal wearPrice;

    /**
     * Ruft den Wert der wearGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getWearGroup() {
        return wearGroup;
    }

    /**
     * Legt den Wert der wearGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setWearGroup(FieldString value) {
        this.wearGroup = value;
    }

    /**
     * Ruft den Wert der wearAge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearAge() {
        return wearAge;
    }

    /**
     * Legt den Wert der wearAge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearAge(FieldDecimal value) {
        this.wearAge = value;
    }

    /**
     * Ruft den Wert der wearMileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWearMileage() {
        return wearMileage;
    }

    /**
     * Legt den Wert der wearMileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWearMileage(FieldInteger value) {
        this.wearMileage = value;
    }

    /**
     * Ruft den Wert der wearAdditional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearAdditional() {
        return wearAdditional;
    }

    /**
     * Legt den Wert der wearAdditional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearAdditional(FieldDecimal value) {
        this.wearAdditional = value;
    }

    /**
     * Ruft den Wert der wearPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearPercent() {
        return wearPercent;
    }

    /**
     * Legt den Wert der wearPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearPercent(FieldDecimal value) {
        this.wearPercent = value;
    }

    /**
     * Ruft den Wert der wearPrice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWearPrice() {
        return wearPrice;
    }

    /**
     * Legt den Wert der wearPrice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWearPrice(FieldDecimal value) {
        this.wearPrice = value;
    }

}
