package smp;

import java.util.Scanner;
/*
 * ���ο� ������ ����� �����ϱ� ���� �� ����
 * ID,PW�޴°� ���
 */
public class SMPBusiness {
	Scanner sc = new Scanner(System.in);
	HeadOffice[] list = {new Cheongdam(), new Gangnam(), new Hannam()};
	Cheongdam c = new Cheongdam();
	int cntC=0, cntG=0, cntH=0;
	
	
	//ȭ�����
	void clearScreen() {
		for (int i = 0; i < 40; i++)
			System.out.println("");
	}//end clearScreen
	
	//�ʱ�ȭ��
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
					System.out.println("���α׷��� ����˴ϴ�.");
				}
				System.out.println("ID�� PW�� �ٽ� Ȯ�����ּ���.");
			}
		}
	}//end start
	
	//��ü�޴�
	void officeMenu() {
		boolean officeFlag = true;
		int choice=0;
		while(officeFlag) {
			System.out.println("������ �Է��Ͻ�");
			System.out.println("������ �����ϼ���.");
			System.out.println("1.û����\n2.������\n3.�ѳ���\n4.����");
			System.out.print("���� >>> ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
				sc = new Scanner(System.in);
				choice=0;
			}
			
			switch(choice) {
				case 1: branchMenu(list[0]); break;
				case 2: branchMenu(list[1]); break;
				case 3: branchMenu(list[2]); break;
				case 4: 
					officeFlag = false; 
					System.out.println("����ϼ̽��ϴ�.");
					break;
				default: break;
			}
		}
	}//end officeMenu
	
	//�����޴�
	void branchMenu(HeadOffice h) {
		clearScreen();
		boolean branchFlag = true;
		while(branchFlag) {
			System.out.println(h+"�� �޴� ����â");
			System.out.println("================");
			System.out.println("1.������\n2.������\n3.�������\n4.�Ѹ���\n5.�ڷΰ���");
			System.out.print("���� >>> ");
			int choice=0;
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
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
	
	//�Է�
	//���� �����ؼ� �Է��ϴ°� ���
	void Deadline(HeadOffice h) {
		clearScreen();
		System.out.println(h+"�� ������");
		System.out.print("���� >>> ");
		int monthlySales = sc.nextInt();
		System.out.print("�ΰǺ� >>> ");
		int personnelExpense = sc.nextInt();
		System.out.print("������ >>> ");
		int utilityCharges = sc.nextInt();
		System.out.print("���� >>> ");
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
	
	//���������
	void profit(HeadOffice h) {
		clearScreen();
		int month;
		while(true) {
			System.out.print("���� �����ϼ��� >>> ");
			try {
				month = sc.nextInt();
				if(!(month-1<cntC||month-1<cntH||month-1<cntG)) {
					continue;
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
				sc = new Scanner(System.in);
				month=0;
			}
		}
		sc.nextLine();
		if(h instanceof Cheongdam) {
			System.out.println("=====================");
			System.out.print(h+"�� "+month+"�� ������ : ");
			System.out.println(h.aC[month-1].aNetProfit+"��");
			System.out.println("=====================");
		}else if(h instanceof Gangnam) {
			System.out.println("=====================");
			System.out.print(h+"�� "+month+"�� ������ : ");
			System.out.println(h.aG[month-1].aNetProfit+"��");
			System.out.println("=====================");			
		}else if(h instanceof Hannam) {
			System.out.println("=====================");
			System.out.print(h+"�� "+month+"�� ������ : ");
			System.out.println(h.aH[month-1].aNetProfit+"��");
			System.out.println("=====================");
		}
		System.out.println("Press the Enter.");
		sc.nextLine();
		clearScreen();
	}//end profit

	//�������
	void modify(HeadOffice h) {
		clearScreen();
		int month;
		while(true) {
			System.out.print("�����Ͻ� ���� �Է��ϼ��� : ");
			try {
				month = sc.nextInt();
				if(!(month-1<cntC||month-1<cntH||month-1<cntG)) {
					continue;
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���.");
				sc = new Scanner(System.in);
			}
		}
		System.out.println("1.�� ����\n2.�ΰǺ�\n3.������\n4.����\n5.�ڷΰ���");
		System.out.print("���� >>> ");
		//���� ���ڿ� �Է��ϸ� ���� ���� ������
		int choice=0;
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("���ڸ� �Է����ּ���.");
			sc = new Scanner(System.in);
			choice=0;
		}
		switch(choice) {
			case 1: 
				System.out.print(h+"�� �����Ͻ� "+month+"�� �� ������ �Է��ϼ��� : ");
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
				System.out.print(h+"�� �����Ͻ� "+month+"�� �ΰǺ� �Է��ϼ��� : ");
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
				System.out.print(h+"�� �����Ͻ� "+month+"�� �������� �Է��ϼ��� : ");
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
				System.out.print(h+"�� �����Ͻ� "+month+"�� ������ �Է��ϼ��� : ");
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
	
	//�Ѹ���
	void grossSales(HeadOffice h) {
		clearScreen();
		sc.nextLine();
		System.out.println(h+"�� ���� ���");
		if(h instanceof Cheongdam) {
			for (int i = 0; i < cntC; i++) {
				System.out.println("=================================================");
				System.out.println((i+1)+"�� �� ���� : "+h.aC[i].monthlySales+"��");
				System.out.println((i+1)+"�� �ΰǺ� : "+h.aC[i].personnelExpense+"��");
				System.out.println((i+1)+"�� ������ : "+h.aC[i].utilityCharges+"��");
				System.out.println((i+1)+"�� ���� : "+h.aC[i].monthlyRent+"��");
				System.out.println((i+1)+"�� ���� : "+(int)(h.aC[i].tax)+"��");
				System.out.println((i+1)+"�� �μ�Ƽ�� : "+h.aC[i].incentive+"��");
				System.out.println((i+1)+"�� ������ : "+(h.aC[i].aNetProfit)+"��");
			}
			System.out.println("=================================================");
		}else if(h instanceof Gangnam) {
			for (int i = 0; i < cntG; i++) {
				System.out.println("=================================================");
				System.out.println((i+1)+"�� �� ���� : "+h.aG[i].monthlySales+"��");
				System.out.println((i+1)+"�� �ΰǺ� : "+h.aG[i].personnelExpense+"��");
				System.out.println((i+1)+"�� ������ : "+h.aG[i].utilityCharges+"��");
				System.out.println((i+1)+"�� ���� : "+h.aG[i].monthlyRent+"��");
				System.out.println((i+1)+"�� ���� : "+(int)(h.aG[i].tax)+"��");
				System.out.println((i+1)+"�� �μ�Ƽ�� : "+h.aG[i].incentive+"��");
				System.out.println((i+1)+"�� ������ : "+(h.aG[i].aNetProfit)+"��");
				System.out.println("=================================================");
			}
		}else if(h instanceof Hannam) {
			for (int i = 0; i < cntH; i++) {
				System.out.println("=================================================");
				System.out.println((i+1)+"�� �� ���� : "+h.aH[i].monthlySales+"��");
				System.out.println((i+1)+"�� �ΰǺ� : "+h.aH[i].personnelExpense+"��");
				System.out.println((i+1)+"�� ������ : "+h.aH[i].utilityCharges+"��");
				System.out.println((i+1)+"�� ���� : "+h.aH[i].monthlyRent+"��");
				System.out.println((i+1)+"�� ���� : "+(int)(h.aH[i].tax)+"��");
				System.out.println((i+1)+"�� �μ�Ƽ�� : "+h.aH[i].incentive+"��");
				System.out.println((i+1)+"�� ������ : "+(h.aH[i].aNetProfit)+"��");
				System.out.println("=================================================");
			}
		}
		System.out.println("Press the Enter.");
		sc.nextLine();
		clearScreen();
	}//end grossSales
	
	//������ ���
	void cList(HeadOffice h, int month) {
		System.out.println("=================================================");
		System.out.println(month+"�� �� ���� : "+h.aC[month-1].monthlySales+"��");
		System.out.println(month+"�� �ΰǺ� : "+h.aC[month-1].personnelExpense+"��");
		System.out.println(month+"�� ������ : "+h.aC[month-1].utilityCharges+"��");
		System.out.println(month+"�� ���� : "+h.aC[month-1].monthlyRent+"��");
		System.out.println(month+"�� ���� : "+(int)(h.aC[month-1].tax)+"��");
		System.out.println(month+"�� �μ�Ƽ�� : "+h.aC[month-1].incentive+"��");
		System.out.println(month+"�� ������ : "+(h.aC[month-1].aNetProfit)+"��");
		System.out.println("=================================================");
	}
	void gList(HeadOffice h, int month) {
		System.out.println("=================================================");
		System.out.println(month+"�� �� ���� : "+h.aG[month-1].monthlySales+"��");
		System.out.println(month+"�� �ΰǺ� : "+h.aG[month-1].personnelExpense+"��");
		System.out.println(month+"�� ������ : "+h.aG[month-1].utilityCharges+"��");
		System.out.println(month+"�� ���� : "+h.aG[month-1].monthlyRent+"��");
		System.out.println(month+"�� ���� : "+(int)(h.aG[month-1].tax)+"��");
		System.out.println(month+"�� �μ�Ƽ�� : "+h.aG[month-1].incentive+"��");
		System.out.println(month+"�� ������ : "+(h.aG[month-1].aNetProfit)+"��");
		System.out.println("=================================================");
	}
	void hList(HeadOffice h, int month) {
		System.out.println("=================================================");
		System.out.println(month+"�� �� ���� : "+h.aH[month-1].monthlySales+"��");
		System.out.println(month+"�� �ΰǺ� : "+h.aH[month-1].personnelExpense+"��");
		System.out.println(month+"�� ������ : "+h.aH[month-1].utilityCharges+"��");
		System.out.println(month+"�� ���� : "+h.aH[month-1].monthlyRent+"��");
		System.out.println(month+"�� ���� : "+(int)(h.aH[month-1].tax)+"��");
		System.out.println(month+"�� �μ�Ƽ�� : "+h.aH[month-1].incentive+"��");
		System.out.println(month+"�� ������ : "+(h.aH[month-1].aNetProfit)+"��");
		System.out.println("=================================================");
	}
	
	
	
}//end class
