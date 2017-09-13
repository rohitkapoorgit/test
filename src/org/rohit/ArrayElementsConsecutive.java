package org.rohit;
//http://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/
//http://www.geeksforgeeks.org/check-array-elements-consecutive-time-o1-space-handles-positive-negative-numbers/
public class ArrayElementsConsecutive {
	
	public boolean consecutive(int[] a){
		
		int min = getMin(a);
		//int max = getMax(a);
		for(int i=0;i<a.length;i++){
			
			if(Math.abs(a[i])-min < a.length){
				
				//a[Math.abs(a[i])-min] = -a[Math.abs(a[i])-min];
				a[Math.abs(a[i])-min]*=-1;
		
			}
		} 
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]>0){
				
				return false;
			}
		}
		
		return true;
	}
	
	public int getMin(int[] a){
		
		int min = a[0];
		for(int i=1;i<a.length;i++){
			
			if(a[i]<min){
				
				min = a[i];
			}
		}
		
		return min;
		
	}
	
	public int getMax(int[] a){
		
		int max = a[0];
		for(int i=1;i<a.length;i++){
			
			if(a[i]>max){
				
				max = a[i];
			}
		}
		
		return max;
		
	}
	
	public static void main(String[] args){
		
		ArrayElementsConsecutive test = new ArrayElementsConsecutive();
		System.out.println(test.consecutive(new int[] {5, 2, 3, 1, 4}));
		System.out.println(test.consecutive(new int[] {83, 78, 80, 81, 79, 82}));
		System.out.println(test.consecutive(new int[] {34, 23, 52, 12, 3}));
		System.out.println(test.consecutive(new int[] {7, 6, 5, 5, 3, 4}));
		System.out.println(test.consecutive(new int[] {21,27,24,26,25,22}));
		System.out.println(test.consecutive(new int[] {0}));
		System.out.println(test.consecutive(new int[] {5, 2, 3, 1, 4,0}));
		
	}


}

//multiply 2 integers without * 
//http://www.geeksforgeeks.org/multiply-two-numbers-without-using-multiply-division-bitwise-operators-and-no-loops/

//http://ideone.com/qJxM68