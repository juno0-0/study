package p2;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();//�߻�޼ҵ�, �ڽĵ��� ������ �� �ֵ��� �����⸸ ����� ���� ��.
	//���� ���� : static{ } --> main() --> {  } --> ������
	//main()�� static�̶� �ʱ�ȭ��Ϻ��� ���� ����ȴ�.
	//������
	public Animal() {  }

	//�ʱ�ȭ ���
	{  }
	
	//���� �ʱ�ȭ ���
	static{  }
}
