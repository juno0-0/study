package yieldEx;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۵�");
			}else {
				System.out.println("ThreadB�� yield��");
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
