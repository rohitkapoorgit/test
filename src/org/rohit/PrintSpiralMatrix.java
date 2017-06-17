package org.rohit;

import java.util.LinkedList;
import java.util.List;

public class PrintSpiralMatrix {
	
	public List<Integer> spiralMatrix(int[][] m){
		
		List<Integer> l = new LinkedList<>();
		int rowStart = 0;int rowEnd = m.length-1;int colStart = 0;int colEnd = m[0].length-1;
		
		while(rowStart<=rowEnd && colStart<=colEnd){
			
			for(int i=colStart;i<=colEnd;i++){
				
				l.add(m[rowStart][i]);
			}
			
			rowStart++;
			
			for(int i=rowStart;i<=rowEnd;i++){
				
				l.add(m[i][colEnd]);
			}
			
			colEnd--;
			
			for(int i=colEnd;i>=colStart;i--){
				
				l.add(m[rowEnd][i]);
			}
			
			rowEnd--;
			
			for(int i=rowEnd;i>=rowStart;i--){
				
				l.add(m[i][colStart]);
			}
			
			colStart++;
		}
		
		return l;
	}
	
	public static void main(String[] args){
		
		PrintSpiralMatrix test = new PrintSpiralMatrix();
		int[][] array = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 },
				{ 10, 11, 12}
		};
		System.out.println(String.valueOf(test.spiralMatrix(array)));
	}


}
