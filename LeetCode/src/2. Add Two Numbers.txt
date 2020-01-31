class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
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
                 t1=t1.next;
            t2=t2.next;
            }
            else if(t1!=null)
            {
                sum=sum+(t1.val);
                 t1=t1.next;
            //t2=t2.next;
            }
            else if(t2!=null)
            {
                sum=sum+(t2.val);
               //  t1=t1.next;
            t2=t2.next;
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
           
            
            if(t1==null && t2==null && carry!=0)
			{
				ListNode temp=new ListNode(carry);
                t.next=temp;
                t=temp;
			}
            i++;
        }
        
        return s;
    }
}