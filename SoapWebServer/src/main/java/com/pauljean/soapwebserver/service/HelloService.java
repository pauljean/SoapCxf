package com.pauljean.soapwebserver.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService {
	
	
	@WebMethod
	public String sayHello() {
		
		return "Hello world !!!";
	}
	
	@WebMethod
	public String sayHelloByName(String name) {
		
		return "Hello "+name +" !!!";
	}


}
