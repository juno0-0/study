package p1;
//�ڽ�Ŭ����
public class AA extends B{
	void aaMethod() {
		y=y+20;//y=40
		//x=x+20; //final�� ���� �ʵ�� ���� ������ �� ����.
		System.out.println(x+20);
	}
	
	@Override
	void bMethod() {
		y=y+100;
	}
	
//	@Override		
//	void bMethod2() {
//		y=y+1000;
//	}
	
	
	
	
}
