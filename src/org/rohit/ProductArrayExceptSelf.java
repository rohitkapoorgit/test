package org.rohit;

import java.util.Arrays;

public class ProductArrayExceptSelf {
	
	public int[] productExceptSelf(int[] in) {
		
		int[] out = new int[in.length];
		out[0] = 1;
		
		for(int i=1;i<in.length;i++){
			
			out[i] = out[i-1]*in[i-1];
		}
		
		int r = 1;
		
		for(int i=in.length-1;i>=0;i--){
			
			out[i] = out[i]*r;
			r = r*in[i];
		}
		
		return out;
	        
	}
	
	public static void main(String[] args){
			
		ProductArrayExceptSelf test = new ProductArrayExceptSelf();
		int[] array = {1,2,3,4};
		System.out.println(Arrays.toString(test.productExceptSelf(array)));
	}

}
