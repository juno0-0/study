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
		String kor = "국어";
		String math = "수학";
		String eng = "영어";
		System.out.println("1.국어 2.영어 3.수학");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		System.out.print("중간 > ");
		int m = sc.nextInt();
		System.out.print("기말 > ");
		int f = sc.nextInt();
		System.out.print("수행평가 > ");
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
