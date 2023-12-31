
package de.dat.datecodeselection.vehicleidentificationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse f�r fieldString complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fieldString">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldString", propOrder = {
    "value"
})
@XmlSeeAlso({
    FieldString1000 .class,
    FieldString2 .class,
    FieldString30 .class,
    FieldString5 .class,
    FieldString10 .class,
    FieldString4 .class,
    FieldString8 .class,
    FieldString40 .class,
    FieldCharacter.class,
    FieldString9 .class,
    FieldString6 .class,
    FieldString80 .class,
    FieldString3 .class,
    FieldString17 .class,
    FieldString15 .class,
    FieldString60 .class,
    FieldString4000 .class,
    FieldString50 .class,
    FieldString200 .class,
    FieldString12 .class,
    FieldString20 .class,
    FieldString100 .class
})
public class FieldString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "nil")
    protected Boolean nil;
    @XmlAttribute(name = "overwrite")
    protected Boolean overwrite;
    @XmlAttribute(name = "origin")
    protected String origin;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der nil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNil() {
        return nil;
    }

    /**
     * Legt den Wert der nil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNil(Boolean value) {
        this.nil = value;
    }

    /**
     * Ruft den Wert der overwrite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Legt den Wert der overwrite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

}
