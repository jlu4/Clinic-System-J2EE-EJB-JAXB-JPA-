
package edu.stevens.cs548.clinic.service.web.soap.provider;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specializationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="specializationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SURGERY"/>
 *     &lt;enumeration value="RADIOLOGY"/>
 *     &lt;enumeration value="ONCOLOGY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "specializationType")
@XmlEnum
public enum SpecializationType {

    SURGERY,
    RADIOLOGY,
    ONCOLOGY;

    public String value() {
        return name();
    }

    public static SpecializationType fromValue(String v) {
        return valueOf(v);
    }

}
