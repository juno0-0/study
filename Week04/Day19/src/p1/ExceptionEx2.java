package p1;

public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			method1();
			method2();
		}catch(ArithmeticException e) {
			System.out.println("����~~");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭����~~");
		}catch(Exception e) {
			System.out.println("��翹������~");
		}finally{
			System.out.println("�����ͺ��̽� ����");
			System.out.println("�α׾ƿ�");
		}
	}
	
	private static void method2() throws Exception{
		a();
		
	}
	
	private static void a() throws ArithmeticException, ArrayIndexOutOfBoundsException{
		b();
		int[] arr = new int[5];
		arr[5]=10;//�ٸ����ܹ߻�
		System.out.println("a");
	}
	
	private static void b() throws ArithmeticException{
		int a=10;
		int c=a/2;//���ܹ߻�
	}
	
	private static void method1() {
		
	}
}
