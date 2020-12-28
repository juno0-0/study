package product;

public class TV extends Product{
	public TV() {
		super(100);//부모의 생성자 호출
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}
