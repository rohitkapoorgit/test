package org.rohit;

public class MaxElement_RotatedBinarySearch {
	
	public int binSearch(int[] a){
		
		int beg = 0;
		int end = a.length-1;
		int mid;
		//for removing dups
		while(a[beg]==a[end] && beg!=end){
			
			beg++;
		           
		}
		if(a[end]>a[beg]){
			
			return a[end];
		}
		if(a.length==1){
			
			return a[0];
		}
		while(beg<=end){
			
			mid = (beg+end)/2;
			if(a[mid] >a[mid+1]){
				
				return a[mid];
			}
			
			else if(a[mid]<a[mid-1]){
				
				return a[mid-1];
			}
			
			else if(a[mid]>a[beg]){
				
				beg = mid+1;
			}
			
			else if(a[mid]<a[end]){
				
				end = mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		
		MaxElement_RotatedBinarySearch test = new MaxElement_RotatedBinarySearch();
		int[] array7 = {9};
		System.out.println(test.binSearch(array7));
		int[] array = {9,12,15,1,2,4,5,7,8};
		System.out.println(test.binSearch(array));
		int[] array1 = {9,12,15,16,2,4,5};
		System.out.println(test.binSearch(array1));
		int[] array2 = {9,12,15,16};
		System.out.println(test.binSearch(array2));
		int[] array3 = {9,12,15,16,17,19,6,7};
		System.out.println(test.binSearch(array3));
		int[] array4 = {19,1,2,4,5,8,9,10,17};
		System.out.println(test.binSearch(array4));
		int[] array5 = {2,2,2,2,2,2,2,2,0,1,1,2};
		System.out.println(test.binSearch(array5));
		int[] array6 = {2,2,2,0,2,2,2,2,2,2,2,2};
		System.out.println(test.binSearch(array6));
	}

}
