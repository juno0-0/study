package yieldEx;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA �۵�");
			}else {
				System.out.println("ThreadA�� yield��");
				Thread.yield();//work�� �۾��� �� �����Ƿ� �ٸ� �����忡�� �纸��
			}
		}
		System.out.println("ThreadA ����");
	}
}
