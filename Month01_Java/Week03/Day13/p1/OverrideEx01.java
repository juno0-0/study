package p1;

public class OverrideEx01 {
	public static void main(String[] args) {
		Point3D p3d = new Point3D();
//		System.out.println(p3d.getLocation());
//		System.out.println(p3d.superGetLocation());
		
		//�θ��� �޼ҵ带 ����ϱ�
		Point p = new Point();
//		System.out.println(p.getLocation());
		
		System.out.println(p3d);//p3d �ڿ� .toString()�� �������ִ� ��
		System.out.println(p3d.toString());
		System.out.println(p);
		
	}
}
