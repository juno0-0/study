package anonymousClass;

public class PCMain {
	public static void main(String[] args) {
		int b=20;
		Parent1 p1 = new Parent1() {
			int a =10;
			
			@Override
			public void ap1() {
				System.out.println("익명 자식 객체 추상메소드");
				ss();
				a+=20;
				System.out.println(b);
				
			}
			public void ss() { a+=30; }
		};
		//일반클래스의 부모를 익명자식객체로 만들기
		Parent2 p2 = new Parent2() { 
			int c = 10;
			
			@Override
			public void p2() {
				// TODO Auto-generated method stub
				super.p2();
			}
			
			public void p3() {
				
			}
		};
		
		/*
		자식이 이름이 있는 경우
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		c1.p1();
		c2.p2();
		*/
		
	}
}
