package p1;

public class ShopService {
	static private ShopService s = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return s;
	}
}
