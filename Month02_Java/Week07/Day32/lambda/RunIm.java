package lambda;
//인터페이스
@FunctionalInterface
public interface RunIm {
	void abMethod(int a, String b);
	//void abMethod2(); //추상메소드가 2개면 람다식으로 만들 수 없다.
}
