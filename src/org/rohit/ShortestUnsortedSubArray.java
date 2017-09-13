package org.rohit;
//https://leetcode.com/articles/shortest-unsorted-continous-subarray/
//Using 2 loops - O(n2)
//Below is O(nlogn)//Since we have l and r, we can also find the sub array
//Later - http://www.geeksforgeeks.org/minimum-length-unsorted-subarray-sorting-which-makes-the-complete-array-sorted/
import java.util.Arrays;

public class ShortestUnsortedSubArray {
	
	public int shortestUnsorted(int[] a){
		
		int l = a.length; int r = 0;
		//int[] b = new int[a.length];
		//System.arraycopy(a, 0, b, 0, a.length);
		int[] b = Arrays.copyOfRange(a, 0, a.length);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++){
			
			if(a[i] != b[i]){
				
				l = Math.min(l, i);
				r = Math.max(r, i);
			}
		}
		
		return r-l<0?0:r-l+1;
	}
	
	public static void main(String[] args){
		
		ShortestUnsortedSubArray test = new ShortestUnsortedSubArray();
		int[] inp = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(test.shortestUnsorted(inp));
		int[] inp1 = {2, 6, 8, 10, 9, 15};
		System.out.println(test.shortestUnsorted(inp1));
		int[] inp2 = {2, 6, 8, 10, 15};
		System.out.println(test.shortestUnsorted(inp2));
	}


}
