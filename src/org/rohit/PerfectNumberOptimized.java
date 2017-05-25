package org.rohit;

public class PerfectNumberOptimized {
	
	public boolean perfect(int a){
		
		int sum = 0;
		for(int i=2;i<=Math.sqrt(a);i++){
			
			if(a%i ==0){
				
				sum+=i;
				
				if(i != a/i){
					
					sum+=a/i;
				}
			}
			
		}
		
		return sum+1 == a;
	}
	
	public static void main(String[] args){
		
		PerfectNumberOptimized test = new PerfectNumberOptimized();
		System.out.println(test.perfect(28));
	}


}
