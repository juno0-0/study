package p1;

public class SmartPhone extends Phone{
	//추상메소드를 반드시 오버라이딩해야지 에러가 안난다.
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String turnOff() {
		return null;
	}
	
	@Override
	public void aa() {//추상메소드가 아니라서 해도 되고 안해도 된다.
		
	}
	
	
}
