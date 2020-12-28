package main;

import a.aa.Person1;
import a.ab.Person2;
//import b.ba.Student1;
//import c.ca.ccb.It2;
//import c.ca.ccb.It3;
//import c.ca.ccb.It4;
import c.ca.*;//위와 같은 것
//*은 바로 앞에 있는 폴더의 모든 클래스만 import
import c.ca.CA;
//ccb폴더 안에 있는 모든 클래스
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
		
		//public인 경우 접근해 보기
		a.aa.Person1 p1 = new a.aa.Person1("홍길동");
		p1.age = 30;
		new Person1("이순신");
		p1.person1Method();
		
		//protected인 경우 접근해 보기
		//protected라서 접근이 안된다.
//		Person2 p2 = new Person2("2번째사람");//오류 내용 : Person2()생성자의 접근권한자를 public으로 바꿔라
//		p2.age = 30;
//		new Person2("생성자접근");
//		p2.person2Method();
		
		//default인 경우 접근해 보기
		//default인 경우 다른 패키지에서 인스턴스화도 할 수 없다.
//		Student1 st1 = new Student1();//객체 생성 안됨
//		st1.age = 30;
//		st1.student1Method();
//		new Student1();
//		Student1.age; //static으로도 접근이 안된다.
		//같은 패키지에 있는 클래스만 접근 가능
		Student3 st3 = new Student3();
		st3.age=30;
		st3.student3Method();
		
		//private인 경우 접근해 보기
		//생성자만 public으로 해놓은 경우
//		Student4 st4 = new Student4();
//		st4.age=30;
//		st4.student4Method();
//		st4.studentPrint();
		
	
		
		
		
		
		
		
		
		
	}
}
