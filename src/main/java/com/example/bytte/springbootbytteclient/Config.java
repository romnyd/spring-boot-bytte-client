package com.example.bytte.springbootbytteclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
 
@Configuration
public class Config {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.example.bytte.schemas.ServicioAutenticacion");
        
        return marshaller;
    }
 
	/*
	 * @Bean public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
	 * SOAPConnector client = new SOAPConnector(); client.setDefaultUri(
	 * "http://13.68.235.146/CASB/CASB.ProcesoAutenticacion/Service/ServicioAutenticacion.svc"
	 * );
	 * 
	 * client.setMarshaller(marshaller); client.setUnmarshaller(marshaller); return
	 * client; }
	 */
    @Bean
    public WebServiceTemplate webServiceTemplate() {
      WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
      webServiceTemplate.setMarshaller(marshaller());
      webServiceTemplate.setUnmarshaller(marshaller());
      webServiceTemplate.setDefaultUri(
          "http://13.68.235.146/CASB/CASB.ProcesoAutenticacion/Service/ServicioAutenticacion.svc");

      return webServiceTemplate;
    }
}