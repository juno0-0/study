package p3;
//인터페이스
public interface RemoteControl {
	//상수
	static final double PI = 3.14;
	double EARTH_AREA = 5478.651;//생략해도 자동으로 static final
	final double EARTH_HEIGTH = 500;//static이 생략된 것
	static double MAX=99999;
	//추상메소드, public abstract가 생략된다.
	public abstract void turnOn();
	void turnOff();//public abstract가 생략
	public void soundOn();//abstract가 생략
	abstract void soundOff();//public이 생략되어있다.
	
	//default메소드를 1.8버젼에서 허용함
	default void setMute() { //인스턴스 메소드
		
	}//동작코드 작성
	default void setMM() {  }
	
	//정적메소드 허용 1.8버젼에서 허용함
	static void aa() {  }//클래스 메소드
	
	//생성자 만들기 - x
	//public RemoteControl() { }
	
	//초기화 블록 - x
	//{  }
	
	//정적 초기화 블록 - x
	//static {  }
}
