package org.rohit;

//Integer.toString(n,2)  //decimal to binary
public class binaryPrime {
	
	public boolean binaryIsPrime(String s){
		
		boolean isBoolean = true;
		int decimal = Integer.parseInt(s,2);
		if(decimal == 1 || decimal == 0 ){
			
			isBoolean = false;
			
		}
		for(int i=2; i<=decimal/2; i++){
			
			if(decimal%i==0){
				
				isBoolean = false;
				break;
				
			}
		}
		
		return isBoolean;
	}
	
	public static void main(String[] args){
		
		binaryPrime test = new binaryPrime();
		if(test.binaryIsPrime("1001")){
			
			System.out.println("This is Prime");
			
		}
		
		else{
			
			System.out.println("This is Not Prime");
			
		}
		
	}

}
