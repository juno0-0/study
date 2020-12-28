package yieldEx;

public class YieldEx {
	public static void main(String[] args) {
		ThreadA ta = new ThreadA();//Thread의 NEW상태
		ThreadB tb = new ThreadB();
		ta.start();//Thread의 RUNNABLE상태
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
