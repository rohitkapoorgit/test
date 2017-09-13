package org.rohit;

public class validSquare {
	
	public boolean square(int[] a, int[] b, int[] c,int[] d){
		
		return check(a,b,c,d)|| check(a,b,d,c)|| check(a,c,b,d);
	}
	
	public boolean check(int[] a, int[] b,int[] c,int[] d){
		
		return dist(a,b)>0 && dist(a,b) ==dist(b,c) && dist(b,c) ==dist(c,d) && dist(c,d) ==dist(d,a) && dist(a,c) ==dist(b,d);
	}
	
	public double dist(int[] x,int[] y){
		
		return Math.sqrt(Math.pow(y[1]-x[1],2) + Math.pow(y[0]-x[0],2));
	}
	
	public static void main(String[] args){
		
		validSquare test = new validSquare();
		int[] p1 = {-1,1}; int[] p2 = {0,1}; int[] p3 = {0,0}; int[] p4 = {-1,0};
		System.out.println(test.square(p1,p2,p3,p4));
	}

}
