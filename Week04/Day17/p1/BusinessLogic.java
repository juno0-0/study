package p1;

public class BusinessLogic {
	void start() {
		RemoteControl rc =null;//�������̽�Ÿ���� ���������� ����ϱ� ���ؼ� ����
		/*
		rc = new SmartTelevision();//new SmartTelevision()�� �ٲ��ָ� �ȴ�.
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
		a.chatting("����� ��üȭ �� �ڷ��Դϴ�~~");
	}
}
