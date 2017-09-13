package org.rohit;
import java.util.ArrayList;
//If there are 2 sets, we can store elements of 1st in set, and then check if elements of 
//2nd are in set - O(n). Would need extra space
//Union & Intersection of 2 sorted arrays - http://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
//Time compl of below - O(n1+n2+n3)
import java.util.LinkedList;
import java.util.List;

public class CommonElementsInSortedArray {
	
	public List<Integer> commonElements(int[] a,int[] b,int[] c){
		
		if(a==null||b==null||c==null){
			
			return new ArrayList<Integer>();
		}
		int i=0,j=0,k=0;
		List<Integer> l = new LinkedList<Integer>();
		while(i<a.length && j<b.length && k<c.length){
			
			if(a[i]==b[j] && b[j]==c[k]){
				
				l.add(a[i]);
				i++;j++;k++;
			}
			
			else if(a[i]>b[j]){
				
				j++;
			}
			
			else if(b[j]>c[k]){
				
				k++;
			}
			
			else{
				
				i++;
			}
		}
		
		return l;
	}
	
	public static void main(String[] args){
		
		CommonElementsInSortedArray test = new CommonElementsInSortedArray();
		int ar1[] = {1, 5, 10, 20, 40, 80};
		int ar2[] = {6, 7, 20, 80, 100};
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		System.out.println(test.commonElements(ar1,ar2,ar3));
		int ar4[] = {1, 5, 5};
		int ar5[] = {3, 4, 5, 5, 10};
		int ar6[] = {5, 5, 10, 20};
		System.out.println(test.commonElements(ar4,ar5,ar6));
		int ar7[] = {1, 5, 5};
		int ar8[] = {};
		int ar9[] = {5, 5, 10, 20};
		System.out.println(test.commonElements(ar7,ar8,ar9));
		int ar10[] = null;
		int ar11[] = {};
		int ar12[] = {5, 5, 10, 20};
		System.out.println(test.commonElements(ar10,ar11,ar12));
	}


}
