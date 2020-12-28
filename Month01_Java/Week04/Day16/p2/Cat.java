package p2;

public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.print("야옹야옹!!");
	}
	
	public Cat() {
		this.kind="포유류";//원래는 super지만 this를 쓰면 컴퓨터가 Cat에서 먼저 찾고 없으면 부모의 클래스에서 찾는다.
	}
	
	@Override
	public String toString() {
		return "고양이";
	}
	
}
