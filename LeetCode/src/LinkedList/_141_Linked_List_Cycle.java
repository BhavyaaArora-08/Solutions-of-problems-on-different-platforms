package LinkedList;

public class _141_Linked_List_Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static boolean find(ListNode head) {

		ListNode fast=head,slow=head;
		
		while(fast!=null && fast.next!=null && slow!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
			
			if(fast==slow)
				return true;
		}
		
		
		return false;
	}

}
