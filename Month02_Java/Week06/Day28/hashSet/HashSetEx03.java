package hashSet;

import java.util.*;

public class HashSetEx03 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add(new String("ȫ�浿"));
		set1.add(new String("ȫ�浿"));
		
		//����� ���� Ŭ������ ������� Set�� �ֱ�
		Set<Person> set = new HashSet<Person>();
		//Set<Person> set = new LinkedHashSet<Person>();
		
		Person p = new Person("������",23);
		set.add(new Person("ȫ�浿",20));
		set.add(new Person("�̼���",30));
		set.add(new Person("������",40));
		set.add(new Person("ȫ�浿",20));
		set.add(new Person("ȫ�浿",20));
		
		set.add(p);
		
		Iterator<Person> iter = set.iterator();
		while(iter.hasNext()) {
			Person i = iter.next();
			System.out.println(i);
			//System.out.println(iter.next());
		}
		
		System.out.println(set1);
		
		Set<Student> s = new HashSet<Student>();
		s.add(new Student("�����",2018,10));
		s.add(new Student("�����",2018,20));
		s.add(new Student("�����",2018,15));
		s.add(new Student("�����",2018,10));
		s.add(new Student("������",2020,30));
		s.add(new Student("������",2020,30));
		s.add(new Student("������",2020,30));
		s.add(new Student("�����",2019,10));
		s.add(new Student("�����",2019,10));
		
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
	
	//�䱸���׿� ���� ���� ����� �Ǵ��� �������� hashCode(), equals()�� ������ �ش�.
	//��ü�� Set�� ������ �� ���������� hashCode()�� equals()�� ȣ���ؼ� ���ϴ� ��
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
		return "�б� : "+sName+", �й� : "+dept+", ��ȣ : "+num;
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