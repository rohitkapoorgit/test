package org.rest.rohit.messenger.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rest.rohit.messenger.database.database;
import org.rest.rohit.messenger.model.*;

public class commentService {

	private Map<Long, message> messages = database.getMessages();

	public List<comment> getAllComments(long messageId){
		Map<Long, comment> comments = messages.get(messageId).getComments();
		return new ArrayList<comment>(comments.values());
	}
	
	
	
	public comment getComment(long messageId, long commentId){
		
		Map<Long, comment> comments = messages.get(messageId).getComments();
		return comments.get(commentId);
		
	}
	
	public comment addComment(long messageId, comment actComment){
		
		Map<Long, comment> comments = messages.get(messageId).getComments();
		actComment.setId(comments.size()+1);
		comments.put(actComment.getId(), actComment);
		return actComment;
		
	}
	
	public comment updateComment(long messageId, comment updComment){
		
		if (updComment.getId() <= 0){
			
			return null;
		}
		
		Map<Long, comment> comments = messages.get(messageId).getComments();
		comments.put(updComment.getId(), updComment);
		return updComment;
		
	}
	
	public comment removeComment(long messageId, long commentId){
		
		Map<Long, comment> comments = messages.get(messageId).getComments();
		return comments.remove(commentId);
	}
	
	
}
