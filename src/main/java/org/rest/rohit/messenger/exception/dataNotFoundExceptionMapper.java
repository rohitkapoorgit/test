package org.rest.rohit.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.rest.rohit.messenger.model.errorMessage;

@Provider
public class dataNotFoundExceptionMapper implements ExceptionMapper<dataNotFoundException> {

	@Override
	public Response toResponse(dataNotFoundException ex) {
		
		errorMessage x = new errorMessage(ex.toString(),404);
		return Response.status(Status.NOT_FOUND).entity(x).build(); 
		
	}

}
