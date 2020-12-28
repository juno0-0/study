package synchronizedEx;

public class MainThreadEx {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		User1 u1 = new User1();//스레드의 NEW 상태
		u1.setCalculator(c);
		u1.start();//스레드의 RUNNABLE 상태 --> 스케쥴러(운영체제)가 스케쥴에 따라 cpu(core, process)에 넣어준다. = RUNNING 상태
		User2 u2 = new User2();
		u2.setCalculator(c);
		u2.start();
		
		
	}
}
