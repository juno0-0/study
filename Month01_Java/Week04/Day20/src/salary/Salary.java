package salary;

import java.util.Scanner;

public class Salary{
	static int money=0;
	static String sabun="";
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޿� : ");
		money = sc.nextInt();
		
		System.out.print("��� : ");
		sabun = sc.next();
	}
	
	static void login() throws SalaryException, SabunException{
		if(money<0) {
			throw new SalaryException("�޿��� ������ �� �� �����ϴ�.");
		}
		if(!sabun.equals("1234")) {
			throw new SabunException("����� �ʼ� �Է��Դϴ�.");
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
