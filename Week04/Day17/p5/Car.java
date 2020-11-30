package p5;
//비즈니스 로직 부분
public class Car {
//	Tire frontleftTire = new HankookTire();//필드의 다형성
//	Tire frontrightTire = new HankookTire();//구현클래스를 인터페이스 타입의 참조변수에 넣은 것
//	Tire backleftTire = new KumhoTire();
//	Tire backrightTire = new KumhoTire();
	//여기서 타입을 부모가 아닌 HankookTire나 KumhoTire로 줬으면 교체가 안된다.

	
	void run() {
//		for(Tire i : tires) {
//			i.roll();
//		}
		Tire[] tires = new Tire[4];
//		Tire[] tires = {new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire()};
		tires[0]=new HankookTire();
		tires[1]=new HankookTire();
		tires[2]=new HankookTire();
		tires[3]=new HankookTire();
		tires[0].roll();
		tires[1].roll();
		tires[2].roll();
		tires[3].roll();
	}
	
	
}
