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
			System.out.println("1.�������� 2.�������� 3.�������� 4.��������");
			System.out.print("�����? ");
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
			System.out.print("��ǰ�� : ");
			o.name = sc.next();
			if(o.name.equals("��ǻ��")) {
				if(o instanceof Seoul) {
					System.out.print("�������� ��ǻ�� �Ǹŷ���? : ");
					s.computerCnt+=sc.nextInt();
				}else if(o instanceof Gyeonggi) {
					System.out.print("������� ��ǻ�� �Ǹŷ���? : ");
					gy.computerCnt+=sc.nextInt();
				}else if(o instanceof Gangwon) {
					System.out.print("�������� ��ǻ�� �Ǹŷ���? : ");
					ga.computerCnt+=sc.nextInt();
				}else {
					System.out.print("�������� ��ǻ�� �Ǹŷ���? : ");
					j.computerCnt+=sc.nextInt();
				}
			}else if(o.name.equals("������")) {
				if(o instanceof Seoul) {
					System.out.print("�������� ������ �Ǹŷ���? : ");
					s.printerCnt+=sc.nextInt();
				}else if(o instanceof Gyeonggi) {
					System.out.print("������� ������ �Ǹŷ���? : ");
					gy.printerCnt+=sc.nextInt();
				}else if(o instanceof Gangwon) {
					System.out.print("�������� ������ �Ǹŷ���? : ");
					ga.printerCnt+=sc.nextInt();
				}else {
					System.out.print("�������� ������ �Ǹŷ���? : ");
					j.printerCnt+=sc.nextInt();
				}	
			}
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�?(Y/N)");
			String yn = sc.next();
			if(yn.equals("N") || yn.equals("n")) {
				flag=false;
			}
		
	}
	void income() {
		if(s.computerCnt!=0) {
			temp += "Seoul  ��ǻ��"+"  "+o.computer+"  "+s.computerCnt+"  "+s.computerCnt*o.computer+"\n";
		}
		if(s.printerCnt!=0) {
			temp += "Seoul  ������"+"  "+o.printer+"  "+s.printerCnt+"  "+s.printerCnt*o.printer+"\n";
		}
		if(gy.computerCnt!=0) {
			temp += "Gyeonggi  ��ǻ��"+"  "+o.computer+"  "+gy.computerCnt+"  "+gy.computerCnt*o.computer+"\n";
		}
		if(gy.printerCnt!=0) {
			temp += "Gyeonggi  ������"+"  "+o.printer+"  "+gy.printerCnt+"  "+gy.printerCnt*o.printer+"\n";
		}
		if(ga.computerCnt!=0) {
			temp += "Gangwon  ��ǻ��"+"  "+o.computer+"  "+ga.computerCnt+"  "+ga.computerCnt*o.computer+"\n";
		}
		if(ga.printerCnt!=0) {
			temp += "Gangwon  ������"+"  "+o.printer+"  "+ga.printerCnt+"  "+ga.printerCnt*o.printer+"\n";
		}
		if(j.computerCnt!=0) {
			temp += "Jeju  ��ǻ��"+"  "+o.computer+"  "+j.computerCnt+"  "+j.computerCnt*o.computer+"\n";
		}
		if(j.printerCnt!=0) {
			temp += "Jeju  ������"+"  "+o.printer+"  "+j.printerCnt+"  "+j.printerCnt*o.printer+"\n";
		}
		
	}
	void output() {
		System.out.println("==============================");
		System.out.println("�� ���纰 �Ǹ� ��Ȳ");
		System.out.println("==============================");
		System.out.println("�����       ��ǰ��  ��ǰ����    �Ǹŷ�  ������Ȳ");
		System.out.println("==============================");
		income();
		System.out.println(temp);
	}
}
