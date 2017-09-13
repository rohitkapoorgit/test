package org.rohit;
//Other methods - http://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
import java.util.Arrays;

public class FirstMissingPositive {
	
	public int firstMissingPositive(int[] a){
		
		int start = arrange(a);
		//int[] posArray = Arrays.copyOfRange(a, start, a.length);
		//Instead of using another array, we change the original array to remove
		//-ve numbers
		a = Arrays.copyOfRange(a, start, a.length);
		for(int k=0; k<a.length;k++){
			
			if(Math.abs(a[k])-1 < a.length && a[Math.abs(a[k])-1]>0){
				
				a[Math.abs(a[k])-1] = -a[Math.abs(a[k])-1];
				
			}
		}
		
		for(int k=0;k<a.length;k++){
			
			if(a[k]>0){
				
				return k+1;
			}
		}
		
		return -1;
	}
	
	public int arrange(int[] b){
		int j = 0;
		for(int i=0;i<b.length;i++){
			
			if(b[i]<=0){
				
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
		int[] array1 = {-1,-5,-2,-8,-4,-6,-8,-9,-5,-3};
		System.out.println(String.valueOf(test.firstMissingPositive(array1)));
		int[] array2 = {};
		System.out.println(String.valueOf(test.firstMissingPositive(array2)));
		
		int[] array3 = {1,5,2,8,4,-6,-8,9,5,3,0};
		System.out.println(String.valueOf(test.firstMissingPositive(array3)));
		
		int[] array4 = {3};
		System.out.println(String.valueOf(test.firstMissingPositive(array4)));
	}

}
