package compose;

import java.util.function.Function;



public class FunctionAndThenComposeEx {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> {return m.getAddress();};//apply() �߻�޼ҵ� �������̵�
		//m�� �Ѱ��ָ� return m.getAddress()�� ����
		//�׷� �ؿ��� apply() ȣ���ϸ� �Ű������� �޾Ƽ� ����
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("ȫ�浿","123",new Address("���ѹα�","����")));//�޼ҵ� ȣ��
		System.out.println(city);//�ؿ� 4���̶� ���� ���
		
		Address add = functionA.apply(new Member("ȫ�浿","123",new Address("���ѹα�","����")));
		System.out.println(add);
		String str = functionB.apply(add);
		System.out.println(str);
		System.out.println();
		functionAB = functionB.compose(functionA);
		String city2 = functionAB.apply(new Member("ȫ�浿","123",new Address("���ѹα�","����")));//�޼ҵ� ȣ��
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
