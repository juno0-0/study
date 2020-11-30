package p6;

public class Driver {
	public void driver(Vehicle v) {
		if(v instanceof Bus) {//v는 Bus 타입이니?
			Bus b = (Bus)v;	//v 참조변수는 Bus 클래스를 인스턴스화한 값을 가르킬 수 있나?
			b.checkFare();
			b.run();
		}else if(v instanceof Taxi) {
			Taxi t = (Taxi)v;
			t.run();
		}else if(v instanceof Vehicle) {
			v.run();
		}
//		v.run();
	}
}
