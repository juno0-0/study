package lambdathis;

public class UsingthisExample {
	public static void main(String[] args) {
		Usingthis ut = new Usingthis();
		Usingthis.Inner i = ut.new Inner();
		i.method();
	}
}
