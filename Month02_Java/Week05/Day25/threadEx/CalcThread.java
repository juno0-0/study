package threadEx;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);//Thread Ŭ������ �ִ� setName()�� ȣ��
	}				  //setName()�� Thread Ŭ�������� final�� ����Ǿ� �־� ������ �Ұ���
	@Override
	public void run() {
		for(int i=0;i<2000;i++) {
			System.out.println(getName());
		}
	}
}
