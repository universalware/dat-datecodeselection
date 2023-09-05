
package de.dat.datecodeselection.vehicleimagery;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für releaseRestriction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="releaseRestriction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="REPAIR"/>
 *     &lt;enumeration value="APPRAISAL"/>
 *     &lt;enumeration value="GLASS"/>
 *     &lt;enumeration value="APPRAISALNEW"/>
 *     &lt;enumeration value="APPRAISALSHORT"/>
 *     &lt;enumeration value="TCO"/>
 *     &lt;enumeration value="APPRAISAL2YNEW"/>
 *     &lt;enumeration value="APPRAISAL_AND_REPAIR"/>
 *     &lt;enumeration value="TCO_NEW"/>
 *     &lt;enumeration value="CA_DATAENGINEERINGMODE"/>
 *     &lt;enumeration value="VA_DATAENGINEERINGMODE"/>
 *     &lt;enumeration value="COMPREHENSIVE"/>
 *     &lt;enumeration value="APPRAISALNEWFORMER"/>
 *     &lt;enumeration value="REPAIR_OR_REPAIR_INCOMPLETE"/>
 *     &lt;enumeration value="COMPREHENSIVE_OR_REPAIR_INCOMPLETE"/>
 *     &lt;enumeration value="ALL_OR_REPAIR_OR_APPRAISAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "releaseRestriction")
@XmlEnum
public enum ReleaseRestriction {

    ALL("ALL"),
    REPAIR("REPAIR"),
    APPRAISAL("APPRAISAL"),
    GLASS("GLASS"),
    APPRAISALNEW("APPRAISALNEW"),
    APPRAISALSHORT("APPRAISALSHORT"),
    TCO("TCO"),
    @XmlEnumValue("APPRAISAL2YNEW")
    APPRAISAL_2_YNEW("APPRAISAL2YNEW"),
    APPRAISAL_AND_REPAIR("APPRAISAL_AND_REPAIR"),
    TCO_NEW("TCO_NEW"),
    CA_DATAENGINEERINGMODE("CA_DATAENGINEERINGMODE"),
    VA_DATAENGINEERINGMODE("VA_DATAENGINEERINGMODE"),
    COMPREHENSIVE("COMPREHENSIVE"),
    APPRAISALNEWFORMER("APPRAISALNEWFORMER"),
    REPAIR_OR_REPAIR_INCOMPLETE("REPAIR_OR_REPAIR_INCOMPLETE"),
    COMPREHENSIVE_OR_REPAIR_INCOMPLETE("COMPREHENSIVE_OR_REPAIR_INCOMPLETE"),
    ALL_OR_REPAIR_OR_APPRAISAL("ALL_OR_REPAIR_OR_APPRAISAL");
    private final String value;

    ReleaseRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReleaseRestriction fromValue(String v) {
        for (ReleaseRestriction c: ReleaseRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
