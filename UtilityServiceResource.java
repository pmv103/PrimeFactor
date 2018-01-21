package com.utilityservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * 
 * @author Pradeepkumar M Vishwakarma
 *
 * Utility service contains getPrimeFactors() method which calculate prime factors of a number
 * Method accept one input parameter as string
 * Return the response in string
 */

/**
 * 
 * @Path here defines class level path. Identifies the URI path that a resource
 *       class will serve requests for.
 */
@Path("/utilityservice")
public class UtilityServiceResource {

	/**
	 * @GET here defines, this method will method will process HTTP GET request 
	 */
	@GET
	/**
	 * @Path here defines method level path. Identifies the URI path that a
	 * resource class method will serve requests for. 
	 */	
	@Path("/primefactors/{numString: .*}") 
	/**
	 * 
	 * @param numString
	 * @return
	 */
	public Response getPrimeFactors(@PathParam("numString") String numString) {

		return Response.status(200).entity(PrimeFactor.getPrimeFactors(numString)).build();
	}

}
