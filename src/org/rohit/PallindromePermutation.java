package org.rohit;

import java.util.LinkedHashMap;
import java.util.Map;

public class PallindromePermutation {
	
	public boolean checkForPallindromePerm(String s){
		
		Map<Character,Integer> m = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			
			if(m.containsKey(s.charAt(i))){
				
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
			}
			
			else{
				
				m.put(s.charAt(i),1);
			}
		}
		
		int count = 0;
		for(char c:m.keySet()){
			
			if(m.get(c)%2==1){
				
				count+=1;
			}
		}
		
		return count<=1;
	}
	
	 public static void main(String[] args){
			
		 PallindromePermutation test = new PallindromePermutation();
	     String s="carerac";
		 System.out.println(test.checkForPallindromePerm(s));
	}


}
