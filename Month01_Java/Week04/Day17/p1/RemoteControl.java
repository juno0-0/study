package p1;
//구현클래스의 부모로 사용할 필드나 추상 메소드
public interface RemoteControl {
	int MAX_VOLUME = 10;
	//static이 붙은건 클래스명(인터페이스명).멤버
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}

//인터페이스는 부모클래스로 쓴다고 생각하면 된다.
//자식은 인터페이스의 추상메서드를 구현하는 부분
//부모클래스 = 공통인 부분
