package p1;
/*
 * B : ��
 * A : �� ��
 * C : �� �� ��
 */
public class D {
	public static void main(String[] args) {
		//��ü �ڷ� ����ϱ�
		System.out.println("1~10������ ��, �� ���ϱ�");
		Aclass a = new Aclass(10);
		System.out.println("�հ� = "+a.sumBMethod());
		System.out.println("55-10 = "+a.subAMethod());
		
		System.out.println("1~100������ �� ���ϱ�");
		Bclass b = new Bclass(100);
		System.out.println("�հ� = "+b.sumBMethod());
		
		System.out.println("1~200������ �� ���ϱ�");
		Cclass c = new Cclass(200);
		System.out.println("�հ� = "+c.sumBMethod());
		System.out.println("(1~200������ ��)-10 = "+c.subAMethod());
		System.out.println("(1~20������ ��) = "+c.mulCMethod());
		
		
	}
	
}
