package org.rohit;

import java.util.Arrays;
//This has 2 scenarios. Commented one is to find number of non-dup's in array.
public class RemoveDup {
	       //int
	public int[] removeDuplicate(int[] a){
		
		int j = 0;
		for(int i=1;i<a.length;i++){
			
			if(a[i]!=a[j]){
				
				a[++j] = a[i];
				
			}
		}
		
		
		//return ++j;
		return Arrays.copyOfRange(a, 0, j+1);
	}
	
	public static void main(String[] args){
		
		RemoveDup test = new RemoveDup();
		int[] a = new int[]{1,2,3,3,3,4,4,6};
		//System.out.println(test.removeDuplicate(a));
		System.out.println(Arrays.toString(test.removeDuplicate(a)));
		int[] b = {1};
		//System.out.println(test.removeDuplicate(a));
		System.out.println(Arrays.toString(test.removeDuplicate(b)));
	}

}
