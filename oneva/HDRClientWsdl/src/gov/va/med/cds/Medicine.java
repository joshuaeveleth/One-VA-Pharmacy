//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 07:51:00 PM EST 
//


package gov.va.med.cds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Medicine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Medicine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmopDrugCode" type="{Basedatatypes}HL72CodedElementLite" minOccurs="0"/>
 *         &lt;element name="medicationCode" type="{Basedatatypes}HL72CodedElement" minOccurs="0"/>
 *         &lt;element name="otcCode" type="{Basedatatypes}HL72CodedElementLite" minOccurs="0"/>
 *         &lt;element name="tradeName" type="{Basedatatypes}HL72CodedElementLite" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medicine", namespace = "Common", propOrder = {
    "cmopDrugCode",
    "medicationCode",
    "otcCode",
    "tradeName"
})
public class Medicine {

    protected HL72CodedElementLite cmopDrugCode;
    protected HL72CodedElement medicationCode;
    protected HL72CodedElementLite otcCode;
    protected HL72CodedElementLite tradeName;

    /**
     * Gets the value of the cmopDrugCode property.
     * 
     * @return
     *     possible object is
     *     {@link HL72CodedElementLite }
     *     
     */
    public HL72CodedElementLite getCmopDrugCode() {
        return cmopDrugCode;
    }

    /**
     * Sets the value of the cmopDrugCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HL72CodedElementLite }
     *     
     */
    public void setCmopDrugCode(HL72CodedElementLite value) {
        this.cmopDrugCode = value;
    }

    /**
     * Gets the value of the medicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link HL72CodedElement }
     *     
     */
    public HL72CodedElement getMedicationCode() {
        return medicationCode;
    }

    /**
     * Sets the value of the medicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HL72CodedElement }
     *     
     */
    public void setMedicationCode(HL72CodedElement value) {
        this.medicationCode = value;
    }

    /**
     * Gets the value of the otcCode property.
     * 
     * @return
     *     possible object is
     *     {@link HL72CodedElementLite }
     *     
     */
    public HL72CodedElementLite getOtcCode() {
        return otcCode;
    }

    /**
     * Sets the value of the otcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HL72CodedElementLite }
     *     
     */
    public void setOtcCode(HL72CodedElementLite value) {
        this.otcCode = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link HL72CodedElementLite }
     *     
     */
    public HL72CodedElementLite getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HL72CodedElementLite }
     *     
     */
    public void setTradeName(HL72CodedElementLite value) {
        this.tradeName = value;
    }

}