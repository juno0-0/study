package lambda;

public class Inter1Ex {
	public static void main(String[] args) {
		Inter1 i1 = new Inter1() {
			
			@Override
			public void inter1Method() {
				System.out.println("익명 구현 객체 표현하기");
			}
		};
		
		Inter1 i2 = ()->{System.out.println("익명 구현 객체 표현하기");
						 System.out.println("객체명이 생략된 모습");};
						 //실행문이 1개면 { }생략 가능
		i1.inter1Method();
		i2.inter1Method();
	}
}
