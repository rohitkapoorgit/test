package org.rest.rohit.messenger.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rest.rohit.messenger.database.database;
import org.rest.rohit.messenger.model.profile;

public class profileService {
	
	public profileService(){
		
		profiles.put("rohit", new profile(1L, "rohit", "rohit", "kapoor"));
		
	}
	
	private Map<String, profile> profiles = database.getProfiles();

	public List<profile> getAllProfiles(){
		return new ArrayList<profile>(profiles.values());
	}
	
	public profile getProfile(String name){
		
		return profiles.get(name);
		
	}
	
	public profile addProfile(profile actProfile){
		
		actProfile.setId(profiles.size()+1);
		profiles.put(actProfile.getProfileName(), actProfile);
		return actProfile;
		
	}
	
	public profile updateProfile(profile updProfile){
		
		if (updProfile.getProfileName().isEmpty()){
			
			return null;
		}
		
		profiles.put(updProfile.getProfileName(), updProfile);
		return updProfile;
		
	}
	
	public profile removeProfile(String name){
		
		return profiles.remove(name);
	}
	
	
}
