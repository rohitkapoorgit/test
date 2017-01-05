package org.rest.rohit.messenger.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.rest.rohit.messenger.service.messageService;
import org.rest.rohit.messenger.model.*;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class messageResource {
	
	messageService objService = new messageService();
	
	@GET
	public List<message> getMessage(@QueryParam("year") int year, 
			@QueryParam("start") int start, 
			@QueryParam("size") int size ){
		
		if(year > 0){
			return objService.getAllMessagesForAYear(year);
		}
		
		if(start > 0 && size > 0){
			return objService.getAllMessagesPaginated(start, size);
		}
		
		return objService.getAllMessages();
	}
	
	@POST
	public  Response addMessage(@Context UriInfo uriInfo, message actMessage){
		
		message returnedMessage = objService.addMessage(actMessage);

		String newId = String.valueOf(returnedMessage.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(returnedMessage).build();
	}
	
	@GET
	@Path("/{messageId}")
	public message getSingleMessage(@PathParam("messageId") long id){
		
		return objService.getMessage(id);
	}
	
	
	@Path("/{messageId}/comments")
	public commentResource getCommentResource(){
		
		
		return new commentResource();
	}

}
