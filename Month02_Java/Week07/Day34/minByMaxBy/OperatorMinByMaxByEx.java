package minByMaxBy;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorMinByMaxByEx {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		//minBy() ȣ��, ���� �޼ҵ� 
		//int compare(T o1, T o2)
		binaryOperator = BinaryOperator.minBy((o1,o2)->Integer.compare(o1.price, o2.price));
		fruit = binaryOperator.apply(new Fruit("����",6000), new Fruit("����",10000));
		System.out.println(fruit.name);
		//minBy�� ������ ���ؼ� ������ �� ���Ⱑ ���
		
		binaryOperator = BinaryOperator.maxBy((o1,o2)->Integer.compare(o1.price, o2.price));
		fruit = binaryOperator.apply(new Fruit("����",6000), new Fruit("����",10000));
		System.out.println(fruit.name);
		//maxBy�� ������ ���ؼ� ������ ��� ���Ⱑ ���
		
		//int applyAsInt(int left, int right);
		//IntBinaryOperator i = (t1, t2)->{return Math.max(t1, t2);}; ���ٽ� ǥ��
		IntBinaryOperator i = Math::max;//�޼ҵ� ����(�Ű����� �����ϴ� ���Ҹ� �ϴ� ���), ���ٽ��� �� ����ȭ
		int m = i.applyAsInt(100, 200);
		System.out.println(m);
	}
}

class Fruit{
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
