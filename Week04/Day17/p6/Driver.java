package p6;

public class Driver {
	public void driver(Vehicle v) {
		if(v instanceof Bus) {//v�� Bus Ÿ���̴�?
			Bus b = (Bus)v;	//v ���������� Bus Ŭ������ �ν��Ͻ�ȭ�� ���� ����ų �� �ֳ�?
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
