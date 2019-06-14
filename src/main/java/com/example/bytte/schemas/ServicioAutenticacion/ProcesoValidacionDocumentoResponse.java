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
 * <p>Java class for ProcesoValidacionDocumentoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcesoValidacionDocumentoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bytte.com.co/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScoreDactilar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreDactilarValor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreANIOCR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreANIBarCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreOCRBarCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreFace" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreFaceValor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ScoreDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StatusDactilar" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusANIOCR" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusANIBarCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusOCRBarCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusFace" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="StatusDocumento" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="AutenticadoDocumento" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InformacionCliente" type="{http://casb.bytte.com.co/}ClienteDocumento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcesoValidacionDocumentoResponse", propOrder = {
    "scoreDactilar",
    "scoreDactilarValor",
    "scoreANIOCR",
    "scoreANIBarCode",
    "scoreOCRBarCode",
    "scoreFace",
    "scoreFaceValor",
    "scoreDocumento",
    "statusDactilar",
    "statusANIOCR",
    "statusANIBarCode",
    "statusOCRBarCode",
    "statusFace",
    "statusDocumento",
    "autenticadoDocumento",
    "informacionCliente"
})
public class ProcesoValidacionDocumentoResponse
    extends Response
{

    @XmlElement(name = "ScoreDactilar")
    protected int scoreDactilar;
    @XmlElement(name = "ScoreDactilarValor")
    protected int scoreDactilarValor;
    @XmlElement(name = "ScoreANIOCR")
    protected int scoreANIOCR;
    @XmlElement(name = "ScoreANIBarCode")
    protected int scoreANIBarCode;
    @XmlElement(name = "ScoreOCRBarCode")
    protected int scoreOCRBarCode;
    @XmlElement(name = "ScoreFace")
    protected int scoreFace;
    @XmlElement(name = "ScoreFaceValor")
    protected int scoreFaceValor;
    @XmlElement(name = "ScoreDocumento")
    protected int scoreDocumento;
    @XmlElement(name = "StatusDactilar")
    protected short statusDactilar;
    @XmlElement(name = "StatusANIOCR")
    protected short statusANIOCR;
    @XmlElement(name = "StatusANIBarCode")
    protected short statusANIBarCode;
    @XmlElement(name = "StatusOCRBarCode")
    protected short statusOCRBarCode;
    @XmlElement(name = "StatusFace")
    protected short statusFace;
    @XmlElement(name = "StatusDocumento")
    protected short statusDocumento;
    @XmlElement(name = "AutenticadoDocumento")
    protected boolean autenticadoDocumento;
    @XmlElement(name = "InformacionCliente")
    protected ClienteDocumento informacionCliente;

    /**
     * Gets the value of the scoreDactilar property.
     * 
     */
    public int getScoreDactilar() {
        return scoreDactilar;
    }

    /**
     * Sets the value of the scoreDactilar property.
     * 
     */
    public void setScoreDactilar(int value) {
        this.scoreDactilar = value;
    }

    /**
     * Gets the value of the scoreDactilarValor property.
     * 
     */
    public int getScoreDactilarValor() {
        return scoreDactilarValor;
    }

    /**
     * Sets the value of the scoreDactilarValor property.
     * 
     */
    public void setScoreDactilarValor(int value) {
        this.scoreDactilarValor = value;
    }

    /**
     * Gets the value of the scoreANIOCR property.
     * 
     */
    public int getScoreANIOCR() {
        return scoreANIOCR;
    }

    /**
     * Sets the value of the scoreANIOCR property.
     * 
     */
    public void setScoreANIOCR(int value) {
        this.scoreANIOCR = value;
    }

    /**
     * Gets the value of the scoreANIBarCode property.
     * 
     */
    public int getScoreANIBarCode() {
        return scoreANIBarCode;
    }

    /**
     * Sets the value of the scoreANIBarCode property.
     * 
     */
    public void setScoreANIBarCode(int value) {
        this.scoreANIBarCode = value;
    }

    /**
     * Gets the value of the scoreOCRBarCode property.
     * 
     */
    public int getScoreOCRBarCode() {
        return scoreOCRBarCode;
    }

    /**
     * Sets the value of the scoreOCRBarCode property.
     * 
     */
    public void setScoreOCRBarCode(int value) {
        this.scoreOCRBarCode = value;
    }

    /**
     * Gets the value of the scoreFace property.
     * 
     */
    public int getScoreFace() {
        return scoreFace;
    }

    /**
     * Sets the value of the scoreFace property.
     * 
     */
    public void setScoreFace(int value) {
        this.scoreFace = value;
    }

    /**
     * Gets the value of the scoreFaceValor property.
     * 
     */
    public int getScoreFaceValor() {
        return scoreFaceValor;
    }

    /**
     * Sets the value of the scoreFaceValor property.
     * 
     */
    public void setScoreFaceValor(int value) {
        this.scoreFaceValor = value;
    }

    /**
     * Gets the value of the scoreDocumento property.
     * 
     */
    public int getScoreDocumento() {
        return scoreDocumento;
    }

    /**
     * Sets the value of the scoreDocumento property.
     * 
     */
    public void setScoreDocumento(int value) {
        this.scoreDocumento = value;
    }

    /**
     * Gets the value of the statusDactilar property.
     * 
     */
    public short getStatusDactilar() {
        return statusDactilar;
    }

    /**
     * Sets the value of the statusDactilar property.
     * 
     */
    public void setStatusDactilar(short value) {
        this.statusDactilar = value;
    }

    /**
     * Gets the value of the statusANIOCR property.
     * 
     */
    public short getStatusANIOCR() {
        return statusANIOCR;
    }

    /**
     * Sets the value of the statusANIOCR property.
     * 
     */
    public void setStatusANIOCR(short value) {
        this.statusANIOCR = value;
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
     */
    public short getStatusOCRBarCode() {
        return statusOCRBarCode;
    }

    /**
     * Sets the value of the statusOCRBarCode property.
     * 
     */
    public void setStatusOCRBarCode(short value) {
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
     */
    public short getStatusDocumento() {
        return statusDocumento;
    }

    /**
     * Sets the value of the statusDocumento property.
     * 
     */
    public void setStatusDocumento(short value) {
        this.statusDocumento = value;
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
     * Gets the value of the informacionCliente property.
     * 
     * @return
     *     possible object is
     *     {@link ClienteDocumento }
     *     
     */
    public ClienteDocumento getInformacionCliente() {
        return informacionCliente;
    }

    /**
     * Sets the value of the informacionCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteDocumento }
     *     
     */
    public void setInformacionCliente(ClienteDocumento value) {
        this.informacionCliente = value;
    }

}