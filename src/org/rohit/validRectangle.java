package org.rohit;

public class validRectangle {
	
	public boolean rect(int[] a, int[] b, int[] c,int[] d){
		
		return check(a,b,c,d)|| check(a,b,d,c)|| check(a,c,b,d);
	}
	
	public boolean check(int[] a, int[] b,int[] c,int[] d){
		
		return dist(a,b)>0 && dist(a,b) ==dist(c,d) && dist(b,c) ==dist(d,a) && dist(a,c) ==dist(b,d);
	}
	
	public double dist(int[] x,int[] y){
		
		return Math.sqrt(Math.pow(y[1]-x[1],2) + Math.pow(y[0]-x[0],2));
	}
	
	public static void main(String[] args){
		
		validRectangle test = new validRectangle();
		int[] p1 = {0,0}; int[] p2 = {3,3}; int[] p3 = {2,0}; int[] p4 = {0,3};
		System.out.println(test.rect(p1,p2,p3,p4));
	}

}
