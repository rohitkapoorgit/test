package org.rohit;

public class AppendMinCharsAtBegToMakeStringPall {
	
	public String makePallindrome(String s){
		
		boolean flag;
		StringBuilder r = new StringBuilder();
		for(int i=s.length();i>=0;i--){
			
			flag = pallindrome(s.substring(0, i));
			if(!flag){
				
				r.append(s.charAt(i-1));
			}
			
			else{
				
				break;
			}
		}
		
//		return r.toString() + s;
		return r.toString();
	}
	
	public boolean pallindrome(String a){
		
		StringBuilder sb = new StringBuilder(a);
		return a.equals(sb.reverse().toString());
	}
	
	public static void main(String[] args){
		
		AppendMinCharsAtBegToMakeStringPall test = new AppendMinCharsAtBegToMakeStringPall();
		System.out.println(test.makePallindrome("aacecaaa"));
		System.out.println(test.makePallindrome("abcd"));
		System.out.println(test.makePallindrome("madam"));
		//System.out.println(test.makePallindrome(null));
		System.out.println(test.makePallindrome("a"));
		
	}

}
