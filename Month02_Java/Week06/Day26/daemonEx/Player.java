package daemonEx;

public class Player {
	public synchronized void video() {
		System.out.println("�������� ����մϴ�.");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void music() {
		System.out.println("������ ����մϴ�.");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
