package localInner;



public class LocalMemberOutter {
	//�ν��Ͻ� ���
	int ia = 10;
	void iaMethond() { 
		System.out.println("�̰��� �ܺ�Ŭ������ �޼ҵ�κ��Դϴ�."+ia);
	}
	
	//���� ���
	static int isa = 20;
	static void isaMethod() { }
	
	void innerMethod() {
		int ii=10;
//		ii=ii+10;//������ ������ �����ϸ� ����� �ȵȴ�.
		//final int ii = 10; final�� �ڵ����� �ٴ� ��
		class LocalInner{
			//Ŭ���� ����
			int inna = 10;
			//ii=ii+20;//������ �ȵ�
			
			void iinaMethod() {
				ia = ia+10;
				System.out.println(ii+ia);
				System.out.println("�̰��� �����̳�Ŭ���� �޼ҵ�");
			}
			//static int innsa = 20;
			//static void iinsaMethod() { }
			public LocalInner() { }
			
		}//end LocalInner
	
		//LocalInnerŬ������ ��üȭ ���Ѽ� �����ϴ� �ڵ� �ۼ�
		LocalInner li = new LocalInner();
		li.inna = li.inna + 100;
		li.iinaMethod();
		
		
	}//end innerMethod 
	
}
