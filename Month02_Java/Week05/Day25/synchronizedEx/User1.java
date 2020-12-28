package synchronizedEx;

public class User1 extends Thread{
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		super.setName("User1");//스레드 이름 지정하기
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
