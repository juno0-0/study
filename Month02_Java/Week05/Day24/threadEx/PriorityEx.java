package threadEx;

public class PriorityEx {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread t = new CalcThread("thread"+i);
			if(i!=10) {
				t.setPriority(Thread.MIN_PRIORITY);//1~9���� �켱������ 1�� �ֱ�
			}else {
				t.setPriority(Thread.MAX_PRIORITY);//10�� �켱������ ���������� �ֱ�
			}
			t.start();//Runnable ���·� �ֱ� --> �����층(�ü��) --> Running 
		}
		
	}
}
