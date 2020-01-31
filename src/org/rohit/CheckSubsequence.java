package org.rohit;

public class CheckSubsequence {
	
	public boolean subseq(String a, String b){
		
		int j = 0;
		for(int i=0; i<b.length() && j<a.length(); i++){
			
			if(a.charAt(j) == b.charAt(i)){
				
				j++;
			}
		}
		
		return j==a.length();
	}
	
	public static void main(String[] args){
		
		CheckSubsequence test = new CheckSubsequence();
		System.out.println(test.subseq("gksrek", "geeksforgeeks"));
		System.out.println(test.subseq("abc", "ahbgdc"));
		System.out.println(test.subseq("axc", "ahbgdc"));
		System.out.println(test.subseq("abc", "ahbg"));
		
	}

}
