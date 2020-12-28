package exception;

import java.util.Scanner;
public class LoginExample {
	static String id=null;
	static String pw=null;
	static Scanner sc = new Scanner(System.in);
	
	private static void input() {
		System.out.print("ID : ");
		id = sc.next();
		System.out.print("PW : ");
		pw = sc.next();
	}
	private static void login() throws NotExistIDException, WrongPassWordException{
		if(!id.equals("admin")) {
			//예외 발생 시키기
			throw new NotExistIDException("예외발생 예외발생 아이디가 틀렸습니다.");
		} //throw 명시적 생성자(msg);
		if(!pw.equals("admin1234")) {
			throw new WrongPassWordException("비밀번호가 틀렸습니다. 혹시 해커인가요?");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			input();
			login();
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
			//getMessage() : 예외의 메세지 값을 얻어오는 것
		} catch (WrongPassWordException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("5초후에 자동 로그아웃 합니다.");
		}
		
	}


}
