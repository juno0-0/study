package generic2;

public class Util {
	public static <T extends Number>int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		int v2 = t2.intValue();
		byte v3 = t1.byteValue();
		return Double.compare(v1, v2);//v1�� v2�� ������ 0, v1�� ������ -1, v1�� ũ�� 1
		
		
	}
}
