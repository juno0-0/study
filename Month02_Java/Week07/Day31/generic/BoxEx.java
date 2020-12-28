package generic;

public class BoxEx {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box<Apple> box2 = new Box<Apple>();
		box2.setT(new Apple());
		//box2.setT(new Banana());//Apple클래스만 넣을 수 있는 곳에 Banana 클래스를 넣어서 에러
		//box2.set("홍길동");//Apple클래스만 넣을 수 있는 곳에 문자열을 넣어서 에러
		Box<Banana> box3 = new Box<Banana>();
		box3.setT(new Banana());
		
		
		/*
		box1.setObject("사과");
		box1.setObject("포도");
		box1.setObject(new Apple());
		box1.setObject(123);
		
		Box box2 = new Box();
		box2.setObject("바나나");
		box2.setObject("갈비");
		*/
		
		
		
	}
}
