package waitNotifyEx;

public class WaitNotifyEx {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();//°øÀ¯ °´Ã¼
		ThreadA ta = new ThreadA(sharedObject);
		ThreadB tb = new ThreadB(sharedObject);
		ta.start();
		tb.start();
		
	}
}
