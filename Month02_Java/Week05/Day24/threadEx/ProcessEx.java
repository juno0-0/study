package threadEx;

public class ProcessEx {
	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		Stop stop = new Stop();
		Pause pause = new Pause();
		Thread t1 = new Thread(go);//Runnable�� start()�� ��� ����� �Ѵ�.
		Thread t2 = new Thread(come);
		Thread t3 = new Thread(stop);
		Thread t4 = new Thread(pause);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
