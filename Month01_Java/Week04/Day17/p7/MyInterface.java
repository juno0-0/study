package p7;

public interface MyInterface {
	public void method2010();//2010��~2019�� ���� Ŭ������ �������� ���� �߻�޼��� 2020~
	default void method2020(){}//2020�⵵ ���Ŀ� ������ Ŭ������ �������� ���� �߻�޼���
	default void method2030() {}
	
	static void stMethod4() {//2030�� ���� ���ο� �޼���
		System.out.println("���� �޼���");
	}
	
}
