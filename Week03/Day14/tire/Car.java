package tire;
//Business Class = 로직 짜는 부분
//공통의 부분인 타이어클래스를 만들고
//개별적인 금호타이어, 한국타이어를 만들었다.
//여기서는 카부분의 공통적인 기능을 선언한다.(달린다,멈춘다)
public class Car {
	//부모를 객체화
	Tire frontLeftTire = new Tire("앞 왼쪽",6);
	Tire frontRightTire = new Tire("앞 오른쪽",2);
	Tire backLeftTire = new Tire("뒤 왼쪽",3);
	Tire backRightTire = new Tire("뒤 오른쪽",4);
	
	//달린다.
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
		
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
