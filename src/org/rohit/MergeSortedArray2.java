package org.rohit;
//O(n+m) time and O(n+m) space
import java.util.Arrays;

public class MergeSortedArray2 {
	
	public int[] merge(int[] num1, int[] num2){
		
		if(num1==null||num2==null){
			
			return new int[]{};
		}
		int i=num1.length-1, j=num2.length-1, k=num1.length+num2.length-1;
		int[] num3 = new int[num1.length+num2.length];
		
		
	    while(i>-1 && j>-1){
	    	
	    	if(num1[i]>num2[j]){
	    		
	    		num3[k] = num1[i];
	    		k--;i--;
	    	}
	    	
	    	else{
	    		
	    		num3[k] = num2[j];
	    		k--;j--;
	    	}
	    }
	    
	    while(j>-1){
	    	
	    	num3[k]=num2[j];
	    	k--;j--;
	    }
	    
	    while(i>-1){
	    	
	    	num3[k]=num1[i];
	    	k--;i--;
	    }
	    
	    //System.out.println(Arrays.toString(num3));
	    return num3;
	}
	
	public static void main(String[] args){
		
		MergeSortedArray2 test = new MergeSortedArray2();
		int[] a = new int[]{1,2,3,3,4,10};
		int[] b = new int[]{3,4,5,6,7,8,9,9};
		System.out.println(Arrays.toString(test.merge(a,b)));
		int[] a1 = new int[]{5,6,7,8,9,10};
		int[] b1 = new int[]{3,4,5,6,7,8,9,9};
		System.out.println(Arrays.toString(test.merge(a1,b1)));
		
		int[] a2 = new int[]{5,6,7,8,9,10};
		int[] b2 = new int[]{};
		System.out.println(Arrays.toString(test.merge(a2,b2)));
		
		int[] a3 = new int[]{5,6,7,8,9,10};
		int[] b3 = null;
		System.out.println(Arrays.toString(test.merge(a3,b3)));
	}

}
