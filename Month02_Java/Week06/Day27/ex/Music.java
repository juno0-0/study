package ex;

public class Music extends Thread{
	@Override
	   public  void run() {
	     
	      printMethodM();
	   }
	   public synchronized void printMethodM() {
	      while(true) {
	      System.out.println("������ ����մϴ�.");
	      notify();
	      try {
	         wait(1000);
	       }catch(InterruptedException e) {}
	   }
	  }

	
	
	
}
