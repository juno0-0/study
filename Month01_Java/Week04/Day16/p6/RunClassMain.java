package p6;

public class RunClassMain {
	public static void main(String[] args) {
		//���� Ŭ������ ��üȭ �ϼ���.
		RunClassEx rce = new RunClassEx();
		//interMethod()ȣ��
		System.out.print("interMethod()ȣ�� : ");
		rce.interMethod();
		//inter0101Method()ȣ��
		System.out.print("inter0101Method()ȣ�� : ");
		rce.inter0101Method();
		//inter0102Method()ȣ��
		System.out.print("inter0102Method()ȣ�� : ");
		rce.inter0102Method();
		
		//������ ����Ŭ������ ��üȭ�ϰ� �θ����������� Inter0102�� �ϱ�
		Inter0102 i = new RunClassEx();
		
		//interMethod()ȣ��
		i.interMethod();
		//inter0102Method()ȣ��
		i.inter0102Method();
		
		//Inter0102Ÿ���̶� Inter0101���� ������ �� ����.
		//i.inter0101Method();
		
		//������ ����Ŭ������ ��üȭ�ϰ� �θ����������� Inter0101�� �ϱ�
		Inter0101 j = new RunClassEx();
		j.interMethod();
		j.inter0101Method();
		//Inter0101Ÿ���̶� Inter0102���� ������ �� ����.
		Inter0102 h = (Inter0102)j;
		System.out.println("Test");
		h.inter0102Method();
		System.out.println("!");
		
		//������ ����Ŭ������ ��üȭ�ϰ� �θ����������� Inter01�� �ϱ�
		Inter01 k = new RunClassEx();
		k.interMethod();
		
		Inter0101 k1 = (Inter0101)k;
		k1.inter0101Method();
		
		Inter0102 k2 = (Inter0102)k;
		k2.inter0102Method();
		
		
		
	}
}
