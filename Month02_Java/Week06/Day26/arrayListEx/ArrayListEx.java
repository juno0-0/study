package arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		//ArrayList al = new ArrayList();//��ü���� 
		List al = new ArrayList();//��ü���� ������
		//�� �ֱ� - ���� 10, 20, 30
		al.add(new Integer(10));
		al.add(20);//�׳� ���� �־ �ȴ�.
		al.add(new Integer(30));
		al.add(new Integer(10));
		
		//�� �ֱ� - �Ǽ� 1.1, 3.3
		al.add(new Double(1.1));
		al.add(new Double(3.3));
		
		//�� �ֱ� - �� true, false;
		al.add(new Boolean(true));
		al.add(new Boolean(false));
		
		//�� �ֱ� - CarŬ����, Student Ŭ���� �������� �ֱ�
		al.add(new Car());
		al.add(new Student());
		al.add(new Car());
		al.add(new Car());
		
		//�ε��� ���� �ٲٱ�(�����ϱ�)
		al.set(3, new Double(20.15));
		al.set(5, new Car());
		
		//ArarryList �ȿ� ��� �ִ� ������ ����ϱ�
		System.out.println(al.get(5));
		System.out.println(al.get(7));
		System.out.println(al.get(11));

		System.out.println();
		al.add(3, new Integer(100));
		al.add(5, new Student());
		
		//��ü ����ϱ� get(0)~get(11) �ݺ��Ѵ�.
		//ArrayList�� ��ü ũ�� = size() 
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

class Car{ }

