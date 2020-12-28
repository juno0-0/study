package anonymous;

public class RemoteControlMain {
	public static void main(String[] args) {
		//RemoteControl rc = new RemoteControlRun();
		RemoteControl rc = new RemoteControl() {//인터페이스를 new하고 { }; 후에 참조변수.멤버
												//구현객체를 생략하고 바로 재정의
			int a = 10;
			//static int sa =20;
			//static은 클래스명으로 접근하는데 클래스명 자체가 없어서 사용을 못한다.
			
			@Override
			public void turnOn() {
				System.out.println("익명객체 켜기");
			}
			
			@Override
			public void turnOff() {
				System.out.println("익명객체 끄기");
			}
			
			void ss() {
				System.out.println("익명객체 자신의 메소드");
				
			}
			
		};
		rc.turnOn();
		
		
	}
}
