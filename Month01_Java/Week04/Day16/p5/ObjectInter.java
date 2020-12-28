package p5;

public interface ObjectInter {
	//상수
	static final int MAX=99999;
	static final int MIN=-99999;
	//추상메소드
	public abstract void calc();
	public abstract void avg();
	//인스턴스메소드
	default void number() { }
	//정적메소드
	static void stnumber() { }
	
}
