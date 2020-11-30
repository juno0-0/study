package objectClassEx;

public class ObjectEx {
	public static void main(String[] args) {
		//이름과 나이가 같으면 같은 사람으로 판단하기
		Value v1 = new Value("홍길동",10);
		Value v2 = new Value("홍길동",10);
		Value v3 = new Value("이순신",20);
		if(v1.equals(v2)) {//v1의 주소와 v2의 주소가 다르다 => new를 해서
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(v1.equals(v3)) {//v1의 주소와 v2의 주소가 다르다 => new를 해서
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		
	}

}



class Value{
	String name;
	int age;
	public Value(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value v = (Value)obj;
			if(name.equals(v.name)&&age==v.age) {
				return true;
			}
		}
		return false;
	}
	
}
