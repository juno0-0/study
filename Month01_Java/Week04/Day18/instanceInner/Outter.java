package instanceInner;
//인스턴스 내부 클래스 예제
public class Outter {
	//인스턴스 멤버
	int ia = 10;
	void iaMethond() {//내부클래스 멤버 사용 불가능 
		//iia=iia+10;
		//iiaMethod();
		System.out.println("이곳은 외부 클래스 부분입니다."+ia);
	}
	//정적 멤버
	static int ja = 20;
	static void jaMethod() {
		System.out.println("이곳은 외부 클래스 정적메소드 부분입니다.");
	}
	
	class Inner{//인스턴스 이너클래스 : 인스턴스 멤버만 만들 수 있다.
		//자신의 멤버
		int iia = 30;
		void iiaMethod() { 
			ia=ia+30; 
			ja = ja+40; 
			iaMethond(); 
			Outter.jaMethod(); 
			System.out.println("이곳은 내부 클래스 부분입니다."+iia);
		}//Outter 멤버들 모두 사용할 수 있다.
		//내부클래스가 아무런 제약 없이 외부클래스의 멤버를 사용할 수 있다.
		//static int jja = 40;
		//static void jjaMethod() { }
		//밖에 있는 클래스 멤버 사용
	}
	
}
