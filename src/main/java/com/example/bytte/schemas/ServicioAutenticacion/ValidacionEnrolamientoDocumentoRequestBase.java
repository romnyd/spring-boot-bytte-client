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
 * <p>Java class for ValidacionEnrolamientoDocumentoRequestBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidacionEnrolamientoDocumentoRequestBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://casb.bytte.com.co/}ValidacionEnrolamientoDocumentoRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GPSData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceMAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImagenFrenteRostro" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImagenSelfie" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImagenFrenteFirma" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ImagenCompleta" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacionEnrolamientoDocumentoRequestBase", propOrder = {
    "gpsData",
    "deviceIP",
    "deviceMAC",
    "deviceUUID",
    "imagenFrenteRostro",
    "imagenSelfie",
    "imagenFrenteFirma",
    "imagenCompleta"
})
public class ValidacionEnrolamientoDocumentoRequestBase
    extends ValidacionEnrolamientoDocumentoRequest
{

    @XmlElement(name = "GPSData")
    protected String gpsData;
    @XmlElement(name = "DeviceIP")
    protected String deviceIP;
    @XmlElement(name = "DeviceMAC")
    protected String deviceMAC;
    @XmlElement(name = "DeviceUUID")
    protected String deviceUUID;
    @XmlElement(name = "ImagenFrenteRostro")
    protected byte[] imagenFrenteRostro;
    @XmlElement(name = "ImagenSelfie")
    protected byte[] imagenSelfie;
    @XmlElement(name = "ImagenFrenteFirma")
    protected byte[] imagenFrenteFirma;
    @XmlElement(name = "ImagenCompleta")
    protected byte[] imagenCompleta;

    /**
     * Gets the value of the gpsData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPSData() {
        return gpsData;
    }

    /**
     * Sets the value of the gpsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPSData(String value) {
        this.gpsData = value;
    }

    /**
     * Gets the value of the deviceIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceIP() {
        return deviceIP;
    }

    /**
     * Sets the value of the deviceIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceIP(String value) {
        this.deviceIP = value;
    }

    /**
     * Gets the value of the deviceMAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceMAC() {
        return deviceMAC;
    }

    /**
     * Sets the value of the deviceMAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceMAC(String value) {
        this.deviceMAC = value;
    }

    /**
     * Gets the value of the deviceUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceUUID() {
        return deviceUUID;
    }

    /**
     * Sets the value of the deviceUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceUUID(String value) {
        this.deviceUUID = value;
    }

    /**
     * Gets the value of the imagenFrenteRostro property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenFrenteRostro() {
        return imagenFrenteRostro;
    }

    /**
     * Sets the value of the imagenFrenteRostro property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenFrenteRostro(byte[] value) {
        this.imagenFrenteRostro = value;
    }

    /**
     * Gets the value of the imagenSelfie property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenSelfie() {
        return imagenSelfie;
    }

    /**
     * Sets the value of the imagenSelfie property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenSelfie(byte[] value) {
        this.imagenSelfie = value;
    }

    /**
     * Gets the value of the imagenFrenteFirma property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenFrenteFirma() {
        return imagenFrenteFirma;
    }

    /**
     * Sets the value of the imagenFrenteFirma property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenFrenteFirma(byte[] value) {
        this.imagenFrenteFirma = value;
    }

    /**
     * Gets the value of the imagenCompleta property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagenCompleta() {
        return imagenCompleta;
    }

    /**
     * Sets the value of the imagenCompleta property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagenCompleta(byte[] value) {
        this.imagenCompleta = value;
    }

}