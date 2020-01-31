package org.rohit;

public class IncreasingTripletSubseq {
	
	public boolean incSub(int[] arr){
		
		int min_1 = Integer.MAX_VALUE;
		int min_2 = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]<=min_1){
				
				min_1 = arr[i];
			}
			
			else if(arr[i]<=min_2){
				
				min_2 = arr[i];
			}
			
			else{
				
				return true;
			}		
			
		}
		
		return false;
	}
	
	public static void main(String[] args){
		
		IncreasingTripletSubseq test = new IncreasingTripletSubseq();
		int[] a = {1,2,3,4,5};
		System.out.println(test.incSub(a));
		int[] b = {1,4,1,4,5,2,6};
		System.out.println(test.incSub(b));
		int[] c = {5,6,2,1,8,5};
		System.out.println(test.incSub(c));
		int[] d = {8,6,2,4,4,5};
		System.out.println(test.incSub(d));
		int[] e = {3,2,6,1,2,7};
		System.out.println(test.incSub(e));
		int[] f = {5,6,2,1,4};
		System.out.println(test.incSub(f));
	}

}
