package threadEx;

public class Come implements Runnable{
//	public void come() {
//		while(true) {
//			System.out.println("come!!");
//		}
//	}
	@Override
	public void run() {//Thread�� ó���� ������ �ۼ�
		while(true) {
			System.out.println("come!!");
		}
	}
}
