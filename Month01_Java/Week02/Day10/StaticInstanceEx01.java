package p1;

public class StaticInstanceEx01 {
	public static void main(String[] args) {
		//�ν��Ͻ� ���� 2��
		String nameMain;
		int ageMain;
		
		//Ŭ���� ���� 2��
		//static String telMain;//�ϳ��� �޼���(main) �ȿ� �ν��Ͻ� ������ static ������ ������ 
		//static String deptMain;//�ν��Ͻ��� ���� �ö󰡾��ϰ� static�� �޼��念���� �ö󰡾� �ϱ� ������(��ġ�� �޶�) ���ö�
		
		//Person Ŭ������ Ŭ�������(static)�� ����ϱ�
		Person.tel = "1234";		//�޸𸮿� �ö��־ �ٷ� �� �� �ִ�
		Person.dept = "��ǻ�Ͱ��а�";	//Ŭ������.���� ����
		
		//Person Ŭ������ �ν��Ͻ������ ����ϱ�
		Person p = new Person();//��üȭ(�ν��Ͻ�ȭ) = ���޸𸮿� �ø��� -> static�� ���� ���� �͸� �ö󰣴�.
		p.name = "ȫ�浿";
		p.age = 20;
		//p.tel = "1111"; ������ �ȳ����� ������� �ʴ´�.
		
		//Ŭ���� �޼��带 ����ϱ�
		Person.outputSt();
		
		//�ν��Ͻ� �޼��带 ����ϱ�
		p.output();
		
	}
}
