package collect;

import java.util.*;

public class MaleStudent {
	private List<Student> list;//요소를 저장할 컬렉션

	public MaleStudent() {//생성자
		list = new ArrayList<Student>();
		System.out.println("["+Thread.currentThread().getName()+"] MaleStudent()");
	}
	
	public void accumulate(Student student) {//요소를 수집하는 메소드
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()+"] accumulate(Student student)");
	}
	
	//두 MaleStudent를 결합하는 메소드(병렬처리시에만 호출된다.)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()+"] combine(MaleStudent other)");
	}

	//getter
	public final List<Student> getList() {
		return list;
	}
	
	
	
	
	
}
