package org.rohit;

import java.util.Arrays;

//can be done with Map, store number with count, then check in map for num between 1-n
//Below is using Constant space
public class SetMismatch {
	
	public int[] missingNumber(int[] num){
		
		int dup = -1;int missing = -1;
		for(int i=0;i<num.length;i++){
			
			if(num[Math.abs(num[i])-1]<0){
				
				dup = Math.abs(num[i]);
			}
			
			else{
				
				num[Math.abs(num[i])-1] = num[Math.abs(num[i])-1]*-1;
			}
		}
		
		for(int i=0;i<num.length;i++){
			
			if(num[i]>0){
				
				missing = i+1;
				break;
			}
		}
		
		return new int[] {dup,missing};
	}
	
	public static void main(String[] args){
		
		SetMismatch test = new SetMismatch();
		int[] array = {3,5,2,1,2};
		System.out.println(Arrays.toString(test.missingNumber(array)));
		int[] array1 = {1,2,2,4};
		System.out.println(Arrays.toString(test.missingNumber(array1)));
		int[] array2 = {1};
		System.out.println(Arrays.toString(test.missingNumber(array2)));
	}


}

