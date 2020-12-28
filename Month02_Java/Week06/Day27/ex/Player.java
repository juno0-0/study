package ex;

public class Player {
	public synchronized void music() {
		while(true) {
			try {
				wait();
			} catch (InterruptedException e) {}
			notify();
		}
	}
	
	public synchronized void video() {
		while(true) {
			try {
				wait();
			} catch (InterruptedException e) { }
			notify();
		}
	}
}
