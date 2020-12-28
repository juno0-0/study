package p2;

public class AnimalMain {
	public static void main(String[] args) {
		//강아지클래스 객체화
		Dog d = new Dog();
		
		//고양이클래스 객체화
		Cat c = new Cat();
		
		//강아지클래스 다형성
		Animal dog = new Dog();
		
		//고양이클래스 다형성
		Animal cat = new Cat();
		
		//동물클래스 객체화
		//Animal a = new Animal();
		
		//출력 고양이는 야옹야옹하고 웁니다. 고양이는 숨을 쉽니다. 강아지는 멍멍멍멍하고 짖습니다. 강아지는 숨을 쉽니다.
		Cat nabi = (Cat)cat;
		
		System.out.print(cat+"는 ");
		cat.sound();
		System.out.println("하고 웁니다.");
		System.out.print(cat+"는 ");
		cat.breathe();
		
		System.out.print(dog.kind+"는 ");
		dog.sound();
		dog.sound();
		System.out.println("짖습니다.");
		System.out.print(dog.kind+"는 ");
		dog.breathe();
				
	}
}
