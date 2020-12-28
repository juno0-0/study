package yieldEx;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작동");
			}else {
				System.out.println("ThreadB가 yield함");
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}
