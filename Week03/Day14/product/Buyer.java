package product;
//����Ͻ�����
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i=0;
	
	//���� ������ ������
	       //Product p = new TV();
	void buy(Product p) {//p�� Product�� ����Ű�� �ּҰ� ����.
		boolean p1 = p instanceof Product;
		boolean p2 = p instanceof Audio;
		boolean p3 = p instanceof IPhone;
		
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� "+p+"��(��) �������� ���Ͽ����ϴ�.");
			return;//�̷��� ��ȯ���� �ʰ� �޼ҵ带 Ż����
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p;
//		System.out.println(p.toString()+"�� �����ϼ̽��ϴ�.");//���������� �ڿ��� toString()�� ����
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	//��ٱ���
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList+=item[i+1]==null?item[i]:item[i]+",";
//			itemList += item[i]+",";
		}
		System.out.println("������ ��ǰ�� �� �ݾ� : "+sum+"�� �Դϴ�.");
		System.out.println("������ ��ǰ�� "+itemList+"�Դϴ�.");
		System.out.println("���� �ܾ��� "+money+"�� �Դϴ�.");
	}
	
	
	
	
}
