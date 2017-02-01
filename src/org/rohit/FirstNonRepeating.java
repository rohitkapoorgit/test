package org.rohit;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
	
	public String nonRepeating(String s){
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++){
			
			char a = s.charAt(i);
			if(map.containsKey(a)){
				
				map.put(a,map.get(a)+1);
			}
			
			else{
				
				map.put(a,1);
			}
			
		}
		
		boolean found = false;
		for(Map.Entry<Character,Integer> j:map.entrySet()){
			
			if(j.getValue()==1){
				
				found = true;
				return j.getKey().toString();
			}
		}
		
		if(!found){
			
			return "No non repeating";
		}
		
		return "";
		
	}
	
	public static void main(String[] args){
		
		FirstNonRepeating test = new FirstNonRepeating();
		System.out.println(test.nonRepeating("abcdpeapaecb"));
		
	}

}
