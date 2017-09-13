package org.rohit;

//can use 3 loops to find triplets, can use sorting, this is 3rd method O(n)

public class MaxProd3No {
	
	public int maxProd(int[] num){
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++){
			
			if(num[i]<min1){
				
				min2 = min1;
				min1 = num[i];
			}
			
			else if(num[i]<min2){
				
				min2 = num[i];
			}
			
			if(num[i]>max1){
				
				max3 = max2;
				max2 = max1;
				max1 = num[i];
			}
			
			else if(num[i]>max2){
				
				max3 = max2;
				max2 = num[i];
			}
			
			else if(num[i]>max3){
				
				max3 = num[i];
			}
		}
		
		return Math.max(max1*max2*max3, min1*min2*max1);
	}
	
	public static void main(String[] args){
		
		MaxProd3No test = new MaxProd3No();
		int[] a = {1,6,3,2,8,-5};
		System.out.println(test.maxProd(a));
	}

}
