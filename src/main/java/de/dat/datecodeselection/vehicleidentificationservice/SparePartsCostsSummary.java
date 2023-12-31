
package de.dat.datecodeselection.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r SparePartsCostsSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SparePartsCostsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AllSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCosts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProcurementCostsFromParts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConsumablesSurcharge" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SurchargeDeduction" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DisposalCostsSpareParts" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SmallMaterialsLumpSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="TotalSum" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartsTotalWear" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartsTotalPartsWear" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="SparePartsTotalTotalWear" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SparePartsCostsSummary", propOrder = {

})
public class SparePartsCostsSummary {

    @XmlElement(name = "AllSum")
    protected FieldDecimal allSum;
    @XmlElement(name = "ProcurementCosts")
    protected FieldDecimal procurementCosts;
    @XmlElement(name = "ProcurementCostsFromParts")
    protected FieldDecimal procurementCostsFromParts;
    @XmlElement(name = "ConsumablesSurcharge")
    protected FieldDecimal consumablesSurcharge;
    @XmlElement(name = "SurchargeDeduction")
    protected FieldDecimal surchargeDeduction;
    @XmlElement(name = "DisposalCostsSpareParts")
    protected FieldDecimal disposalCostsSpareParts;
    @XmlElement(name = "SmallMaterialsLumpSum")
    protected FieldDecimal smallMaterialsLumpSum;
    @XmlElement(name = "TotalSum")
    protected FieldDecimal totalSum;
    @XmlElement(name = "SparePartsTotalWear")
    protected FieldDecimal sparePartsTotalWear;
    @XmlElement(name = "SparePartsTotalPartsWear")
    protected FieldDecimal sparePartsTotalPartsWear;
    @XmlElement(name = "SparePartsTotalTotalWear")
    protected FieldDecimal sparePartsTotalTotalWear;

    /**
     * Ruft den Wert der allSum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAllSum() {
        return allSum;
    }

    /**
     * Legt den Wert der allSum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAllSum(FieldDecimal value) {
        this.allSum = value;
    }

    /**
     * Ruft den Wert der procurementCosts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCosts() {
        return procurementCosts;
    }

    /**
     * Legt den Wert der procurementCosts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCosts(FieldDecimal value) {
        this.procurementCosts = value;
    }

    /**
     * Ruft den Wert der procurementCostsFromParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getProcurementCostsFromParts() {
        return procurementCostsFromParts;
    }

    /**
     * Legt den Wert der procurementCostsFromParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setProcurementCostsFromParts(FieldDecimal value) {
        this.procurementCostsFromParts = value;
    }

    /**
     * Ruft den Wert der consumablesSurcharge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getConsumablesSurcharge() {
        return consumablesSurcharge;
    }

    /**
     * Legt den Wert der consumablesSurcharge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setConsumablesSurcharge(FieldDecimal value) {
        this.consumablesSurcharge = value;
    }

    /**
     * Ruft den Wert der surchargeDeduction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSurchargeDeduction() {
        return surchargeDeduction;
    }

    /**
     * Legt den Wert der surchargeDeduction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSurchargeDeduction(FieldDecimal value) {
        this.surchargeDeduction = value;
    }

    /**
     * Ruft den Wert der disposalCostsSpareParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDisposalCostsSpareParts() {
        return disposalCostsSpareParts;
    }

    /**
     * Legt den Wert der disposalCostsSpareParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDisposalCostsSpareParts(FieldDecimal value) {
        this.disposalCostsSpareParts = value;
    }

    /**
     * Ruft den Wert der smallMaterialsLumpSum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSmallMaterialsLumpSum() {
        return smallMaterialsLumpSum;
    }

    /**
     * Legt den Wert der smallMaterialsLumpSum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSmallMaterialsLumpSum(FieldDecimal value) {
        this.smallMaterialsLumpSum = value;
    }

    /**
     * Ruft den Wert der totalSum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTotalSum() {
        return totalSum;
    }

    /**
     * Legt den Wert der totalSum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTotalSum(FieldDecimal value) {
        this.totalSum = value;
    }

    /**
     * Ruft den Wert der sparePartsTotalWear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartsTotalWear() {
        return sparePartsTotalWear;
    }

    /**
     * Legt den Wert der sparePartsTotalWear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartsTotalWear(FieldDecimal value) {
        this.sparePartsTotalWear = value;
    }

    /**
     * Ruft den Wert der sparePartsTotalPartsWear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartsTotalPartsWear() {
        return sparePartsTotalPartsWear;
    }

    /**
     * Legt den Wert der sparePartsTotalPartsWear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartsTotalPartsWear(FieldDecimal value) {
        this.sparePartsTotalPartsWear = value;
    }

    /**
     * Ruft den Wert der sparePartsTotalTotalWear-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getSparePartsTotalTotalWear() {
        return sparePartsTotalTotalWear;
    }

    /**
     * Legt den Wert der sparePartsTotalTotalWear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setSparePartsTotalTotalWear(FieldDecimal value) {
        this.sparePartsTotalTotalWear = value;
    }

}
