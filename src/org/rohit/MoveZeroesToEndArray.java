package org.rohit;

import java.util.Arrays;

public class MoveZeroesToEndArray {
	
	public int[] move(int[] arr){
		
		int start = 0;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]!=0){
				
				swap(start,i,arr);
				start++;
			}
		}
		
		return arr;
		
	}
		
	public void swap(int x, int y, int[]arr){
			
			int tmp;
			tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;
	}
	
	public static void main(String[] args){
		
		MoveZeroesToEndArray test = new MoveZeroesToEndArray();
		int[] arr = {0,1,0,3,12};
		System.out.println(Arrays.toString(test.move(arr)));
		int[] arr1 = {1,0,3,12};
		System.out.println(Arrays.toString(test.move(arr1)));
	}	

}
