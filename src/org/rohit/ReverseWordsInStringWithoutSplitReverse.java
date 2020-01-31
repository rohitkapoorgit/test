package org.rohit;

public class ReverseWordsInStringWithoutSplitReverse {
	
	public String revString(String a){
		
		StringBuilder s = new StringBuilder();
		StringBuilder out = new StringBuilder();
		a = a.trim();
		for(int i=0;i<a.length();i++){
			
			if(a.charAt(i) != ' '){
				
				s.append(a.charAt(i));
			}
			
			else{
				
				while(i<a.length() && a.charAt(i)==' '){
					i++;
				}
				i--;
				
				String sRev = reverse(s.toString());
				out.append(sRev).append(" ");
				s = new StringBuilder();
			}
		}
		
		String sRev = reverse(s.toString());
		out.append(sRev);
		return out.toString().trim();
	}
	
	public String reverse(String inp){
		
		StringBuilder r = new StringBuilder();
		for(int j=inp.length()-1;j>=0;j--){
			
			r.append(inp.charAt(j));
		}
		
		return r.toString();
	}
	
	public static void main(String[] args){
		
		ReverseWordsInStringWithoutSplitReverse test = new ReverseWordsInStringWithoutSplitReverse();
		String x = "Let's take     LeetCode contest";
		System.out.println(test.revString(x));
		
		String y = "rohit";
		System.out.println(test.revString(y));
		System.out.println(test.revString("Let's take LeetCode contest"));
		System.out.println(test.revString(" Let's take LeetCode  contest "));
	}


}
