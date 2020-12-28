package hashMap;

import java.sql.Struct;
import java.util.*;
import java.util.Map.Entry;

public class HashMapEx01 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		//Map에 값 넣기
		map.put(new Student(2020,"홍길동"),100);
		map.put(new Student(2019,"김길동"),80);
		map.put(new Student(2018,"홍길동"),90);
		map.put(new Student(2020,"홍길동"),100);
		
		//출력하기
		System.out.println(map.get(new Student(2018,"홍길동")));
		
		//전체를 출력하기 map.get(key) 반복
		//방법1 key만 전부다 가지고 온다.
		Set<Student> s = map.keySet();
		Iterator<Student> iter = s.iterator();
		while(iter.hasNext()) {
			Student ss = iter.next();
			System.out.println(map.get(ss));
			
		}
		//방법2 Map에 있는 Map.Entry를 모두 가지고 온다. --> key만 가지고 온다 --> 반복해서 key를 넣어준다.
		//                                      value만 가지고 온다 --> 반복해서 value를 넣어준다.
		Set<Map.Entry<Student, Integer>> es = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> it = es.iterator();
		while(it.hasNext()) {
			Map.Entry<Student, Integer> sss = it.next();
			System.out.println(sss.getKey().name+" "+sss.getKey().sno+" "+sss.getValue());
		}
		
		
		
		
		
		
		Map<Person, Integer> pMap = new HashMap<Person, Integer>();
		pMap.put(new Person(123,"서울","홍길동"), 100);
		pMap.put(new Person(234,"인천","김길동"), 90);
		pMap.put(new Person(345,"부천","박길동"), 200);
		pMap.put(new Person(123,"서울","홍길동"), 300);
		
		System.out.println(pMap.get(new Person(123,"서울","홍길동")));
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
