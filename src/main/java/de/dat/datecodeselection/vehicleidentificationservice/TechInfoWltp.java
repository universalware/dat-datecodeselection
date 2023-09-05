
package de.dat.datecodeselection.vehicleidentificationservice;

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
 *         &lt;element name="WltpConsumptionLowMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionLowMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionLowMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionLowMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionMediumMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionMediumMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionMediumMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionMediumMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionHighMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionHighMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionHighMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionHighMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionExtraHighMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionExtraHighMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionExtraHighMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionExtraHighMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionMixedMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionMixedMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionMixedMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionMixedMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentLowCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentLowCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentLowCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentLowCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMediumCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMediumCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMediumCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMediumCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentHighCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentHighCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentHighCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentHighCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentExtraHighCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentExtraHighCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentExtraHighCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentExtraHighCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMixedCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMixedCngMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMixedCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMixedCngMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentLowLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentLowLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentLowLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentLowLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMediumLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMediumLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMediumLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMediumLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentHighLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentHighLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentHighLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentHighLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentExtraHighLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentExtraHighLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentExtraHighLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentExtraHighLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMixedLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMixedLpgMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMixedLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMixedLpgMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentLowHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentLowHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentLowHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentLowHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMediumHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMediumHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMediumHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMediumHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentHighHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentHighHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentHighHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentHighHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentExtraHighHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentExtraHighHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentExtraHighHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentExtraHighHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMixedHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMixedHMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionBivalentMixedHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionBivalentMixedHMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpCo2EmissionMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpCo2EmissionMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpCo2EmissionMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpCo2EmissionMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionElectricalMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionElectricalMin" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpConsumptionElectricalMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpConsumptionElectricalMax" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpRangeElectricalMin" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpRangeElectricalMin" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpRangeElectricalMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpRangeElectricalMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpRangeTotalMin" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpRangeTotalMin" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="WltpRangeTotalMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatWltpRangeTotalMax" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "TechInfoWltp")
public class TechInfoWltp {

    @XmlElement(name = "WltpConsumptionLowMin")
    protected FieldDecimal wltpConsumptionLowMin;
    @XmlElement(name = "DatWltpConsumptionLowMin")
    protected FieldDecimal datWltpConsumptionLowMin;
    @XmlElement(name = "WltpConsumptionLowMax")
    protected FieldDecimal wltpConsumptionLowMax;
    @XmlElement(name = "DatWltpConsumptionLowMax")
    protected FieldDecimal datWltpConsumptionLowMax;
    @XmlElement(name = "WltpConsumptionMediumMin")
    protected FieldDecimal wltpConsumptionMediumMin;
    @XmlElement(name = "DatWltpConsumptionMediumMin")
    protected FieldDecimal datWltpConsumptionMediumMin;
    @XmlElement(name = "WltpConsumptionMediumMax")
    protected FieldDecimal wltpConsumptionMediumMax;
    @XmlElement(name = "DatWltpConsumptionMediumMax")
    protected FieldDecimal datWltpConsumptionMediumMax;
    @XmlElement(name = "WltpConsumptionHighMin")
    protected FieldDecimal wltpConsumptionHighMin;
    @XmlElement(name = "DatWltpConsumptionHighMin")
    protected FieldDecimal datWltpConsumptionHighMin;
    @XmlElement(name = "WltpConsumptionHighMax")
    protected FieldDecimal wltpConsumptionHighMax;
    @XmlElement(name = "DatWltpConsumptionHighMax")
    protected FieldDecimal datWltpConsumptionHighMax;
    @XmlElement(name = "WltpConsumptionExtraHighMin")
    protected FieldDecimal wltpConsumptionExtraHighMin;
    @XmlElement(name = "DatWltpConsumptionExtraHighMin")
    protected FieldDecimal datWltpConsumptionExtraHighMin;
    @XmlElement(name = "WltpConsumptionExtraHighMax")
    protected FieldDecimal wltpConsumptionExtraHighMax;
    @XmlElement(name = "DatWltpConsumptionExtraHighMax")
    protected FieldDecimal datWltpConsumptionExtraHighMax;
    @XmlElement(name = "WltpConsumptionMixedMin")
    protected FieldDecimal wltpConsumptionMixedMin;
    @XmlElement(name = "DatWltpConsumptionMixedMin")
    protected FieldDecimal datWltpConsumptionMixedMin;
    @XmlElement(name = "WltpConsumptionMixedMax")
    protected FieldDecimal wltpConsumptionMixedMax;
    @XmlElement(name = "DatWltpConsumptionMixedMax")
    protected FieldDecimal datWltpConsumptionMixedMax;
    @XmlElement(name = "WltpConsumptionBivalentLowCngMin")
    protected FieldDecimal wltpConsumptionBivalentLowCngMin;
    @XmlElement(name = "DatWltpConsumptionBivalentLowCngMin")
    protected FieldDecimal datWltpConsumptionBivalentLowCngMin;
    @XmlElement(name = "WltpConsumptionBivalentLowCngMax")
    protected FieldDecimal wltpConsumptionBivalentLowCngMax;
    @XmlElement(name = "DatWltpConsumptionBivalentLowCngMax")
    protected FieldDecimal datWltpConsumptionBivalentLowCngMax;
    @XmlElement(name = "WltpConsumptionBivalentMediumCngMin")
    protected FieldDecimal wltpConsumptionBivalentMediumCngMin;
    @XmlElement(name = "DatWltpConsumptionBivalentMediumCngMin")
    protected FieldDecimal datWltpConsumptionBivalentMediumCngMin;
    @XmlElement(name = "WltpConsumptionBivalentMediumCngMax")
    protected FieldDecimal wltpConsumptionBivalentMediumCngMax;
    @XmlElement(name = "DatWltpConsumptionBivalentMediumCngMax")
    protected FieldDecimal datWltpConsumptionBivalentMediumCngMax;
    @XmlElement(name = "WltpConsumptionBivalentHighCngMin")
    protected FieldDecimal wltpConsumptionBivalentHighCngMin;
    @XmlElement(name = "DatWltpConsumptionBivalentHighCngMin")
    protected FieldDecimal datWltpConsumptionBivalentHighCngMin;
    @XmlElement(name = "WltpConsumptionBivalentHighCngMax")
    protected FieldDecimal wltpConsumptionBivalentHighCngMax;
    @XmlElement(name = "DatWltpConsumptionBivalentHighCngMax")
    protected FieldDecimal datWltpConsumptionBivalentHighCngMax;
    @XmlElement(name = "WltpConsumptionBivalentExtraHighCngMin")
    protected FieldDecimal wltpConsumptionBivalentExtraHighCngMin;
    @XmlElement(name = "DatWltpConsumptionBivalentExtraHighCngMin")
    protected FieldDecimal datWltpConsumptionBivalentExtraHighCngMin;
    @XmlElement(name = "WltpConsumptionBivalentExtraHighCngMax")
    protected FieldDecimal wltpConsumptionBivalentExtraHighCngMax;
    @XmlElement(name = "DatWltpConsumptionBivalentExtraHighCngMax")
    protected FieldDecimal datWltpConsumptionBivalentExtraHighCngMax;
    @XmlElement(name = "WltpConsumptionBivalentMixedCngMin")
    protected FieldDecimal wltpConsumptionBivalentMixedCngMin;
    @XmlElement(name = "DatWltpConsumptionBivalentMixedCngMin")
    protected FieldDecimal datWltpConsumptionBivalentMixedCngMin;
    @XmlElement(name = "WltpConsumptionBivalentMixedCngMax")
    protected FieldDecimal wltpConsumptionBivalentMixedCngMax;
    @XmlElement(name = "DatWltpConsumptionBivalentMixedCngMax")
    protected FieldDecimal datWltpConsumptionBivalentMixedCngMax;
    @XmlElement(name = "WltpConsumptionBivalentLowLpgMin")
    protected FieldDecimal wltpConsumptionBivalentLowLpgMin;
    @XmlElement(name = "DatWltpConsumptionBivalentLowLpgMin")
    protected FieldDecimal datWltpConsumptionBivalentLowLpgMin;
    @XmlElement(name = "WltpConsumptionBivalentLowLpgMax")
    protected FieldDecimal wltpConsumptionBivalentLowLpgMax;
    @XmlElement(name = "DatWltpConsumptionBivalentLowLpgMax")
    protected FieldDecimal datWltpConsumptionBivalentLowLpgMax;
    @XmlElement(name = "WltpConsumptionBivalentMediumLpgMin")
    protected FieldDecimal wltpConsumptionBivalentMediumLpgMin;
    @XmlElement(name = "DatWltpConsumptionBivalentMediumLpgMin")
    protected FieldDecimal datWltpConsumptionBivalentMediumLpgMin;
    @XmlElement(name = "WltpConsumptionBivalentMediumLpgMax")
    protected FieldDecimal wltpConsumptionBivalentMediumLpgMax;
    @XmlElement(name = "DatWltpConsumptionBivalentMediumLpgMax")
    protected FieldDecimal datWltpConsumptionBivalentMediumLpgMax;
    @XmlElement(name = "WltpConsumptionBivalentHighLpgMin")
    protected FieldDecimal wltpConsumptionBivalentHighLpgMin;
    @XmlElement(name = "DatWltpConsumptionBivalentHighLpgMin")
    protected FieldDecimal datWltpConsumptionBivalentHighLpgMin;
    @XmlElement(name = "WltpConsumptionBivalentHighLpgMax")
    protected FieldDecimal wltpConsumptionBivalentHighLpgMax;
    @XmlElement(name = "DatWltpConsumptionBivalentHighLpgMax")
    protected FieldDecimal datWltpConsumptionBivalentHighLpgMax;
    @XmlElement(name = "WltpConsumptionBivalentExtraHighLpgMin")
    protected FieldDecimal wltpConsumptionBivalentExtraHighLpgMin;
    @XmlElement(name = "DatWltpConsumptionBivalentExtraHighLpgMin")
    protected FieldDecimal datWltpConsumptionBivalentExtraHighLpgMin;
    @XmlElement(name = "WltpConsumptionBivalentExtraHighLpgMax")
    protected FieldDecimal wltpConsumptionBivalentExtraHighLpgMax;
    @XmlElement(name = "DatWltpConsumptionBivalentExtraHighLpgMax")
    protected FieldDecimal datWltpConsumptionBivalentExtraHighLpgMax;
    @XmlElement(name = "WltpConsumptionBivalentMixedLpgMin")
    protected FieldDecimal wltpConsumptionBivalentMixedLpgMin;
    @XmlElement(name = "DatWltpConsumptionBivalentMixedLpgMin")
    protected FieldDecimal datWltpConsumptionBivalentMixedLpgMin;
    @XmlElement(name = "WltpConsumptionBivalentMixedLpgMax")
    protected FieldDecimal wltpConsumptionBivalentMixedLpgMax;
    @XmlElement(name = "DatWltpConsumptionBivalentMixedLpgMax")
    protected FieldDecimal datWltpConsumptionBivalentMixedLpgMax;
    @XmlElement(name = "WltpConsumptionBivalentLowHMin")
    protected FieldDecimal wltpConsumptionBivalentLowHMin;
    @XmlElement(name = "DatWltpConsumptionBivalentLowHMin")
    protected FieldDecimal datWltpConsumptionBivalentLowHMin;
    @XmlElement(name = "WltpConsumptionBivalentLowHMax")
    protected FieldDecimal wltpConsumptionBivalentLowHMax;
    @XmlElement(name = "DatWltpConsumptionBivalentLowHMax")
    protected FieldDecimal datWltpConsumptionBivalentLowHMax;
    @XmlElement(name = "WltpConsumptionBivalentMediumHMin")
    protected FieldDecimal wltpConsumptionBivalentMediumHMin;
    @XmlElement(name = "DatWltpConsumptionBivalentMediumHMin")
    protected FieldDecimal datWltpConsumptionBivalentMediumHMin;
    @XmlElement(name = "WltpConsumptionBivalentMediumHMax")
    protected FieldDecimal wltpConsumptionBivalentMediumHMax;
    @XmlElement(name = "DatWltpConsumptionBivalentMediumHMax")
    protected FieldDecimal datWltpConsumptionBivalentMediumHMax;
    @XmlElement(name = "WltpConsumptionBivalentHighHMin")
    protected FieldDecimal wltpConsumptionBivalentHighHMin;
    @XmlElement(name = "DatWltpConsumptionBivalentHighHMin")
    protected FieldDecimal datWltpConsumptionBivalentHighHMin;
    @XmlElement(name = "WltpConsumptionBivalentHighHMax")
    protected FieldDecimal wltpConsumptionBivalentHighHMax;
    @XmlElement(name = "DatWltpConsumptionBivalentHighHMax")
    protected FieldDecimal datWltpConsumptionBivalentHighHMax;
    @XmlElement(name = "WltpConsumptionBivalentExtraHighHMin")
    protected FieldDecimal wltpConsumptionBivalentExtraHighHMin;
    @XmlElement(name = "DatWltpConsumptionBivalentExtraHighHMin")
    protected FieldDecimal datWltpConsumptionBivalentExtraHighHMin;
    @XmlElement(name = "WltpConsumptionBivalentExtraHighHMax")
    protected FieldDecimal wltpConsumptionBivalentExtraHighHMax;
    @XmlElement(name = "DatWltpConsumptionBivalentExtraHighHMax")
    protected FieldDecimal datWltpConsumptionBivalentExtraHighHMax;
    @XmlElement(name = "WltpConsumptionBivalentMixedHMin")
    protected FieldDecimal wltpConsumptionBivalentMixedHMin;
    @XmlElement(name = "DatWltpConsumptionBivalentMixedHMin")
    protected FieldDecimal datWltpConsumptionBivalentMixedHMin;
    @XmlElement(name = "WltpConsumptionBivalentMixedHMax")
    protected FieldDecimal wltpConsumptionBivalentMixedHMax;
    @XmlElement(name = "DatWltpConsumptionBivalentMixedHMax")
    protected FieldDecimal datWltpConsumptionBivalentMixedHMax;
    @XmlElement(name = "WltpCo2EmissionMin")
    protected FieldDecimal wltpCo2EmissionMin;
    @XmlElement(name = "DatWltpCo2EmissionMin")
    protected FieldDecimal datWltpCo2EmissionMin;
    @XmlElement(name = "WltpCo2EmissionMax")
    protected FieldDecimal wltpCo2EmissionMax;
    @XmlElement(name = "DatWltpCo2EmissionMax")
    protected FieldDecimal datWltpCo2EmissionMax;
    @XmlElement(name = "WltpConsumptionElectricalMin")
    protected FieldDecimal wltpConsumptionElectricalMin;
    @XmlElement(name = "DatWltpConsumptionElectricalMin")
    protected FieldDecimal datWltpConsumptionElectricalMin;
    @XmlElement(name = "WltpConsumptionElectricalMax")
    protected FieldDecimal wltpConsumptionElectricalMax;
    @XmlElement(name = "DatWltpConsumptionElectricalMax")
    protected FieldDecimal datWltpConsumptionElectricalMax;
    @XmlElement(name = "WltpRangeElectricalMin")
    protected FieldInteger wltpRangeElectricalMin;
    @XmlElement(name = "DatWltpRangeElectricalMin")
    protected FieldInteger datWltpRangeElectricalMin;
    @XmlElement(name = "WltpRangeElectricalMax")
    protected FieldInteger wltpRangeElectricalMax;
    @XmlElement(name = "DatWltpRangeElectricalMax")
    protected FieldInteger datWltpRangeElectricalMax;
    @XmlElement(name = "WltpRangeTotalMin")
    protected FieldInteger wltpRangeTotalMin;
    @XmlElement(name = "DatWltpRangeTotalMin")
    protected FieldInteger datWltpRangeTotalMin;
    @XmlElement(name = "WltpRangeTotalMax")
    protected FieldInteger wltpRangeTotalMax;
    @XmlElement(name = "DatWltpRangeTotalMax")
    protected FieldInteger datWltpRangeTotalMax;

    /**
     * Ruft den Wert der wltpConsumptionLowMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionLowMin() {
        return wltpConsumptionLowMin;
    }

    /**
     * Legt den Wert der wltpConsumptionLowMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionLowMin(FieldDecimal value) {
        this.wltpConsumptionLowMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionLowMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionLowMin() {
        return datWltpConsumptionLowMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionLowMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionLowMin(FieldDecimal value) {
        this.datWltpConsumptionLowMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionLowMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionLowMax() {
        return wltpConsumptionLowMax;
    }

    /**
     * Legt den Wert der wltpConsumptionLowMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionLowMax(FieldDecimal value) {
        this.wltpConsumptionLowMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionLowMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionLowMax() {
        return datWltpConsumptionLowMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionLowMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionLowMax(FieldDecimal value) {
        this.datWltpConsumptionLowMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionMediumMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionMediumMin() {
        return wltpConsumptionMediumMin;
    }

    /**
     * Legt den Wert der wltpConsumptionMediumMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionMediumMin(FieldDecimal value) {
        this.wltpConsumptionMediumMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionMediumMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionMediumMin() {
        return datWltpConsumptionMediumMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionMediumMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionMediumMin(FieldDecimal value) {
        this.datWltpConsumptionMediumMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionMediumMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionMediumMax() {
        return wltpConsumptionMediumMax;
    }

    /**
     * Legt den Wert der wltpConsumptionMediumMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionMediumMax(FieldDecimal value) {
        this.wltpConsumptionMediumMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionMediumMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionMediumMax() {
        return datWltpConsumptionMediumMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionMediumMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionMediumMax(FieldDecimal value) {
        this.datWltpConsumptionMediumMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionHighMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionHighMin() {
        return wltpConsumptionHighMin;
    }

    /**
     * Legt den Wert der wltpConsumptionHighMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionHighMin(FieldDecimal value) {
        this.wltpConsumptionHighMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionHighMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionHighMin() {
        return datWltpConsumptionHighMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionHighMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionHighMin(FieldDecimal value) {
        this.datWltpConsumptionHighMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionHighMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionHighMax() {
        return wltpConsumptionHighMax;
    }

    /**
     * Legt den Wert der wltpConsumptionHighMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionHighMax(FieldDecimal value) {
        this.wltpConsumptionHighMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionHighMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionHighMax() {
        return datWltpConsumptionHighMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionHighMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionHighMax(FieldDecimal value) {
        this.datWltpConsumptionHighMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionExtraHighMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionExtraHighMin() {
        return wltpConsumptionExtraHighMin;
    }

    /**
     * Legt den Wert der wltpConsumptionExtraHighMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionExtraHighMin(FieldDecimal value) {
        this.wltpConsumptionExtraHighMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionExtraHighMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionExtraHighMin() {
        return datWltpConsumptionExtraHighMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionExtraHighMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionExtraHighMin(FieldDecimal value) {
        this.datWltpConsumptionExtraHighMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionExtraHighMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionExtraHighMax() {
        return wltpConsumptionExtraHighMax;
    }

    /**
     * Legt den Wert der wltpConsumptionExtraHighMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionExtraHighMax(FieldDecimal value) {
        this.wltpConsumptionExtraHighMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionExtraHighMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionExtraHighMax() {
        return datWltpConsumptionExtraHighMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionExtraHighMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionExtraHighMax(FieldDecimal value) {
        this.datWltpConsumptionExtraHighMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionMixedMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionMixedMin() {
        return wltpConsumptionMixedMin;
    }

    /**
     * Legt den Wert der wltpConsumptionMixedMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionMixedMin(FieldDecimal value) {
        this.wltpConsumptionMixedMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionMixedMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionMixedMin() {
        return datWltpConsumptionMixedMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionMixedMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionMixedMin(FieldDecimal value) {
        this.datWltpConsumptionMixedMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionMixedMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionMixedMax() {
        return wltpConsumptionMixedMax;
    }

    /**
     * Legt den Wert der wltpConsumptionMixedMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionMixedMax(FieldDecimal value) {
        this.wltpConsumptionMixedMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionMixedMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionMixedMax() {
        return datWltpConsumptionMixedMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionMixedMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionMixedMax(FieldDecimal value) {
        this.datWltpConsumptionMixedMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentLowCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentLowCngMin() {
        return wltpConsumptionBivalentLowCngMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentLowCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentLowCngMin(FieldDecimal value) {
        this.wltpConsumptionBivalentLowCngMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentLowCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentLowCngMin() {
        return datWltpConsumptionBivalentLowCngMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentLowCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentLowCngMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentLowCngMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentLowCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentLowCngMax() {
        return wltpConsumptionBivalentLowCngMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentLowCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentLowCngMax(FieldDecimal value) {
        this.wltpConsumptionBivalentLowCngMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentLowCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentLowCngMax() {
        return datWltpConsumptionBivalentLowCngMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentLowCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentLowCngMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentLowCngMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMediumCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMediumCngMin() {
        return wltpConsumptionBivalentMediumCngMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMediumCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMediumCngMin(FieldDecimal value) {
        this.wltpConsumptionBivalentMediumCngMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMediumCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMediumCngMin() {
        return datWltpConsumptionBivalentMediumCngMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMediumCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMediumCngMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentMediumCngMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMediumCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMediumCngMax() {
        return wltpConsumptionBivalentMediumCngMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMediumCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMediumCngMax(FieldDecimal value) {
        this.wltpConsumptionBivalentMediumCngMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMediumCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMediumCngMax() {
        return datWltpConsumptionBivalentMediumCngMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMediumCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMediumCngMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentMediumCngMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentHighCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentHighCngMin() {
        return wltpConsumptionBivalentHighCngMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentHighCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentHighCngMin(FieldDecimal value) {
        this.wltpConsumptionBivalentHighCngMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentHighCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentHighCngMin() {
        return datWltpConsumptionBivalentHighCngMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentHighCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentHighCngMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentHighCngMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentHighCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentHighCngMax() {
        return wltpConsumptionBivalentHighCngMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentHighCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentHighCngMax(FieldDecimal value) {
        this.wltpConsumptionBivalentHighCngMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentHighCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentHighCngMax() {
        return datWltpConsumptionBivalentHighCngMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentHighCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentHighCngMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentHighCngMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentExtraHighCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentExtraHighCngMin() {
        return wltpConsumptionBivalentExtraHighCngMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentExtraHighCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentExtraHighCngMin(FieldDecimal value) {
        this.wltpConsumptionBivalentExtraHighCngMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentExtraHighCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentExtraHighCngMin() {
        return datWltpConsumptionBivalentExtraHighCngMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentExtraHighCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentExtraHighCngMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentExtraHighCngMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentExtraHighCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentExtraHighCngMax() {
        return wltpConsumptionBivalentExtraHighCngMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentExtraHighCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentExtraHighCngMax(FieldDecimal value) {
        this.wltpConsumptionBivalentExtraHighCngMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentExtraHighCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentExtraHighCngMax() {
        return datWltpConsumptionBivalentExtraHighCngMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentExtraHighCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentExtraHighCngMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentExtraHighCngMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMixedCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMixedCngMin() {
        return wltpConsumptionBivalentMixedCngMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMixedCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMixedCngMin(FieldDecimal value) {
        this.wltpConsumptionBivalentMixedCngMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMixedCngMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMixedCngMin() {
        return datWltpConsumptionBivalentMixedCngMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMixedCngMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMixedCngMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentMixedCngMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMixedCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMixedCngMax() {
        return wltpConsumptionBivalentMixedCngMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMixedCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMixedCngMax(FieldDecimal value) {
        this.wltpConsumptionBivalentMixedCngMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMixedCngMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMixedCngMax() {
        return datWltpConsumptionBivalentMixedCngMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMixedCngMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMixedCngMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentMixedCngMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentLowLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentLowLpgMin() {
        return wltpConsumptionBivalentLowLpgMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentLowLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentLowLpgMin(FieldDecimal value) {
        this.wltpConsumptionBivalentLowLpgMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentLowLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentLowLpgMin() {
        return datWltpConsumptionBivalentLowLpgMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentLowLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentLowLpgMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentLowLpgMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentLowLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentLowLpgMax() {
        return wltpConsumptionBivalentLowLpgMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentLowLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentLowLpgMax(FieldDecimal value) {
        this.wltpConsumptionBivalentLowLpgMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentLowLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentLowLpgMax() {
        return datWltpConsumptionBivalentLowLpgMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentLowLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentLowLpgMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentLowLpgMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMediumLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMediumLpgMin() {
        return wltpConsumptionBivalentMediumLpgMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMediumLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMediumLpgMin(FieldDecimal value) {
        this.wltpConsumptionBivalentMediumLpgMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMediumLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMediumLpgMin() {
        return datWltpConsumptionBivalentMediumLpgMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMediumLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMediumLpgMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentMediumLpgMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMediumLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMediumLpgMax() {
        return wltpConsumptionBivalentMediumLpgMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMediumLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMediumLpgMax(FieldDecimal value) {
        this.wltpConsumptionBivalentMediumLpgMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMediumLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMediumLpgMax() {
        return datWltpConsumptionBivalentMediumLpgMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMediumLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMediumLpgMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentMediumLpgMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentHighLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentHighLpgMin() {
        return wltpConsumptionBivalentHighLpgMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentHighLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentHighLpgMin(FieldDecimal value) {
        this.wltpConsumptionBivalentHighLpgMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentHighLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentHighLpgMin() {
        return datWltpConsumptionBivalentHighLpgMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentHighLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentHighLpgMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentHighLpgMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentHighLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentHighLpgMax() {
        return wltpConsumptionBivalentHighLpgMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentHighLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentHighLpgMax(FieldDecimal value) {
        this.wltpConsumptionBivalentHighLpgMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentHighLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentHighLpgMax() {
        return datWltpConsumptionBivalentHighLpgMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentHighLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentHighLpgMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentHighLpgMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentExtraHighLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentExtraHighLpgMin() {
        return wltpConsumptionBivalentExtraHighLpgMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentExtraHighLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentExtraHighLpgMin(FieldDecimal value) {
        this.wltpConsumptionBivalentExtraHighLpgMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentExtraHighLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentExtraHighLpgMin() {
        return datWltpConsumptionBivalentExtraHighLpgMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentExtraHighLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentExtraHighLpgMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentExtraHighLpgMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentExtraHighLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentExtraHighLpgMax() {
        return wltpConsumptionBivalentExtraHighLpgMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentExtraHighLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentExtraHighLpgMax(FieldDecimal value) {
        this.wltpConsumptionBivalentExtraHighLpgMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentExtraHighLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentExtraHighLpgMax() {
        return datWltpConsumptionBivalentExtraHighLpgMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentExtraHighLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentExtraHighLpgMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentExtraHighLpgMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMixedLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMixedLpgMin() {
        return wltpConsumptionBivalentMixedLpgMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMixedLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMixedLpgMin(FieldDecimal value) {
        this.wltpConsumptionBivalentMixedLpgMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMixedLpgMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMixedLpgMin() {
        return datWltpConsumptionBivalentMixedLpgMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMixedLpgMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMixedLpgMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentMixedLpgMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMixedLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMixedLpgMax() {
        return wltpConsumptionBivalentMixedLpgMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMixedLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMixedLpgMax(FieldDecimal value) {
        this.wltpConsumptionBivalentMixedLpgMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMixedLpgMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMixedLpgMax() {
        return datWltpConsumptionBivalentMixedLpgMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMixedLpgMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMixedLpgMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentMixedLpgMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentLowHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentLowHMin() {
        return wltpConsumptionBivalentLowHMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentLowHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentLowHMin(FieldDecimal value) {
        this.wltpConsumptionBivalentLowHMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentLowHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentLowHMin() {
        return datWltpConsumptionBivalentLowHMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentLowHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentLowHMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentLowHMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentLowHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentLowHMax() {
        return wltpConsumptionBivalentLowHMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentLowHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentLowHMax(FieldDecimal value) {
        this.wltpConsumptionBivalentLowHMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentLowHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentLowHMax() {
        return datWltpConsumptionBivalentLowHMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentLowHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentLowHMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentLowHMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMediumHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMediumHMin() {
        return wltpConsumptionBivalentMediumHMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMediumHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMediumHMin(FieldDecimal value) {
        this.wltpConsumptionBivalentMediumHMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMediumHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMediumHMin() {
        return datWltpConsumptionBivalentMediumHMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMediumHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMediumHMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentMediumHMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMediumHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMediumHMax() {
        return wltpConsumptionBivalentMediumHMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMediumHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMediumHMax(FieldDecimal value) {
        this.wltpConsumptionBivalentMediumHMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMediumHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMediumHMax() {
        return datWltpConsumptionBivalentMediumHMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMediumHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMediumHMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentMediumHMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentHighHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentHighHMin() {
        return wltpConsumptionBivalentHighHMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentHighHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentHighHMin(FieldDecimal value) {
        this.wltpConsumptionBivalentHighHMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentHighHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentHighHMin() {
        return datWltpConsumptionBivalentHighHMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentHighHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentHighHMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentHighHMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentHighHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentHighHMax() {
        return wltpConsumptionBivalentHighHMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentHighHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentHighHMax(FieldDecimal value) {
        this.wltpConsumptionBivalentHighHMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentHighHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentHighHMax() {
        return datWltpConsumptionBivalentHighHMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentHighHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentHighHMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentHighHMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentExtraHighHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentExtraHighHMin() {
        return wltpConsumptionBivalentExtraHighHMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentExtraHighHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentExtraHighHMin(FieldDecimal value) {
        this.wltpConsumptionBivalentExtraHighHMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentExtraHighHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentExtraHighHMin() {
        return datWltpConsumptionBivalentExtraHighHMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentExtraHighHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentExtraHighHMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentExtraHighHMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentExtraHighHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentExtraHighHMax() {
        return wltpConsumptionBivalentExtraHighHMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentExtraHighHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentExtraHighHMax(FieldDecimal value) {
        this.wltpConsumptionBivalentExtraHighHMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentExtraHighHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentExtraHighHMax() {
        return datWltpConsumptionBivalentExtraHighHMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentExtraHighHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentExtraHighHMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentExtraHighHMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMixedHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMixedHMin() {
        return wltpConsumptionBivalentMixedHMin;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMixedHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMixedHMin(FieldDecimal value) {
        this.wltpConsumptionBivalentMixedHMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMixedHMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMixedHMin() {
        return datWltpConsumptionBivalentMixedHMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMixedHMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMixedHMin(FieldDecimal value) {
        this.datWltpConsumptionBivalentMixedHMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionBivalentMixedHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionBivalentMixedHMax() {
        return wltpConsumptionBivalentMixedHMax;
    }

    /**
     * Legt den Wert der wltpConsumptionBivalentMixedHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionBivalentMixedHMax(FieldDecimal value) {
        this.wltpConsumptionBivalentMixedHMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionBivalentMixedHMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionBivalentMixedHMax() {
        return datWltpConsumptionBivalentMixedHMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionBivalentMixedHMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionBivalentMixedHMax(FieldDecimal value) {
        this.datWltpConsumptionBivalentMixedHMax = value;
    }

    /**
     * Ruft den Wert der wltpCo2EmissionMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpCo2EmissionMin() {
        return wltpCo2EmissionMin;
    }

    /**
     * Legt den Wert der wltpCo2EmissionMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpCo2EmissionMin(FieldDecimal value) {
        this.wltpCo2EmissionMin = value;
    }

    /**
     * Ruft den Wert der datWltpCo2EmissionMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpCo2EmissionMin() {
        return datWltpCo2EmissionMin;
    }

    /**
     * Legt den Wert der datWltpCo2EmissionMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpCo2EmissionMin(FieldDecimal value) {
        this.datWltpCo2EmissionMin = value;
    }

    /**
     * Ruft den Wert der wltpCo2EmissionMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpCo2EmissionMax() {
        return wltpCo2EmissionMax;
    }

    /**
     * Legt den Wert der wltpCo2EmissionMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpCo2EmissionMax(FieldDecimal value) {
        this.wltpCo2EmissionMax = value;
    }

    /**
     * Ruft den Wert der datWltpCo2EmissionMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpCo2EmissionMax() {
        return datWltpCo2EmissionMax;
    }

    /**
     * Legt den Wert der datWltpCo2EmissionMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpCo2EmissionMax(FieldDecimal value) {
        this.datWltpCo2EmissionMax = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionElectricalMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionElectricalMin() {
        return wltpConsumptionElectricalMin;
    }

    /**
     * Legt den Wert der wltpConsumptionElectricalMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionElectricalMin(FieldDecimal value) {
        this.wltpConsumptionElectricalMin = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionElectricalMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionElectricalMin() {
        return datWltpConsumptionElectricalMin;
    }

    /**
     * Legt den Wert der datWltpConsumptionElectricalMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionElectricalMin(FieldDecimal value) {
        this.datWltpConsumptionElectricalMin = value;
    }

    /**
     * Ruft den Wert der wltpConsumptionElectricalMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getWltpConsumptionElectricalMax() {
        return wltpConsumptionElectricalMax;
    }

    /**
     * Legt den Wert der wltpConsumptionElectricalMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setWltpConsumptionElectricalMax(FieldDecimal value) {
        this.wltpConsumptionElectricalMax = value;
    }

    /**
     * Ruft den Wert der datWltpConsumptionElectricalMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDatWltpConsumptionElectricalMax() {
        return datWltpConsumptionElectricalMax;
    }

    /**
     * Legt den Wert der datWltpConsumptionElectricalMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDatWltpConsumptionElectricalMax(FieldDecimal value) {
        this.datWltpConsumptionElectricalMax = value;
    }

    /**
     * Ruft den Wert der wltpRangeElectricalMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWltpRangeElectricalMin() {
        return wltpRangeElectricalMin;
    }

    /**
     * Legt den Wert der wltpRangeElectricalMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWltpRangeElectricalMin(FieldInteger value) {
        this.wltpRangeElectricalMin = value;
    }

    /**
     * Ruft den Wert der datWltpRangeElectricalMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWltpRangeElectricalMin() {
        return datWltpRangeElectricalMin;
    }

    /**
     * Legt den Wert der datWltpRangeElectricalMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWltpRangeElectricalMin(FieldInteger value) {
        this.datWltpRangeElectricalMin = value;
    }

    /**
     * Ruft den Wert der wltpRangeElectricalMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWltpRangeElectricalMax() {
        return wltpRangeElectricalMax;
    }

    /**
     * Legt den Wert der wltpRangeElectricalMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWltpRangeElectricalMax(FieldInteger value) {
        this.wltpRangeElectricalMax = value;
    }

    /**
     * Ruft den Wert der datWltpRangeElectricalMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWltpRangeElectricalMax() {
        return datWltpRangeElectricalMax;
    }

    /**
     * Legt den Wert der datWltpRangeElectricalMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWltpRangeElectricalMax(FieldInteger value) {
        this.datWltpRangeElectricalMax = value;
    }

    /**
     * Ruft den Wert der wltpRangeTotalMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWltpRangeTotalMin() {
        return wltpRangeTotalMin;
    }

    /**
     * Legt den Wert der wltpRangeTotalMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWltpRangeTotalMin(FieldInteger value) {
        this.wltpRangeTotalMin = value;
    }

    /**
     * Ruft den Wert der datWltpRangeTotalMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWltpRangeTotalMin() {
        return datWltpRangeTotalMin;
    }

    /**
     * Legt den Wert der datWltpRangeTotalMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWltpRangeTotalMin(FieldInteger value) {
        this.datWltpRangeTotalMin = value;
    }

    /**
     * Ruft den Wert der wltpRangeTotalMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getWltpRangeTotalMax() {
        return wltpRangeTotalMax;
    }

    /**
     * Legt den Wert der wltpRangeTotalMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setWltpRangeTotalMax(FieldInteger value) {
        this.wltpRangeTotalMax = value;
    }

    /**
     * Ruft den Wert der datWltpRangeTotalMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatWltpRangeTotalMax() {
        return datWltpRangeTotalMax;
    }

    /**
     * Legt den Wert der datWltpRangeTotalMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatWltpRangeTotalMax(FieldInteger value) {
        this.datWltpRangeTotalMax = value;
    }

}
