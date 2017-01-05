package org.rest.rohit.messenger.service;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.rest.rohit.messenger.database.database;
import org.rest.rohit.messenger.exception.dataNotFoundException;
import org.rest.rohit.messenger.model.*;

public class messageService {
	
	public messageService(){
		
		messages.put(1L, new message(1L, "Hello World", "rohit"));
		messages.put(2L, new message(2L, "REST API", "rohit2"));
	}
	
	private Map<Long, message> messages = database.getMessages();

	public List<message> getAllMessages(){
		return new ArrayList<message>(messages.values());
	}
	
	public List<message> getAllMessagesForAYear(int year){
		Calendar cal = Calendar.getInstance();
		List<message> messageYear = new ArrayList<>();
		for(message i : messages.values()){
			cal.setTime(i.getCreated());
			if(cal.get(Calendar.YEAR) == year){
				messageYear.add(i);
			}
			
		}
		return messageYear;
	}
	
	public List<message> getAllMessagesPaginated(int start, int size){
		List<message> list = new ArrayList<message>(messages.values());
		return list.subList(start, start+size);
	}
	
	public message getMessage(long id) throws dataNotFoundException{
		
		message actMessage = messages.get(id);
		if(actMessage == null){
			
			throw new dataNotFoundException("Message with id not found");
		}
		
		return messages.get(id);
		
	}
	
	public message addMessage(message actMessage){
		
		actMessage.setId(messages.size()+1);
		messages.put(actMessage.getId(), actMessage);
		return actMessage;
		
	}
	
	public message updateMessage(message updMessage){
		
		if (updMessage.getId() <= 0){
			
			return null;
		}
		
		messages.put(updMessage.getId(), updMessage);
		return updMessage;
		
	}
	
	public message removeMessage(long id){
		
		return messages.remove(id);
	}
	
	
}
