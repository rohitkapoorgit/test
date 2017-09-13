package org.rohit;
//can do directly as well
public class DecToBinary {
	
	public String decToBin(int n){
		
		//return Integer.toString(n,2);
		
		StringBuilder s = new StringBuilder();
		while(n!=0){
			
			s.append(n%2);
			n = n/2;
		}
		
		return s.reverse().toString();
	}
	
	public static void main(String[] args){
		
		DecToBinary test = new DecToBinary();
		
		System.out.println(test.decToBin(8));
		System.out.println(test.decToBin(0));
		
	}

}
