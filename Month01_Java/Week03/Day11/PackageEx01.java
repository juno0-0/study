package main;

import a.aa.Person1;
import a.ab.Person2;
//import b.ba.Student1;
//import c.ca.ccb.It2;
//import c.ca.ccb.It3;
//import c.ca.ccb.It4;
import c.ca.*;//���� ���� ��
//*�� �ٷ� �տ� �ִ� ������ ��� Ŭ������ import
import c.ca.CA;
//ccb���� �ȿ� �ִ� ��� Ŭ����
import c.ca.ccb.It2;
import c.ca.ccb.It3;
import c.ca.ccb.It4;

public class PackageEx01{
	public static void main(String[] args) {
		Person3 p3 = new Person3();
		b.bb.Student2 st2 = new b.bb.Student2();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		It2 it2 = new It2();
		It3 it3 = new It3();
		It4 it4 = new It4();
		CA ca = new CA();
		
		//public�� ��� ������ ����
		a.aa.Person1 p1 = new a.aa.Person1("ȫ�浿");
		p1.age = 30;
		new Person1("�̼���");
		p1.person1Method();
		
		//protected�� ��� ������ ����
		//protected�� ������ �ȵȴ�.
//		Person2 p2 = new Person2("2��°���");//���� ���� : Person2()�������� ���ٱ����ڸ� public���� �ٲ��
//		p2.age = 30;
//		new Person2("����������");
//		p2.person2Method();
		
		//default�� ��� ������ ����
		//default�� ��� �ٸ� ��Ű������ �ν��Ͻ�ȭ�� �� �� ����.
//		Student1 st1 = new Student1();//��ü ���� �ȵ�
//		st1.age = 30;
//		st1.student1Method();
//		new Student1();
//		Student1.age; //static���ε� ������ �ȵȴ�.
		//���� ��Ű���� �ִ� Ŭ������ ���� ����
		Student3 st3 = new Student3();
		st3.age=30;
		st3.student3Method();
		
		//private�� ��� ������ ����
		//�����ڸ� public���� �س��� ���
//		Student4 st4 = new Student4();
//		st4.age=30;
//		st4.student4Method();
//		st4.studentPrint();
		
	
		
		
		
		
		
		
		
		
	}
}
