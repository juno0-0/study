package threadEx;

public class Stop implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("stop!!");
		}
	}
}
