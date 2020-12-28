package minByMaxBy;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorMinByMaxByEx {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		//minBy() 호출, 정적 메소드 
		//int compare(T o1, T o2)
		binaryOperator = BinaryOperator.minBy((o1,o2)->Integer.compare(o1.price, o2.price));
		fruit = binaryOperator.apply(new Fruit("딸기",6000), new Fruit("수박",10000));
		System.out.println(fruit.name);
		//minBy로 가격을 비교해서 가격이 싼 딸기가 출력
		
		binaryOperator = BinaryOperator.maxBy((o1,o2)->Integer.compare(o1.price, o2.price));
		fruit = binaryOperator.apply(new Fruit("딸기",6000), new Fruit("수박",10000));
		System.out.println(fruit.name);
		//maxBy로 가격을 비교해서 가격이 비싼 딸기가 출력
		
		//int applyAsInt(int left, int right);
		//IntBinaryOperator i = (t1, t2)->{return Math.max(t1, t2);}; 람다식 표현
		IntBinaryOperator i = Math::max;//메소드 참조(매개값을 전달하는 역할만 하는 경우), 람다식을 더 간략화
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
