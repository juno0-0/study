package instanceInner;
//�ν��Ͻ� ���� Ŭ���� ����
public class Outter {
	//�ν��Ͻ� ���
	int ia = 10;
	void iaMethond() {//����Ŭ���� ��� ��� �Ұ��� 
		//iia=iia+10;
		//iiaMethod();
		System.out.println("�̰��� �ܺ� Ŭ���� �κ��Դϴ�."+ia);
	}
	//���� ���
	static int ja = 20;
	static void jaMethod() {
		System.out.println("�̰��� �ܺ� Ŭ���� �����޼ҵ� �κ��Դϴ�.");
	}
	
	class Inner{//�ν��Ͻ� �̳�Ŭ���� : �ν��Ͻ� ����� ���� �� �ִ�.
		//�ڽ��� ���
		int iia = 30;
		void iiaMethod() { 
			ia=ia+30; 
			ja = ja+40; 
			iaMethond(); 
			Outter.jaMethod(); 
			System.out.println("�̰��� ���� Ŭ���� �κ��Դϴ�."+iia);
		}//Outter ����� ��� ����� �� �ִ�.
		//����Ŭ������ �ƹ��� ���� ���� �ܺ�Ŭ������ ����� ����� �� �ִ�.
		//static int jja = 40;
		//static void jjaMethod() { }
		//�ۿ� �ִ� Ŭ���� ��� ���
	}
	
}
