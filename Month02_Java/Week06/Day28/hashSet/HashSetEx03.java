package hashSet;

import java.util.*;

public class HashSetEx03 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add(new String("홍길동"));
		set1.add(new String("홍길동"));
		
		//사용자 정의 클래스의 멤버들을 Set에 넣기
		Set<Person> set = new HashSet<Person>();
		//Set<Person> set = new LinkedHashSet<Person>();
		
		Person p = new Person("아이유",23);
		set.add(new Person("홍길동",20));
		set.add(new Person("이순신",30));
		set.add(new Person("정현희",40));
		set.add(new Person("홍길동",20));
		set.add(new Person("홍길동",20));
		
		set.add(p);
		
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {
			Person i = iter.next();
			System.out.println(i);
			//System.out.println(iter.next());
		}
		
		System.out.println(set1);
		
		Set<Student> s = new HashSet<Student>();
		s.add(new Student("서울대",2018,10));
		s.add(new Student("서울대",2018,20));
		s.add(new Student("서울대",2018,15));
		s.add(new Student("서울대",2018,10));
		s.add(new Student("연세대",2020,30));
		s.add(new Student("연세대",2020,30));
		s.add(new Student("연세대",2020,30));
		s.add(new Student("고려대",2019,10));
		s.add(new Student("고려대",2019,10));
		
		Iterator<Student> i = s.iterator();
		while(i.hasNext()) {
			Student temp = i.next();
			System.out.println(temp);
		}
	}
}

class Person{
	String name;
	int age;
	
	public Person() { }
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name : "+name+", age : "+age;
	}
	
	//요구사항에 따라서 같은 사람을 판단할 기준으로 hashCode(), equals()로 구현해 준다.
	//객체를 Set에 저장할 때 내부적으로 hashCode()와 equals()를 호출해서 비교하는 것
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		}
		return false;
	}
}


class Student{
	String sName;
	int dept;
	int num;
	
	public Student() {}

	public Student(String sName, int dept, int num) {
		this.sName = sName;
		this.dept = dept;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "학교 : "+sName+", 학번 : "+dept+", 번호 : "+num;
	}
	
	@Override
	public int hashCode() {
		return (sName+dept+num).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return sName.equals(s.sName)&&dept==s.dept&&num==s.num;
		}
		return false;
	}
}//end class