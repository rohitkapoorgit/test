package org.rest.rohit.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class errorMessage {

	private String error;
	private int errorCode;
	
	public errorMessage(){
		
	}
	
	public errorMessage(String error, int errorCode){
		
		this.error = error;
		this.errorCode = errorCode;
		
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
