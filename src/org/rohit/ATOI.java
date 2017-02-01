package org.rohit;

public class ATOI {
	
	public int atoi(String s){
		
		int result = 0;
	     for (int i =0; i < s.length(); i++){
	    	 
	    	 char digit = (char)(s.charAt(i)-'0');
	    	 result += (digit * Math.pow(10, (s.length() - i - 1)));

	      }
	     
	     return result;
		
	}

	public static void main(String[] args){
		
		ATOI test = new ATOI();
		System.out.println(test.atoi("4683"));
		
	}


}
