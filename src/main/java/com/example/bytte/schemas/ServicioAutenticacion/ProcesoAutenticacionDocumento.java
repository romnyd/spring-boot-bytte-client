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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcesoAutenticacionDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcesoAutenticacionDocumento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImagenFrente" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="URLImagenFrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImagenReverso" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="URLImagenReverso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcesoAutenticacionDocumento", propOrder = {
    "imagenFrente",
    "urlImagenFrente",
    "imagenReverso",
    "urlImagenReverso"
})
public class ProcesoAutenticacionDocumento {

    @XmlElement(name = "ImagenFrente")
    protected byte[] imagenFrente;
    @XmlElement(name = "URLImagenFrente")
    protected String urlImagenFrente;
    @XmlElement(name = "ImagenReverso")
    protected byte[] imagenReverso;
    @XmlElement(name = "URLImagenReverso")
    protected String urlImagenReverso;

    /**
     * Gets the value of the imagenFrente property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenFrente() {
        return imagenFrente;
    }

    /**
     * Sets the value of the imagenFrente property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenFrente(byte[] value) {
        this.imagenFrente = value;
    }

    /**
     * Gets the value of the urlImagenFrente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLImagenFrente() {
        return urlImagenFrente;
    }

    /**
     * Sets the value of the urlImagenFrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLImagenFrente(String value) {
        this.urlImagenFrente = value;
    }

    /**
     * Gets the value of the imagenReverso property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenReverso() {
        return imagenReverso;
    }

    /**
     * Sets the value of the imagenReverso property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenReverso(byte[] value) {
        this.imagenReverso = value;
    }

    /**
     * Gets the value of the urlImagenReverso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLImagenReverso() {
        return urlImagenReverso;
    }

    /**
     * Sets the value of the urlImagenReverso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLImagenReverso(String value) {
        this.urlImagenReverso = value;
    }

}
