package org.rohit;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] stringArray){
		
		Arrays.sort(stringArray);
		StringBuilder result = new StringBuilder();
		char[] a = stringArray[0].toCharArray();
		char[] b = stringArray[stringArray.length-1].toCharArray();
		
		for (int i = 0; i < a.length; i ++){
			
            if (a[i] == b[i]){
            	
                result.append(a[i]);
            }
            else {
                break;
            }
            
        }
		
		return result.toString();
	}
	
	public static void main(String[] args){
		
		LongestCommonPrefix test = new LongestCommonPrefix();
		String[] input = {"geeksforgeeks", "geeks", "geebeturn","geek"};
		System.out.println(test.longestCommonPrefix(input));
	}

}