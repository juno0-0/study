package P1;

public class ReferenceAddressEx01 {
	public static void main(String[] args) { 
		Object1 refVal1 = new Object1();
		//new Object1 = Heap������ Object1�� �ø� = �ּҰ� ���� = refVal1�� �ּҸ� ����
		Object2 refVal2 = new Object2();
		//new Object2 = Heap������ Object2�� �ø� = �ּҰ� ���� = refVal2�� �ּҸ� ����
		Object2 refVal3 = new Object2();
		//new Object3 = Heap������ Object3�� �ø� = �ּҰ� ���� = refVal3�� �ּҸ� ����
		
		if(refVal1.irum1.equals(refVal2.irum2))
			System.out.println("���� �̸��Դϴ�.");
		else
			System.out.println("�ٸ� �̸��Դϴ�.");
		if(!(refVal1.equals(refVal2)))
			System.out.println("�ٸ� �ּ��Դϴ�.");
		else
			System.out.println("���� �ּ��Դϴ�.");
		if(!(refVal2.equals(refVal3)))
			System.out.println("�ٸ� �ּ��Դϴ�.");
		else
			System.out.println("���� �ּ��Դϴ�.");
		if(!(refVal2.equals(refVal3)))
			System.out.println("�ٸ� �ּ��Դϴ�.");
		else
			System.out.println("���� �ּ��Դϴ�.");
		
		String name1 = "����ȣ";
		String name2 = "����ȣ";
		if(name1==name2)
			System.out.println("���� �̸�");
		else 
			System.out.println("�ٸ� �̸�");
		
		String name3 = new String("����ȣ");
		String name4 = new String("����ȣ");
		
		if(name3==name4)//���ڿ����ͷ��� �����ϴٸ� String ��ü�� �ּҸ� �����Ѵ�.
			System.out.println("���� �̸�");
		else 
			System.out.println("�ٸ� �̸�");
		
		if(name3.equals(name4))//name3�� �ּҷ� ���� �ִ� ���� name4�� �ּҷ� ���� �ִ� ���� ������ ��
			System.out.println("���� �̸�");
		else 
			System.out.println("�ٸ� �̸�");
		
		
	}
}

class Object1{
	String irum1 = "����ȣ";
}
class Object2{
	String irum2 = "����ȣ2";
}
class Object3{
	//��ü3
	
}