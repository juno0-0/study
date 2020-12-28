package threadEx;

public class Pause implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("pause!!");
		}
		
	}
}
