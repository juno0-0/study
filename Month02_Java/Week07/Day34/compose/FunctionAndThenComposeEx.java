package compose;

import java.util.function.Function;



public class FunctionAndThenComposeEx {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> {return m.getAddress();};//apply() 추상메소드 오버라이딩
		//m을 넘겨주면 return m.getAddress()가 실행
		//그럼 밑에서 apply() 호출하면 매개변수를 받아서 실행
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동","123",new Address("대한민국","서울")));//메소드 호출
		System.out.println(city);//밑에 4줄이랑 같은 결과
		
		Address add = functionA.apply(new Member("홍길동","123",new Address("대한민국","서울")));
		System.out.println(add);
		String str = functionB.apply(add);
		System.out.println(str);
		System.out.println();
		functionAB = functionB.compose(functionA);
		String city2 = functionAB.apply(new Member("홍길동","123",new Address("대한민국","서울")));//메소드 호출
		System.out.println(city2);
		
		
		
		
	}//end main
}
class Member{
	private String name;
	private String id;
	private Address address;
	
	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

}//end Member

class Address{
	private String country;
	private String city;
	
	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

}//end Address
