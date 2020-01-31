package org.rohit;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestPallindrome {
	
	public int longest(String s){
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		int result = 0;
		int count = 0;
		
		for(int i=0; i<s.length(); i++){
			
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(char c:map.keySet()){
			
			if(map.get(c)%2==0){
				
				result += map.get(c)/2; 
			}
			
			else{
				
				result += map.get(c)/2;
				count++;
			}
		}
		
		result = result*2;
		
		if(count>0){
			result += 1;
		}
		
		return result;
		
	}
	
	public static void main(String[] args){
		
		LongestPallindrome test = new LongestPallindrome();
		System.out.println(test.longest("abccccdd"));
		System.out.println(test.longest("abcccdd"));
		System.out.println(test.longest("aaaaabbb"));
	}

}
