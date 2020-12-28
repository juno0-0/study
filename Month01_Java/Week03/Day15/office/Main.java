package office;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Business b = new Business();
		boolean flag = true;
		while(flag) {
			System.out.println("==============");
			System.out.println("판매량관리 프로젝트");
			System.out.println("==============");
			System.out.println("1.입력 2.출력 3.종료");
			System.out.print("선택 > ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: b.menu(); break;
				case 2: b.output(); break;
				case 3: flag = false; break;
			}
		}
	}
}
