
package de.dat.datecodeselection.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für parkingDentPositions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="parkingDentPositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParkingDentPosition" type="{http://www.dat.de/vxs}parkingDentPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingDentPositions", propOrder = {
    "parkingDentPosition"
})
public class ParkingDentPositions {

    @XmlElement(name = "ParkingDentPosition")
    protected List<ParkingDentPosition> parkingDentPosition;

    /**
     * Gets the value of the parkingDentPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingDentPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingDentPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingDentPosition }
     * 
     * 
     */
    public List<ParkingDentPosition> getParkingDentPosition() {
        if (parkingDentPosition == null) {
            parkingDentPosition = new ArrayList<ParkingDentPosition>();
        }
        return this.parkingDentPosition;
    }

}
