package org.rohit;

import java.util.LinkedHashSet;
import java.util.Set;
//This can be used to find length of longest substring without repetition
public class LongestSubWithoutRep {
	
	public String longestSub(String s){
		
		char[] charArray = s.toCharArray();
		String longest = "";
		String finalLongest = "";
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<charArray.length;i++){
			
			if(set.contains(charArray[i])){
				
				set.clear();
				longest = "";
			}
			
			set.add(charArray[i]);
			longest = longest + charArray[i];
			if(longest.length()>finalLongest.length()){
				
				finalLongest = longest;
			}
			
		}
		
		return finalLongest;
	}
	
	public static void main(String[] args){
		
		LongestSubWithoutRep test = new LongestSubWithoutRep();
		System.out.println(test.longestSub("abcabcbb"));
		System.out.println(test.longestSub("abcabcbwrwtsrer"));
		
	}

}
