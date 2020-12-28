package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {
	public static void main(String[] args) {
		//void accept(T t);
		Consumer<String> c = t->{//Consumer�� ���� �߻�޼ҵ��� �Ű������� T t
			System.out.println(t+"8");
		};
		c.accept("java");
		
		//void accept(T t, U u);
		BiConsumer<String, String> b = (t,u)->{//BiConsumer�� ���� �߻�޼ҵ��� �Ű������� U u, T t
			System.out.println(t+u);
		};//���ٽ����� accept()�� �������̵� �� ��
		b.accept("java", "8");
		
	    //void accept(double value);
		DoubleConsumer d = (v) -> {//DoubleConsumer�� ���� �߻�޼ҵ��� �Ű������� double value
			v = v+100; 
			System.out.println(v);
		}; 
		d.accept(100.1);
		
		//void accept(T t, int value);
		ObjIntConsumer<Car> oi = (t, v) -> {
			System.out.println(t.getName());
			System.out.println(v);
		};
		Car car = new Car("�ҳ�Ÿ");
		oi.accept(car, 100000);
		
	    //void accept(long value);
		LongConsumer lc = (value) -> {
			System.out.println(value-2000000000);
		};
		lc.accept(100000);
		
		
	}
}

class Car{
	private String name;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	
}