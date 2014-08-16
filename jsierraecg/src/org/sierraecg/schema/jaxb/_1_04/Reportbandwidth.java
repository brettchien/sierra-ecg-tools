//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:39 PM EDT 
//


package org.sierraecg.schema.jaxb._1_04;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www3.medical.philips.com}highpassfiltersetting"/>
 *         &lt;element ref="{http://www3.medical.philips.com}lowpassfiltersetting"/>
 *         &lt;element ref="{http://www3.medical.philips.com}notchfiltersetting"/>
 *         &lt;element ref="{http://www3.medical.philips.com}notchharmonicssetting" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}artifactfilterflag" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}hysteresisfilterflag" minOccurs="0"/>
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
    "highpassfiltersetting",
    "lowpassfiltersetting",
    "notchfiltersetting",
    "notchharmonicssetting",
    "artifactfilterflag",
    "hysteresisfilterflag"
})
@XmlRootElement(name = "reportbandwidth")
public class Reportbandwidth {

    protected float highpassfiltersetting;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lowpassfiltersetting;
    @XmlElement(required = true)
    protected String notchfiltersetting;
    protected String notchharmonicssetting;
    @XmlSchemaType(name = "string")
    protected TYPEflag artifactfilterflag;
    @XmlSchemaType(name = "string")
    protected TYPEflag hysteresisfilterflag;

    /**
     * Gets the value of the highpassfiltersetting property.
     * 
     */
    public float getHighpassfiltersetting() {
        return highpassfiltersetting;
    }

    /**
     * Sets the value of the highpassfiltersetting property.
     * 
     */
    public void setHighpassfiltersetting(float value) {
        this.highpassfiltersetting = value;
    }

    /**
     * Gets the value of the lowpassfiltersetting property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowpassfiltersetting() {
        return lowpassfiltersetting;
    }

    /**
     * Sets the value of the lowpassfiltersetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowpassfiltersetting(BigInteger value) {
        this.lowpassfiltersetting = value;
    }

    /**
     * Gets the value of the notchfiltersetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotchfiltersetting() {
        return notchfiltersetting;
    }

    /**
     * Sets the value of the notchfiltersetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotchfiltersetting(String value) {
        this.notchfiltersetting = value;
    }

    /**
     * Gets the value of the notchharmonicssetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotchharmonicssetting() {
        return notchharmonicssetting;
    }

    /**
     * Sets the value of the notchharmonicssetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotchharmonicssetting(String value) {
        this.notchharmonicssetting = value;
    }

    /**
     * Gets the value of the artifactfilterflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getArtifactfilterflag() {
        return artifactfilterflag;
    }

    /**
     * Sets the value of the artifactfilterflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setArtifactfilterflag(TYPEflag value) {
        this.artifactfilterflag = value;
    }

    /**
     * Gets the value of the hysteresisfilterflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getHysteresisfilterflag() {
        return hysteresisfilterflag;
    }

    /**
     * Sets the value of the hysteresisfilterflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setHysteresisfilterflag(TYPEflag value) {
        this.hysteresisfilterflag = value;
    }

}
