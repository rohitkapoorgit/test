package org.rohit;

public class AddBinaryAsString {
	
	public String addBin(String a, String b){
		
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		StringBuilder s = new StringBuilder();
		while(i>=0 || j>=0){
			
			int sum = 0;
			if(i>=0){
				
				sum = sum + (a.charAt(i)-'0') + carry;
				i--;
			}
			
			if(j>=0){
				
				sum = sum + (b.charAt(j)-'0') + carry;
				j--;
			
			}
			
			s.append(sum%2);
			carry = sum/2;
			
		}
		
		if(carry!=0){
			
			s.append(carry);
		}
		
		return s.reverse().toString();
	}
	
	
	public static void main(String[] args){
		
		AddBinaryAsString test = new AddBinaryAsString();
		System.out.println(test.addBin("11","1"));
	}

}
