package product;
//비즈니스로직
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i=0;
	
	//구매 동작을 구현함
	       //Product p = new TV();
	void buy(Product p) {//p는 Product를 가르키는 주소가 담긴다.
		boolean p1 = p instanceof Product;
		boolean p2 = p instanceof Audio;
		boolean p3 = p instanceof IPhone;
		
		if(money<p.price) {
			System.out.println("잔액이 부족하여 "+p+"을(를) 구매하지 못하였습니다.");
			return;//이러면 반환하지 않고 메소드를 탈출함
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p;
//		System.out.println(p.toString()+"를 구입하셨습니다.");//참조변수의 뒤에는 toString()이 생략
		System.out.println(p+"를 구입하셨습니다.");
	}
	
	//장바구니
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList+=item[i+1]==null?item[i]:item[i]+",";
//			itemList += item[i]+",";
		}
		System.out.println("구입한 물품의 총 금액 : "+sum+"원 입니다.");
		System.out.println("구입한 물품은 "+itemList+"입니다.");
		System.out.println("현재 잔액은 "+money+"원 입니다.");
	}
	
	
	
	
}
