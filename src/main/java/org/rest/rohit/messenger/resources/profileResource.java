package org.rest.rohit.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.rohit.messenger.service.profileService;
import org.rest.rohit.messenger.model.*;
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

@Path("/profiles")
public class profileResource {
	
	profileService objServiceProfile = new profileService();
	
	@GET
	public List<profile> getProfile(){
		
		return objServiceProfile.getAllProfiles();
	}
	
	@POST	
	public  profile addProfile(profile actProfile){
		
		return objServiceProfile.addProfile(actProfile);
	}
	
	@GET
	@Path("/{profileName}")
	public profile getSingleProfile(@PathParam("profileName") String name){
		
		return objServiceProfile.getProfile(name);
	}
	
	@PUT
	@Path("/{profileName}")
	public profile updateProfile(@PathParam("profileName") String name, profile actProfile){
		
		return objServiceProfile.updateProfile(actProfile);
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String actName){
		
		objServiceProfile.removeProfile(actName);
	}

}
