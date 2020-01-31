package org.rohit;
//Also look at Single number program in leet code

public class Pallindrome {
	
	public boolean isPalindrome(String s) {
	        
	        if(s==null){
	            return false;
	        }
	        s = s.toLowerCase();
	        
	        int l = 0;
	        int r = s.length()-1;
	        while(l<r){
	            
	            while(l<r && !((s.charAt(l)>='a'&&s.charAt(l)<='z') || (s.charAt(l)>='0'&&s.charAt(l)<='9'))){
	                
	                l++;
	            }
	            while(l<r && !((s.charAt(r)>='a'&&s.charAt(r)<='z') || (s.charAt(r)>='0'&&s.charAt(r)<='9'))){
	                
	                r--;
	            }
	            
	            if(s.charAt(l)!=s.charAt(r)){
	                
	                return false;
	            }
	            l++;
	            r--;
	        }
	        
	        return true;
	        
	}

	public static void main(String[] args){
	
		Pallindrome test = new Pallindrome();
		String s = "A man, a plan, a canal: Panama";
		System.out.println(test.isPalindrome(s));
		System.out.println(test.isPalindrome("     "));
		System.out.println(test.isPalindrome("     a"));
		System.out.println(test.isPalindrome("     c    c     "));
		
	}

}
