package org.rohit;

import java.util.Arrays;

public class NextGreaterElementCircular1 {
	
	public int[] nextGreater(int[] a){
		
		int l = a.length;
		int[] r = new int[l];
		int count;
		int j;
		for(int i=0;i<l;i++){
			j=i+1;
			if(j==l){
				j=0;
			}
			r[i] = -1;
			count = 1;
			while(count<l){
				
				if(a[j]>a[i]){
					
					r[i]=a[j];
					break;
				}
				
				else{
					
					if(j==l-1){
						j=0;
					}
					else{
						j++;
					}
					
					count++;
				}
				
			}
			
		}
		
		return r;
	}
	
	public static void main(String[] args){
		
		NextGreaterElementCircular1 test = new NextGreaterElementCircular1();
		int[] inp = {1,2,1,3,2};
		System.out.println(Arrays.toString(test.nextGreater(inp)));
	}

}
