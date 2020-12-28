package joinEx;

public class JoinEx {
	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		try {
			st.join();//join() 수행하는 중 interrupt()가 호출되면 예외발생
		} catch (InterruptedException e) {}//interrupt()가 실행대기로 만들거나 종료로 만드는 것
		//일시정지 상태가 되면 interrupt()가 호출된다.
		//start()가 호출되고 run()이 실행하는 동안 join()으로 일시정지 하는 것
		System.out.println("합 : "+st.getSum());//run()이 실행되기도 전에 getSum()을 호출한 것
		
	}
}
