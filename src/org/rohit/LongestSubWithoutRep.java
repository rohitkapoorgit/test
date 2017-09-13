package org.rohit;

import java.util.LinkedHashSet;
import java.util.Set;
//This can be used to find length of longest substring without repetition
//This solution is incorrect, we need to use 2 loops to find substring and then check 
//if it has all unique chars
//https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
public class LongestSubWithoutRep {
	
	public String longestSub(String s){
		
		String longest = "";
		String finalLongest = "";
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++){
			
			if(set.contains(s.charAt(i))){
				
				set.clear();
				longest = "";
			}
			
			set.add(s.charAt(i));
			longest = longest + s.charAt(i);
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
