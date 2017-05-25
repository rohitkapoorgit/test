package org.rohit;

import java.util.Arrays;

public class permutationString2 {
	
	public boolean permString(String s1,String s2){
		
		s1 = sort(s1);
		for(int i=0;i<s2.length()-s1.length();i++){
			
			String temp = s2.substring(i, i+s1.length());
			temp = sort(temp);
			if(s1.equals(temp))
				return true;
			
		}
		
		return false;
	}
	
	public String sort(String a){
		
		char[] c = a.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	 public static void main(String[] args){
			
		 permutationString2 test = new permutationString2();
	    	String s1="acb";
	    	String s2= "eidbacooo";
			
			System.out.println(test.permString(s1,s2));
		}


}
