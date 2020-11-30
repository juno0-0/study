package p7;

public interface MyInterface {
	public void method2010();//2010년~2019년 구현 클래스에 공통으로 들어가는 추상메서드 2020~
	default void method2020(){}//2020년도 이후에 구현한 클래스에 공통으로 들어가는 추상메서드
	default void method2030() {}
	
	static void stMethod4() {//2030년 이후 새로운 메서드
		System.out.println("정적 메서드");
	}
	
}
