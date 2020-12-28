package cloneEx;

public class ShallDeepCopyEx {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(1,1), 2.0);
		Circle c1 = c.shallowCopy();//얕은 복제
		Circle c2 = c.deepCopy();//깊은 복제
		
		System.out.println("c="+c);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
		//수정하기
		c1.p.x = 9;
		c1.p.y = 10;
		c.r = 30;
		System.out.println("수정한 후");
		System.out.println("c="+c);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
	}
}
