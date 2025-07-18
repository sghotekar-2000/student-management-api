package com.example.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public MyMessage sayHello() {
		return new MyMessage("Hello, Jersey JSON response!");    
		}

}
