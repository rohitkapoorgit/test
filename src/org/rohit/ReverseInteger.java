package org.rohit;

public class ReverseInteger {
	
	public int reverse(int n){
		
		int result = 0;
		int temp = 0;
		
		while(n != 0){
			
			temp =  n%10;
			result = result*10 + temp;
			n = n/10;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		
		ReverseInteger test = new ReverseInteger();
		System.out.println(test.reverse(-462));
		System.out.println(test.reverse(462));
		System.out.println(test.reverse(0));
		System.out.println(test.reverse(6));
		
	}

}
