package daemonEx;

public class DaemonEx {
	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setDaemon(true);//AutoSaveThread를 메인스레드의 Daemon으로 만든다는 의미
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}
	
}
