package p5;
//인터페이스 위에 또 인터페이스 = extends
//인터페이스끼리는 상속을 할 수 있다.
//인터페이스끼리는 implements가 아니라 extends
//인터페이스끼리는 다중 상속이 가능하다.
public interface Unit extends ObjectInter, Moveable{
	//상수
	static final int UnitMAX=100;
	//추상메소드
	public abstract void unitMax();
	
	
}
