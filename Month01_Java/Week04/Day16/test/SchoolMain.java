package test;

import java.util.Scanner;

public class SchoolMain {
	Scanner sc = new Scanner(System.in);
	School s = new School();
	School[] arS = new School[10];
	
	public static void main(String[] args) {
		SchoolMain sm = new SchoolMain();
		sm.input();
	}
	
	
	
	void input() {
		String kor = "����";
		String math = "����";
		String eng = "����";
		System.out.println("1.���� 2.���� 3.����");
		System.out.print("���� > ");
		int choice = sc.nextInt();
		System.out.print("�߰� > ");
		int m = sc.nextInt();
		System.out.print("�⸻ > ");
		int f = sc.nextInt();
		System.out.print("������ > ");
		int p = sc.nextInt();
		if(choice==1) {
			for (int i = 0; i < arS.length; i++) {
				if(arS[i]==null) {
					arS[i]=new School(kor,m,f,p);				
				}
			}			
		}else if(choice==2) {
			for (int i = 0; i < arS.length; i++) {
				if(arS[i]==null) {
					arS[i]=new School(eng,m,f,p);				
				}
			}			
		}else if(choice==3) {
			for (int i = 0; i < arS.length; i++) {
				if(arS[i]==null) {
					arS[i]=new School(math,m,f,p);				
				}
			}			
			
		}
		
	}
}
