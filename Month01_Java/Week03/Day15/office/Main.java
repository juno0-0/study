package office;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Business b = new Business();
		boolean flag = true;
		while(flag) {
			System.out.println("==============");
			System.out.println("�Ǹŷ����� ������Ʈ");
			System.out.println("==============");
			System.out.println("1.�Է� 2.��� 3.����");
			System.out.print("���� > ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1: b.menu(); break;
				case 2: b.output(); break;
				case 3: flag = false; break;
			}
		}
	}
}
