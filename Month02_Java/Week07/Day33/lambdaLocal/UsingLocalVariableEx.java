package lambdaLocal;

public class UsingLocalVariableEx {
	public static void method(int arg) {
		int localVar = 40;//���ú���
		//localVar = 300;
		//arg -= 100;
		
		//���ٽ� ����
		MyFunctionInterface fi = ()->{
			System.out.println("arg "+arg);
			System.out.println("localVar "+localVar);
		};
		
		fi.method();//���ٽ����� ������ �Լ�(�޼ҵ�)�� ȣ��
		
	}//end method
	public static void main(String[] args) {
		method(500);
		
	}
	
}
