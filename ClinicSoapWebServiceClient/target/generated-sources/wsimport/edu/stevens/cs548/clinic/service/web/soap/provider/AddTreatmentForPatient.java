
package edu.stevens.cs548.clinic.service.web.soap.provider;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import edu.stevens.cs548.clinic.service.dto.TreatmentDto;


/**
 * <p>Java class for addTreatmentForPatient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addTreatmentForPatient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://cs548.stevens.edu/clinic/service/dto}treatment-dto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTreatmentForPatient", propOrder = {
    "treatmentDto"
})
public class AddTreatmentForPatient {

    @XmlElement(name = "treatment-dto", namespace = "http://cs548.stevens.edu/clinic/service/dto")
    protected TreatmentDto treatmentDto;

    /**
     * Gets the value of the treatmentDto property.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentDto }
     *     
     */
    public TreatmentDto getTreatmentDto() {
        return treatmentDto;
    }

    /**
     * Sets the value of the treatmentDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentDto }
     *     
     */
    public void setTreatmentDto(TreatmentDto value) {
        this.treatmentDto = value;
    }

}
