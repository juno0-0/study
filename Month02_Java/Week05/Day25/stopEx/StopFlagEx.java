package stopEx;

public class StopFlagEx {
	public static void main(String[] args) {
		PrintThread1 pt = new PrintThread1();
		pt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		pt.setStop(true);
	}
	
	
	
	
}

class PrintThread1 extends Thread{
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		while(!stop) {
			System.out.println("������");
		}
		System.out.println("�ڿ����� - �����ִ� ��Ʈ��ũ �α׾ƿ�, �����ͺ��̽� close, ���� close");
		System.out.println("���� ����");
	}
	
	
}