package org.rohit;

public class Divide2Int {
	
	public int divide(int dividend, int divisor){
		
		int i=0;
		int j=1;
		if(dividend<0){
			j = -1*j;
		}
		
		if(divisor<0){
			j = -1*j;
		}
		
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		
		while(dividend>divisor){
			
			i++;
			dividend = dividend-divisor;
		}
		
		return i*j;
	}
	
	public static void main(String[] args){
		
		Divide2Int test = new Divide2Int();
		System.out.println(test.divide(7,-3));
	}


}
