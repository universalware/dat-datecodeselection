
package de.dat.datecodeselection.vehicleidentificationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}PositionsWithMeasuresProtocolEntry" maxOccurs="unbounded" minOccurs="0"/>
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
    "positionsWithMeasuresProtocolEntry"
})
@XmlRootElement(name = "PositionsWithMeasuresProtocol")
public class PositionsWithMeasuresProtocol {

    @XmlElement(name = "PositionsWithMeasuresProtocolEntry")
    protected List<PositionsWithMeasuresProtocolEntry> positionsWithMeasuresProtocolEntry;

    /**
     * Gets the value of the positionsWithMeasuresProtocolEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionsWithMeasuresProtocolEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionsWithMeasuresProtocolEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionsWithMeasuresProtocolEntry }
     * 
     * 
     */
    public List<PositionsWithMeasuresProtocolEntry> getPositionsWithMeasuresProtocolEntry() {
        if (positionsWithMeasuresProtocolEntry == null) {
            positionsWithMeasuresProtocolEntry = new ArrayList<PositionsWithMeasuresProtocolEntry>();
        }
        return this.positionsWithMeasuresProtocolEntry;
    }

}
