package waitNotifyEx;

public class WorkObject {//공유 객체의 클래스
	public synchronized void methodA() {
		//임계영역 : 한 스레드만 사용할 수 있는 부분
		//하나 끝나면 다음꺼 실행
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	
	
}
