package P1;

public class Test {
	public static void main(String[] args) {
		String name1 = "����ȣ";
		String name2 = "����ȣ";
		
		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿");
		
		//name3�� ����Ű�� ���� name4�� ����Ű�� ���� ������ ���ϱ�
		if(name3.equals(name4)) {
			System.out.println("���� ��");
		}else {
			System.out.println("�ٸ� ��");
		}
		//==�����ڴ� �⺻���� ��쿡 ������ !=�� �⺻���� ��쿡 ���� ���� ���� �Ǹ��Ѵ�.
		//�������� ��� ==�� �������� ������ �ִ� �ּҸ� ���Ѵ�.
		if(name3==name4) {
			System.out.println("���� �ּ�");
		}else {
			System.out.println("�ٸ� �ּ�");
		}
	}
}
class Student{
	
}