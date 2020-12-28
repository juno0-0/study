package genericExtends;

public class ChildProductStorage {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> childProduct = new ChildProduct<>();
		childProduct.setKind(new Tv());
		childProduct.setModel("����ƮTv");
		childProduct.setCompany("�Ｚ");
		System.out.println(childProduct.getKind());
		System.out.println(childProduct.getModel());
		System.out.println(childProduct.getCompany());
		
		Product<Tv, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("���ͳ�Tv");
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		
		StorageImpl<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);
		storage.add(new Tv(), 1);
		Tv tv = storage.get(0);
		Tv tv1 = storage.get(1);
		System.out.println(tv);
		System.out.println(tv1);
		
	}
}
