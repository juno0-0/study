package tire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1;i<=20;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1: 
					System.out.println("앞 왼쪽 HankookTire 교체"); 
					car.frontLeftTire = new HankookTire("앞 왼쪽",15);
					//한국타이어 인스턴스의 주소를 Car클래스의 car에 가서 그 안에 Tire클래스의 frontLeftTire에 넣어준다.
					break; 
				case 2: 
					System.out.println("앞 오른쪽 KumhoTire 교체"); 
					car.frontRightTire = new KumhoTire("앞 오른쪽",13);
					break; 
				case 3: 
					System.out.println("뒤 왼쪽 MichelinTire 교체"); 
					car.backLeftTire = new MichelinTire("뒤 왼쪽",14);
					break; 
				case 4: 
					System.out.println("뒤 오른쪽 NexenTire 교체"); 
					car.backRightTire = new NexenTire("뒤 오른쪽",17);
					break; 
			}
			System.out.println("===========================================");
		}		
	}
}
