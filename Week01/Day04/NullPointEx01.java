package P1;

public class NullPointEx01 {
	public static void main(String[] args) {
		//��������(�迭, Ŭ����, ������, �������̽�) ����
		Student st;//stack�� �ּҰ� �� st�� ����
		//st = Student�� �ּҰ��� ���� �������
		InterStudent is;//stack�� �ּҰ� �� is�� ����
		//is = InterStudent�� �ּҰ��� ���� �������
		
		int[] arr;//�迭
		
		//���������� �ʱⰪ�� �ֱ�
		Student st1 = null;
		//null = heap���� ���� �ּҰ� ����.
		InterStudent ist1 = null;
		int[] arr1 = null;
		
		//NullPointerException �߻��ϴ� ��
		int[] intArray = null;
		intArray = new int[3];
		intArray[0] = 10;
		//heap�� ������ ��� 10�� ���� �ڸ��� ���� ��.
		System.out.println(intArray[0]);
		
		String str = null;
		str = "�ڸ��� IT";
		System.out.println("�ѹ��ڼ� : "+str.length());
		//length() : ���̸� ���ϴ� �޼ҵ�
	}

}

class Student{
	
}
interface InterStudent{
	
}
