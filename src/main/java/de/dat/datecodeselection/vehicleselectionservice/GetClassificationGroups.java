
package de.dat.datecodeselection.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r getClassificationGroups complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getClassificationGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sphinx.dat.de/services/VehicleSelectionService}subTypeVariantSelectionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClassificationGroups", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "request"
})
public class GetClassificationGroups {

    @XmlElement(namespace = "")
    protected SubTypeVariantSelectionRequest request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubTypeVariantSelectionRequest }
     *     
     */
    public SubTypeVariantSelectionRequest getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubTypeVariantSelectionRequest }
     *     
     */
    public void setRequest(SubTypeVariantSelectionRequest value) {
        this.request = value;
    }

}
