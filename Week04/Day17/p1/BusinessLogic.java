package p1;

public class BusinessLogic {
	void start() {
		RemoteControl rc =null;//인터페이스타입을 참조변수로 사용하기 위해서 선언
		/*
		rc = new SmartTelevision();//new SmartTelevision()만 바꿔주면 된다.
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();
		
		//Down-casting
		Searchable s = (Searchable)rc;
		s.search("KBS");
		
		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		*/
		
		rc = new Audio();
		Searchable s = (Searchable)rc;
		s.search("FM");
		rc.turnOn();
		rc.setVolume(13);
		rc.setMute(true);
		rc.turnOff();
		
		Audio a = (Audio)rc;
		a.chatting("오디오 객체화 한 자료입니다~~");
	}
}
