package org.rohit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public boolean match(String s){
		
		//Pattern p = Pattern.compile("\\d{5}(-?\\d{4})?");
		Pattern p = Pattern.compile("\\d{5}-?(\\d{4})?");
		Matcher m = p.matcher(s);
		
		return m.matches();
	}
	
	public String match1(String s){
		
		Pattern p = Pattern.compile("\\.*");
		Matcher m = p.matcher(s);
		
		while(m.find()){
			
			s = s.replaceAll("\\.*","");
		}
		return s;
	}
	
	public String match2(String s){
				
		s = s.replaceAll("-*","");
		return s;
	}
	
	public String matchDup(String s){
		
		Pattern p = Pattern.compile("\\b(\\w+)\\b(\\s+\\b\\1\\b)*",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		while(m.find()){
			
			s = s.replaceAll(m.group(0), m.group(1));
		}
		return s;
	}
	
	public static void main(String[] args){
		
		Regex test = new Regex();
		String a = "12345-1234";
		System.out.println(test.match(a));
		String b = "123451234";
		System.out.println(test.match(b));
		String c = "12345";
		System.out.println(test.match(c));
		System.out.println(test.matchDup("My name name name is rk RK Rk"));
		System.out.println(test.match1("abcen wdc.dchj wej.d.s "));
		System.out.println(test.match2("abcen - wdc-dchj wej.d -s "));
	}


}
