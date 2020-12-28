package p8;

public interface ParentInterface {
	public void method1();
	public default void method2() {System.out.println("2020 new Code");}
}
