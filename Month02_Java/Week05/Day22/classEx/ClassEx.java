package classEx;

import systemEx.SystemEx;

public class ClassEx {
	public static void main(String[] args) {
		Car c = new Car();
		//Class c = new Class();
		Class clazz1 = c.getClass();//생성자가 없는 경우의 클래스
		String name = clazz1.getName();
		String sname = clazz1.getSimpleName();
		//Package pc = clazz1.getPackage();//패키지 클래스로 리턴된다.
		//String pName = pc.getName();
		String pName = clazz1.getPackage().getName();//위의 2줄을 1줄로 만든 것
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