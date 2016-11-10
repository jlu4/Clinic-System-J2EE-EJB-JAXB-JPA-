
package edu.stevens.cs548.clinic.service.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrugTreatmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrugTreatmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dosage" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="prescribing-physician" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugTreatmentType", propOrder = {
    "name",
    "dosage",
    "prescribingPhysician"
})
public class DrugTreatmentType {

    @XmlElement(required = true)
    protected String name;
    protected float dosage;
    @XmlElement(name = "prescribing-physician", required = true)
    protected String prescribingPhysician;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dosage property.
     * 
     */
    public float getDosage() {
        return dosage;
    }

    /**
     * Sets the value of the dosage property.
     * 
     */
    public void setDosage(float value) {
        this.dosage = value;
    }

    /**
     * Gets the value of the prescribingPhysician property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescribingPhysician() {
        return prescribingPhysician;
    }

    /**
     * Sets the value of the prescribingPhysician property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescribingPhysician(String value) {
        this.prescribingPhysician = value;
    }

}
