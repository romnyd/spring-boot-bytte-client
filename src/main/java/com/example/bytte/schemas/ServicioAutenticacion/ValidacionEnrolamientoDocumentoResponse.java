//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 11:19:40 AM COT 
//


package com.example.bytte.schemas.ServicioAutenticacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidacionEnrolamientoDocumentoResult" type="{http://casb.bytte.com.co/}ProcesoValidacionDocumentoResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validacionEnrolamientoDocumentoResult"
})
@XmlRootElement(name = "ValidacionEnrolamientoDocumentoResponse")
public class ValidacionEnrolamientoDocumentoResponse {

    @XmlElement(name = "ValidacionEnrolamientoDocumentoResult")
    protected ProcesoValidacionDocumentoResponse validacionEnrolamientoDocumentoResult;

    /**
     * Gets the value of the validacionEnrolamientoDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProcesoValidacionDocumentoResponse }
     *     
     */
    public ProcesoValidacionDocumentoResponse getValidacionEnrolamientoDocumentoResult() {
        return validacionEnrolamientoDocumentoResult;
    }

    /**
     * Sets the value of the validacionEnrolamientoDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesoValidacionDocumentoResponse }
     *     
     */
    public void setValidacionEnrolamientoDocumentoResult(ProcesoValidacionDocumentoResponse value) {
        this.validacionEnrolamientoDocumentoResult = value;
    }

}
