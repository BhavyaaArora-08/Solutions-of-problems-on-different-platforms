package LinkedList;

import java.util.LinkedList;

public class _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=1101,ans=0;
//		while(x!=0)
//		{
//			ans=(2*ans)+(x%10);
//			x=x/10;
//		}
//		
//		System.out.println(ans);
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static int find(ListNode head)
	{
		ListNode temp=head;
		int ans=0;
		int count=-1;
		
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		temp=head;
		
		while(temp!=null)
		{
			ans+=(Math.pow(2, count) * temp.val);
			temp=temp.next;
		}
		
		
		return ans;
		
	}

}
