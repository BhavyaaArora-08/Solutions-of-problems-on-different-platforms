package LinkedList;

public class _61_Rotate_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	
	public static ListNode find(ListNode head,int k)
	{
		 if(head==null || k==0)
				return head;
		 
		int count=0;
		
		ListNode tempa=head;
		while(tempa!=null)
		{
			count++;
			tempa=tempa.next;
		}
		
		k=k%count;
		
		
		while(k-->0)
		{
			ListNode temp=head,prev=head;
			
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			
			temp.next=head;
			prev.next=null;
			head=temp;
		}
		
		return head;
	}

}
