package org.rest.rohit.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.rest.rohit.messenger.model.message;
import org.rest.rohit.messenger.model.profile;

public class database {
	
	private static Map<Long, message> messages = new HashMap<>();
	private static Map<String, profile> profiles = new HashMap<>();
	
	public static Map<Long, message> getMessages(){
		
		return messages;
	}
	
	public static Map<String, profile> getProfiles(){
		
		return profiles;
	}
	
}
