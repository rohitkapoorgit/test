package org.rohit;

import java.util.Arrays;

public class PlusOneInArrayOfDigits {
	
	public int[] plusOne(int[] array){
		
		if(array==null || array.length==0){
			
			return new int[]{};
		}
		int length = array.length;
		for(int i=length-1; i>=0;i--){
			
			if(array[i]<9){
				
				array[i]++;
				return array;
			}
			
			array[i] = 0;
		}
		
		int[] number = new int[length+1];
		number[0] = 1;
		return number;
		
	}
	
	public static void main(String[] args){
		
		PlusOneInArrayOfDigits test = new PlusOneInArrayOfDigits();
		int[] a = {9,9,9,9};
		System.out.println(Arrays.toString(test.plusOne(a)));
		int[] b = null;
		System.out.println(Arrays.toString(test.plusOne(b)));
		int[] c = {9};
		System.out.println(Arrays.toString(test.plusOne(c)));
	}


}
