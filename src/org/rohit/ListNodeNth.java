package org.rohit;

public class ListNodeNth {
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    
		ListNode start = new ListNode();
		ListNode slow = start, fast = start;
	    slow.next = head;
	    
	    //Move fast in front so that the gap between slow and fast becomes n
	    for(int i=1; i<=n+1; i++)   {
	        fast = fast.next;
	    }
	    //Move fast to the end, maintaining the gap
	    while(fast != null) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    //Skip the desired node
	    slow.next = slow.next.next;
	    return start.next;	
	}
	
	
	public static void main(String[] args){
		
		//ListNodeNth test = new ListNodeNth();
		//test.removeNthFromEnd({1,2,3,4,5},2);
	}


}
