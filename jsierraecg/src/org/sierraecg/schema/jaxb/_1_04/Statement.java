//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.15 at 08:44:39 PM EDT 
//


package org.sierraecg.schema.jaxb._1_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www3.medical.philips.com}statementcode"/>
 *         &lt;element ref="{http://www3.medical.philips.com}leftstatement"/>
 *         &lt;element ref="{http://www3.medical.philips.com}rightstatement"/>
 *       &lt;/sequence>
 *       &lt;attribute name="editedflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statementcode",
    "leftstatement",
    "rightstatement"
})
@XmlRootElement(name = "statement")
public class Statement {

    @XmlElement(required = true)
    protected String statementcode;
    @XmlElement(required = true)
    protected String leftstatement;
    @XmlElement(required = true)
    protected String rightstatement;
    @XmlAttribute(name = "editedflag")
    protected TYPEflag editedflag;

    /**
     * Gets the value of the statementcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementcode() {
        return statementcode;
    }

    /**
     * Sets the value of the statementcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementcode(String value) {
        this.statementcode = value;
    }

    /**
     * Gets the value of the leftstatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftstatement() {
        return leftstatement;
    }

    /**
     * Sets the value of the leftstatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftstatement(String value) {
        this.leftstatement = value;
    }

    /**
     * Gets the value of the rightstatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightstatement() {
        return rightstatement;
    }

    /**
     * Sets the value of the rightstatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightstatement(String value) {
        this.rightstatement = value;
    }

    /**
     * Gets the value of the editedflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getEditedflag() {
        return editedflag;
    }

    /**
     * Sets the value of the editedflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setEditedflag(TYPEflag value) {
        this.editedflag = value;
    }

}
