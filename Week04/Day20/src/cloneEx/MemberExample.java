package cloneEx;

public class MemberExample {
	public static void main(String[] args) {
		Member mk1 = new Member("blue", "ȫ�浿", "12345", 25, true);
		Member mk2 = mk1.getMember();
		System.out.println(mk1.id);
		System.out.println(mk1.name);
		System.out.println(mk1.password);
		System.out.println(mk1.age);
		System.out.println(mk1.adult);
		System.out.println(mk1.a[0]);
		System.out.println("===========================");
		mk2.id="red";
		mk2.password="7777";
		
		System.out.println("clone : "+mk2.id);
		System.out.println("original : "+mk1.id);
		System.out.println(mk2.name);
		System.out.println("clone : "+mk2.password);
		System.out.println("original : "+mk1.password);
		System.out.println(mk2.age);
		System.out.println(mk2.adult);
		System.out.println(mk2.a[0]);
		
		mk1.a[0]=100;
		System.out.println(mk1.a[0]);
		System.out.println(mk2.a[0]);
		mk2.a[3]=1000;
		System.out.println(mk1.a[3]);
		System.out.println(mk2.a[3]);
	}
}
