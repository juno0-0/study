package cloneEx;

import java.util.Arrays;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public Member[] scores = new Member[100];
	public int[] a = {1,2,3,4};
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.adult=adult;
	}

	
	public Member getMember(){//자손 참조변수 = Object 리턴형
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}//end getMember();
	
}
