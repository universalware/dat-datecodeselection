
package de.dat.datecodeselection.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalculationProtocol complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalculationProtocol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.dat.de/vxs}ProtocolHints" minOccurs="0"/>
 *         &lt;element name="RemovedRepairTypesProtocol" type="{http://www.dat.de/vxs}ProtocolEntriesWithRemoval" minOccurs="0" form="qualified"/>
 *         &lt;element name="InvalidPositionsProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="ImplausiblePositionsProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="MissingInputProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="UnspecificPositionsProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsOfOtherPositionProtocol" type="{http://www.dat.de/vxs}ProtocolEntriesWithRemoval" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartsOfCombinationPositionProtocol" type="{http://www.dat.de/vxs}ProtocolEntriesWithRemoval" minOccurs="0" form="qualified"/>
 *         &lt;element name="RemovedByCompositePositionProtocol" type="{http://www.dat.de/vxs}ProtocolEntriesWithRemoval" minOccurs="0" form="qualified"/>
 *         &lt;element name="MissingLacquerInformationProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="PredamagePositionsProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="SetupTimeRelevantPositionsProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="WithoutUsedPriceProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="WithoutManufacturerPriceProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element name="WithLacquerBlendingProtocol" type="{http://www.dat.de/vxs}ProtocolEntries" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}SuppressedPositionsProtocol" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}DentPositionsProtocol" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}PositionsWithMeasuresProtocol" minOccurs="0"/>
 *         &lt;element ref="{http://www.dat.de/vxs}PriceCorrectionsProtocol" minOccurs="0"/>
 *         &lt;element name="AllinDeductionFromTotalInPercent" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="CalculationStatus" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="PrintDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorAniaCalculation" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorDoubleRequest" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="IndicatorLacquerWaterbased" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastCalcUserId" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastCalculationDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="LastCalculationUser" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="StatusRepairCostsTakeover" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TransmissionState" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProtocolData" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationProtocol", propOrder = {

})
public class CalculationProtocol {

    @XmlElement(name = "ProtocolHints")
    protected ProtocolHints protocolHints;
    @XmlElement(name = "RemovedRepairTypesProtocol")
    protected ProtocolEntriesWithRemoval removedRepairTypesProtocol;
    @XmlElement(name = "InvalidPositionsProtocol")
    protected ProtocolEntries invalidPositionsProtocol;
    @XmlElement(name = "ImplausiblePositionsProtocol")
    protected ProtocolEntries implausiblePositionsProtocol;
    @XmlElement(name = "MissingInputProtocol")
    protected ProtocolEntries missingInputProtocol;
    @XmlElement(name = "UnspecificPositionsProtocol")
    protected ProtocolEntries unspecificPositionsProtocol;
    @XmlElement(name = "PartsOfOtherPositionProtocol")
    protected ProtocolEntriesWithRemoval partsOfOtherPositionProtocol;
    @XmlElement(name = "PartsOfCombinationPositionProtocol")
    protected ProtocolEntriesWithRemoval partsOfCombinationPositionProtocol;
    @XmlElement(name = "RemovedByCompositePositionProtocol")
    protected ProtocolEntriesWithRemoval removedByCompositePositionProtocol;
    @XmlElement(name = "MissingLacquerInformationProtocol")
    protected ProtocolEntries missingLacquerInformationProtocol;
    @XmlElement(name = "PredamagePositionsProtocol")
    protected ProtocolEntries predamagePositionsProtocol;
    @XmlElement(name = "SetupTimeRelevantPositionsProtocol")
    protected ProtocolEntries setupTimeRelevantPositionsProtocol;
    @XmlElement(name = "WithoutUsedPriceProtocol")
    protected ProtocolEntries withoutUsedPriceProtocol;
    @XmlElement(name = "WithoutManufacturerPriceProtocol")
    protected ProtocolEntries withoutManufacturerPriceProtocol;
    @XmlElement(name = "WithLacquerBlendingProtocol")
    protected ProtocolEntries withLacquerBlendingProtocol;
    @XmlElement(name = "SuppressedPositionsProtocol")
    protected SuppressedPositionsProtocol suppressedPositionsProtocol;
    @XmlElement(name = "DentPositionsProtocol")
    protected DentPositionsProtocol dentPositionsProtocol;
    @XmlElement(name = "PositionsWithMeasuresProtocol")
    protected PositionsWithMeasuresProtocol positionsWithMeasuresProtocol;
    @XmlElement(name = "PriceCorrectionsProtocol")
    protected PriceCorrectionsProtocol priceCorrectionsProtocol;
    @XmlElement(name = "AllinDeductionFromTotalInPercent")
    protected FieldDecimal allinDeductionFromTotalInPercent;
    @XmlElement(name = "CalculationStatus")
    protected FieldInteger calculationStatus;
    @XmlElement(name = "PrintDate")
    protected FieldDate printDate;
    @XmlElement(name = "IndicatorAniaCalculation")
    protected FieldDecimal indicatorAniaCalculation;
    @XmlElement(name = "IndicatorDoubleRequest")
    protected FieldDecimal indicatorDoubleRequest;
    @XmlElement(name = "IndicatorLacquerWaterbased")
    protected FieldDecimal indicatorLacquerWaterbased;
    @XmlElement(name = "LastCalcUserId")
    protected FieldInteger lastCalcUserId;
    @XmlElement(name = "LastCalculationDate")
    protected FieldDateTime lastCalculationDate;
    @XmlElement(name = "LastCalculationUser")
    protected FieldString lastCalculationUser;
    @XmlElement(name = "StatusRepairCostsTakeover")
    protected FieldInteger statusRepairCostsTakeover;
    @XmlElement(name = "TransmissionState")
    protected FieldDecimal transmissionState;
    @XmlElement(name = "ProtocolData")
    protected FieldString protocolData;

    /**
     * Ruft den Wert der protocolHints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolHints }
     *     
     */
    public ProtocolHints getProtocolHints() {
        return protocolHints;
    }

    /**
     * Legt den Wert der protocolHints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolHints }
     *     
     */
    public void setProtocolHints(ProtocolHints value) {
        this.protocolHints = value;
    }

    /**
     * Ruft den Wert der removedRepairTypesProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public ProtocolEntriesWithRemoval getRemovedRepairTypesProtocol() {
        return removedRepairTypesProtocol;
    }

    /**
     * Legt den Wert der removedRepairTypesProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public void setRemovedRepairTypesProtocol(ProtocolEntriesWithRemoval value) {
        this.removedRepairTypesProtocol = value;
    }

    /**
     * Ruft den Wert der invalidPositionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getInvalidPositionsProtocol() {
        return invalidPositionsProtocol;
    }

    /**
     * Legt den Wert der invalidPositionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setInvalidPositionsProtocol(ProtocolEntries value) {
        this.invalidPositionsProtocol = value;
    }

    /**
     * Ruft den Wert der implausiblePositionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getImplausiblePositionsProtocol() {
        return implausiblePositionsProtocol;
    }

    /**
     * Legt den Wert der implausiblePositionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setImplausiblePositionsProtocol(ProtocolEntries value) {
        this.implausiblePositionsProtocol = value;
    }

    /**
     * Ruft den Wert der missingInputProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getMissingInputProtocol() {
        return missingInputProtocol;
    }

    /**
     * Legt den Wert der missingInputProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setMissingInputProtocol(ProtocolEntries value) {
        this.missingInputProtocol = value;
    }

    /**
     * Ruft den Wert der unspecificPositionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getUnspecificPositionsProtocol() {
        return unspecificPositionsProtocol;
    }

    /**
     * Legt den Wert der unspecificPositionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setUnspecificPositionsProtocol(ProtocolEntries value) {
        this.unspecificPositionsProtocol = value;
    }

    /**
     * Ruft den Wert der partsOfOtherPositionProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public ProtocolEntriesWithRemoval getPartsOfOtherPositionProtocol() {
        return partsOfOtherPositionProtocol;
    }

    /**
     * Legt den Wert der partsOfOtherPositionProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public void setPartsOfOtherPositionProtocol(ProtocolEntriesWithRemoval value) {
        this.partsOfOtherPositionProtocol = value;
    }

    /**
     * Ruft den Wert der partsOfCombinationPositionProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public ProtocolEntriesWithRemoval getPartsOfCombinationPositionProtocol() {
        return partsOfCombinationPositionProtocol;
    }

    /**
     * Legt den Wert der partsOfCombinationPositionProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public void setPartsOfCombinationPositionProtocol(ProtocolEntriesWithRemoval value) {
        this.partsOfCombinationPositionProtocol = value;
    }

    /**
     * Ruft den Wert der removedByCompositePositionProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public ProtocolEntriesWithRemoval getRemovedByCompositePositionProtocol() {
        return removedByCompositePositionProtocol;
    }

    /**
     * Legt den Wert der removedByCompositePositionProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntriesWithRemoval }
     *     
     */
    public void setRemovedByCompositePositionProtocol(ProtocolEntriesWithRemoval value) {
        this.removedByCompositePositionProtocol = value;
    }

    /**
     * Ruft den Wert der missingLacquerInformationProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getMissingLacquerInformationProtocol() {
        return missingLacquerInformationProtocol;
    }

    /**
     * Legt den Wert der missingLacquerInformationProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setMissingLacquerInformationProtocol(ProtocolEntries value) {
        this.missingLacquerInformationProtocol = value;
    }

    /**
     * Ruft den Wert der predamagePositionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getPredamagePositionsProtocol() {
        return predamagePositionsProtocol;
    }

    /**
     * Legt den Wert der predamagePositionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setPredamagePositionsProtocol(ProtocolEntries value) {
        this.predamagePositionsProtocol = value;
    }

    /**
     * Ruft den Wert der setupTimeRelevantPositionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getSetupTimeRelevantPositionsProtocol() {
        return setupTimeRelevantPositionsProtocol;
    }

    /**
     * Legt den Wert der setupTimeRelevantPositionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setSetupTimeRelevantPositionsProtocol(ProtocolEntries value) {
        this.setupTimeRelevantPositionsProtocol = value;
    }

    /**
     * Ruft den Wert der withoutUsedPriceProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getWithoutUsedPriceProtocol() {
        return withoutUsedPriceProtocol;
    }

    /**
     * Legt den Wert der withoutUsedPriceProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setWithoutUsedPriceProtocol(ProtocolEntries value) {
        this.withoutUsedPriceProtocol = value;
    }

    /**
     * Ruft den Wert der withoutManufacturerPriceProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getWithoutManufacturerPriceProtocol() {
        return withoutManufacturerPriceProtocol;
    }

    /**
     * Legt den Wert der withoutManufacturerPriceProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setWithoutManufacturerPriceProtocol(ProtocolEntries value) {
        this.withoutManufacturerPriceProtocol = value;
    }

    /**
     * Ruft den Wert der withLacquerBlendingProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolEntries }
     *     
     */
    public ProtocolEntries getWithLacquerBlendingProtocol() {
        return withLacquerBlendingProtocol;
    }

    /**
     * Legt den Wert der withLacquerBlendingProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolEntries }
     *     
     */
    public void setWithLacquerBlendingProtocol(ProtocolEntries value) {
        this.withLacquerBlendingProtocol = value;
    }

    /**
     * Ruft den Wert der suppressedPositionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuppressedPositionsProtocol }
     *     
     */
    public SuppressedPositionsProtocol getSuppressedPositionsProtocol() {
        return suppressedPositionsProtocol;
    }

    /**
     * Legt den Wert der suppressedPositionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuppressedPositionsProtocol }
     *     
     */
    public void setSuppressedPositionsProtocol(SuppressedPositionsProtocol value) {
        this.suppressedPositionsProtocol = value;
    }

    /**
     * Ruft den Wert der dentPositionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DentPositionsProtocol }
     *     
     */
    public DentPositionsProtocol getDentPositionsProtocol() {
        return dentPositionsProtocol;
    }

    /**
     * Legt den Wert der dentPositionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DentPositionsProtocol }
     *     
     */
    public void setDentPositionsProtocol(DentPositionsProtocol value) {
        this.dentPositionsProtocol = value;
    }

    /**
     * Ruft den Wert der positionsWithMeasuresProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PositionsWithMeasuresProtocol }
     *     
     */
    public PositionsWithMeasuresProtocol getPositionsWithMeasuresProtocol() {
        return positionsWithMeasuresProtocol;
    }

    /**
     * Legt den Wert der positionsWithMeasuresProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionsWithMeasuresProtocol }
     *     
     */
    public void setPositionsWithMeasuresProtocol(PositionsWithMeasuresProtocol value) {
        this.positionsWithMeasuresProtocol = value;
    }

    /**
     * Ruft den Wert der priceCorrectionsProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceCorrectionsProtocol }
     *     
     */
    public PriceCorrectionsProtocol getPriceCorrectionsProtocol() {
        return priceCorrectionsProtocol;
    }

    /**
     * Legt den Wert der priceCorrectionsProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCorrectionsProtocol }
     *     
     */
    public void setPriceCorrectionsProtocol(PriceCorrectionsProtocol value) {
        this.priceCorrectionsProtocol = value;
    }

    /**
     * Ruft den Wert der allinDeductionFromTotalInPercent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getAllinDeductionFromTotalInPercent() {
        return allinDeductionFromTotalInPercent;
    }

    /**
     * Legt den Wert der allinDeductionFromTotalInPercent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setAllinDeductionFromTotalInPercent(FieldDecimal value) {
        this.allinDeductionFromTotalInPercent = value;
    }

    /**
     * Ruft den Wert der calculationStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getCalculationStatus() {
        return calculationStatus;
    }

    /**
     * Legt den Wert der calculationStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setCalculationStatus(FieldInteger value) {
        this.calculationStatus = value;
    }

    /**
     * Ruft den Wert der printDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getPrintDate() {
        return printDate;
    }

    /**
     * Legt den Wert der printDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setPrintDate(FieldDate value) {
        this.printDate = value;
    }

    /**
     * Ruft den Wert der indicatorAniaCalculation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIndicatorAniaCalculation() {
        return indicatorAniaCalculation;
    }

    /**
     * Legt den Wert der indicatorAniaCalculation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIndicatorAniaCalculation(FieldDecimal value) {
        this.indicatorAniaCalculation = value;
    }

    /**
     * Ruft den Wert der indicatorDoubleRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIndicatorDoubleRequest() {
        return indicatorDoubleRequest;
    }

    /**
     * Legt den Wert der indicatorDoubleRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIndicatorDoubleRequest(FieldDecimal value) {
        this.indicatorDoubleRequest = value;
    }

    /**
     * Ruft den Wert der indicatorLacquerWaterbased-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getIndicatorLacquerWaterbased() {
        return indicatorLacquerWaterbased;
    }

    /**
     * Legt den Wert der indicatorLacquerWaterbased-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setIndicatorLacquerWaterbased(FieldDecimal value) {
        this.indicatorLacquerWaterbased = value;
    }

    /**
     * Ruft den Wert der lastCalcUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLastCalcUserId() {
        return lastCalcUserId;
    }

    /**
     * Legt den Wert der lastCalcUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLastCalcUserId(FieldInteger value) {
        this.lastCalcUserId = value;
    }

    /**
     * Ruft den Wert der lastCalculationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getLastCalculationDate() {
        return lastCalculationDate;
    }

    /**
     * Legt den Wert der lastCalculationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setLastCalculationDate(FieldDateTime value) {
        this.lastCalculationDate = value;
    }

    /**
     * Ruft den Wert der lastCalculationUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLastCalculationUser() {
        return lastCalculationUser;
    }

    /**
     * Legt den Wert der lastCalculationUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLastCalculationUser(FieldString value) {
        this.lastCalculationUser = value;
    }

    /**
     * Ruft den Wert der statusRepairCostsTakeover-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getStatusRepairCostsTakeover() {
        return statusRepairCostsTakeover;
    }

    /**
     * Legt den Wert der statusRepairCostsTakeover-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setStatusRepairCostsTakeover(FieldInteger value) {
        this.statusRepairCostsTakeover = value;
    }

    /**
     * Ruft den Wert der transmissionState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getTransmissionState() {
        return transmissionState;
    }

    /**
     * Legt den Wert der transmissionState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setTransmissionState(FieldDecimal value) {
        this.transmissionState = value;
    }

    /**
     * Ruft den Wert der protocolData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProtocolData() {
        return protocolData;
    }

    /**
     * Legt den Wert der protocolData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProtocolData(FieldString value) {
        this.protocolData = value;
    }

}
