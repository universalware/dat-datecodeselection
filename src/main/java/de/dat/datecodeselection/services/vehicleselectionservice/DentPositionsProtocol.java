
package de.dat.datecodeselection.services.vehicleselectionservice;

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
 *         &lt;element ref="{http://www.dat.de/vxs}DentPositionsProtocolEntry" maxOccurs="unbounded" minOccurs="0"/>
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
    "dentPositionsProtocolEntry"
})
@XmlRootElement(name = "DentPositionsProtocol")
public class DentPositionsProtocol {

    @XmlElement(name = "DentPositionsProtocolEntry")
    protected List<DentPositionsProtocolEntry> dentPositionsProtocolEntry;

    /**
     * Gets the value of the dentPositionsProtocolEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentPositionsProtocolEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentPositionsProtocolEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DentPositionsProtocolEntry }
     * 
     * 
     */
    public List<DentPositionsProtocolEntry> getDentPositionsProtocolEntry() {
        if (dentPositionsProtocolEntry == null) {
            dentPositionsProtocolEntry = new ArrayList<DentPositionsProtocolEntry>();
        }
        return this.dentPositionsProtocolEntry;
    }

}
