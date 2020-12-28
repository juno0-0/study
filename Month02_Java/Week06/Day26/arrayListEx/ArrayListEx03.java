package arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx03 {
	public static void main(String[] args) {
		
		List<Student> ls = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		//ls�ȿ� StudentŬ������ 3�� �ֱ� �й� 2020 2019 2019
		ls.add(new Student("2020","ȫ�浿"));
		ls.add(new Student("2019","�̼���"));
		ls.add(new Student("2019","�ְ���"));
		//li�ȿ� 100, 200, 300 �ֱ�
		li.add(100);
		li.add(200);
		li.add(300);
		//li���� 1�� �ε����� 100�ֱ�(����)
		li.add(1, 100);
		//ls���� 2�� �ε����� "2018"�ֱ�(����)
		ls.add(2, new Student("2018","������"));
		//�ְ��� ���. ����� get(index)
		System.out.println(ls.get(3).getName());
		//2018�� ���
		System.out.println(ls.get(2).getNo());
		//�ְ��� �ֹ������� �ٲ㺸����
		ls.get(3).setName("�ֹ���");
		//2018�� 2017�� �ٲ㺸����
		ls.get(2).setNo("2017");
		System.out.println(ls.get(3).getName());
		System.out.println(ls.get(2).getNo());
		//3�� index ã��
		
		//2017�� ��� index�� �ִ���
		
	}
}

class Student{
	private String no;
	private String name;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
		
	}
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
	}
	
}