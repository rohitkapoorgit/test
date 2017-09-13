package org.rohit;

//O(n+m) time complexity, if n=m, then O(2n), which is O(n)
//Matrix is row and column sorted
public class NumberOfNegativeNumbersMatrix {
	
	public int negativeNumbers(int[][] m){
		
		int i=0;int j=m[0].length-1;int count = 0;
		while(i<m.length && j>=0){
			
			if(m[i][j]<0){
				
				count = count + j+1;
				i++;
			}
			
			else{
				
				j--;
			}
		}
		
		return count;
	}
	

    public static void main(String[] args){
			
		NumberOfNegativeNumbersMatrix test = new NumberOfNegativeNumbersMatrix();
		int[][] m = {{-3, -2, -1,  1},
					 {-2,  2,  3,  4},
					 {4,   5,  7,  8}};
		
		System.out.println(test.negativeNumbers(m));
		
		int[][] m1 = {{-8,-7,-5,-4},
				 	  {-3,-2,-1,4},
				 	  {4,5,7,8}};
		System.out.println(test.negativeNumbers(m1));
		
			
	}
}
