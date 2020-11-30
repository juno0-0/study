package objectClassEx;

public class Member {
	public String id;
	public Member() {}
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
			//ob1ÀÇ ID	       obj2ÀÇ ID
				return true;
			}
		}
		return false;
	}
	
}
