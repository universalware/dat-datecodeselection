
package de.dat.datecodeselection.vehicleimagery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r vehicleImageType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="vehicleImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PICTURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "vehicleImageType")
@XmlEnum
public enum VehicleImageType {

    PICTURE;

    public String value() {
        return name();
    }

    public static VehicleImageType fromValue(String v) {
        return valueOf(v);
    }

}
