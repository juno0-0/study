package testExample;

import java.util.Scanner;

public class Business {
	AGrade ag=null;
	BGrade bg=null;
	CGrade cg=null;
	DGrade dg=null;
	
	public Business() {//�����ڿ� ��� ����Ŭ���� ��üȭ
		ag = new AGrade();
		bg = new BGrade();
		cg = new CGrade();
		dg = new DGrade();
	}
	
	Scanner sc = new Scanner(System.in);
	void start() {
		menuDisplay();
	}//end start
	
	void menuDisplay() {
		boolean flag = true;
		int choice=0;
		while(flag) {
			System.out.println("=================");
			System.out.println("1.�Է� 2.��� 3.����");
			System.out.println("=================");
			System.out.print("���� >>> ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: //input(); 
					break;
				case 2: //output(); 
					break;
				case 3: flag = false; 
					break;
			}
		}
	}//end menuDisplay
	
	void input() {
		System.out.print("���� >>> ");
		String custName = sc.next();
		System.out.print("����ڵ� >>> ");
		String grade = sc.next();
		System.out.print("���ð� >>> ");
		int useTime = sc.nextInt();
		switch(grade) {
			case "A": case "a": 
				//ag.aInput(custName, grade, useTime);
				break;
			case "B": case "b": 
				bg.bInput(custName, grade, useTime);
				break;
			case "C": case "c": 
				cg.cInput(custName, grade, useTime);
				break;
			case "D": case "d": 
				dg.dInput(custName, grade, useTime);
				break;
			default: break;
		}
	}//end input
	
	void output() {
		
	}
	
	
	
}//end class
