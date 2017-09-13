package org.rohit;

public class RotatedBinarySearch {
	
	public int binSearch(int[] a, int target){
		
		int beg = 0;
		int end = a.length-1;
		int mid;
		while(beg<=end){
			
			mid = (beg+end)/2;
			if(a[mid] ==target){
				
				return mid;
			}
			
			else if(a[mid]>=a[beg]){
				
				if(target>=a[beg] && target<a[mid]){
					
					end = mid-1;
				}
				
				else{
					
					beg = mid+1;
				}
				
			}
			
			else if(a[mid]<=a[end]){
				
				if(target>a[mid] && target<=a[end]){
					
					beg = mid+1;
				}
				
				else{
					
					end = mid-1;
				}
				
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		
		RotatedBinarySearch test = new RotatedBinarySearch();
		int[] array = {9,12,15,-4,-2,5,7,8};
		System.out.println(test.binSearch(array, -4));
		
		int[] array1 = {5};
		System.out.println(test.binSearch(array1, 5));
		
		int[] array2 = {5};
		System.out.println(test.binSearch(array2, 6));
		
		int[] array3 = {2,4,5,7,8,10,12};
		System.out.println(test.binSearch(array3, 5));
	}

}
