package yieldEx;

public class YieldEx {
	public static void main(String[] args) {
		ThreadA ta = new ThreadA();//Thread�� NEW����
		ThreadB tb = new ThreadB();
		ta.start();//Thread�� RUNNABLE����
		tb.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		ta.work=false;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		ta.work=true;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		ta.stop=true;
		tb.stop=true;
		
	}
}
