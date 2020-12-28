package collect;

import java.util.*;

public class MaleStudent {
	private List<Student> list;//��Ҹ� ������ �÷���

	public MaleStudent() {//������
		list = new ArrayList<Student>();
		System.out.println("["+Thread.currentThread().getName()+"] MaleStudent()");
	}
	
	public void accumulate(Student student) {//��Ҹ� �����ϴ� �޼ҵ�
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()+"] accumulate(Student student)");
	}
	
	//�� MaleStudent�� �����ϴ� �޼ҵ�(����ó���ÿ��� ȣ��ȴ�.)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()+"] combine(MaleStudent other)");
	}

	//getter
	public final List<Student> getList() {
		return list;
	}
	
	
	
	
	
}
