package com.cs.FirstJerseyProject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/persons")
public class PersonResources {

	@GET
	// @Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDetail getPersonDetail(@QueryParam("name") String name) {
		PersonDetail person = new PersonDetail();
		person.setName(name);
		person.setEmpId(101);
		person.setAddress("Hyd");
		return person;
	}

}
