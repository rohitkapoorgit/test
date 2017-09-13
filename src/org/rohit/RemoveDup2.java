package org.rohit;

import java.util.Arrays;
//This has 2 scenarios. Commented one is to find number of non-dup's in array.
//Max 2 dups allowed
public class RemoveDup2 {
	       //int
	public int[] removeDuplicate(int[] a){
		
		int j = 1;
		for(int i=2;i<a.length;i++){
			
			if(a[i]!=a[j] || a[i]!=a[j-1]){
				
				a[++j] = a[i];
				
			}
		}
		
		
		//return ++j;
		return Arrays.copyOfRange(a, 0, j+1);
	}
	
	public static void main(String[] args){
		
		RemoveDup2 test = new RemoveDup2();
		int[] a = new int[]{1,2,3,3,3,4,4,6};
		//System.out.println(test.removeDuplicate(a));
		System.out.println(Arrays.toString(test.removeDuplicate(a)));
		int[] b = new int[]{1,1,1,2,2,2,2,3,3,3,4,4,5,8};
		System.out.println(Arrays.toString(test.removeDuplicate(b)));
		
		int[] c = {1};//Handle in the code for length=1
		System.out.println(Arrays.toString(test.removeDuplicate(c)));
	}

}
