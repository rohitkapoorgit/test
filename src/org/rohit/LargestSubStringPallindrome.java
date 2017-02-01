package org.rohit;

public class LargestSubStringPallindrome {
	
	public String larPallin(String s){
		
		String longestPallindrome = "";
		for(int i=0;i<s.length()-1;i++){
			
			for(int j=i+1;j<s.length();j++){
				
				String sub = s.substring(i,j);
				if(pallindrome(sub) && sub.length()> longestPallindrome.length()){
					
					longestPallindrome = sub;
					
				}
			}
		}
		
		return longestPallindrome;
	}
	
	public boolean pallindrome(String act){
		
		StringBuffer build = new StringBuffer();
		return act.equals(build.append(act).reverse().toString());
		
	}
	
	public static void main(String[] args){
		
		LargestSubStringPallindrome test = new LargestSubStringPallindrome();
		System.out.println(test.larPallin("HYABCDEFFEDCBADEDCBAGHTFYW1234554321ZWETYGDE"));
		
	}


}
