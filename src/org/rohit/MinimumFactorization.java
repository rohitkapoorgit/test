package org.rohit;

public class MinimumFactorization {
	
	public int smallestFactorization(int a) {
        if (a < 2)
            return a;
        long res = 0, mul = 1;
        for (int i = 9; i >= 2; i--) {
            while (a % i == 0) {
                res = mul * i + res;
                mul = mul*10;
                a = a/i;
            }
        }
        return a < 2 && res <= Integer.MAX_VALUE ? (int)res : 0;
    }
	
	public static void main(String[] args){
		
		MinimumFactorization test = new MinimumFactorization();
		System.out.println(test.smallestFactorization(25));
		System.out.println(test.smallestFactorization(48));
	}


}
