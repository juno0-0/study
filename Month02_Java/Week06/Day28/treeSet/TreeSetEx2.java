package treeSet;

import java.util.*;

//�����ϰ��� �ϴ� �ڷ� ���ϱ�
//���� ������� TreeSet�� �޾��ֱ�
public class TreeSetEx2 {
	public static void main(String[] args) {
		Set<Person> tree = new TreeSet<>();
		tree.add(new Person("ȫ�浿",30));
		tree.add(new Person("��浿",50));
		tree.add(new Person("ȫ�浿",20));
		tree.add(new Person("�̱浿",10));
		tree.add(new Person("�ڱ浿",30));
		System.out.println(tree);
		
		Set<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("�����", "ȫ�浿", "�̰��", 100));
	    treeSet.add(new Student("������", "�ֱ浿", "�����", 90));
	    treeSet.add(new Student("�����", "�ڱ浿", "�����", 70));
	    treeSet.add(new Student("������", "�ֱ浿", "�����", 90));
	    treeSet.add(new Student("�����", "ȫ�浿", "�̰��", 100));
	    treeSet.add(new Student("������", "�ֱ浿", "�����", 90));

		System.out.println(treeSet);
		
	}
}

class Student implements Comparable<Student>{
	String schoolName;
	String tName;
	String Name;
	int score;
	
	public Student(String schoolName, String tName, String name, int score) {
		this.schoolName = schoolName;
		this.tName = tName;
		this.Name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return schoolName+" "+tName+" "+Name+" "+score;
	}

	@Override
	public int compareTo(Student o) {
		/*
		//���� ��������
		if(score<o.score)return 1;
		else if(score==o.score)return 0;
		else return -1;
		*/
		/*
		//�б��� ��������
		if(schoolName.hashCode()<o.schoolName.hashCode())return -1;
		else if(schoolName.hashCode()==o.schoolName.hashCode())return 0;
		else return 1;
		*/
		
		//�̸� ��������
		if(Name.hashCode()<o.Name.hashCode())return -1;
		else if(Name.hashCode()==o.Name.hashCode())return 0;
		else return 1;
		
		/*
		//�̸�+���� ��������
		if((Name+score).hashCode()<(o.Name+o.score).hashCode())return -1;
		else if((Name+score).hashCode()==(o.Name+o.score).hashCode())return 0;
		else return 1;
		*/
	}
}







class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"   "+age;
	}
	
	@Override
	public int compareTo(Person o) {
		//���̼����� TreeSet�� �Ŵ޾� �ֱ�
		//if(age<o.age)return -1;//age : Ʈ���� �޷��ִ� ����, o.age : ���Ӱ� Ʈ���� �޾ƾ� �ϴ� ����
		//else if(age==o.age)return 0;
		//else return 1;
		//�̸������� TreeSet�� �Ŵ޾� �ֱ�
		if((o.age+o.name).hashCode()<(age+name).hashCode())return -1;
		else if((o.age+o.name).hashCode()==(age+name).hashCode())return 0;
		else return 1;
		//������������ �ٲٴ°� return -1;�� return 1;�� �ٲ��ְų�
		//�Ű������� ���� ��ü�� �ʵ带 �տ��� ���� �ڿ��� Ŭ���� ����ʵ带 ����.
		
	}
	
}