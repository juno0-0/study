package generic;

public class BoxEx {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box<Apple> box2 = new Box<Apple>();
		box2.setT(new Apple());
		//box2.setT(new Banana());//AppleŬ������ ���� �� �ִ� ���� Banana Ŭ������ �־ ����
		//box2.set("ȫ�浿");//AppleŬ������ ���� �� �ִ� ���� ���ڿ��� �־ ����
		Box<Banana> box3 = new Box<Banana>();
		box3.setT(new Banana());
		
		
		/*
		box1.setObject("���");
		box1.setObject("����");
		box1.setObject(new Apple());
		box1.setObject(123);
		
		Box box2 = new Box();
		box2.setObject("�ٳ���");
		box2.setObject("����");
		*/
		
		
		
	}
}
