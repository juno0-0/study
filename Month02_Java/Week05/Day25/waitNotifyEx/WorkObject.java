package waitNotifyEx;

public class WorkObject {//���� ��ü�� Ŭ����
	public synchronized void methodA() {
		//�Ӱ迵�� : �� �����常 ����� �� �ִ� �κ�
		//�ϳ� ������ ������ ����
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	
	
}
