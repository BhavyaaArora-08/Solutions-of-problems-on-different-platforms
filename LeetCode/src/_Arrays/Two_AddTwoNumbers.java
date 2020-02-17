

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Two_AddTwoNumbers {
	
	static class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val=x;
		}
	}
	
	public static void main(String[] args) {
		
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		
		ListNode s=addTwoNumbers(l1, l2);
		
		while(s!=null)
		{
			System.out.print(s.val+" ");
			s=s.next;
		}
		
		System.out.println();
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode s=null,t = null;
        int i=0;
        int carry=0;
        
        while(t1!=null || t2!=null)
        {
            int sum=0;
            if(t1!=null && t2!=null)
            {
                sum=sum+(t1.val + t2.val);
            }
            else if(t1!=null)
            {
                sum=sum+(t1.val);
            }
            else if(t2!=null)
            {
                sum=sum+(t2.val);
            }
            
            sum+=carry;
            if(i==0)
            {
                s=new ListNode(sum%10);
                t=s;
            }
            else
            {
                ListNode temp=new ListNode(sum%10);
                t.next=temp;
                t=temp;
            }
            carry=(sum<10)?0:(sum/10); 
            t1=t1.next;
            t2=t2.next;
            i++;
        }
        
        return s;
    }
}