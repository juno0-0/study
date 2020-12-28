package threadEx;

public class CalcThread extends Thread{
	String name;

	public CalcThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(name);
		}
	}
	
}
