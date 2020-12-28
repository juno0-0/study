package runnable;

public class RunnableEx {
	public static void main(String[] args) {
//		Runnable runnable = () -> {//Runnable도 함수적 인터페이스
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i);
//			}
//		};
//		Thread t = new Thread(runnable);
//		t.start();
//		
//		Thread t2 = new Thread(new Runnable() {//익명 객체 생성
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println(i);
//				}				
//			}
//		});
		
		Thread t1 = new Thread(()-> {//람다식으로 익명 객체 생성
			for (int i = 0; i < 10; i++) {//Thread의 생성자를 보면 매개변수가 Runnable의 target으로 받고 있어서
				System.out.println(i);//따로 Runnable이라고 명시하지 않아도 Runnable의 람다식이 되는 것
			}
		});
		t1.start();
		
		
		
	}
}
