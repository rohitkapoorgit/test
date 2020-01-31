package org.rohit;
//Can do one by one - http://www.geeksforgeeks.org/array-rotation/
//This would have O(n*k)
//Below is O(n)
import java.util.Arrays;

//For right rotation
//Original List                   : 1 2 3 4 5 6 7
//After reversing all numbers     : 7 6 5 4 3 2 1
//After reversing first k numbers : 5 6 7 4 3 2 1
//After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
//For left rotation
//Original List                   : 1 2 3 4 5 6 7
//After reversing all numbers     : 7 6 5 4 3 2 1
//After reversing first n-k numbers : 4 5 6 7 3 2 1
//After revering last k numbers : 4 5 6 7 1 2 3 --> Result
public class RotateArray {
	
	public int[] rotateArrayRight(int[] a, int k){
		
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		return a;
	}
	
	public void reverse(int[] a,int start, int end){
		
		while(start<=end){
			
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args){
		
		RotateArray test = new RotateArray();
		int[] array = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(test.rotateArrayRight(array,3)));
		
		//The above approach won't work for arrays whose length is less than k, like the below 2 examples
		//But we can check if length is less than k. If yes, we do k = k - length
		//So in this case, k = 3 - 2 = 1 
		int[] array1 = {1,2};
		System.out.println(Arrays.toString(test.rotateArrayRight(array1,3)));
		
		//We can check if length is 1, return same array, as there will be no affect.
		int[] array2 = {1};
		System.out.println(Arrays.toString(test.rotateArrayRight(array2,3)));
	}


}
