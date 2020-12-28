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
			//���� �߻� ��Ű��
			throw new NotExistIDException("���ܹ߻� ���ܹ߻� ���̵� Ʋ�Ƚ��ϴ�.");
		} //throw ����� ������(msg);
		if(!pw.equals("admin1234")) {
			throw new WrongPassWordException("��й�ȣ�� Ʋ�Ƚ��ϴ�. Ȥ�� ��Ŀ�ΰ���?");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			input();
			login();
		} catch (NotExistIDException e) {
			System.out.println(e.getMessage());
			//getMessage() : ������ �޼��� ���� ������ ��
		} catch (WrongPassWordException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("5���Ŀ� �ڵ� �α׾ƿ� �մϴ�.");
		}
		
	}


}
