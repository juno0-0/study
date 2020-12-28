package threadEx;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);//Thread 클래스에 있는 setName()을 호출
	}				  //setName()은 Thread 클래스에서 final로 선언되어 있어 재정의 불가능
	@Override
	public void run() {
		for(int i=0;i<2000;i++) {
			System.out.println(getName());
		}
	}
}
