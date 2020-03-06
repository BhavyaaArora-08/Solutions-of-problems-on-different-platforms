package practise_round_2019;

import java.util.Scanner;

public class Guessing_Game{
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        
        while(t-->0)
        {
            int a=obj.nextInt();
            int b=obj.nextInt();
            int n=obj.nextInt();
            int j=0;
            
            while(a<=b && j<n)
            {
                int mid=(a+b)/2;
                System.out.println(mid);
                String ans=obj.next();
                
                if(ans.equals("CORRECT"))
                {
                    break;
                }
                else if(ans.equals("TOO_SMALL"))
                {
                    a=mid+1;
                }
                else if(ans.equals("TOO_BIG"))
                {
                    b=mid-1;
                }
                j++;
            }
            
        }
    }
    
}