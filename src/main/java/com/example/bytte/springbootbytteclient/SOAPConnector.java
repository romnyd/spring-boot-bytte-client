package com.example.bytte.springbootbytteclient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.example.bytte.schemas.ServicioAutenticacion.ConsultaUsuario;
import com.example.bytte.schemas.ServicioAutenticacion.ConsultaUsuarioResponse;



public class SOAPConnector extends WebServiceGatewaySupport {
	public Object callWebService(String url, Object request){
        return getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
	 @Bean
	    CommandLineRunner lookup(SOAPConnector soapConnector) {
	        return args -> {
	        	System.out.println("Got Response As below ========= : 0");
	        	
	        	
	             
	        };
	    }
}
