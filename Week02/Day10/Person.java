package p1;

public class Person {
	//�ν��Ͻ� ���� 2�� ����
	String name;
	int age;
	
	//Ŭ���� ���� 2�� ���� static
	static String tel;
	static String dept;
	
	//�޼���
	//�ν��Ͻ� �޼���
	//�ν��Ͻ� �޼���� Ŭ��������� �ν��Ͻ������ �� ���� �� �ִ�.
	void output() {
		name = "�ּ���";
		age = 10;
		tel = "777";
		dept = "���а�";
		System.out.println("�ν��Ͻ� �޼��� �κ��Դϴ�.");
		outputSt();
	}
	
	//Ŭ���� �޼��� static
	//Ŭ�����޼��� �ȿ� ���� �� �ִ� ���� static���� �� ������ ���� �� �ִ�.
	static void outputSt() {
		tel = "888";
		dept = "�ǾƳ�";
		//name = "�ڰ��";  <- static�� ������ �δ��ܰ迡�� ���� �޸𸮿� �ö󰡴µ�  
		//age = 40;			  name�� age�� ����ܰ迡�� new�ؼ� ��ü�� ������ �� �޸𸮿� �ö󰡱� ������ ������ ����.
		//output();
		
		System.out.println("Ŭ���� ����� �޼����Դϴ�.");
	}
	
	
	
	
}
