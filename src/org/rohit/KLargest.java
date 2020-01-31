package org.rohit;
//queue is FIFO, stack is LIFO
//Stack - elements inserted at top, removed from top
//Queue - elements inserted from back, removed from front
import java.util.PriorityQueue;

public class KLargest {
	
	public int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	    for(int i: nums){
//	        q.offer(i);
	    	q.add(i);
	 
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
		
		int[] array2 = {4,2};
		System.out.println(String.valueOf(test.findKthLargest(array2,2)));
		
		int[] array3 = {1,3,4,-4};
		System.out.println(String.valueOf(test.findKthLargest(array3,2)));
		int[] array4 = {2,2,3,1};
		System.out.println(String.valueOf(test.findKthLargest(array4,3)));
	}

}
