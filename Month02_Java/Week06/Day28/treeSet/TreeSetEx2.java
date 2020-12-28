package treeSet;

import java.util.*;

//정렬하고자 하는 자료 비교하기
//나이 순서대로 TreeSet에 달아주기
public class TreeSetEx2 {
	public static void main(String[] args) {
		Set<Person> tree = new TreeSet<>();
		tree.add(new Person("홍길동",30));
		tree.add(new Person("김길동",50));
		tree.add(new Person("홍길동",20));
		tree.add(new Person("이길동",10));
		tree.add(new Person("박길동",30));
		System.out.println(tree);
		
		Set<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("서울대", "홍길동", "이경미", 100));
	    treeSet.add(new Student("연세대", "최길동", "정경미", 90));
	    treeSet.add(new Student("고려대", "박길동", "정경미", 70));
	    treeSet.add(new Student("연세대", "최길동", "정경미", 90));
	    treeSet.add(new Student("서울대", "홍길동", "이경미", 100));
	    treeSet.add(new Student("연세대", "최길동", "정경미", 90));

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
		//점수 내림차순
		if(score<o.score)return 1;
		else if(score==o.score)return 0;
		else return -1;
		*/
		/*
		//학교명 오름차순
		if(schoolName.hashCode()<o.schoolName.hashCode())return -1;
		else if(schoolName.hashCode()==o.schoolName.hashCode())return 0;
		else return 1;
		*/
		
		//이름 오름차순
		if(Name.hashCode()<o.Name.hashCode())return -1;
		else if(Name.hashCode()==o.Name.hashCode())return 0;
		else return 1;
		
		/*
		//이름+점수 오름차순
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
		//나이순으로 TreeSet에 매달아 주기
		//if(age<o.age)return -1;//age : 트리에 달려있는 나이, o.age : 새롭게 트리에 달아야 하는 나이
		//else if(age==o.age)return 0;
		//else return 1;
		//이름순으로 TreeSet에 매달아 주기
		if((o.age+o.name).hashCode()<(age+name).hashCode())return -1;
		else if((o.age+o.name).hashCode()==(age+name).hashCode())return 0;
		else return 1;
		//내림차순으로 바꾸는건 return -1;과 return 1;을 바꿔주거나
		//매개변수로 받은 객체의 필드를 앞에다 쓰고 뒤에다 클래스 멤버필드를 쓴다.
		
	}
	
}