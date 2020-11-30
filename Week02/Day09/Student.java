package p2;

import java.util.Scanner;
public class Student {
	int[] a = new int[2];
	void menu(int choice) {
		Scanner sc = new Scanner(System.in);
		switch(choice) {
		case 1:
			int inputChoice = sc.nextInt();
			inputMenu(inputChoice);
			break;
		case 2:
			break;
		default:
			break;
		}
	}
	
	void inputMenu(int inputChoice) {
		switch(inputChoice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		while(true) {
			System.out.println(st.a[1]);
			System.out.print("메뉴선택 : ");
			int choice = sc.nextInt();
			st.menu(choice);
			
			if(choice == 0) break;
		}
		
	}//main

	
}//class
