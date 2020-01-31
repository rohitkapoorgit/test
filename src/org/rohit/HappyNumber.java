package org.rohit;

import java.util.HashSet;

public class HappyNumber{
	
	public boolean happy(int n) { 
		
		HashSet<Integer> s = new HashSet<>();
		while(n>1 && !s.contains(n)){
			
			s.add(n);
			n = getSquare(n);
		}
		
		return n==1;
        
    }
	
	public int getSquare(int a){
		
		int sum = 0;
		
		while(a>0){			
			sum+= (a%10)*(a%10);
			a = a/10;		
		}
		
		return sum;
	}
	
	public static void main(String[] args){
		
		HappyNumber test = new HappyNumber();
		System.out.println(test.happy(19));
		System.out.println(test.happy(20));
	}

}
