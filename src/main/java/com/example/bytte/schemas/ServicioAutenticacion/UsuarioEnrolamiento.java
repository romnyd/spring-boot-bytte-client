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
 * <p>Java class for UsuarioEnrolamiento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsuarioEnrolamiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://casb.bytte.com.co/}Usuario"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnroladoDactilar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TemplateDactilar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnroladoFacial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TemplateFacial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioEnrolamiento", propOrder = {
    "enroladoDactilar",
    "templateDactilar",
    "enroladoFacial",
    "templateFacial"
})
public class UsuarioEnrolamiento
    extends Usuario
{

    @XmlElement(name = "EnroladoDactilar")
    protected boolean enroladoDactilar;
    @XmlElement(name = "TemplateDactilar")
    protected String templateDactilar;
    @XmlElement(name = "EnroladoFacial")
    protected boolean enroladoFacial;
    @XmlElement(name = "TemplateFacial")
    protected String templateFacial;

    /**
     * Gets the value of the enroladoDactilar property.
     * 
     */
    public boolean isEnroladoDactilar() {
        return enroladoDactilar;
    }

    /**
     * Sets the value of the enroladoDactilar property.
     * 
     */
    public void setEnroladoDactilar(boolean value) {
        this.enroladoDactilar = value;
    }

    /**
     * Gets the value of the templateDactilar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateDactilar() {
        return templateDactilar;
    }

    /**
     * Sets the value of the templateDactilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateDactilar(String value) {
        this.templateDactilar = value;
    }

    /**
     * Gets the value of the enroladoFacial property.
     * 
     */
    public boolean isEnroladoFacial() {
        return enroladoFacial;
    }

    /**
     * Sets the value of the enroladoFacial property.
     * 
     */
    public void setEnroladoFacial(boolean value) {
        this.enroladoFacial = value;
    }

    /**
     * Gets the value of the templateFacial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateFacial() {
        return templateFacial;
    }

    /**
     * Sets the value of the templateFacial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateFacial(String value) {
        this.templateFacial = value;
    }

}