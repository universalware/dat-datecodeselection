
package de.dat.datecodeselection.services.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Sign" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Country" type="{http://www.dat.de/vxs}fieldString3" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleTypeKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ManufacturerKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleMainTypeKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleSubTypeKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="VehicleSubTypeVariantKey" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeMin" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTime" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeEdge" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimeProd" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="ConstructionTimePriceList" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}VINContainers" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "VINECode")
public class VINECode {

    @XmlElement(name = "Sign")
    protected FieldInteger sign;
    @XmlElement(name = "Country")
    protected FieldString3 country;
    @XmlElement(name = "VehicleTypeKey")
    protected FieldInteger vehicleTypeKey;
    @XmlElement(name = "ManufacturerKey")
    protected FieldInteger manufacturerKey;
    @XmlElement(name = "VehicleMainTypeKey")
    protected FieldInteger vehicleMainTypeKey;
    @XmlElement(name = "VehicleSubTypeKey")
    protected FieldInteger vehicleSubTypeKey;
    @XmlElement(name = "VehicleSubTypeVariantKey")
    protected FieldInteger vehicleSubTypeVariantKey;
    @XmlElement(name = "ConstructionTimeMin")
    protected FieldInteger constructionTimeMin;
    @XmlElement(name = "ConstructionTime")
    protected FieldInteger constructionTime;
    @XmlElement(name = "ConstructionTimeEdge")
    protected FieldInteger constructionTimeEdge;
    @XmlElement(name = "ConstructionTimeProd")
    protected FieldInteger constructionTimeProd;
    @XmlElement(name = "ConstructionTimePriceList")
    protected FieldInteger constructionTimePriceList;
    @XmlElement(name = "VINContainers")
    protected VINContainers vinContainers;

    /**
     * Ruft den Wert der sign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getSign() {
        return sign;
    }

    /**
     * Legt den Wert der sign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setSign(FieldInteger value) {
        this.sign = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString3 }
     *     
     */
    public FieldString3 getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString3 }
     *     
     */
    public void setCountry(FieldString3 value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der vehicleTypeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleTypeKey() {
        return vehicleTypeKey;
    }

    /**
     * Legt den Wert der vehicleTypeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleTypeKey(FieldInteger value) {
        this.vehicleTypeKey = value;
    }

    /**
     * Ruft den Wert der manufacturerKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getManufacturerKey() {
        return manufacturerKey;
    }

    /**
     * Legt den Wert der manufacturerKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setManufacturerKey(FieldInteger value) {
        this.manufacturerKey = value;
    }

    /**
     * Ruft den Wert der vehicleMainTypeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleMainTypeKey() {
        return vehicleMainTypeKey;
    }

    /**
     * Legt den Wert der vehicleMainTypeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleMainTypeKey(FieldInteger value) {
        this.vehicleMainTypeKey = value;
    }

    /**
     * Ruft den Wert der vehicleSubTypeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleSubTypeKey() {
        return vehicleSubTypeKey;
    }

    /**
     * Legt den Wert der vehicleSubTypeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleSubTypeKey(FieldInteger value) {
        this.vehicleSubTypeKey = value;
    }

    /**
     * Ruft den Wert der vehicleSubTypeVariantKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getVehicleSubTypeVariantKey() {
        return vehicleSubTypeVariantKey;
    }

    /**
     * Legt den Wert der vehicleSubTypeVariantKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setVehicleSubTypeVariantKey(FieldInteger value) {
        this.vehicleSubTypeVariantKey = value;
    }

    /**
     * Ruft den Wert der constructionTimeMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeMin() {
        return constructionTimeMin;
    }

    /**
     * Legt den Wert der constructionTimeMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeMin(FieldInteger value) {
        this.constructionTimeMin = value;
    }

    /**
     * Ruft den Wert der constructionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTime() {
        return constructionTime;
    }

    /**
     * Legt den Wert der constructionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTime(FieldInteger value) {
        this.constructionTime = value;
    }

    /**
     * Ruft den Wert der constructionTimeEdge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeEdge() {
        return constructionTimeEdge;
    }

    /**
     * Legt den Wert der constructionTimeEdge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeEdge(FieldInteger value) {
        this.constructionTimeEdge = value;
    }

    /**
     * Ruft den Wert der constructionTimeProd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimeProd() {
        return constructionTimeProd;
    }

    /**
     * Legt den Wert der constructionTimeProd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimeProd(FieldInteger value) {
        this.constructionTimeProd = value;
    }

    /**
     * Ruft den Wert der constructionTimePriceList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getConstructionTimePriceList() {
        return constructionTimePriceList;
    }

    /**
     * Legt den Wert der constructionTimePriceList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setConstructionTimePriceList(FieldInteger value) {
        this.constructionTimePriceList = value;
    }

    /**
     * Ruft den Wert der vinContainers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VINContainers }
     *     
     */
    public VINContainers getVINContainers() {
        return vinContainers;
    }

    /**
     * Legt den Wert der vinContainers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VINContainers }
     *     
     */
    public void setVINContainers(VINContainers value) {
        this.vinContainers = value;
    }

}
