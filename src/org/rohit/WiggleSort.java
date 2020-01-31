package org.rohit;
//Depending upon sort technique, O(n2) or O(nLogn)
//Using single pass method - O(N)
import java.util.Arrays;

public class WiggleSort {
	
	//Using sorting
	public int[] wiggle(int[] arr){
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i+=2){
			
			swap(arr,i,i+1);
		}
		
		return arr;
	}
	
	//Single pass - Start with big element
	public int[] singlePassWiggle(int[] arr){
		
		for(int i=0;i<arr.length;i+=2){
			
			if(i>0 && arr[i]<arr[i-1]){
				
				swap(arr, i, i-1);
			}
			
			if(i<arr.length-1 && arr[i]<arr[i+1]){
				
				swap(arr, i, i+1);
			}
		}
		
		return arr;
	}
	
	//Single pass - start with small element
	public int[] singlePassWiggleStartWithSmallElement(int[] arr){
		
		for(int i=0;i<arr.length;i+=2){
			
			if(i>0 && arr[i]>arr[i-1]){
				
				swap(arr, i, i-1);
			}
			
			if(i<arr.length-1 && arr[i]>arr[i+1]){
				
				swap(arr, i, i+1);
			}
		}
		
		return arr;
	}

	public void swap(int[] arr, int a, int b){
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void main(String[] args){
		
		WiggleSort test = new WiggleSort();
		int[] a = {1, 5, 1, 1, 6, 4};
		System.out.println(Arrays.toString(test.wiggle(a)));
		int[] b = {10, 5, 6, 3, 2, 20, 100, 80};
		System.out.println(Arrays.toString(test.wiggle(b)));
		int[] c = {1, 5, 1, 1, 6, 4};
		System.out.println(Arrays.toString(test.singlePassWiggle(c)));
		int[] d = {10, 5, 6, 3, 2, 20, 100, 80};
		System.out.println(Arrays.toString(test.singlePassWiggle(d)));
		int[] e = {1, 5, 1, 1, 6, 4};
		System.out.println(Arrays.toString(test.singlePassWiggleStartWithSmallElement(e)));
		int[] f = {10, 5, 6, 3, 2, 20, 100, 80};
		System.out.println(Arrays.toString(test.singlePassWiggleStartWithSmallElement(f)));
	}

}
