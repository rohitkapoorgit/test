package org.rohit;

public class PerfectSquareUsingBinarySearch {
	
	public boolean perfect(int n){
		
		int l = 0;
		int r = n/2;
		while(l<=r){
			
			int mid = (l+r)/2;
			if(mid*mid == n){
				
				return true;
			}
			
			else if(mid*mid>n){
				
				r = mid-1;
			}
			
			else{
				
				l = mid+1;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		
		PerfectSquareUsingBinarySearch test = new PerfectSquareUsingBinarySearch();
		System.out.println(test.perfect(16));
		System.out.println(test.perfect(24));
		
	}

}
