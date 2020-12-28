package ex;

public class Music extends Thread{
	@Override
	   public  void run() {
	     
	      printMethodM();
	   }
	   public synchronized void printMethodM() {
	      while(true) {
	      System.out.println("음악을 재생합니다.");
	      notify();
	      try {
	         wait(1000);
	       }catch(InterruptedException e) {}
	   }
	  }

	
	
	
}
