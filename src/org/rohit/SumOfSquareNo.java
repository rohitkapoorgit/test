package org.rohit;
//https://leetcode.com/problems/sum-of-square-numbers/solution/
//We are finding if b is a perfect square
public class SumOfSquareNo {
	
	public boolean sumOfSq(int c){
		
		for(long a=0; a*a<=c;a++){
			
			double b = Math.sqrt(c-a*a);
			if(b == (int)(b)){
				
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		
		SumOfSquareNo test = new SumOfSquareNo();
		System.out.println(test.sumOfSq(5));
		System.out.println(test.sumOfSq(9));
		System.out.println(test.sumOfSq(6));
		System.out.println(test.sumOfSq(0));
	}

}
