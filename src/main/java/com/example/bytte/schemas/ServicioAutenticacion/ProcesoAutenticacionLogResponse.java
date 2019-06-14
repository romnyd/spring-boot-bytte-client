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
 * <p>Java class for ProcesoAutenticacionLogResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcesoAutenticacionLogResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bytte.com.co/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Ultimo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BarCodeBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusFingerprint" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusAniOCR" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusANIBarCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusOCRBarCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusFace" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusDocumento" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="ScoreFingerprintValor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreFingerprint" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreAniOCR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreANIBarcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreOCRBarCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreFace" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreFaceValor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Finalizado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AutenticadoDocumento" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImagenDocumento" type="{http://casb.bytte.com.co/}ProcesoAutenticacionDocumento" minOccurs="0"/&gt;
 *         &lt;element name="HuellasProceso" type="{http://casb.bytte.com.co/}ArrayOfProcesoAutenticacionCapturaHuella" minOccurs="0"/&gt;
 *         &lt;element name="BarCodeData" type="{http://casb.bytte.com.co/}DocumentoData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcesoAutenticacionLogResponse", propOrder = {
    "idLog",
    "version",
    "idProceso",
    "fechaProceso",
    "ultimo",
    "barCodeBase64",
    "statusFingerprint",
    "statusAniOCR",
    "statusANIBarCode",
    "statusOCRBarCode",
    "statusFace",
    "statusDocumento",
    "scoreFingerprintValor",
    "scoreFingerprint",
    "scoreAniOCR",
    "scoreANIBarcode",
    "scoreOCRBarCode",
    "scoreFace",
    "scoreFaceValor",
    "scoreDocumento",
    "finalizado",
    "autenticadoDocumento",
    "numeroDocumento",
    "imagenDocumento",
    "huellasProceso",
    "barCodeData"
})
public class ProcesoAutenticacionLogResponse
    extends Response
{

    @XmlElement(name = "IdLog")
    protected String idLog;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "IdProceso")
    protected String idProceso;
    @XmlElement(name = "FechaProceso", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaProceso;
    @XmlElement(name = "Ultimo")
    protected boolean ultimo;
    @XmlElement(name = "BarCodeBase64")
    protected String barCodeBase64;
    @XmlElement(name = "StatusFingerprint")
    protected short statusFingerprint;
    @XmlElement(name = "StatusAniOCR")
    protected short statusAniOCR;
    @XmlElement(name = "StatusANIBarCode")
    protected short statusANIBarCode;
    @XmlElement(name = "StatusOCRBarCode", required = true, type = Short.class, nillable = true)
    protected Short statusOCRBarCode;
    @XmlElement(name = "StatusFace")
    protected short statusFace;
    @XmlElement(name = "StatusDocumento", required = true, type = Short.class, nillable = true)
    protected Short statusDocumento;
    @XmlElement(name = "ScoreFingerprintValor", required = true, type = Integer.class, nillable = true)
    protected Integer scoreFingerprintValor;
    @XmlElement(name = "ScoreFingerprint", required = true, type = Integer.class, nillable = true)
    protected Integer scoreFingerprint;
    @XmlElement(name = "ScoreAniOCR", required = true, type = Integer.class, nillable = true)
    protected Integer scoreAniOCR;
    @XmlElement(name = "ScoreANIBarcode", required = true, type = Integer.class, nillable = true)
    protected Integer scoreANIBarcode;
    @XmlElement(name = "ScoreOCRBarCode", required = true, type = Integer.class, nillable = true)
    protected Integer scoreOCRBarCode;
    @XmlElement(name = "ScoreFace", required = true, type = Integer.class, nillable = true)
    protected Integer scoreFace;
    @XmlElement(name = "ScoreFaceValor", required = true, type = Integer.class, nillable = true)
    protected Integer scoreFaceValor;
    @XmlElement(name = "ScoreDocumento", required = true, type = Integer.class, nillable = true)
    protected Integer scoreDocumento;
    @XmlElement(name = "Finalizado", required = true, type = Boolean.class, nillable = true)
    protected Boolean finalizado;
    @XmlElement(name = "AutenticadoDocumento")
    protected boolean autenticadoDocumento;
    @XmlElement(name = "NumeroDocumento")
    protected String numeroDocumento;
    @XmlElement(name = "ImagenDocumento")
    protected ProcesoAutenticacionDocumento imagenDocumento;
    @XmlElement(name = "HuellasProceso")
    protected ArrayOfProcesoAutenticacionCapturaHuella huellasProceso;
    @XmlElement(name = "BarCodeData")
    protected DocumentoData barCodeData;

    /**
     * Gets the value of the idLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLog() {
        return idLog;
    }

    /**
     * Sets the value of the idLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLog(String value) {
        this.idLog = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the idProceso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProceso() {
        return idProceso;
    }

    /**
     * Sets the value of the idProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProceso(String value) {
        this.idProceso = value;
    }

    /**
     * Gets the value of the fechaProceso property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaProceso() {
        return fechaProceso;
    }

    /**
     * Sets the value of the fechaProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaProceso(XMLGregorianCalendar value) {
        this.fechaProceso = value;
    }

    /**
     * Gets the value of the ultimo property.
     * 
     */
    public boolean isUltimo() {
        return ultimo;
    }

    /**
     * Sets the value of the ultimo property.
     * 
     */
    public void setUltimo(boolean value) {
        this.ultimo = value;
    }

    /**
     * Gets the value of the barCodeBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCodeBase64() {
        return barCodeBase64;
    }

    /**
     * Sets the value of the barCodeBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCodeBase64(String value) {
        this.barCodeBase64 = value;
    }

    /**
     * Gets the value of the statusFingerprint property.
     * 
     */
    public short getStatusFingerprint() {
        return statusFingerprint;
    }

    /**
     * Sets the value of the statusFingerprint property.
     * 
     */
    public void setStatusFingerprint(short value) {
        this.statusFingerprint = value;
    }

    /**
     * Gets the value of the statusAniOCR property.
     * 
     */
    public short getStatusAniOCR() {
        return statusAniOCR;
    }

    /**
     * Sets the value of the statusAniOCR property.
     * 
     */
    public void setStatusAniOCR(short value) {
        this.statusAniOCR = value;
    }

    /**
     * Gets the value of the statusANIBarCode property.
     * 
     */
    public short getStatusANIBarCode() {
        return statusANIBarCode;
    }

    /**
     * Sets the value of the statusANIBarCode property.
     * 
     */
    public void setStatusANIBarCode(short value) {
        this.statusANIBarCode = value;
    }

    /**
     * Gets the value of the statusOCRBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatusOCRBarCode() {
        return statusOCRBarCode;
    }

    /**
     * Sets the value of the statusOCRBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatusOCRBarCode(Short value) {
        this.statusOCRBarCode = value;
    }

    /**
     * Gets the value of the statusFace property.
     * 
     */
    public short getStatusFace() {
        return statusFace;
    }

    /**
     * Sets the value of the statusFace property.
     * 
     */
    public void setStatusFace(short value) {
        this.statusFace = value;
    }

    /**
     * Gets the value of the statusDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatusDocumento() {
        return statusDocumento;
    }

    /**
     * Sets the value of the statusDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatusDocumento(Short value) {
        this.statusDocumento = value;
    }

    /**
     * Gets the value of the scoreFingerprintValor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreFingerprintValor() {
        return scoreFingerprintValor;
    }

    /**
     * Sets the value of the scoreFingerprintValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreFingerprintValor(Integer value) {
        this.scoreFingerprintValor = value;
    }

    /**
     * Gets the value of the scoreFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreFingerprint() {
        return scoreFingerprint;
    }

    /**
     * Sets the value of the scoreFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreFingerprint(Integer value) {
        this.scoreFingerprint = value;
    }

    /**
     * Gets the value of the scoreAniOCR property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreAniOCR() {
        return scoreAniOCR;
    }

    /**
     * Sets the value of the scoreAniOCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreAniOCR(Integer value) {
        this.scoreAniOCR = value;
    }

    /**
     * Gets the value of the scoreANIBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreANIBarcode() {
        return scoreANIBarcode;
    }

    /**
     * Sets the value of the scoreANIBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreANIBarcode(Integer value) {
        this.scoreANIBarcode = value;
    }

    /**
     * Gets the value of the scoreOCRBarCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreOCRBarCode() {
        return scoreOCRBarCode;
    }

    /**
     * Sets the value of the scoreOCRBarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreOCRBarCode(Integer value) {
        this.scoreOCRBarCode = value;
    }

    /**
     * Gets the value of the scoreFace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreFace() {
        return scoreFace;
    }

    /**
     * Sets the value of the scoreFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreFace(Integer value) {
        this.scoreFace = value;
    }

    /**
     * Gets the value of the scoreFaceValor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreFaceValor() {
        return scoreFaceValor;
    }

    /**
     * Sets the value of the scoreFaceValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreFaceValor(Integer value) {
        this.scoreFaceValor = value;
    }

    /**
     * Gets the value of the scoreDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreDocumento() {
        return scoreDocumento;
    }

    /**
     * Sets the value of the scoreDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreDocumento(Integer value) {
        this.scoreDocumento = value;
    }

    /**
     * Gets the value of the finalizado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalizado() {
        return finalizado;
    }

    /**
     * Sets the value of the finalizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalizado(Boolean value) {
        this.finalizado = value;
    }

    /**
     * Gets the value of the autenticadoDocumento property.
     * 
     */
    public boolean isAutenticadoDocumento() {
        return autenticadoDocumento;
    }

    /**
     * Sets the value of the autenticadoDocumento property.
     * 
     */
    public void setAutenticadoDocumento(boolean value) {
        this.autenticadoDocumento = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the imagenDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link ProcesoAutenticacionDocumento }
     *     
     */
    public ProcesoAutenticacionDocumento getImagenDocumento() {
        return imagenDocumento;
    }

    /**
     * Sets the value of the imagenDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesoAutenticacionDocumento }
     *     
     */
    public void setImagenDocumento(ProcesoAutenticacionDocumento value) {
        this.imagenDocumento = value;
    }

    /**
     * Gets the value of the huellasProceso property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProcesoAutenticacionCapturaHuella }
     *     
     */
    public ArrayOfProcesoAutenticacionCapturaHuella getHuellasProceso() {
        return huellasProceso;
    }

    /**
     * Sets the value of the huellasProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProcesoAutenticacionCapturaHuella }
     *     
     */
    public void setHuellasProceso(ArrayOfProcesoAutenticacionCapturaHuella value) {
        this.huellasProceso = value;
    }

    /**
     * Gets the value of the barCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoData }
     *     
     */
    public DocumentoData getBarCodeData() {
        return barCodeData;
    }

    /**
     * Sets the value of the barCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoData }
     *     
     */
    public void setBarCodeData(DocumentoData value) {
        this.barCodeData = value;
    }

}