package org.rohit;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//import java.util.NavigableMap;
//import java.util.TreeMap;

public class CharacterOccurrence {
	
	public String[] occurrence(String s){
		
		//s = s.replaceAll("\\s+", "");
		s = s.replaceAll("[^a-zA-Z0-9]","");
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(int i=0; i<s.length(); i++){
			
			char a = s.charAt(i);
			if(map.containsKey(a)){
				
				map.put(a, map.get(a)+1);
			
			}
			
			else{
				
				map.put(a, 1);
			}
			
		}
		
		//NavigableMap<Character,Integer> revMap = new TreeMap<Character,Integer>(map);
		int max = Collections.max(map.values());
		
		List<String> list = new LinkedList<String>();
		List<String> finalList = new LinkedList<String>();
		for(Map.Entry<Character,Integer> j:map.entrySet()){
			
			if(j.getValue()>=max){
				
				list.clear();
				//max = j.getValue();
				list.add(j.getKey().toString() + " occurs");
				list.add(String.valueOf(j.getValue()) + " times");
				StringBuilder sb = new StringBuilder();
				for (String c : list) {
		        	
		            sb.append(c).append(" ");
		            
		        }
		        
		        finalList.add(sb.toString());
				
			}
			
			
		}
		
		String[] stringArray = finalList.toArray(new String[0]);
		return stringArray;
	}
	
	public static void main(String[] args){
		
		CharacterOccurrence test = new CharacterOccurrence();
		for(String str : test.occurrence("avf!!!!!tg tye!uti  optef* "))
			System.out.println(str);
		System.out.println("-----------------------------");
		for(String str : test.occurrence("aeftg tyeeti  optef "))
			System.out.println(str);
		System.out.println("-----------------------------");
		for(String str : test.occurrence("Dog is an animal "))
			System.out.println(str);
		
	}

}
