package synchronizedEx;

public class User1 extends Thread{
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		super.setName("User1");//������ �̸� �����ϱ�
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
