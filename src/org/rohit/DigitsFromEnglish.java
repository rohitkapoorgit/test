package org.rohit;

public class DigitsFromEnglish {
	
	private static final Object[] obj = new Object[]{
            "six", 'x', 6,
            "eight", 'g', 8,
            "three", 'h', 3,
            "two", 'w', 2,
            "four", 'u', 4,
            "zero", 'z', 0,
            "one", 'o', 1,
            "five", 'f', 5,
            "seven", 's', 7,
            "nine", 'i', 9};
	
	public String convert(String s){
		
		int[] freq = new int[26];
		for(int i=0; i<s.length(); i++){
			
			freq[s.charAt(i)-'a']++;
		}
		
		int[] res = new int[10];
		
		for(int i=0; i<obj.length; i=i+3){
			
			String word = (String) obj[i];
			char c = (char) obj[i+1];
			int digit = (int) obj[i+2];
			
			int times = freq[c-'a'];
			if(times>0){
				
				for(int j: word.toCharArray()){
					
					freq[j-'a'] = freq[j-'a']-times;
				}
				
				res[digit] = times;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<=9; i++){
			
			while(res[i]>0){
				sb.append(i);
				res[i]--;
			}
			
		}
		
		return sb.toString();
		
		
	}
	
	public static void main(String[] args){
		
		DigitsFromEnglish test = new DigitsFromEnglish();
		System.out.println(test.convert("owoztneoer"));
		System.out.println(test.convert("fviefuro"));
		System.out.println(test.convert("owoztonetoerw"));
	}

}
