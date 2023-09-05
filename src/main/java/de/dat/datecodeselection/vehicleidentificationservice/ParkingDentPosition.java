
package de.dat.datecodeselection.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für parkingDentPosition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="parkingDentPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DentNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentSize" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="HighStrengthOrAluminium" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdhesiveMaterial" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="OutOfReach" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="EdgeOrFold" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PointyOrDeep" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="Overstretched" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PolishedScratches" type="{http://www.dat.de/vxs}fieldBoolean" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingDentPosition", propOrder = {

})
public class ParkingDentPosition {

    @XmlElement(name = "DentNumber")
    protected FieldInteger dentNumber;
    @XmlElement(name = "DentSize")
    protected FieldInteger dentSize;
    @XmlElement(name = "HighStrengthOrAluminium")
    protected FieldBoolean highStrengthOrAluminium;
    @XmlElement(name = "AdhesiveMaterial")
    protected FieldBoolean adhesiveMaterial;
    @XmlElement(name = "OutOfReach")
    protected FieldBoolean outOfReach;
    @XmlElement(name = "EdgeOrFold")
    protected FieldBoolean edgeOrFold;
    @XmlElement(name = "PointyOrDeep")
    protected FieldBoolean pointyOrDeep;
    @XmlElement(name = "Overstretched")
    protected FieldBoolean overstretched;
    @XmlElement(name = "PolishedScratches")
    protected FieldBoolean polishedScratches;

    /**
     * Ruft den Wert der dentNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDentNumber() {
        return dentNumber;
    }

    /**
     * Legt den Wert der dentNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDentNumber(FieldInteger value) {
        this.dentNumber = value;
    }

    /**
     * Ruft den Wert der dentSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDentSize() {
        return dentSize;
    }

    /**
     * Legt den Wert der dentSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDentSize(FieldInteger value) {
        this.dentSize = value;
    }

    /**
     * Ruft den Wert der highStrengthOrAluminium-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getHighStrengthOrAluminium() {
        return highStrengthOrAluminium;
    }

    /**
     * Legt den Wert der highStrengthOrAluminium-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setHighStrengthOrAluminium(FieldBoolean value) {
        this.highStrengthOrAluminium = value;
    }

    /**
     * Ruft den Wert der adhesiveMaterial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getAdhesiveMaterial() {
        return adhesiveMaterial;
    }

    /**
     * Legt den Wert der adhesiveMaterial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setAdhesiveMaterial(FieldBoolean value) {
        this.adhesiveMaterial = value;
    }

    /**
     * Ruft den Wert der outOfReach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getOutOfReach() {
        return outOfReach;
    }

    /**
     * Legt den Wert der outOfReach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setOutOfReach(FieldBoolean value) {
        this.outOfReach = value;
    }

    /**
     * Ruft den Wert der edgeOrFold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getEdgeOrFold() {
        return edgeOrFold;
    }

    /**
     * Legt den Wert der edgeOrFold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setEdgeOrFold(FieldBoolean value) {
        this.edgeOrFold = value;
    }

    /**
     * Ruft den Wert der pointyOrDeep-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPointyOrDeep() {
        return pointyOrDeep;
    }

    /**
     * Legt den Wert der pointyOrDeep-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPointyOrDeep(FieldBoolean value) {
        this.pointyOrDeep = value;
    }

    /**
     * Ruft den Wert der overstretched-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getOverstretched() {
        return overstretched;
    }

    /**
     * Legt den Wert der overstretched-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setOverstretched(FieldBoolean value) {
        this.overstretched = value;
    }

    /**
     * Ruft den Wert der polishedScratches-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBoolean }
     *     
     */
    public FieldBoolean getPolishedScratches() {
        return polishedScratches;
    }

    /**
     * Legt den Wert der polishedScratches-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBoolean }
     *     
     */
    public void setPolishedScratches(FieldBoolean value) {
        this.polishedScratches = value;
    }

}
