package org.rohit;
//O(n2) time complexity
public class LargestSubStringPall2 {
	
	public String longestPalindrome(String s) {
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	}

	public int expandAroundCenter(String s, int left, int right) {
	    //int L = left, R = right;
	    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	        left--;
	        right++;
	    }
	    return right - left - 1;
	}
	
	public static void main(String[] args){
		
		LargestSubStringPall2 test = new LargestSubStringPall2();
		System.out.println(test.longestPalindrome("HYABCDEFEDCBADEDCBAGHTFYW1234554321ZWETYGDE"));
		System.out.println(test.longestPalindrome("abcdef"));
		System.out.println(test.longestPalindrome("a"));
	}

}
