package ep;
//���ݰ���ϴ� ����Ͻ����� Ŭ����
public class TaxRate {
//	public void taxRateMethod(Empolyee e) {
//		if(e instanceof Empolyee) {//Empolyee�� ���� ó���� �ִٸ� engineer�� ���� �� manager�� ���� ���� �ǹ�����. 
//			System.out.println("Empolyee���� ��� : "+e.money*e.taxRate+"��");//if���� �� ���� ������ �����ؼ� ���� �ͺ��� if�� Ȯ���Ѵ�.
//		}else if(e instanceof Engineer) {			//�ڼ��� ���� if�� �ɰ� �������� ������ Ȯ���Ѵ�.
//			Engineer engineer = (Engineer)e;
//			System.out.println("Engineer���� ��� : "+engineer.money*engineer.taxRate+"��");
//		}else if(e instanceof Manager) {
//			Manager manager = (Manager)e;
//			System.out.println("Manager���� ��� : "+manager.money*manager.taxRate+"��");
//		}
//	}
	public void taxRateMethod(Empolyee e) {
		if(e instanceof Manager) {//EmpolyeeŸ���� e�� Manager�� ����ų �� �ִ�?
			//down casting
			Manager manager = (Manager)e;
			System.out.println("Manager���� ��� : "+manager.money*manager.taxRate+"��");
		}else if(e instanceof Engineer) {
			//down casting
			Engineer engineer = (Engineer)e;
			System.out.println("Engineer���� ��� : "+engineer.money*engineer.taxRate+"��");
		}else if(e instanceof Arbeit) {
			//down casting
			Arbeit a = (Arbeit)e;
			System.out.println("Arbeit���� ��� : "+a.money*a.taxRate+"��");
		}else if(e instanceof Empolyee) {
			System.out.println("Empolyee���� ��� : "+e.money*e.taxRate+"��");
		}
	}
}
