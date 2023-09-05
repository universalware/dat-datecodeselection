
package de.dat.datecodeselection.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für iflPositionData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="iflPositionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IflWorkData" type="{http://www.dat.de/vxs}iflWorkData" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="IflLacquerData" type="{http://www.dat.de/vxs}iflWorkData" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="IflMaterialData" type="{http://www.dat.de/vxs}iflMaterialData" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iflPositionData", propOrder = {
    "iflWorkData",
    "iflLacquerData",
    "iflMaterialData"
})
public class IflPositionData {

    @XmlElement(name = "IflWorkData")
    protected List<IflWorkData> iflWorkData;
    @XmlElement(name = "IflLacquerData")
    protected List<IflWorkData> iflLacquerData;
    @XmlElement(name = "IflMaterialData")
    protected List<IflMaterialData> iflMaterialData;

    /**
     * Gets the value of the iflWorkData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iflWorkData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIflWorkData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IflWorkData }
     * 
     * 
     */
    public List<IflWorkData> getIflWorkData() {
        if (iflWorkData == null) {
            iflWorkData = new ArrayList<IflWorkData>();
        }
        return this.iflWorkData;
    }

    /**
     * Gets the value of the iflLacquerData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iflLacquerData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIflLacquerData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IflWorkData }
     * 
     * 
     */
    public List<IflWorkData> getIflLacquerData() {
        if (iflLacquerData == null) {
            iflLacquerData = new ArrayList<IflWorkData>();
        }
        return this.iflLacquerData;
    }

    /**
     * Gets the value of the iflMaterialData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iflMaterialData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIflMaterialData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IflMaterialData }
     * 
     * 
     */
    public List<IflMaterialData> getIflMaterialData() {
        if (iflMaterialData == null) {
            iflMaterialData = new ArrayList<IflMaterialData>();
        }
        return this.iflMaterialData;
    }

}
