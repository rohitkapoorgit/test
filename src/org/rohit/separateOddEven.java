package org.rohit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class separateOddEven {
	
	public int[] separate(int[] array){
		
		List<Integer> odd = new LinkedList<Integer>();
		List<Integer> even = new LinkedList<Integer>();
		
		for(int i=0; i<array.length;i++){
			
			if(array[i]%2 == 0){
				
				even.add(array[i]);
			}
			
			else{
				
				odd.add(array[i]);
			}
		}
		
		int k = 0;
		for(int i=0;i<array.length;i+=2){
			
			array[i] = odd.get(k);
			array[i+1] = even.get(k);
			k++;
			
		}
		
		return array;
		
	}
	
	public static void main(String[] args){
		
		separateOddEven test = new separateOddEven();
		int[] a = {2,5,6,8,3,5,4,1};
		System.out.println(Arrays.toString(test.separate(a)));
		
	}

}
