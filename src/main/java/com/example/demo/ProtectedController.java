package com.example.demo;

import org.eclipse.microprofile.jwt.Claim;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Set;
import javax.inject.Singleton;

/**
 *
 */
@Path("/protected")
@Singleton
public class ProtectedController {

	@Inject
	@Claim("groups")
	private Set<String> groups;

	@Inject
	@Claim("sub")
	private String subject;

	@GET
	@RolesAllowed({"Admin", "Everyone"})
	public String getJWTBasedValue() {
			return this.subject + ": " + this.groups.toString();
	}

}
