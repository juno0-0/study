package p1;

public class StaticInstanceEx03 {
	//������ �ڱⰡ ���� {}�� ������ �������.
	//�ٸ� Ŭ�������� ��ü�� �����ؼ� �� �� ������ ��üȭ ���� ������ �� �� ����.
	static int publicVar = 100;
	
	
	public static void main(String[] args) {//main���� static�� �پ��ִ� = void sum(){}�� main�� �޸𸮿� �ö� �� �޸𸮿� �ö��� ���� �����̱� ������. 
		final int publicVar; //static �޼��� �ȿ� static ���������� �־ �����߻�
									//���������� ����� ������ ������� �ϴµ� static�� �پ��־ �ٽ� �޸𸮷� ���ư��� �ϴϱ� �浹�� ����Ų��.
									//= ������������ static�� ������ �ȵȴ�.
		System.out.println(StaticInstanceEx03.publicVar);
//		System.out.println(publicVar);
									
	}
	static void sum() {
		System.out.println(publicVar);//�޼��� ���� ������ "}"�� ������ �������. = main�� {}�� ����� publicVar�� �����.
	}
	
	static void rank() {
		publicVar++;//�޼��� ���� ������ "}"�� ������ �������. = main�� {}�� ����� publicVar�� �����.
	}
}
