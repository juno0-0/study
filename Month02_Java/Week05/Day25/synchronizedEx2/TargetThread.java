package synchronizedEx2;

public class TargetThread extends Thread{
	@Override
	public void run() {
		for(long i=0;i<1000000000;i++) { }//지연시키는 것 TIMED_WAITING상태
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {}//TIMED_WAITING상태
		for(long i=0;i<1000000000;i++) { }//지연시키는 것 TIMED_WAITING상태
	
	}
}
