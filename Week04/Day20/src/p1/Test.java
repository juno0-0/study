package p1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(true) {
			System.out.print("정수입력 : ");
			try {
				choice = sc.nextInt();		
			}catch(Exception e) {
				System.out.println("문자열을 입력했음");
			}
			System.out.println("후");
			if(choice==0) break;
		}
	}
	
	
}
