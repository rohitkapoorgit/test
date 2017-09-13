package org.rohit;

import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public boolean isomorphic(String s1, String s2){
		
		if(s1.length() != s2.length()){
			
			return false;
		}
		
		Map<Character, Character> m = new LinkedHashMap<>();

		for(int i=0;i<s1.length();i++){
			
			char a = s1.charAt(i);
			char b = s2.charAt(i);
			if(!m.containsKey(a) && !m.containsValue(b)){
				
				m.put(a, b);
			}
			
			else if(m.containsKey(a)){
				
				char val = m.get(a);
				if(val != b){
					
					return false;
				}
			}
			
			else if(m.containsValue(b) && !m.containsKey(a)){
				
				return false;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args){
		
		IsomorphicStrings test = new IsomorphicStrings();
		System.out.println(test.isomorphic("egg", "add"));
		System.out.println(test.isomorphic("foo", "bar"));
		System.out.println(test.isomorphic("paper", "title"));
		System.out.println(test.isomorphic("abbcdd", "ijjcii"));
		System.out.println(test.isomorphic("eggz", "adda"));
		System.out.println(test.isomorphic("", ""));
		System.out.println(test.isomorphic("abc", "abc"));
	}

}
