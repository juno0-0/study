package supplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {
	public static void main(String[] args) {
		//T get();
		Supplier<String> s = ()->{
			String name = "ȫ�浿";
			return name;
		};
		System.out.println(s.get());
		/*
		String get(){
			String name = "ȫ�浿";
			return name;
		}
		*/
		
		Supplier<Integer> s1 = ()->{
			int age = 20;
			return age;
		};	
		Car car = new Car();
		System.out.println(s1.get());
		Supplier<String> s2 = ()->{
			car.setName("�ҳ�Ÿ");
			return car.getName();
		};
		System.out.println(s2.get());
	    
		//boolean getAsBoolean();
		BooleanSupplier bs = ()->{
			return car.getName().equals("�ҳ�Ÿ");
		};
		System.out.println(bs.getAsBoolean());
		
		
	    //int getAsInt();
		IntSupplier is = ()->{
			car.price = 30000000;
			return car.price;
		};
		System.out.println("���� : "+is.getAsInt());
		
		DoubleSupplier ds = ()->{
			car.tax = car.price*0.0225;
			return car.tax;
		};
		System.out.println("���� : "+ds.getAsDouble());
	}
}
class Car{
	String name;
	int price;
	double tax; 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}