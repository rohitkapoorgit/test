package org.rohit;

//if target not found, beg has the index where target would be inserted in case of sorted array
public class BinarySearch {
	
	public boolean binSearch(int[] a, int target){
		
		int beg = 0;
		int end = a.length-1;
		int mid;
		boolean found = false;
		while(beg<=end){
			
			mid = (beg+end)/2;
			if(a[mid] ==target){
				
				found = true;
				return found;
			}
			
			else if(a[mid]>target){
				
				end = mid-1;
			}
			
			else if(a[mid]<target){
				
				beg = mid+1;
			}
		}
		
		return found;
	}
	
	public static void main(String[] args){
		
		BinarySearch test = new BinarySearch();
		int[] array = {2,4,5,8,9,12,15};
		System.out.println(test.binSearch(array, 6));
	}

}
