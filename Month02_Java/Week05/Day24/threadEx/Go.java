package threadEx;

public class Go implements Runnable{
//	public void go() {
//		while(true) {
//			System.out.println("Go!!");
//		}
//	}
	@Override
	public void run() {
		while(true) {
			System.out.println("Go!!");
		}
	}
}
