package com.cs.FirstJerseyProject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/persons")
public class PersonResources {

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDetail getPersonDetailJSON(@QueryParam("name") String name) {
		PersonDetail person = new PersonDetail();
		person.setName(name);
		person.setEmpId(101);
		person.setAddress("Hyd");
		return person;
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public PersonDetail getPersonDetailXML(@QueryParam("name") String name) {
		PersonDetail person = new PersonDetail();
		person.setName(name);
		person.setEmpId(101);
		person.setAddress("Hyd");
		return person;
	}

}
