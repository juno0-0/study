package salary;

import java.util.Scanner;

public class Salary{
	static int money=0;
	static String sabun="";
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("급여 : ");
		money = sc.nextInt();
		
		System.out.print("사번 : ");
		sabun = sc.next();
	}
	
	static void login() throws SalaryException, SabunException{
		if(money<0) {
			throw new SalaryException("급여는 음수가 될 수 없습니다.");
		}
		if(!sabun.equals("1234")) {
			throw new SabunException("사번은 필수 입력입니다.");
		}
	}
	public static void main(String[] args) {
		try {
			input();
			login();
		} catch (SalaryException e) {
			System.out.println(e.getMessage());
		} catch (SabunException e) {
			System.out.println(e.getMessage());
		}
	}
}
