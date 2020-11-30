package p1;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			method1();
			method2();
		}catch(ArithmeticException e) {
			System.out.println("예외~~");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열예외~~");
		}catch(Exception e) {
			System.out.println("모든예외제외~");
		}finally{
			System.out.println("데이터베이스 종료");
			System.out.println("로그아웃");
		}
	}
	
	private static void method2() throws Exception{
		a();
		
	}
	
	private static void a() throws ArithmeticException, ArrayIndexOutOfBoundsException{
		b();
		int[] arr = new int[5];
		arr[5]=10;//다른예외발생
		System.out.println("a");
	}
	
	private static void b() throws ArithmeticException{
		int a=10;
		int c=a/2;//예외발생
	}
	
	private static void method1() {
		
	}
}
