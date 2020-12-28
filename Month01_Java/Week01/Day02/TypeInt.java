package P3;

public class TypeInt {
	//메소드정의 pb_1 = b_1
	static void printf(byte pb_1,short ps_1,int pi_1,long pl_1) {
		System.out.println(pb_1);
		System.out.println(ps_1);
		System.out.println(pi_1);
		System.out.println(pl_1);
	}
	public static void main(String[] args) {
		byte b_1=1;
		short s_1=2;
		int i_1=3;
		long l_1=4L;
		
		printf(b_1,s_1,i_1,l_1);

	}

}
