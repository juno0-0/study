package p8;

public class ChildInterMain {
	public static void main(String[] args) {
		ParentInterface p = new ChildInterEx();
		ChildInterEx c = (ChildInterEx)p;
		c.ss();
		
		ParentInterface p1 = new ChildInterEx02();
		ChildInterEx02 c2 = (ChildInterEx02)p1;
		c2.sss();
		
	}
}
