package joinEx;

public class JoinEx {
	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		try {
			st.join();//join() �����ϴ� �� interrupt()�� ȣ��Ǹ� ���ܹ߻�
		} catch (InterruptedException e) {}//interrupt()�� ������� ����ų� ����� ����� ��
		//�Ͻ����� ���°� �Ǹ� interrupt()�� ȣ��ȴ�.
		//start()�� ȣ��ǰ� run()�� �����ϴ� ���� join()���� �Ͻ����� �ϴ� ��
		System.out.println("�� : "+st.getSum());//run()�� ����Ǳ⵵ ���� getSum()�� ȣ���� ��
		
	}
}
