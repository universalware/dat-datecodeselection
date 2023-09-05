
package de.dat.datecodeselection.services.vehicleidentificationservice;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element name="FeatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}TargetMarketplaceFeatureItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "featureName",
    "targetMarketplaceFeatureItem"
})
@XmlRootElement(name = "FeatureList")
public class FeatureList {

    @XmlElement(name = "FeatureName")
    protected String featureName;
    @XmlElement(name = "TargetMarketplaceFeatureItem")
    protected List<TargetMarketplaceFeatureItem> targetMarketplaceFeatureItem;

    /**
     * Ruft den Wert der featureName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Legt den Wert der featureName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the targetMarketplaceFeatureItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetMarketplaceFeatureItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetMarketplaceFeatureItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetMarketplaceFeatureItem }
     * 
     * 
     */
    public List<TargetMarketplaceFeatureItem> getTargetMarketplaceFeatureItem() {
        if (targetMarketplaceFeatureItem == null) {
            targetMarketplaceFeatureItem = new ArrayList<TargetMarketplaceFeatureItem>();
        }
        return this.targetMarketplaceFeatureItem;
    }

}
