package runnable;

public class RunnableEx {
	public static void main(String[] args) {
//		Runnable runnable = () -> {//Runnable�� �Լ��� �������̽�
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i);
//			}
//		};
//		Thread t = new Thread(runnable);
//		t.start();
//		
//		Thread t2 = new Thread(new Runnable() {//�͸� ��ü ����
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println(i);
//				}				
//			}
//		});
		
		Thread t1 = new Thread(()-> {//���ٽ����� �͸� ��ü ����
			for (int i = 0; i < 10; i++) {//Thread�� �����ڸ� ���� �Ű������� Runnable�� target���� �ް� �־
				System.out.println(i);//���� Runnable�̶�� ������� �ʾƵ� Runnable�� ���ٽ��� �Ǵ� ��
			}
		});
		t1.start();
		
		
		
	}
}
