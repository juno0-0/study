package p1;

public class Point3D extends Point{
	int z;
	
	
	@Override
	public void getLocation() throws ArithmeticException{//�Ű������� Ÿ�Ը� �޶� �������̵��� �޼ҵ尡 �ƴ϶� �׳� �ڽ��� ������ �޼ҵ�
		// TODO Auto-generated method stub
//		return super.getLocation(); �̷��� ���θ� �θ��� �޼ҵ�� ���� ����̴�.
//		return "x = "+x+", y = "+y+", z = "+z;
	}
	
	@Override
	public String toString() {//Object Ŭ������ �޼ҵ�
		// TODO Auto-generated method stub
		return "�̰��� �ڽ� p3d �κ��Դϴ�.";
	}
	
//	@Override
//	String getLocation() {
//		return "x = "+x+", y = "+y+", z = "+z;
//	}
	
//	String superGetLocation() {//���������� ���� �θ��� �޼ҵ带 ����� �� �ڽĿ��� �޼ҵ带 �ϳ� ���� �ű�� super.�θ�޼ҵ带 ȣ���Ѵ�.
//		return super.getLocation();
//	}
}
