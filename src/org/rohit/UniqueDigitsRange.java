package org.rohit;

public class UniqueDigitsRange {
	
	public int countUnique(int n){
		
		int count = 0;
		
		for(int i=0; i<Math.pow(10, n); i++){
			
			if(unique(i)){
				
				count++;
			}
			
		}
		
		return count;
	}
	
	public boolean unique(int number){
		
		boolean[] flag = new boolean[10];
		while(number > 0){
			
			int a = number%10;
			if(flag[a]){
				
				return false;
			}
			
			flag[a] = true;
			number = number/10;
			
		}
		
		return true;
	}
	
	public static void main(String[] args){
		
		UniqueDigitsRange test = new UniqueDigitsRange();
		System.out.println(test.countUnique(2));
	}

}
