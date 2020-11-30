package office;

import java.util.Scanner;

public class Business {
	Scanner sc = new Scanner(System.in);
//	Office[] arO = {new Seoul(), new Gyeonggi(), new Gangwon(), new Jeju()};
	Office o = new Office();
	Office oSeoul = new Seoul();
	Office oGyeonggi = new Gyeonggi();
	Office oGangwon = new Gangwon();
	Office oJeju = new Jeju();
	Seoul s = (Seoul)oSeoul;
	Gyeonggi gy = (Gyeonggi)oGyeonggi;
	Gangwon ga = (Gangwon)oGangwon;
	Jeju j = (Jeju)oJeju;
	String temp="";
	
	
	boolean flag = true;
	void menu() {
		flag=true;
		do {
			System.out.println("1.서울지사 2.경인지사 3.강원지사 4.제주지사");
			System.out.print("지사는? ");
			int choice = sc.nextInt();
			switch(choice) {
//			case 1: input(arO[choice-1]); break;
			case 1: input(oSeoul); break;
			case 2: input(oGyeonggi); break;
			case 3: input(oGangwon); break;
			case 4: input(oJeju); break;
			}			
		}while(flag);
	}
	void input(Office o) {
			System.out.print("제품은 : ");
			o.name = sc.next();
			if(o.name.equals("컴퓨터")) {
				if(o instanceof Seoul) {
					System.out.print("서울지점 컴퓨터 판매량은? : ");
					s.computerCnt+=sc.nextInt();
				}else if(o instanceof Gyeonggi) {
					System.out.print("경기지점 컴퓨터 판매량은? : ");
					gy.computerCnt+=sc.nextInt();
				}else if(o instanceof Gangwon) {
					System.out.print("강원지점 컴퓨터 판매량은? : ");
					ga.computerCnt+=sc.nextInt();
				}else {
					System.out.print("제주지점 컴퓨터 판매량은? : ");
					j.computerCnt+=sc.nextInt();
				}
			}else if(o.name.equals("프린터")) {
				if(o instanceof Seoul) {
					System.out.print("서울지점 프린터 판매량은? : ");
					s.printerCnt+=sc.nextInt();
				}else if(o instanceof Gyeonggi) {
					System.out.print("경기지점 프린터 판매량은? : ");
					gy.printerCnt+=sc.nextInt();
				}else if(o instanceof Gangwon) {
					System.out.print("강원지점 프린터 판매량은? : ");
					ga.printerCnt+=sc.nextInt();
				}else {
					System.out.print("제주지점 프린터 판매량은? : ");
					j.printerCnt+=sc.nextInt();
				}	
			}
			
			System.out.print("계속 입력하시겠습니까?(Y/N)");
			String yn = sc.next();
			if(yn.equals("N") || yn.equals("n")) {
				flag=false;
			}
		
	}
	void income() {
		if(s.computerCnt!=0) {
			temp += "Seoul  컴퓨터"+"  "+o.computer+"  "+s.computerCnt+"  "+s.computerCnt*o.computer+"\n";
		}
		if(s.printerCnt!=0) {
			temp += "Seoul  프린터"+"  "+o.printer+"  "+s.printerCnt+"  "+s.printerCnt*o.printer+"\n";
		}
		if(gy.computerCnt!=0) {
			temp += "Gyeonggi  컴퓨터"+"  "+o.computer+"  "+gy.computerCnt+"  "+gy.computerCnt*o.computer+"\n";
		}
		if(gy.printerCnt!=0) {
			temp += "Gyeonggi  프린터"+"  "+o.printer+"  "+gy.printerCnt+"  "+gy.printerCnt*o.printer+"\n";
		}
		if(ga.computerCnt!=0) {
			temp += "Gangwon  컴퓨터"+"  "+o.computer+"  "+ga.computerCnt+"  "+ga.computerCnt*o.computer+"\n";
		}
		if(ga.printerCnt!=0) {
			temp += "Gangwon  프린터"+"  "+o.printer+"  "+ga.printerCnt+"  "+ga.printerCnt*o.printer+"\n";
		}
		if(j.computerCnt!=0) {
			temp += "Jeju  컴퓨터"+"  "+o.computer+"  "+j.computerCnt+"  "+j.computerCnt*o.computer+"\n";
		}
		if(j.printerCnt!=0) {
			temp += "Jeju  프린터"+"  "+o.printer+"  "+j.printerCnt+"  "+j.printerCnt*o.printer+"\n";
		}
		
	}
	void output() {
		System.out.println("==============================");
		System.out.println("각 지사별 판매 현황");
		System.out.println("==============================");
		System.out.println("지사명       제품명  제품가격    판매량  매출현황");
		System.out.println("==============================");
		income();
		System.out.println(temp);
	}
}
