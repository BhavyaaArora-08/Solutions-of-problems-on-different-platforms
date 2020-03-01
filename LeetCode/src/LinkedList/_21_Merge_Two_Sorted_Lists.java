package LinkedList;

public class _21_Merge_Two_Sorted_Lists {

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
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
		if(l1 == null) 
            return l2;
		if(l2 == null)
            return l1;
		
        if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} 
        else
        {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
	
	public static ListNode find(ListNode head1,ListNode head2)
	{
		
		ListNode ans=null;
		ListNode temp=null;
		ListNode temp1=head1,temp2=head2;
		
		
		while(temp1!=null && temp2!=null)
		{
			if(temp1.val<=temp2.val)
			{
				if(temp==null)
				{
					ans=temp1;
					temp=temp1;
				}
				else
				{
					temp.next=temp1;
					temp=temp.next;
				}
				
				temp1=temp1.next;
				
			}
			
			else if(temp2.val<=temp1.val)
			{
				if(temp==null)
				{
					ans=temp2;
					temp=temp2;
				}
				else
				{
					temp.next=temp2;
					temp=temp.next;
				}
				
				temp1=temp1.next;
				
			}
		}
		
		
		while(temp1!=null)
		{
			temp.next=temp1;
			temp=temp.next;		
			temp1=temp1.next;
		}

		while(temp2!=null)
		{
			temp.next=temp2;
			temp=temp.next;		
			temp2=temp2.next;
		}
		
		
		return ans;
		
	}
	
	public static ListNode merge(ListNode head1,ListNode head2)
	{
		ListNode temp=null;
		ListNode head=temp;
		
		if(head1.val<=head2.val)
		{
			temp=head1;
			head1=head1.next;
		}
		else
		{
			temp=head2;
			head2=head2.next;
		}
		
		head=temp;
		while(head1!=null && head2!=null)
		{
			while(head1!=null && head1.val<=head2.val)
			{
				head1=head1.next;
				temp.next=head1;
				temp=temp.next;
			}
			
			while(head2!=null && head1!=null && head2.val<=head1.val)
			{
				head2=head2.next;
				temp.next=head2;
				temp=temp.next;
			}
		}
		
		
		
		while(head1!=null)
		{
			temp.next=head1.next;
			temp=temp.next;
		}
		
		while(head2!=null)
		{
			temp.next=head2.next;
			temp=temp.next;
		}
		
		
		return head;
		
	}

}
