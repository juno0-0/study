package hashMap;

import java.sql.Struct;
import java.util.*;
import java.util.Map.Entry;

public class HashMapEx01 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		//Map�� �� �ֱ�
		map.put(new Student(2020,"ȫ�浿"),100);
		map.put(new Student(2019,"��浿"),80);
		map.put(new Student(2018,"ȫ�浿"),90);
		map.put(new Student(2020,"ȫ�浿"),100);
		
		//����ϱ�
		System.out.println(map.get(new Student(2018,"ȫ�浿")));
		
		//��ü�� ����ϱ� map.get(key) �ݺ�
		//���1 key�� ���δ� ������ �´�.
		Set<Student> s = map.keySet();
		Iterator<Student> iter = s.iterator();
		while(iter.hasNext()) {
			Student ss = iter.next();
			System.out.println(map.get(ss));
			
		}
		//���2 Map�� �ִ� Map.Entry�� ��� ������ �´�. --> key�� ������ �´� --> �ݺ��ؼ� key�� �־��ش�.
		//                                      value�� ������ �´� --> �ݺ��ؼ� value�� �־��ش�.
		Set<Map.Entry<Student, Integer>> es = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> it = es.iterator();
		while(it.hasNext()) {
			Map.Entry<Student, Integer> sss = it.next();
			System.out.println(sss.getKey().name+" "+sss.getKey().sno+" "+sss.getValue());
		}
		
		
		
		
		
		
		Map<Person, Integer> pMap = new HashMap<Person, Integer>();
		pMap.put(new Person(123,"����","ȫ�浿"), 100);
		pMap.put(new Person(234,"��õ","��浿"), 90);
		pMap.put(new Person(345,"��õ","�ڱ浿"), 200);
		pMap.put(new Person(123,"����","ȫ�浿"), 300);
		
		System.out.println(pMap.get(new Person(123,"����","ȫ�浿")));
		Set<Map.Entry<Person, Integer>> sm =  pMap.entrySet();
		Iterator<Map.Entry<Person, Integer>> si = sm.iterator();
		while(si.hasNext()) {
			Map.Entry<Person, Integer> mm = si.next();
			System.out.println(mm.getKey().tel+" "+mm.getKey().address+" "+mm.getKey().name+" "+mm.getValue());
		}
		Map<Login, String> lMap = new HashMap<Login, String>();
		lMap.put(new Login("bang"), "1234");
		lMap.put(new Login("abcd"), "aaaa");
		lMap.put(new Login("zoo"), "Boo");
		lMap.put(new Login("qqq"), "234553");
		
		System.out.println(lMap.get(new Login("bang")));
		Set<Map.Entry<Login, String>> log = lMap.entrySet();
		Iterator<Map.Entry<Login, String>> logi = log.iterator();
		while(logi.hasNext()) {
			Map.Entry<Login,String> mmm = logi.next();
			System.out.println(mmm.getKey().id+" "+mmm.getValue());
		}

		
		
		
	}
}
class Student{
	int sno;
	String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return (sno+name).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return sno==s.sno&&name.equals(s.name);
		}
		else return false;
	}
}

class Person{
	int tel;
	String address;
	String name;
	public Person(int tel, String adress, String name) {
		this.tel = tel;
		this.address = adress;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return (tel+address+name).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p =(Person)obj;
			return tel==p.tel&&address.equals(p.address)&&name.equals(p.name);
		}
		else return false;
	}
}

class Login{
	String id;

	public Login(String id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Login) {
			Login l = (Login)obj;
			return id.equals(l.id);
		}else return false;
	}
	
}
