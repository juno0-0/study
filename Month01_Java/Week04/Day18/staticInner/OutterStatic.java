package staticInner;

public class OutterStatic {
	//�ν��Ͻ� ���
	int ia = 10;
	void iaMethond() { 
		//iia=iia+10;
		//iiaMethod();
		InnerStatic.iisa=100;
		InnerStatic.iisaMethod();
		System.out.println("�̰��� �ܺ�Ŭ������ �޼ҵ�κ��Դϴ�."+ia);
	}
	//���� ���
	static int isa = 20;
	static void isaMethod() { }
	
	static class InnerStatic{//static�� ���� Ŭ�������
		//�ν��Ͻ� ���
		int iia = 200;
		void iiaMethod(){
			iia=iia-10;
			//ia=100;
			//iaMethod();
			isa=50;
			isaMethod();
		}
		
		static int iisa=2000;
		static void iisaMethod() { 
			//iia=iia-30;
			//ia=100;
			//iaMethod();
			isa=50;
			isaMethod();
			
		}
		
		
	}
}
