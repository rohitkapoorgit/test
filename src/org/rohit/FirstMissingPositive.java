package org.rohit;

import java.util.Arrays;

public class FirstMissingPositive {
	
	public int firstMissingPositive(int[] a){
		
		int start = arrange(a);
		int[] posArray = Arrays.copyOfRange(a, start, a.length);
		for(int k=0; k<posArray.length;k++){
			
			if(Math.abs(posArray[k])-1 < posArray.length && posArray[Math.abs(posArray[k])-1]>0){
				
				posArray[Math.abs(posArray[k])-1] = -posArray[Math.abs(posArray[k])-1];
				
			}
		}
		
		for(int k=0;k<posArray.length;k++){
			
			if(posArray[k]>0){
				
				return k+1;
			}
		}
		
		return -1;
	}
	
	public int arrange(int[] b){
		int j = 0;
		for(int i=0;i<b.length;i++){
			
			if(b[i]<0){
				
				swap(b,i,j);
				j++;
			}
		}
		
		return j;
	}
	
	public void swap(int[] act,int k,int l){
		
		int temp = act[k];
		act[k] = act[l];
		act[l] = temp;
	}
	
	public static void main(String[] args){
		
		FirstMissingPositive test = new FirstMissingPositive();
		int[] array = {1,5,2,8,4,-6,-8,9,5,3};
		System.out.println(String.valueOf(test.firstMissingPositive(array)));
	}

}
