//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:39 PM EDT 
//


package org.sierraecg.schema.jaxb._1_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www3.medical.philips.com}encounterid" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www3.medical.philips.com}TYPEperson" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}room" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}bed" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}departmentid" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}departmentname" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}institutionid" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}institutionname" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}facilityid" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}facilityname" minOccurs="0"/>
 *         &lt;element name="orderingclinician" type="{http://www3.medical.philips.com}TYPEperson" minOccurs="0"/>
 *         &lt;element name="fellow" type="{http://www3.medical.philips.com}TYPEperson" minOccurs="0"/>
 *         &lt;element name="attendingclinician" type="{http://www3.medical.philips.com}TYPEperson" minOccurs="0"/>
 *         &lt;element name="referringclinician" type="{http://www3.medical.philips.com}TYPEperson" minOccurs="0"/>
 *         &lt;element name="consultingclinician" type="{http://www3.medical.philips.com}TYPEperson" minOccurs="0"/>
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
    "encounterid",
    "operator",
    "room",
    "bed",
    "departmentid",
    "departmentname",
    "institutionid",
    "institutionname",
    "facilityid",
    "facilityname",
    "orderingclinician",
    "fellow",
    "attendingclinician",
    "referringclinician",
    "consultingclinician"
})
@XmlRootElement(name = "acquirer")
public class Acquirer {

    protected String encounterid;
    protected TYPEperson operator;
    protected String room;
    protected String bed;
    protected String departmentid;
    protected String departmentname;
    protected String institutionid;
    protected String institutionname;
    protected String facilityid;
    protected String facilityname;
    protected TYPEperson orderingclinician;
    protected TYPEperson fellow;
    protected TYPEperson attendingclinician;
    protected TYPEperson referringclinician;
    protected TYPEperson consultingclinician;

    /**
     * Gets the value of the encounterid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncounterid() {
        return encounterid;
    }

    /**
     * Sets the value of the encounterid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncounterid(String value) {
        this.encounterid = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEperson }
     *     
     */
    public TYPEperson getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEperson }
     *     
     */
    public void setOperator(TYPEperson value) {
        this.operator = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the bed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBed() {
        return bed;
    }

    /**
     * Sets the value of the bed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBed(String value) {
        this.bed = value;
    }

    /**
     * Gets the value of the departmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * Sets the value of the departmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentid(String value) {
        this.departmentid = value;
    }

    /**
     * Gets the value of the departmentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentname() {
        return departmentname;
    }

    /**
     * Sets the value of the departmentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentname(String value) {
        this.departmentname = value;
    }

    /**
     * Gets the value of the institutionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionid() {
        return institutionid;
    }

    /**
     * Sets the value of the institutionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionid(String value) {
        this.institutionid = value;
    }

    /**
     * Gets the value of the institutionname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionname() {
        return institutionname;
    }

    /**
     * Sets the value of the institutionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionname(String value) {
        this.institutionname = value;
    }

    /**
     * Gets the value of the facilityid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityid() {
        return facilityid;
    }

    /**
     * Sets the value of the facilityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityid(String value) {
        this.facilityid = value;
    }

    /**
     * Gets the value of the facilityname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityname() {
        return facilityname;
    }

    /**
     * Sets the value of the facilityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityname(String value) {
        this.facilityname = value;
    }

    /**
     * Gets the value of the orderingclinician property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEperson }
     *     
     */
    public TYPEperson getOrderingclinician() {
        return orderingclinician;
    }

    /**
     * Sets the value of the orderingclinician property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEperson }
     *     
     */
    public void setOrderingclinician(TYPEperson value) {
        this.orderingclinician = value;
    }

    /**
     * Gets the value of the fellow property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEperson }
     *     
     */
    public TYPEperson getFellow() {
        return fellow;
    }

    /**
     * Sets the value of the fellow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEperson }
     *     
     */
    public void setFellow(TYPEperson value) {
        this.fellow = value;
    }

    /**
     * Gets the value of the attendingclinician property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEperson }
     *     
     */
    public TYPEperson getAttendingclinician() {
        return attendingclinician;
    }

    /**
     * Sets the value of the attendingclinician property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEperson }
     *     
     */
    public void setAttendingclinician(TYPEperson value) {
        this.attendingclinician = value;
    }

    /**
     * Gets the value of the referringclinician property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEperson }
     *     
     */
    public TYPEperson getReferringclinician() {
        return referringclinician;
    }

    /**
     * Sets the value of the referringclinician property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEperson }
     *     
     */
    public void setReferringclinician(TYPEperson value) {
        this.referringclinician = value;
    }

    /**
     * Gets the value of the consultingclinician property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEperson }
     *     
     */
    public TYPEperson getConsultingclinician() {
        return consultingclinician;
    }

    /**
     * Sets the value of the consultingclinician property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEperson }
     *     
     */
    public void setConsultingclinician(TYPEperson value) {
        this.consultingclinician = value;
    }

}
