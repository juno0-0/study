package synchronizedEx;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		System.out.println("���� �����尡 ����� �� �ִ� ��up");
		synchronized(this){//()�ȿ��� ���� ��ü(���� Ŭ����)
			//�Ӱ迵�� : �� �����常 ������ �� �ִ� ���, �ٸ� ������� ������
			this.memory = memory;
			try {
				Thread.sleep(2000);//2�ʵ��� �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+this.memory);
		}
		System.out.println("���� �����尡 ����� �� �ִ� ��down");
	}
	
}
