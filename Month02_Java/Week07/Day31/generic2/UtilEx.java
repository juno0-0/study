package generic2;

public class UtilEx {
	public static void main(String[] args) {
		int result1 = Util.compare(1000, 200);
		System.out.println(result1);
		
		double result2 = Util.compare(2.2, 3.3);
		System.out.println(result2);
		
		//Util.compare("a", "b"); <T extends Number> ���׸� T�� ������ ����Ŭ������ �־�� ��
	}
}
