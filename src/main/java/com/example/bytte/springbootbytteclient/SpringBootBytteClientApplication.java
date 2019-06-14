package com.example.bytte.springbootbytteclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.bytte.schemas.ServicioAutenticacion.ConsultaProcesoValidacionDocumentoRequest;
import com.example.bytte.schemas.ServicioAutenticacion.ConsultaProcesoValidacionDocumentoResponse;
import com.example.bytte.schemas.ServicioAutenticacion.ConsultaUsuario;
import com.example.bytte.schemas.ServicioAutenticacion.ConsultaUsuarioResponse;
import com.example.bytte.schemas.ServicioAutenticacion.ObjectFactory;
import com.example.bytte.springbootbytteclient.SOAPConnector;


@SpringBootApplication
public class SpringBootBytteClientApplication {
	
	  @Autowired private WebServiceTemplate webServiceTemplate;
	 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBytteClientApplication.class, args);
	}
	@Bean
    CommandLineRunner lookup() {
        return args -> {
           
           System.out.println("Inicio del proceso");
            
           ObjectFactory factory = new ObjectFactory();
           ConsultaUsuario person = factory.createConsultaUsuario();
           person.setNumeroDocumento("123");
			  ConsultaUsuario request = new ConsultaUsuario();
			  request.setNumeroDocumento("51724121");
			  
			  
//			  ConsultaUsuarioResponse response =(ConsultaUsuarioResponse)
//			  soapConnector.callWebService(
//			  "http://13.68.235.146/CASB/CASB.ProcesoAutenticacion/Service/ServicioAutenticacion.svc",
//			  request);
			 
           System.out.println("Got Response As below ========= : ");
			
			  
			 
           
			/*
			 * ConsultaProcesoValidacionDocumentoRequest req = new
			 * ConsultaProcesoValidacionDocumentoRequest();
			 * req.setIdentificadorProceso("123");
			 * ConsultaProcesoValidacionDocumentoResponse res =
			 * (ConsultaProcesoValidacionDocumentoResponse)soapConnector.callWebService(
			 * "http://13.68.235.146/CASB/CASB.ProcesoAutenticacion/Service/ServicioAutenticacion.svc",
			 * req);
			 * System.out.println("Name : "+res.getConsultaProcesoValidacionDocumentoResult(
			 * ).getFechaProceso().toString());
			 */
			  
			  ConsultaUsuarioResponse res = (ConsultaUsuarioResponse) webServiceTemplate.marshalSendAndReceive(person,new SoapActionCallback("http://casb.bytte.com.co/IServicioAutenticacion/ConsultaUsuario"));
			  System.out.println("Name : "+res.getConsultaUsuarioResult().getMensaje()
					  ); System.out.println("Fin del proceso");
        };
    }
}
