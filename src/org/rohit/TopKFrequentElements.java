package org.rohit;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TopKFrequentElements {
	
	public List<Integer> frequent(int[] arr, int k){
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		for(int i=0; i<arr.length; i++){
			
			if(map.containsKey(arr[i])){
				
				map.put(arr[i], map.get(arr[i])+1);
			}
			
			else{
				
				map.put(arr[i], 1);
			}
		}
		
		//Queue - less frequent order
		PriorityQueue<Integer> q = new PriorityQueue<>((n1,n2) -> map.get(n1) - map.get(n2));
		
		for(Integer i:map.keySet()){
			
			q.add(i);
			if(q.size()>k){
				q.poll();
			}
		}
		
		List<Integer> out = new LinkedList<>();
		for(Integer i:q){
			
			out.add(0, i);
		}
		
		return out;
		
	}
	
	public static void main(String[] args){
		
		TopKFrequentElements test = new TopKFrequentElements();
		int[] a = {1,1,1,2,2,3};
		System.out.println(test.frequent(a,2));
		int[] b = {1,1,2,2,2,3};
		System.out.println(test.frequent(b,2));
		int[] c = {4,4,2,2,3,3,3};
		System.out.println(test.frequent(c,2));
		int[] d = {4,4,2,2,3,3};
		System.out.println(test.frequent(d,2));
		int[] e = {1};
		System.out.println(test.frequent(e,1));
		
	}

}
