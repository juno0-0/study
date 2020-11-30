package p1;

public class OverrideEx01 {
	public static void main(String[] args) {
		Point3D p3d = new Point3D();
//		System.out.println(p3d.getLocation());
//		System.out.println(p3d.superGetLocation());
		
		//부모의 메소드를 출력하기
		Point p = new Point();
//		System.out.println(p.getLocation());
		
		System.out.println(p3d);//p3d 뒤에 .toString()이 생략되있는 것
		System.out.println(p3d.toString());
		System.out.println(p);
		
	}
}
