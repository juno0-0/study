package smp;

import java.util.Scanner;
/*
 * 새로운 지점이 생기면 수정하기 힘들 것 같음
 * ID,PW받는거 고민
 */
public class SMPBusiness {
	Scanner sc = new Scanner(System.in);
	HeadOffice[] list = {new Cheongdam(), new Gangnam(), new Hannam()};
	Cheongdam c = new Cheongdam();
	int cntC=0, cntG=0, cntH=0;
	
	
	//화면비우기
	void clearScreen() {
		for (int i = 0; i < 40; i++)
			System.out.println("");
	}//end clearScreen
	
	//초기화면
	void start() {
		System.out.println("Sales Management Program");
		System.out.println();
		System.out.println("Press the Enter.");
		sc.nextLine();
		clearScreen();
		for(int i = 0; i < 3; i++) {
			System.out.println("ID : ");
			String id = sc.next();
			System.out.println("PW : ");
			String pw = sc.next();
			System.out.println(id);
			System.out.println(pw);
			if(id.equals(HeadOffice.getId())&&pw.equals(HeadOffice.getPw())) {
				clearScreen();
				officeMenu();
				break;
			}else {
				if(i==2) {
					System.out.println("프로그램이 종료됩니다.");
				}
				System.out.println("ID와 PW를 다시 확인해주세요.");
			}
		}
	}//end start
	
	//전체메뉴
	void officeMenu() {
		boolean officeFlag = true;
		int choice=0;
		while(officeFlag) {
			System.out.println("매출을 입력하실");
			System.out.println("지점을 선택하세요.");
			System.out.println("1.청담점\n2.강남점\n3.한남점\n4.종료");
			System.out.print("선택 >>> ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				sc = new Scanner(System.in);
				choice=0;
			}
			
			switch(choice) {
				case 1: branchMenu(list[0]); break;
				case 2: branchMenu(list[1]); break;
				case 3: branchMenu(list[2]); break;
				case 4: 
					officeFlag = false; 
					System.out.println("고생하셨습니다.");
					break;
				default: break;
			}
		}
	}//end officeMenu
	
	//지점메뉴
	void branchMenu(HeadOffice h) {
		clearScreen();
		boolean branchFlag = true;
		while(branchFlag) {
			System.out.println(h+"점 메뉴 선택창");
			System.out.println("================");
			System.out.println("1.월마감\n2.순이익\n3.매출수정\n4.총매출\n5.뒤로가기");
			System.out.print("선택 >>> ");
			int choice=0;
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				sc = new Scanner(System.in);
				choice=0;
			}
			switch(choice) {
				case 1: Deadline(h); break;
				case 2: profit(h); break;
				case 3: modify(h); break;
				case 4: grossSales(h); break;
				case 5: branchFlag = false; clearScreen(); break;
				default: break;
			}
		}
	}//end branchMenu
	
	//입력
	//월을 지정해서 입력하는거 고민
	void Deadline(HeadOffice h) {
		clearScreen();
		System.out.println(h+"점 월마감");
		System.out.print("매출 >>> ");
		int monthlySales = sc.nextInt();
		System.out.print("인건비 >>> ");
		int personnelExpense = sc.nextInt();
		System.out.print("공과금 >>> ");
		int utilityCharges = sc.nextInt();
		System.out.print("월세 >>> ");
		int monthlyRent = sc.nextInt();
		if(h instanceof Cheongdam) {
			for (int i = 0; i <= cntC; i++) {
				if(h.aC[i]==null) {
					h.aC[i]=new Cheongdam(monthlySales, personnelExpense, utilityCharges, monthlyRent);
					cntC++;
					clearScreen();
					break;
				}
			}			
		}else if(h instanceof Gangnam) {
			for (int i = 0; i <= cntG; i++) {
				if(h.aG[i]==null) {
					h.aG[i]=new Gangnam(monthlySales, personnelExpense, utilityCharges, monthlyRent);
					cntG++;
					clearScreen();
					break;
				}
			}			
		}else if(h instanceof Hannam) {
			for (int i = 0; i <= cntH; i++) {
				if(h.aH[i]==null) {
					h.aH[i]=new Hannam(monthlySales, personnelExpense, utilityCharges, monthlyRent);
					cntH++;
					clearScreen();
					break;
				}
			}						
		}
	}//end input
	
	//순이익출력
	void profit(HeadOffice h) {
		clearScreen();
		int month;
		while(true) {
			System.out.print("월을 선택하세요 >>> ");
			try {
				month = sc.nextInt();
				if(!(month-1<cntC||month-1<cntH||month-1<cntG)) {
					continue;
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				sc = new Scanner(System.in);
				month=0;
			}
		}
		sc.nextLine();
		if(h instanceof Cheongdam) {
			System.out.println("=====================");
			System.out.print(h+"점 "+month+"월 순이익 : ");
			System.out.println(h.aC[month-1].aNetProfit+"원");
			System.out.println("=====================");
		}else if(h instanceof Gangnam) {
			System.out.println("=====================");
			System.out.print(h+"점 "+month+"월 순이익 : ");
			System.out.println(h.aG[month-1].aNetProfit+"원");
			System.out.println("=====================");			
		}else if(h instanceof Hannam) {
			System.out.println("=====================");
			System.out.print(h+"점 "+month+"월 순이익 : ");
			System.out.println(h.aH[month-1].aNetProfit+"원");
			System.out.println("=====================");
		}
		System.out.println("Press the Enter.");
		sc.nextLine();
		clearScreen();
	}//end profit

	//매출수정
	void modify(HeadOffice h) {
		clearScreen();
		int month;
		while(true) {
			System.out.print("수정하실 월을 입력하세요 : ");
			try {
				month = sc.nextInt();
				if(!(month-1<cntC||month-1<cntH||month-1<cntG)) {
					continue;
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}
		System.out.println("1.총 매출\n2.인건비\n3.공과금\n4.월세\n5.뒤로가기");
		System.out.print("선택 >>> ");
		//아직 문자열 입력하면 나는 오류 못잡음
		int choice=0;
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요.");
			sc = new Scanner(System.in);
			choice=0;
		}
		switch(choice) {
			case 1: 
				System.out.print(h+"점 수정하실 "+month+"월 총 매출을 입력하세요 : ");
				if(h instanceof Cheongdam) {
					h.aC[month-1].monthlySales = sc.nextInt();
					h.aC[month-1].incentive = h.incentive(h.aC[month-1].monthlySales, h.aC[month-1].salesTarget);
					h.aC[month-1].aNetProfit = h.aNetProfit(h.aC[month-1].monthlySales, h.aC[month-1].personnelExpense, h.aC[month-1].utilityCharges, h.aC[month-1].monthlyRent, h.aC[month-1].tax)-h.aC[month-1].incentive;
					cList(h, month);
				}else if(h instanceof Gangnam) {
					h.aG[month-1].monthlySales = sc.nextInt();
					h.aG[month-1].incentive = h.incentive(h.aG[month-1].monthlySales, h.aG[month-1].salesTarget);
					h.aG[month-1].aNetProfit = h.aNetProfit(h.aG[month-1].monthlySales, h.aG[month-1].personnelExpense, h.aG[month-1].utilityCharges, h.aG[month-1].monthlyRent, h.aG[month-1].tax)-h.aG[month-1].incentive;
					gList(h, month);
				}else {
					h.aH[month-1].monthlySales = sc.nextInt();
					h.aH[month-1].incentive = h.incentive(h.aH[month-1].monthlySales, h.aH[month-1].salesTarget);
					h.aH[month-1].aNetProfit = h.aNetProfit(h.aH[month-1].monthlySales, h.aH[month-1].personnelExpense, h.aH[month-1].utilityCharges, h.aH[month-1].monthlyRent, h.aH[month-1].tax)-h.aH[month-1].incentive;
					hList(h, month);
				}
				System.out.println("Press the Enter.");
				sc.nextLine();
				sc.nextLine();
				clearScreen();
				break;
			case 2: 
				System.out.print(h+"점 수정하실 "+month+"월 인건비를 입력하세요 : ");
				if(h instanceof Cheongdam) {
					h.aC[month-1].personnelExpense = sc.nextInt();
					h.aC[month-1].aNetProfit = h.aNetProfit(h.aC[month-1].monthlySales, h.aC[month-1].personnelExpense, h.aC[month-1].utilityCharges, h.aC[month-1].monthlyRent, h.aC[month-1].tax)-h.aC[month-1].incentive;
					cList(h, month);
				}else if(h instanceof Gangnam) {
					h.aG[month-1].personnelExpense = sc.nextInt();
					h.aG[month-1].aNetProfit = h.aNetProfit(h.aG[month-1].monthlySales, h.aG[month-1].personnelExpense, h.aG[month-1].utilityCharges, h.aG[month-1].monthlyRent, h.aG[month-1].tax)-h.aG[month-1].incentive;
					gList(h, month);
				}else {
					h.aH[month-1].personnelExpense = sc.nextInt();
					h.aH[month-1].aNetProfit = h.aNetProfit(h.aH[month-1].monthlySales, h.aH[month-1].personnelExpense, h.aH[month-1].utilityCharges, h.aH[month-1].monthlyRent, h.aH[month-1].tax)-h.aH[month-1].incentive;
					hList(h, month);
				}
				System.out.println("Press the Enter.");
				sc.nextLine();
				sc.nextLine();
				clearScreen();
				break;
			case 3: 
				System.out.print(h+"점 수정하실 "+month+"월 공과금을 입력하세요 : ");
				if(h instanceof Cheongdam) {
					h.aC[month-1].utilityCharges = sc.nextInt();
					h.aC[month-1].aNetProfit = h.aNetProfit(h.aC[month-1].monthlySales, h.aC[month-1].personnelExpense, h.aC[month-1].utilityCharges, h.aC[month-1].monthlyRent, h.aC[month-1].tax)-h.aC[month-1].incentive;
					cList(h, month);
				}else if(h instanceof Gangnam) {
					h.aG[month-1].utilityCharges = sc.nextInt();
					h.aG[month-1].aNetProfit = h.aNetProfit(h.aG[month-1].monthlySales, h.aG[month-1].personnelExpense, h.aG[month-1].utilityCharges, h.aG[month-1].monthlyRent, h.aG[month-1].tax)-h.aG[month-1].incentive;
					gList(h, month);
				}else {
					h.aH[month-1].utilityCharges = sc.nextInt();
					h.aH[month-1].aNetProfit = h.aNetProfit(h.aH[month-1].monthlySales, h.aH[month-1].personnelExpense, h.aH[month-1].utilityCharges, h.aH[month-1].monthlyRent, h.aH[month-1].tax)-h.aH[month-1].incentive;
					hList(h, month);
				}
				System.out.println("Press the Enter.");
				sc.nextLine();
				sc.nextLine();
				clearScreen();
				break;
			case 4: 
				System.out.print(h+"점 수정하실 "+month+"월 월세를 입력하세요 : ");
				if(h instanceof Cheongdam) {
					h.aC[month-1].monthlyRent = sc.nextInt();		
					h.aC[month-1].aNetProfit = h.aNetProfit(h.aC[month-1].monthlySales, h.aC[month-1].personnelExpense, h.aC[month-1].utilityCharges, h.aC[month-1].monthlyRent, h.aC[month-1].tax)-h.aC[month-1].incentive;
					cList(h, month);
				}else if(h instanceof Gangnam) {
					h.aG[month-1].monthlyRent = sc.nextInt();
					h.aG[month-1].aNetProfit = h.aNetProfit(h.aG[month-1].monthlySales, h.aG[month-1].personnelExpense, h.aG[month-1].utilityCharges, h.aG[month-1].monthlyRent, h.aG[month-1].tax)-h.aG[month-1].incentive;
					gList(h, month);
				}else {
					h.aH[month-1].monthlyRent = sc.nextInt();
					h.aH[month-1].aNetProfit = h.aNetProfit(h.aH[month-1].monthlySales, h.aH[month-1].personnelExpense, h.aH[month-1].utilityCharges, h.aH[month-1].monthlyRent, h.aH[month-1].tax)-h.aH[month-1].incentive;
					hList(h, month);
				}
				System.out.println("Press the Enter.");
				sc.nextLine();
				sc.nextLine();
				clearScreen();
				break;
			default: break;
		}
	}//end modify
	
	//총매출
	void grossSales(HeadOffice h) {
		clearScreen();
		sc.nextLine();
		System.out.println(h+"점 매출 목록");
		if(h instanceof Cheongdam) {
			for (int i = 0; i < cntC; i++) {
				System.out.println("=================================================");
				System.out.println((i+1)+"월 총 매출 : "+h.aC[i].monthlySales+"원");
				System.out.println((i+1)+"월 인건비 : "+h.aC[i].personnelExpense+"원");
				System.out.println((i+1)+"월 공과금 : "+h.aC[i].utilityCharges+"원");
				System.out.println((i+1)+"월 월세 : "+h.aC[i].monthlyRent+"원");
				System.out.println((i+1)+"월 세금 : "+(int)(h.aC[i].tax)+"원");
				System.out.println((i+1)+"월 인센티브 : "+h.aC[i].incentive+"원");
				System.out.println((i+1)+"월 순이익 : "+(h.aC[i].aNetProfit)+"원");
			}
			System.out.println("=================================================");
		}else if(h instanceof Gangnam) {
			for (int i = 0; i < cntG; i++) {
				System.out.println("=================================================");
				System.out.println((i+1)+"월 총 매출 : "+h.aG[i].monthlySales+"원");
				System.out.println((i+1)+"월 인건비 : "+h.aG[i].personnelExpense+"원");
				System.out.println((i+1)+"월 공과금 : "+h.aG[i].utilityCharges+"원");
				System.out.println((i+1)+"월 월세 : "+h.aG[i].monthlyRent+"원");
				System.out.println((i+1)+"월 세금 : "+(int)(h.aG[i].tax)+"원");
				System.out.println((i+1)+"월 인센티브 : "+h.aG[i].incentive+"원");
				System.out.println((i+1)+"월 순이익 : "+(h.aG[i].aNetProfit)+"원");
				System.out.println("=================================================");
			}
		}else if(h instanceof Hannam) {
			for (int i = 0; i < cntH; i++) {
				System.out.println("=================================================");
				System.out.println((i+1)+"월 총 매출 : "+h.aH[i].monthlySales+"원");
				System.out.println((i+1)+"월 인건비 : "+h.aH[i].personnelExpense+"원");
				System.out.println((i+1)+"월 공과금 : "+h.aH[i].utilityCharges+"원");
				System.out.println((i+1)+"월 월세 : "+h.aH[i].monthlyRent+"원");
				System.out.println((i+1)+"월 세금 : "+(int)(h.aH[i].tax)+"원");
				System.out.println((i+1)+"월 인센티브 : "+h.aH[i].incentive+"원");
				System.out.println((i+1)+"월 순이익 : "+(h.aH[i].aNetProfit)+"원");
				System.out.println("=================================================");
			}
		}
		System.out.println("Press the Enter.");
		sc.nextLine();
		clearScreen();
	}//end grossSales
	
	//수정후 출력
	void cList(HeadOffice h, int month) {
		System.out.println("=================================================");
		System.out.println(month+"월 총 매출 : "+h.aC[month-1].monthlySales+"원");
		System.out.println(month+"월 인건비 : "+h.aC[month-1].personnelExpense+"원");
		System.out.println(month+"월 공과금 : "+h.aC[month-1].utilityCharges+"원");
		System.out.println(month+"월 월세 : "+h.aC[month-1].monthlyRent+"원");
		System.out.println(month+"월 세금 : "+(int)(h.aC[month-1].tax)+"원");
		System.out.println(month+"월 인센티브 : "+h.aC[month-1].incentive+"원");
		System.out.println(month+"월 순이익 : "+(h.aC[month-1].aNetProfit)+"원");
		System.out.println("=================================================");
	}
	void gList(HeadOffice h, int month) {
		System.out.println("=================================================");
		System.out.println(month+"월 총 매출 : "+h.aG[month-1].monthlySales+"원");
		System.out.println(month+"월 인건비 : "+h.aG[month-1].personnelExpense+"원");
		System.out.println(month+"월 공과금 : "+h.aG[month-1].utilityCharges+"원");
		System.out.println(month+"월 월세 : "+h.aG[month-1].monthlyRent+"원");
		System.out.println(month+"월 세금 : "+(int)(h.aG[month-1].tax)+"원");
		System.out.println(month+"월 인센티브 : "+h.aG[month-1].incentive+"원");
		System.out.println(month+"월 순이익 : "+(h.aG[month-1].aNetProfit)+"원");
		System.out.println("=================================================");
	}
	void hList(HeadOffice h, int month) {
		System.out.println("=================================================");
		System.out.println(month+"월 총 매출 : "+h.aH[month-1].monthlySales+"원");
		System.out.println(month+"월 인건비 : "+h.aH[month-1].personnelExpense+"원");
		System.out.println(month+"월 공과금 : "+h.aH[month-1].utilityCharges+"원");
		System.out.println(month+"월 월세 : "+h.aH[month-1].monthlyRent+"원");
		System.out.println(month+"월 세금 : "+(int)(h.aH[month-1].tax)+"원");
		System.out.println(month+"월 인센티브 : "+h.aH[month-1].incentive+"원");
		System.out.println(month+"월 순이익 : "+(h.aH[month-1].aNetProfit)+"원");
		System.out.println("=================================================");
	}
	
	
	
}//end class
