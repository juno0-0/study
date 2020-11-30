package localInner;



public class LocalMemberOutter {
	//인스턴스 멤버
	int ia = 10;
	void iaMethond() { 
		System.out.println("이곳은 외부클래스의 메소드부분입니다."+ia);
	}
	
	//정적 멤버
	static int isa = 20;
	static void isaMethod() { }
	
	void innerMethod() {
		int ii=10;
//		ii=ii+10;//변경이 되지만 변경하면 사용이 안된다.
		//final int ii = 10; final이 자동으로 붙는 것
		class LocalInner{
			//클래스 정의
			int inna = 10;
			//ii=ii+20;//변경이 안됨
			
			void iinaMethod() {
				ia = ia+10;
				System.out.println(ii+ia);
				System.out.println("이곳은 로컬이너클래스 메소드");
			}
			//static int innsa = 20;
			//static void iinsaMethod() { }
			public LocalInner() { }
			
		}//end LocalInner
	
		//LocalInner클래스를 객체화 시켜서 실행하는 코드 작성
		LocalInner li = new LocalInner();
		li.inna = li.inna + 100;
		li.iinaMethod();
		
		
	}//end innerMethod 
	
}
