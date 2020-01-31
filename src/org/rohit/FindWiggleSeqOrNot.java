package org.rohit;

public class FindWiggleSeqOrNot {
	
	public boolean wiggleOrNot(int[] arr){
		
		if(arr.length<2){
			
			return true;
		}
		
		boolean isUp = true;
		
		if(arr[1]<arr[0]){
			
			isUp = false;
		}
		
		for(int i=1; i<arr.length; i++){
			
			if(!(isUp && arr[i]>arr[i-1] || !isUp && arr[i]<arr[i-1])){
				
				return false;
			}
			
			isUp = !isUp;
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		
		FindWiggleSeqOrNot test = new FindWiggleSeqOrNot();
		int[] a = {1,7,4,9,2,5};
		System.out.println(test.wiggleOrNot(a));
		int[] b = {1,17,5,10,13,15,10,5,16,8};
		System.out.println(test.wiggleOrNot(b));
		int[] c = {1,2,3,4,5,6,7,8,9};
		System.out.println(test.wiggleOrNot(c));
		int[] d = {7,4,9,2,5};
		System.out.println(test.wiggleOrNot(d));
		int[] e = {7,4};
		System.out.println(test.wiggleOrNot(e));
		
	}

}
