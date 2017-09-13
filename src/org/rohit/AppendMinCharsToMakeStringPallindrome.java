package org.rohit;

public class AppendMinCharsToMakeStringPallindrome {
	
	public String makePallindrome(String s){
		
		boolean flag;
		StringBuilder r = new StringBuilder();
		String result = "";
		for(int i=0;i<s.length();i++){
			
			flag = pallindrome(s.substring(i, s.length()));
			if(!flag){
				
				r.append(s.charAt(i));
			}
			
			else{
				
				break;
			}
			
		}
		
		result = s + r.reverse().toString();
		return result;
	}
	
	public boolean pallindrome(String a){
		
		StringBuilder sb = new StringBuilder(a);
		return a.equals(sb.reverse().toString());
	}
	
	public static void main(String[] args){
		
		AppendMinCharsToMakeStringPallindrome test = new AppendMinCharsToMakeStringPallindrome();
		System.out.println(test.makePallindrome("lambada"));
		System.out.println(test.makePallindrome("abede"));
		System.out.println(test.makePallindrome("aabb"));
		System.out.println(test.makePallindrome("abc"));
		System.out.println(test.makePallindrome("madam"));
		System.out.println(test.makePallindrome("v"));
		
	}

}
