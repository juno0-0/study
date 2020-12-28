package generic;
//비제네릭인 경우 코드
public class Box<T>{//어떤 타입을 넣을지 몰라서 T로 지정
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	
	
}
