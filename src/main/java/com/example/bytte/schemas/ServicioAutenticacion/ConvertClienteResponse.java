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
 * <p>Java class for ConvertClienteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertClienteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bytte.com.co/}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClienteProceso" type="{http://casb.bytte.com.co/}DocumentoData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertClienteResponse", propOrder = {
    "clienteProceso"
})
public class ConvertClienteResponse
    extends Response
{

    @XmlElement(name = "ClienteProceso")
    protected DocumentoData clienteProceso;

    /**
     * Gets the value of the clienteProceso property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoData }
     *     
     */
    public DocumentoData getClienteProceso() {
        return clienteProceso;
    }

    /**
     * Sets the value of the clienteProceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoData }
     *     
     */
    public void setClienteProceso(DocumentoData value) {
        this.clienteProceso = value;
    }

}