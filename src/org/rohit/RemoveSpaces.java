package org.rohit;

public class RemoveSpaces {
	
	public String removeSpace(String s){
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)!= ' '){
				
				sb.append(s.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args){
		
		RemoveSpaces test = new RemoveSpaces();
	     String s="g  eeks   for ge  eeks  ";
		 System.out.println(test.removeSpace(s));
	}

}
