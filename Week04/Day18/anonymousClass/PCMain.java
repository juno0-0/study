package anonymousClass;

public class PCMain {
	public static void main(String[] args) {
		int b=20;
		Parent1 p1 = new Parent1() {
			int a =10;
			
			@Override
			public void ap1() {
				System.out.println("�͸� �ڽ� ��ü �߻�޼ҵ�");
				ss();
				a+=20;
				System.out.println(b);
				
			}
			public void ss() { a+=30; }
		};
		//�Ϲ�Ŭ������ �θ� �͸��ڽİ�ü�� �����
		Parent2 p2 = new Parent2() { 
			int c = 10;
			
			@Override
			public void p2() {
				// TODO Auto-generated method stub
				super.p2();
			}
			
			public void p3() {
				
			}
		};
		
		/*
		�ڽ��� �̸��� �ִ� ���
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		c1.p1();
		c2.p2();
		*/
		
	}
}
