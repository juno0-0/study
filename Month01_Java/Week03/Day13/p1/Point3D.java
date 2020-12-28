package p1;

public class Point3D extends Point{
	int z;
	
	
	@Override
	public void getLocation() throws ArithmeticException{//매개변수의 타입만 달라도 오버라이딩한 메소드가 아니라 그냥 자식이 선언한 메소드
		// TODO Auto-generated method stub
//		return super.getLocation(); 이렇게 놔두면 부모의 메소드와 같은 기능이다.
//		return "x = "+x+", y = "+y+", z = "+z;
	}
	
	@Override
	public String toString() {//Object 클래스의 메소드
		// TODO Auto-generated method stub
		return "이곳은 자식 p3d 부분입니다.";
	}
	
//	@Override
//	String getLocation() {
//		return "x = "+x+", y = "+y+", z = "+z;
//	}
	
//	String superGetLocation() {//재정의하지 않은 부모의 메소드를 사용할 때 자식에서 메소드를 하나 만들어서 거기다 super.부모메소드를 호출한다.
//		return super.getLocation();
//	}
}
