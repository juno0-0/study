package p5;
//����Ͻ� ���� �κ�
public class Car {
//	Tire frontleftTire = new HankookTire();//�ʵ��� ������
//	Tire frontrightTire = new HankookTire();//����Ŭ������ �������̽� Ÿ���� ���������� ���� ��
//	Tire backleftTire = new KumhoTire();
//	Tire backrightTire = new KumhoTire();
	//���⼭ Ÿ���� �θ� �ƴ� HankookTire�� KumhoTire�� ������ ��ü�� �ȵȴ�.

	
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
