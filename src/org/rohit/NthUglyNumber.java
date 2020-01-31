package org.rohit;

//we can loop from 1, and keep finding ugly number and increment the count - O(n) in time and O(1) in space
//Below is dynamic prog - O(n) in time and O(n) in space
public class NthUglyNumber {
	
	public int nthugly(int n){
		
		int[] ugly = new int[n];
		ugly[0] = 1;
		int i2=0,i3=0,i5=0;
		int nxt_mul_2 = 2;
		int nxt_mul_3 = 3;
		int nxt_mul_5 = 5;
		int nxt_ugly = 1;
		
		for(int i=1;i<n;i++){
			
			nxt_ugly = Math.min(nxt_mul_2, Math.min(nxt_mul_3, nxt_mul_5));
			ugly[i] = nxt_ugly;
			
			if(nxt_ugly == nxt_mul_2){
				i2++;
				nxt_mul_2 = ugly[i2]*2;
			}
			if(nxt_ugly == nxt_mul_3){
				i3++;
				nxt_mul_3 = ugly[i3]*3;
			}
			if(nxt_ugly == nxt_mul_5){
				i5++;
				nxt_mul_5 = ugly[i5]*5;
			}
			
		}
		
		return nxt_ugly;
	}
	
	public static void main(String[] args){
		
		NthUglyNumber test = new NthUglyNumber();
		System.out.println(test.nthugly(150));
		System.out.println(test.nthugly(10));
	}

}
