
public class _189_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		
//		for(int i=0;i<=3;i++)
			roara(arr, 3);
	}
	
	public static void roara(int[] arr,int k)
	{
		
		int[] hey=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
			hey[(i+k)%arr.length]=arr[i];
		
		for(int i=0;i<arr.length;i++)
			arr[i]=hey[i];
		
		for(int val:arr)
			System.out.print(val+" ");
		
		System.out.println();
	}
	
	public static void roar(int[] arr,int k)
	{
		int nod=arr.length;
		k=k%nod;
		
		if(k<0)
			k+=nod;
		
		while(k-->0)
		{
			int last=arr[arr.length-1];
			
			for(int i=arr.length-2;i>=0;i--)
				arr[i+1]=arr[i];
				
			arr[0]=last;
			
			for(int val:arr)
				System.out.print(val+" ");
			
			System.out.println();
		}
		
		
		
		System.out.println();
		
	}

}
