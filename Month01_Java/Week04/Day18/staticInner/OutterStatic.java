package staticInner;

public class OutterStatic {
	//인스턴스 멤버
	int ia = 10;
	void iaMethond() { 
		//iia=iia+10;
		//iiaMethod();
		InnerStatic.iisa=100;
		InnerStatic.iisaMethod();
		System.out.println("이곳은 외부클래스의 메소드부분입니다."+ia);
	}
	//정적 멤버
	static int isa = 20;
	static void isaMethod() { }
	
	static class InnerStatic{//static이 붙은 클래스멤버
		//인스턴스 멤버
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
