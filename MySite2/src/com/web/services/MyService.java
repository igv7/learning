package com.web.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("mySrv")
public class MyService {
	@Path("greet")
	@GET
	public String greet(@QueryParam("user") String name) {
		return "Hello "+name+" !";
	}

	@Path("{num1}/{num2}")
	@GET
	public String sum(@PathParam("num1") int x,@PathParam("num2") int y) {
		return (x+y)+"";
	}

}