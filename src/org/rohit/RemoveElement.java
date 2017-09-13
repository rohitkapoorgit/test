package org.rohit;
//Another approach when elements to be removed are rare
//https://leetcode.com/problems/remove-element/solution/
public class RemoveElement {
	
	public int removeElement(int[] a, int target){
		
		int j=0;
		for(int i=0; i<a.length;i++){
			
			if(a[i]!=target){
				
				a[j++] = a[i];
			}
		}
		
		return j;
		
	}
	
	public static void main(String[] args){
		
		RemoveElement test = new RemoveElement();
		int[] a = new int[]{3,2,5,8,3,5,7};
		System.out.println(test.removeElement(a,3));
		int[] b = new int[]{3,2,2,3};
		System.out.println(test.removeElement(b,3));
		
		int[] c = new int[]{3,2,2,3};
		System.out.println(test.removeElement(c,5));
		
		int[] d = new int[]{2};
		System.out.println(test.removeElement(d,2));
	}

}
