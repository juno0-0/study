package classEx;

import systemEx.SystemEx;

public class ClassEx {
	public static void main(String[] args) {
		Car c = new Car();
		//Class c = new Class();
		Class clazz1 = c.getClass();//�����ڰ� ���� ����� Ŭ����
		String name = clazz1.getName();
		String sname = clazz1.getSimpleName();
		//Package pc = clazz1.getPackage();//��Ű�� Ŭ������ ���ϵȴ�.
		//String pName = pc.getName();
		String pName = clazz1.getPackage().getName();//���� 2���� 1�ٷ� ���� ��
		System.out.println(clazz1);
		System.out.println(name);
		System.out.println(sname);
		System.out.println("===");
		System.out.println(pName);
		System.out.println("===");
		SystemEx s = new SystemEx();
		Class test = s.getClass();
		String name1 = test.getName();
		System.out.println(name1);

	}

}
class Car{
	
}