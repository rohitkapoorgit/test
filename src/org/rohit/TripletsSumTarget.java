package org.rohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSumTarget {
	
	public List<List<Integer>> tripletSum(int[] array, int Sum){
		
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(array);
		for(int i=0; i<array.length-2; i++){
			
			if(i>0 && array[i] == array[i-1]){
				continue;
			}
			
			int target = Sum-array[i];
			int j = i+1;
			int k = array.length-1;
			while(j<k){
				
				int temp = array[j] + array[k];
				if(temp == target){
					
					result.add(Arrays.asList(array[i],array[j],array[k]));
					j++;
					k--;
					while(array[j] == array[j-1] && j<k){
						
						j++;
					}
					while(array[k] == array[k+1] && j<k){
						
						k--;
					}
					
				}
				
				else if(temp > target){
					
					k--;
				}
				
				else if(temp<target){
					
					j++;
				}
				
			}
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args){
		
		TripletsSumTarget test = new TripletsSumTarget();
		int[] a = {1,4,2,3,6,8,4,6,5,1};
		System.out.println(test.tripletSum(a, 8));
	}

}
