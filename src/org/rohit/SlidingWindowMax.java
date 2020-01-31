package org.rohit;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMax {
	
	public int[] maxSlidingWindow( int[] in, int k){
		
		int[] out = new int[in.length-k+1];
		int start = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<in.length;i++){
			
			pq.add(in[i]);
			if(pq.size()==k){
				out[start] = pq.peek();
				pq.remove(in[start]);
				start++;
			}
		}
		
		return out;
	}
	
	public static void main(String[] args){
		
		SlidingWindowMax test = new SlidingWindowMax();
		int[] array = {1,3,-1,-3,5,3,6,7};
		System.out.println(Arrays.toString((test.maxSlidingWindow(array,3))));
	}

}
