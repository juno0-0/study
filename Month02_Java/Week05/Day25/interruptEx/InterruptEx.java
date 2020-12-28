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
		//방법1
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {}
		
		//방법2
//		while(true) {
//			System.out.println("실행중");
//			if(Thread.interrupted()) {
//				break;
//			}
//		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
	
	
}