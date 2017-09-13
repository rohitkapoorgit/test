package org.rohit;

public class SampleRecursionFlow_Factorial {
	
	public int factorial(int n){
		
		int result;
		if(n==0 || n==1){
			
			return 1;
		}
		
		result = n*factorial(n-1);
		return result;
	}

	public static void main(String[] args){
		
		SampleRecursionFlow_Factorial test = new SampleRecursionFlow_Factorial();
		test.factorial(6);
	}
}
