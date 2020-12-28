package synchronizedEx;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		System.out.println("여러 스레드가 출력할 수 있는 곳up");
		synchronized(this){//()안에는 현재 객체(현재 클래스)
			//임계영역 : 한 스레드만 실행할 수 있는 블록, 다른 스레드는 대기상태
			this.memory = memory;
			try {
				Thread.sleep(2000);//2초동안 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
		}
		System.out.println("여러 스레드가 출력할 수 있는 곳down");
	}
	
}
