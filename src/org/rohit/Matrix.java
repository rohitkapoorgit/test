package org.rohit;
//rotate +90 and -90
import java.util.Arrays;

public class Matrix {
	
	public int[][] transpose(int[][] a){
		
		int temp;
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a[i].length;j++){
				
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		
		return a;
	}
	
	public int[][] transposeAny(int[][] a){
		
		int row = a.length;int col = a[0].length;
		int[][] newMat = new int[col][row];
		for(int i=0;i<col;i++){
			
			for(int j=0;j<row;j++){
				
				newMat[i][j] = a[j][i];
				
			}
		}
		
		return newMat;
	}
	
	public int[][] mirrorvert(int[][] b) {
		
	    for (int i = 0; i < b.length; i++){
	    	
	       b[i] = flip(b[i]);
	        
	    }
	    
	    return b;
	}
	
	public int[] flip(int[] c) {
		
		int beg = 0;int end = c.length-1;int temp;
		while(beg<end){
			
			temp = c[beg];
			c[beg] = c[end];
			c[end] = temp;
			beg++;end--;
		}
	    
	    return c;
	}
	
	
	
	public static void main(String[] args){
		
		Matrix test = new Matrix();
		int[][] array = {
		                 {1,2,3},
		                 {4,5,6},
		                 {7,8,9}
		                 
		};
		int[][] array2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
		};
		int[][] array3 = {
                {1,2,3},
                {4,5,6}
                };
		//System.out.println(Arrays.deepToString(test.transpose(array)));
		System.out.println(Arrays.deepToString(test.mirrorvert(test.transpose(array))));
		System.out.println(Arrays.deepToString(test.transpose(test.mirrorvert(array2))));
		System.out.println(Arrays.deepToString(test.transposeAny(array3)));
	}
	
	

}
