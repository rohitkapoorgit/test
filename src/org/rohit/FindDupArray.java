package org.rohit;

import java.util.ArrayList;
import java.util.List;

//1 ≤ a[i] ≤ n (n = size of array)
//some elements appear twice and others appear once
//O(n) time and O(1) space
public class FindDupArray {
	
	public List<Integer> dup(int[] arr){
		
		List<Integer> res = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++){
			//No need to check the 1st condition since it is given
			if(Math.abs(arr[i])<=arr.length && arr[Math.abs(arr[i])-1]>0){
				
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			}
			
			else{
				
				res.add(Math.abs(arr[i]));
			}
			
		}
		
		return res;
	}
	
	public static void main(String[] args){
		
		FindDupArray test = new FindDupArray();
		int[] array = {4,3,2,7,8,2,3,1};
		System.out.println(String.valueOf(test.dup(array)));
		int[] array1 = {4,2,5,6,2,3,1};
		System.out.println(String.valueOf(test.dup(array1)));
	}

}
