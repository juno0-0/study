package synchronizedEx2;

public class TargetThread extends Thread{
	@Override
	public void run() {
		for(long i=0;i<1000000000;i++) { }//������Ű�� �� TIMED_WAITING����
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {}//TIMED_WAITING����
		for(long i=0;i<1000000000;i++) { }//������Ű�� �� TIMED_WAITING����
	
	}
}
