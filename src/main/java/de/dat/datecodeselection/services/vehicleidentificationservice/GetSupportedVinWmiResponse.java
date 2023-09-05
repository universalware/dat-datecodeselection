
package de.dat.datecodeselection.services.vehicleidentificationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getSupportedVinWmiResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getSupportedVinWmiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wmi" type="{http://sphinx.dat.de/services/VehicleIdentificationService}stringStringPair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSupportedVinWmiResponse", namespace = "http://sphinx.dat.de/services/VehicleIdentificationService", propOrder = {
    "wmi"
})
public class GetSupportedVinWmiResponse {

    @XmlElement(namespace = "")
    protected List<StringStringPair> wmi;

    /**
     * Gets the value of the wmi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wmi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWmi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringStringPair }
     * 
     * 
     */
    public List<StringStringPair> getWmi() {
        if (wmi == null) {
            wmi = new ArrayList<StringStringPair>();
        }
        return this.wmi;
    }

}
