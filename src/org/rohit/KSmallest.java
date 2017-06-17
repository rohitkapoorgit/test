package org.rohit;

import java.util.PriorityQueue;

public class KSmallest {
	
	public int findKthSmallest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	    int n=-1;
	    for(int i: nums){
	        q.offer(i);
	    }
	    
	    while(k>0){
	    	
	    	n = q.poll();
	    	k--;
	    }
	 
	    return n;
	}
	
	public static void main(String[] args){
		
		KSmallest test = new KSmallest();
		int[] array = {1,4,7,3,9,5};
		System.out.println(String.valueOf(test.findKthSmallest(array,2)));
	}

}