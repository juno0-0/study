package tire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1;i<=20;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1: 
					System.out.println("�� ���� HankookTire ��ü"); 
					car.frontLeftTire = new HankookTire("�� ����",15);
					//�ѱ�Ÿ�̾� �ν��Ͻ��� �ּҸ� CarŬ������ car�� ���� �� �ȿ� TireŬ������ frontLeftTire�� �־��ش�.
					break; 
				case 2: 
					System.out.println("�� ������ KumhoTire ��ü"); 
					car.frontRightTire = new KumhoTire("�� ������",13);
					break; 
				case 3: 
					System.out.println("�� ���� MichelinTire ��ü"); 
					car.backLeftTire = new MichelinTire("�� ����",14);
					break; 
				case 4: 
					System.out.println("�� ������ NexenTire ��ü"); 
					car.backRightTire = new NexenTire("�� ������",17);
					break; 
			}
			System.out.println("===========================================");
		}		
	}
}
