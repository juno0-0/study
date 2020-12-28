package compare;

public class CompareMethodEx {
	public static void main(String[] args) {
		Pair p1 = new Pair<Integer, String>(1,"사과");
		Pair p2 = new Pair<Integer, String>(1,"사과");
		Util u = new Util();
		System.out.println(u.compare(p1, p2));
		//Util.<Integer, String>compare(p1, p2);
		//Util.compare(p1, p2);//1.7버전 이후로 <> 생략 가능
		
		Pair p5 = new Pair<Integer, Boolean>(10, true);
		Pair p6 = new Pair<Integer, Boolean>(10, false);
		System.out.println(u.compare(p5, p6));
		Pair p7 = new Pair<Car, Integer>(new Car("소나타"), 10);
		Pair p8 = new Pair<Car, Integer>(new Car("소나타"), 10);
		System.out.println(u.compare(p7, p8));
	}
}

class Car{
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car)obj;
			return name.equals(c.name);
		}
		return false;
	}
	
}
