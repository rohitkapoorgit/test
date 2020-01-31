package org.rohit;
//To consider all possible cases
//http://www.programcreek.com/2012/12/leetcode-string-to-integer-atoi/
public class ATOI {
	
	public int atoi(String s){
		
		int result = 0;
	     for (int i =0; i < s.length(); i++){
	    	 
	    	 int digit = s.charAt(i)-'0';
	    	 //result += (digit * Math.pow(10, (s.length() - i - 1)));
	    	 result = result*10 + digit;

	      }
	     
	     return result;
		
	}

	public static void main(String[] args){
		
		ATOI test = new ATOI();
		System.out.println(test.atoi("483"));
		System.out.println(Integer.parseInt("100",2));
		System.out.println(Integer.parseInt("100"));
		System.out.println(Integer.toString(4,2));
		
	}


}
