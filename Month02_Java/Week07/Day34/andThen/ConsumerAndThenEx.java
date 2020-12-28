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
		
		//A�� ���� �����ϰ� B�� ���� ����
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		//B�� ���� �����ϰ� A�� ���� ����
		//Consumer<Member> consumerAB = consumerB.andThen(consumerA);
		
		consumerA.accept(new Member("ȫ�浿","123",new Address("���ѹα�","����")));
		consumerB.accept(new Member("ȫ�浿","123",new Address("���ѹα�","����")));
		consumerAB.accept(new Member("ȫ�浿","123",new Address("���ѹα�","����")));
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