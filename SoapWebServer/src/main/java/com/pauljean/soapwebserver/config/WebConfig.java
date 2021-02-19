package com.pauljean.soapwebserver.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pauljean.soapwebserver.service.HelloService;

@Configuration
public class WebConfig {
	
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endPoint() {
				
		Endpoint endpoint=new EndpointImpl(bus, new HelloService());
		endpoint.publish("/hello");		
		return endpoint;
	}
	

}
