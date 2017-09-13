package org.rohit;

public class CountSayString {
	
	public String countAndSay(String s){
		
		int count=1;
		int i;
		StringBuilder sb = new StringBuilder();
		StringBuilder sbFinal = new StringBuilder();
		for(i=0;i<s.length()-1;i++){
			
			if(s.charAt(i)==s.charAt(i+1)){
				
				count++;
			}
			
			else{
				
				sb.append(s.charAt(i)).append(count);
				sbFinal.append(sb);
				count=1;
				sb = new StringBuilder();
			}
		}
		//sb.append(s.charAt(i)).append(count);
		//sbFinal.append(sb);
		sbFinal.append(s.charAt(i)).append(count);
		return sbFinal.toString();
	}
	
	public static void main(String[] args){
		
		CountSayString test = new CountSayString();
		System.out.println(test.countAndSay("aabbbcddbdddzs"));
		System.out.println(test.countAndSay("d"));
	}


}
