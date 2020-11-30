package p6;

public class RunClassEx implements Inter0101, Inter0102{

	@Override
	public void interMethod() {
		int r;
		r=X+Y;
		System.out.println(r);
	}

	@Override
	public void inter0102Method() {
		double r;
		r=X+Y+Z;
		System.out.println(r);
	}

	@Override
	public void inter0101Method() {
		//X = Y;//상수라서 오류
		double r;
		r=X + Z;
		System.out.println(r);
	}
}
