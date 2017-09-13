package org.rohit;
//O(n+m)
import java.util.Arrays;

public class MergeSortedArray {
	
	public void merge(int[] num1, int m, int[] num2, int n){
		
		int i=m-1, j=n-1, k=m+n-1;
		
	    while(i>-1 && j>-1){
	    	
	    	if(num1[i]>num2[j]){
	    		
	    		num1[k] = num1[i];
	    		k--;i--;
	    	}
	    	
	    	else{
	    		
	    		num1[k] = num2[j];
	    		k--;j--;
	    	}
	    }
	    
	    while(j>-1){
	    	
	    	num1[k]=num2[j];
	    	k--;j--;
	    }
	    
	    System.out.println(Arrays.toString(num1));
	}
	
	public static void main(String[] args){
		
		MergeSortedArray test = new MergeSortedArray();
		int[] a = new int[]{1,2,3,3,4,10,0,0,0,0,0,0,0,0};
		int[] b = new int[]{3,4,5,6,7,8,9,9};
		test.merge(a,6,b,8);
		int[] a1 = new int[]{5,6,7,8,9,10,0,0,0,0,0,0,0,0};
		int[] b1 = new int[]{3,4,5,6,7,8,9,9};
		test.merge(a1,6,b1,8);
	}

}
