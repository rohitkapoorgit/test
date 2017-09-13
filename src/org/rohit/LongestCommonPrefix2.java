package org.rohit;
//O(sum of all chars)
public class LongestCommonPrefix2 {
	
	public String longestCommonPrefix(String[] strs) {
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++){
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }
	    }
	    return prefix;
	}
	
	public static void main(String[] args){
		
		LongestCommonPrefix2 test = new LongestCommonPrefix2();
		String[] input = {"geeksforgeeks", "geks", "geebeturn","geek"};
		System.out.println(test.longestCommonPrefix(input));
	}

}
