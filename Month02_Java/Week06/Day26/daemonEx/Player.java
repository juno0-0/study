package daemonEx;

public class Player {
	public synchronized void video() {
		System.out.println("동영상을 재생합니다.");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void music() {
		System.out.println("음악을 재생합니다.");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
