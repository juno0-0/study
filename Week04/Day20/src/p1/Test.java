package p1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(true) {
			System.out.print("�����Է� : ");
			try {
				choice = sc.nextInt();		
			}catch(Exception e) {
				System.out.println("���ڿ��� �Է�����");
			}
			System.out.println("��");
			if(choice==0) break;
		}
	}
	
	
}
