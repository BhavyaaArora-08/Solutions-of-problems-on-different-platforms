
public class _Flipping_Bits_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(invertBits(1));
	}

	static int invertBits(int n) {
		
		int mask = (Integer.highestOneBit(n) << 1) - 1;
	    return n ^ mask;
	    
	}

}
