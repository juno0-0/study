package ex3;

import java.util.function.IntSupplier;

public class LambdaEx {
	public static int method(int x, int y) {
		IntSupplier supplier = ()->{//�޼ҵ� �ȿ� �ִ� ���� Ŭ����
//			x*=10;
//			int result = x+y;//�޼ҵ��� �Ű������� �����ʵ�� final�� ���� ���纻���� ���ͼ� ������ �� ����.
			int result = x*10+y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}
}
