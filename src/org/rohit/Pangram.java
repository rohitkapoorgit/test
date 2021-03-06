package org.rohit;
import java.util.*;
//Or can use arr[26] to mark pos. of characters
//http://www.geeksforgeeks.org/pangram-checking/
public class Pangram {
	
	//method	
	public String listMissingLetters(String s) {
		
			//String result = "";
			
			//Tree Set so that elements are sorted alphabetically
	        //Set<Character> set = new TreeSet<Character>();
			StringBuilder sb = new StringBuilder();
	        for (char a = 'A'; a <= 'Z'; a++){
	        	
	        	//checking both Upper case and lower case
	        	if ((s.indexOf(a) < 0) && (s.indexOf((char)(a + 32)) < 0)){
	        		
	        		//adding to set as lower case
	        		//set.add((char)(a+32));
	        		sb.append((char)(a+32));
	        		
	        	}
	                
	        }
	        
	        //converting set of chars to String as per the requirement
	       // StringBuilder sb = new StringBuilder();
	        
	        //for (char c : set) {
	        	
	          // sb.append(c);
	            
	        //}
	        
	        //result = sb.toString();
	        return sb.toString();
	       // return set.toString();
	       
	}
	
	//main method to test the example Strings
	public static void main(String[] args){
		
		Pangram test = new Pangram();
		
		System.out.println(test.listMissingLetters("A quick brown fox jumps over the lazy dog"));
		System.out.println(test.listMissingLetters("Four score and seven years ago."));
		System.out.println(test.listMissingLetters("To be or not to be, that is the question!"));
        System.out.println(test.listMissingLetters(""));
        System.out.println(" ".isEmpty());
        System.out.println(" ".length()==1);
        
    }
	
	
}


