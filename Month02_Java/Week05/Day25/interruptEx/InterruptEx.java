package interruptEx;

public class InterruptEx {
	public static void main(String[] args) {
		Thread pt = new PrintThread2();
		pt.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {}
		pt.interrupt();
	}
}

class PrintThread2 extends Thread{
	@Override
	public void run() {
		//���1
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {}
		
		//���2
//		while(true) {
//			System.out.println("������");
//			if(Thread.interrupted()) {
//				break;
//			}
//		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	
	
	
}