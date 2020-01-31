package org.rohit;

import java.util.ArrayList;
import java.util.List;

//1 ≤ a[i] ≤ n (n = size of array)
//some elements appear twice and others appear once
//O(n) time and O(1) space
public class FindDisappearedNumberInArray {
	
	public List<Integer> disappeared(int[] arr){
		
		List<Integer> res = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++){
			//No need to check the 1st condition since it is given
			if(Math.abs(arr[i])<=arr.length && arr[Math.abs(arr[i])-1]>0){
				
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			}			
		}
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]>0){
				
				res.add(i+1);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args){
		
		FindDisappearedNumberInArray test = new FindDisappearedNumberInArray();
		int[] array = {4,3,2,7,8,2,3,1};
		System.out.println(String.valueOf(test.disappeared(array)));
		int[] array1 = {4,2,5,6,2,3,1};
		System.out.println(String.valueOf(test.disappeared(array1)));
	}

}
