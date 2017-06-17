package org.rohit;

import java.util.Arrays;

public class NextPermutation {
	
	public int[] nextGreater(int[] a){
		
		int i = a.length -2;
		while(i>=0 && a[i]>a[i+1]){
			
			i--;
		}
		
		if(i>=0){
			
			int j = a.length -1;
			int diff = Integer.MAX_VALUE;
			int number = a[i];
			for(int k=i+1;k<a.length;k++){
				
				if(a[k]>number && Math.abs(a[k]-number)<diff ){
					
					diff = Math.abs(a[k]-number);
					j =k;
				}
			}
			//while(a[j]<=a[i]){
				
				//j--;
			//}
			
			swap(a,i,j);
			
		}
		
		reverse(a,i+1,a.length-1);
		return a;
							
	}
	
	public void swap(int[] act,int k,int l){
		
		int temp = act[k];
		act[k] = act[l];
		act[l] = temp;
	}
	
	public void reverse(int[] e, int x, int y){
		
		while(x<y){
			
			swap(e,x,y);
			x++;
			y--;
		}
		
	}
	
	public static void main(String[] args){
		
		NextPermutation test = new NextPermutation();
		int[] array = {8,7,6,4,7,6,3 }; //8,7,6,4,3
		System.out.println(Arrays.toString(test.nextGreater(array)));
	}

}
