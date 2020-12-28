package p2;

import java.util.Scanner;

public class BankApplicationMain {
	//�Է¿����� ���� �޴����ÿ����� ���� ������ ��ĳ�ʸ� ���������� ����
	Scanner sc = new Scanner(System.in);
	static int cnt=0;//���� ����
//	BankApplication[] bankAddress=new BankApplication[cnt];
	BankApplication[] bankAddress;
	 
	public BankApplicationMain(int arrayLe) {
		bankAddress = new BankApplication[arrayLe];
	}
	
	
	//�޴�
	//static�� ������ ��üȭ�� ���ϰ� ����� �� ������
	//static�� �޸𸮿� �ö󰡸� �������� �ʱ� ������ ���α׷��� ����� ������ 
	//�޸𸮿� �÷����� �߿��Ѱ� �ƴϸ� �������� �ʴ´�.
	void headTitle() {
		System.out.println("============================================");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		System.out.println("============================================");
		System.out.print("���� > ");
	}
	
	//�޴�����
	int inputChoice() {
		int choice = sc.nextInt();//������ ��Ƶ� �ǰ� �ٷ� �����ص� �ȴ�.
		return choice;
	}
	
	//�Է�
	private void creatBank() {
		cnt++;
		int i=cnt-1;
		bankAddress[i] = new BankApplication();	//���⼭ new�� �� ������ 	
		
		System.out.println("=======");
		System.out.println("���»���");
		System.out.println("=======");
		System.out.print("���¹�ȣ : ");
		bankAddress[i].setBankNum(sc.next());
		System.out.print("������ : ");
		bankAddress[i].setBankName(sc.next());
		System.out.print("�ʱ��Աݾ� : ");
		bankAddress[i].setMoney(sc.nextInt());
		System.out.println("���°� �����Ǿ����ϴ�.");
			
	}
	
	//���
	private void list() {
		System.out.println("=======");
		System.out.println("���¸��");
		System.out.println("=======");
		for (int i = 0; i < cnt; i++) {
			System.out.println(bankAddress[i].getBankNum()+" "+bankAddress[i].getBankName()+" "+bankAddress[i].getMoney());
		}
		
	}
	
	//�Ա�
	private void deposit() {
		System.out.println("=======");
		System.out.println("��   ��");
		System.out.println("=======");
		System.out.print("���¹�ȣ : ");
		String inputbankNumber = sc.next();
		//�ش� ���� ã��
		boolean searchOK = false;
		for (int i = 0; i < cnt; i++) {
			if(inputbankNumber.equals(bankAddress[i].getBankNum())) {
				System.out.print("���ݾ� : ");
				int money = sc.nextInt();
				bankAddress[i].setMoney(money + bankAddress[i].getMoney());
				searchOK = true;
			}	
		}
		if(searchOK) System.out.println("��� : ������ �����߽��ϴ�.");
		else System.out.println("��� : ������ �����߽��ϴ�.");
	}
	
	//���
	private void withdraw() {
		System.out.println("=======");
		System.out.println("��   ��");
		System.out.println("=======");
		System.out.print("���¹�ȣ : ");
		String outputbankNumber = sc.next();
		boolean searchOK = false;
		for (int i = 0; i < cnt; i++) {
			if(outputbankNumber.equals(bankAddress[i].getBankNum())) {
				System.out.print("��ݾ� : ");
				int money = sc.nextInt();
				if(bankAddress[i].getMoney()>=0&&money<=bankAddress[i].getMoney()) {
					bankAddress[i].setMoney(bankAddress[i].getMoney() - money);
					searchOK = true;					
				}else {
					System.out.println("�ܾ� ����");
				}
			}
		}
		if(searchOK) System.out.println("��� : ����� �����߽��ϴ�.");
		else System.out.println("��� : ����� �����߽��ϴ�.");
		
	}
	
	
	
	public static void main(String[] args) {
		BankApplicationMain ba = new BankApplicationMain(10);
		boolean flag = true;
		while(flag) {
			ba.headTitle();
//			int choice = baMain.inputChoice();
			switch(ba.inputChoice()) {	//�ٷ� ���̽��� �־ �ȴ�.
				case 1: ba.creatBank(); break;
				case 2: ba.list(); break;
				case 3: ba.deposit(); break;
				case 4: ba.withdraw(); break;
				case 5: flag=false; break;
			
			}
		}
	}


	
	
}
