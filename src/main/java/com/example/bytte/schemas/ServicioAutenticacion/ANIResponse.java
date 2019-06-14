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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ANIResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANIResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bytte.com.co/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnioResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoErrorDatosCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartamentoExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MunicipioExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroResolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Particula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ANILogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ANILocal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANIResponse", namespace = "http://www.bytte.com.co/", propOrder = {
    "anioResolucion",
    "codigoErrorDatosCedula",
    "departamentoExpedicion",
    "estadoCedula",
    "fechaExpedicion",
    "municipioExpedicion",
    "nuip",
    "numeroResolucion",
    "particula",
    "primerApellido",
    "primerNombre",
    "segundoApellido",
    "segundoNombre",
    "fechaRegistro",
    "aniLogId",
    "aniLocal"
})
public class ANIResponse
    extends Response
{

    @XmlElement(name = "AnioResolucion")
    protected String anioResolucion;
    @XmlElement(name = "CodigoErrorDatosCedula")
    protected String codigoErrorDatosCedula;
    @XmlElement(name = "DepartamentoExpedicion")
    protected String departamentoExpedicion;
    @XmlElement(name = "EstadoCedula")
    protected String estadoCedula;
    @XmlElement(name = "FechaExpedicion")
    protected String fechaExpedicion;
    @XmlElement(name = "MunicipioExpedicion")
    protected String municipioExpedicion;
    @XmlElement(name = "NUIP")
    protected String nuip;
    @XmlElement(name = "NumeroResolucion")
    protected String numeroResolucion;
    @XmlElement(name = "Particula")
    protected String particula;
    @XmlElement(name = "PrimerApellido")
    protected String primerApellido;
    @XmlElement(name = "PrimerNombre")
    protected String primerNombre;
    @XmlElement(name = "SegundoApellido")
    protected String segundoApellido;
    @XmlElement(name = "SegundoNombre")
    protected String segundoNombre;
    @XmlElement(name = "FechaRegistro", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(name = "ANILogId")
    protected String aniLogId;
    @XmlElement(name = "ANILocal")
    protected boolean aniLocal;

    /**
     * Gets the value of the anioResolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioResolucion() {
        return anioResolucion;
    }

    /**
     * Sets the value of the anioResolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioResolucion(String value) {
        this.anioResolucion = value;
    }

    /**
     * Gets the value of the codigoErrorDatosCedula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoErrorDatosCedula() {
        return codigoErrorDatosCedula;
    }

    /**
     * Sets the value of the codigoErrorDatosCedula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoErrorDatosCedula(String value) {
        this.codigoErrorDatosCedula = value;
    }

    /**
     * Gets the value of the departamentoExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoExpedicion() {
        return departamentoExpedicion;
    }

    /**
     * Sets the value of the departamentoExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoExpedicion(String value) {
        this.departamentoExpedicion = value;
    }

    /**
     * Gets the value of the estadoCedula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCedula() {
        return estadoCedula;
    }

    /**
     * Sets the value of the estadoCedula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCedula(String value) {
        this.estadoCedula = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Gets the value of the municipioExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipioExpedicion() {
        return municipioExpedicion;
    }

    /**
     * Sets the value of the municipioExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipioExpedicion(String value) {
        this.municipioExpedicion = value;
    }

    /**
     * Gets the value of the nuip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUIP() {
        return nuip;
    }

    /**
     * Sets the value of the nuip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUIP(String value) {
        this.nuip = value;
    }

    /**
     * Gets the value of the numeroResolucion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroResolucion() {
        return numeroResolucion;
    }

    /**
     * Sets the value of the numeroResolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroResolucion(String value) {
        this.numeroResolucion = value;
    }

    /**
     * Gets the value of the particula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticula() {
        return particula;
    }

    /**
     * Sets the value of the particula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticula(String value) {
        this.particula = value;
    }

    /**
     * Gets the value of the primerApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Sets the value of the primerApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Gets the value of the primerNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Sets the value of the primerNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Gets the value of the segundoApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Sets the value of the segundoApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Gets the value of the segundoNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Sets the value of the segundoNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the aniLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANILogId() {
        return aniLogId;
    }

    /**
     * Sets the value of the aniLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANILogId(String value) {
        this.aniLogId = value;
    }

    /**
     * Gets the value of the aniLocal property.
     * 
     */
    public boolean isANILocal() {
        return aniLocal;
    }

    /**
     * Sets the value of the aniLocal property.
     * 
     */
    public void setANILocal(boolean value) {
        this.aniLocal = value;
    }

}
