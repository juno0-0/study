package ex2;

public class ContainerExample2 {
	public static void main(String[] args) {
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("ȫ�浿","����");
		System.out.println(container1.getKey());
		System.out.println(container1.getValue());
		
		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("ȫ�浿", 35);
		System.out.println(container2.getKey());
		System.out.println(container2.getValue());
	}
}
