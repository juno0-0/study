package generic2;

public class Util {
	public static <T extends Number>int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		int v2 = t2.intValue();
		byte v3 = t1.byteValue();
		return Double.compare(v1, v2);//v1과 v2가 같으면 0, v1이 작으면 -1, v1이 크면 1
		
		
	}
}
