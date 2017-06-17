package org.rohit;
//queue is FIFO, stack is LIFO
import java.util.PriorityQueue;

public class KLargest {
	
	public int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	    for(int i: nums){
	        q.offer(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	 
	    return q.peek();
	}
	
	public static void main(String[] args){
		
		KLargest test = new KLargest();
		int[] array = {1,3,7,3,4,9,7,5};
		System.out.println(String.valueOf(test.findKthLargest(array,2)));
	}

}
