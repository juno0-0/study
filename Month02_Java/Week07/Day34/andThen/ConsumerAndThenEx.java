package andThen;

import java.util.function.Consumer;

public class ConsumerAndThenEx {
	
	
	
	public static void main(String[] args) {
	    //void accept(T t);
		Consumer<Member> consumerA = (m)->{
			System.out.println("consumerA "+m.getName());
		};
		
		Consumer<Member> consumerB = (m)->{
			System.out.println("consumerB "+m.getId());
		};
		
		//A를 가서 실행하고 B로 가서 실행
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		//B를 가서 실행하고 A로 가서 실행
		//Consumer<Member> consumerAB = consumerB.andThen(consumerA);
		
		consumerA.accept(new Member("홍길동","123",new Address("대한민국","서울")));
		consumerB.accept(new Member("홍길동","123",new Address("대한민국","서울")));
		consumerAB.accept(new Member("홍길동","123",new Address("대한민국","서울")));
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