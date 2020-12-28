package p1;
//자식클래스
public class AA extends B{
	void aaMethod() {
		y=y+20;//y=40
		//x=x+20; //final이 붙은 필드는 값을 변경할 수 없다.
		System.out.println(x+20);
	}
	
	@Override
	void bMethod() {
		y=y+100;
	}
	
//	@Override		
//	void bMethod2() {
//		y=y+1000;
//	}
	
	
	
	
}
