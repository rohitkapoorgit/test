package org.rest.rohit.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.rohit.messenger.service.commentService;
import org.rest.rohit.messenger.model.*;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

@Path("/")
public class commentResource {
	
	commentService objCommentService = new commentService();
	
	@GET
	public List<comment> getAllComments(@PathParam("messageId") long messageId){
		
		return objCommentService.getAllComments(messageId);
	}
	
	
	@POST
	public  comment addComment(@PathParam("messageId") long messageId, comment actComment){
		
		return objCommentService.addComment(messageId, actComment);
	}
	
	@GET
	@Path("/{commentId}")
	public comment getSingleComment(@PathParam("messageId") long messageId, 
									@PathParam("commentId") long commentId){
		
		return objCommentService.getComment(messageId, commentId);
	}
	
	
	@DELETE
	@Path("/{commentId}")
	public void deleteComment(@PathParam("messageId") long messageId, 
							  @PathParam("commentId") long commentId){
		
		objCommentService.removeComment(messageId, commentId);
	}

}
