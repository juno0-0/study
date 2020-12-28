package genericMethod;

public class BoxingMethodEx {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int i = box1.getT();
		System.out.println(i);
		
		Box<String> box2 = Util.<String>boxing("ȫ�浿");
		String str = box2.getT();
		System.out.println(str);
	}
}
