package p1;

public class StaticInstanceEx02 {
	public static void main(String[] args) {
		
		Student.kor = 100;//Ŭ������.���� : static����
		Student.eng = 80;
		
		Student.total();//Ŭ������.�޼��� : static�޼���
		
		Student s = new Student("�̰���","���ǰ�");//����� ������
		System.out.println(s.name);//��ü��.���� : �ν��Ͻ�����
		System.out.println(s.dept); 
	}
}
