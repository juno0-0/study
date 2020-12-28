package wrapperClassEx;

public class WrapperEx {
	public static void main(String[] args) {
		//Boxing
		int i=100;
		Integer ii = new Integer(100);
		float f = 10.5f;
		Float ff = new Float(10.5);
		char c = 'a';
		Character cc = new Character('a');
		boolean b = true;
		Boolean bb = new Boolean(true);
	
		//UnBoxing
		int i2 = ii.intValue();
		double d2 = ii.doubleValue();
		System.out.println(d2);
		float f2 = ff.floatValue();
		boolean b2 = bb.booleanValue();
		
		
	}
}
