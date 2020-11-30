package p1;

public class MemeberService {
	Member m;
	
	boolean login(String id, String pw){
		if(id=="java"&&pw=="12345") {
			return true;			
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	public static void main(String[] args) {
		
	}
}
