package org.rohit;
//Can do both max length or max substring
import java.util.HashMap;

public class LongestSubstringLengthWithoutRep {

	//public int lengthOfLongestSubstring(String s) {
	public String lengthOfLongestSubstring(String s) {
        if (s.length()==0) return "";
        int start=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        int j=0;
        for (int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                //j = Math.max(j,map.get(s.charAt(i))+1);
            	j=map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i),i);
            //max = Math.max(max,i-j+1);
            if(i-j+1>max){
            	
            	max = i-j+1;
            	start=j;
            }
        }
        //return max;
        return s.substring(start, start+max);
    }
	
	public static void main(String[] args){
		
		LongestSubstringLengthWithoutRep test = new LongestSubstringLengthWithoutRep();
				
		System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(test.lengthOfLongestSubstring("abcbcde"));
		System.out.println(test.lengthOfLongestSubstring("a"));
		
	}
}
