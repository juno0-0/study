package ep;
//세금계산하는 비즈니스로직 클래스
public class TaxRate {
//	public void taxRateMethod(Empolyee e) {
//		if(e instanceof Empolyee) {//Empolyee가 제일 처음에 있다면 engineer가 들어가도 참 manager가 들어가도 참이 되버린다. 
//			System.out.println("Empolyee세금 계산 : "+e.money*e.taxRate+"원");//if문을 쓸 때는 로직을 생각해서 작은 것부터 if로 확인한다.
//		}else if(e instanceof Engineer) {			//자손을 먼저 if를 걸고 마지막에 조상을 확인한다.
//			Engineer engineer = (Engineer)e;
//			System.out.println("Engineer세금 계산 : "+engineer.money*engineer.taxRate+"원");
//		}else if(e instanceof Manager) {
//			Manager manager = (Manager)e;
//			System.out.println("Manager세금 계산 : "+manager.money*manager.taxRate+"원");
//		}
//	}
	public void taxRateMethod(Empolyee e) {
		if(e instanceof Manager) {//Empolyee타입의 e가 Manager를 가르킬 수 있니?
			//down casting
			Manager manager = (Manager)e;
			System.out.println("Manager세금 계산 : "+manager.money*manager.taxRate+"원");
		}else if(e instanceof Engineer) {
			//down casting
			Engineer engineer = (Engineer)e;
			System.out.println("Engineer세금 계산 : "+engineer.money*engineer.taxRate+"원");
		}else if(e instanceof Arbeit) {
			//down casting
			Arbeit a = (Arbeit)e;
			System.out.println("Arbeit세금 계산 : "+a.money*a.taxRate+"원");
		}else if(e instanceof Empolyee) {
			System.out.println("Empolyee세금 계산 : "+e.money*e.taxRate+"원");
		}
	}
}
