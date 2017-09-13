package org.rohit;

public class Temp {
	
	public void practice(String s){
		
		int[] a = new int[26];
		char[] b = new char[26];
		int[] c = new int[128];
		char[] d = new char[128];
		
		//Storing
		for(int i=0;i<s.length();i++){
			
			a[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s.length();i++){
			
			b[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s.length();i++){
			
			c[s.charAt(i)]++;
		}
		
		for(int i=0;i<s.length();i++){
			
			d[s.charAt(i)]++;
		}
		
		//Accessing
		for(int i=0;i<s.length();i++){
			
			System.out.println(b[s.charAt(i)-'a']);
		}
		
		for(int i=0;i<s.length();i++){
			
			System.out.println(d[s.charAt(i)]);
		}
		
		for(int i=0;i<s.length();i++){
			
			System.out.println(c[s.charAt(i)]);
		}
	}
	
	public static void main(String[] args){
		
		Temp test = new Temp();
		test.practice("abcde");
		
	}

}
