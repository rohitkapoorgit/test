package org.rohit;

//This is to find if one string 1 can be constructed from string 2
public class RansomNote {
	
	public boolean val(String s1, String s2){
		
		int[] arr = new int[26];
		
		for(int i=0; i<s2.length(); i++){
			
			arr[s2.charAt(i) - 'a']++;
		}
		
		for(int i=0; i<s1.length(); i++){
			
			arr[s1.charAt(i) - 'a']--;
			
			if(arr[s1.charAt(i) - 'a'] < 0){
				
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args){
		
		RansomNote test = new RansomNote();
		System.out.println(test.val("a", "b"));
		System.out.println(test.val("aa", "ab"));
		System.out.println(test.val("aa", "baa"));
		System.out.println(test.val("aab", "ab"));
		System.out.println(test.val("aab", "baa"));
		
	}

}
