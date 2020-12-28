package threadEx;

public class Come implements Runnable{
//	public void come() {
//		while(true) {
//			System.out.println("come!!");
//		}
//	}
	@Override
	public void run() {//Thread로 처리할 내용을 작성
		while(true) {
			System.out.println("come!!");
		}
	}
}
