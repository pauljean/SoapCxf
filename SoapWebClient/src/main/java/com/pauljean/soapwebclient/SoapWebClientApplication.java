package com.pauljean.soapwebclient;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pauljean.soapwebserver.service.HelloService;
import com.pauljean.soapwebserver.service.HelloServiceService;

@SpringBootApplication
public class SoapWebClientApplication {

	public static void main(String[] args) throws MalformedURLException {
		SpringApplication.run(SoapWebClientApplication.class, args);
		
		HelloServiceService myCxfSoapService=new HelloServiceService( new URL("http://localhost:8080/hellows/services/hello?wsdl"));
		
		HelloService iService=myCxfSoapService.getHelloServicePort();
		
		System.err.println(iService.sayHello());
		System.err.println(iService.sayHelloByName("Fox"));
	}

}
