package p2;

import p3.VarOrder;

public class GameOrder {
	static int point = 800;//���⼭ static�� �Ⱥ����� 1000, 1000, 1000���� ��µȴ�.
	int instanceVar = 20;//static�� �ƴ� �������� ��� ����.
	public GameOrder() {
		this.instanceVar=300;
		System.out.println("���� ����Ʈ�� "+point);
	}

	static{
//		this.point=200;//static������ this��� �ȉ�
		System.out.println("��Ʈ��ũ ����");
		
	}

	{
		this.instanceVar=100;
		point+=200;
		System.out.println("����Ʈ �ʱ�ȭ");
		System.out.println("����â ����");
	}
	static void stMethod() {
//		this.instanceVar;
//		this.point;
		
	}

}
