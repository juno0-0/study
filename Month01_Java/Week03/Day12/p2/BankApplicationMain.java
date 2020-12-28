package p2;

import java.util.Scanner;

public class BankApplicationMain {
	//입력에서도 쓰고 메뉴선택에서도 쓰기 때문에 스캐너를 전역변수로 생성
	Scanner sc = new Scanner(System.in);
	static int cnt=0;//계좌 갯수
//	BankApplication[] bankAddress=new BankApplication[cnt];
	BankApplication[] bankAddress;
	 
	public BankApplicationMain(int arrayLe) {
		bankAddress = new BankApplication[arrayLe];
	}
	
	
	//메뉴
	//static을 붙히면 객체화를 안하고 출력할 수 있지만
	//static은 메모리에 올라가면 내려오지 않기 때문에 프로그램이 종료될 때까지 
	//메모리에 올려놓을 중요한게 아니면 남용하지 않는다.
	void headTitle() {
		System.out.println("============================================");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("============================================");
		System.out.print("선택 > ");
	}
	
	//메뉴선택
	int inputChoice() {
		int choice = sc.nextInt();//변수에 담아도 되고 바로 리턴해도 된다.
		return choice;
	}
	
	//입력
	private void creatBank() {
		cnt++;
		int i=cnt-1;
		bankAddress[i] = new BankApplication();	//여기서 new를 한 이유는 	
		
		System.out.println("=======");
		System.out.println("계좌생성");
		System.out.println("=======");
		System.out.print("계좌번호 : ");
		bankAddress[i].setBankNum(sc.next());
		System.out.print("계좌주 : ");
		bankAddress[i].setBankName(sc.next());
		System.out.print("초기입금액 : ");
		bankAddress[i].setMoney(sc.nextInt());
		System.out.println("계좌가 생성되었습니다.");
			
	}
	
	//목록
	private void list() {
		System.out.println("=======");
		System.out.println("계좌목록");
		System.out.println("=======");
		for (int i = 0; i < cnt; i++) {
			System.out.println(bankAddress[i].getBankNum()+" "+bankAddress[i].getBankName()+" "+bankAddress[i].getMoney());
		}
		
	}
	
	//입금
	private void deposit() {
		System.out.println("=======");
		System.out.println("예   금");
		System.out.println("=======");
		System.out.print("계좌번호 : ");
		String inputbankNumber = sc.next();
		//해당 계좌 찾기
		boolean searchOK = false;
		for (int i = 0; i < cnt; i++) {
			if(inputbankNumber.equals(bankAddress[i].getBankNum())) {
				System.out.print("예금액 : ");
				int money = sc.nextInt();
				bankAddress[i].setMoney(money + bankAddress[i].getMoney());
				searchOK = true;
			}	
		}
		if(searchOK) System.out.println("결과 : 예금이 성공했습니다.");
		else System.out.println("결과 : 예금이 실패했습니다.");
	}
	
	//출금
	private void withdraw() {
		System.out.println("=======");
		System.out.println("출   금");
		System.out.println("=======");
		System.out.print("계좌번호 : ");
		String outputbankNumber = sc.next();
		boolean searchOK = false;
		for (int i = 0; i < cnt; i++) {
			if(outputbankNumber.equals(bankAddress[i].getBankNum())) {
				System.out.print("출금액 : ");
				int money = sc.nextInt();
				if(bankAddress[i].getMoney()>=0&&money<=bankAddress[i].getMoney()) {
					bankAddress[i].setMoney(bankAddress[i].getMoney() - money);
					searchOK = true;					
				}else {
					System.out.println("잔액 부족");
				}
			}
		}
		if(searchOK) System.out.println("결과 : 출금이 성공했습니다.");
		else System.out.println("결과 : 출금이 실패했습니다.");
		
	}
	
	
	
	public static void main(String[] args) {
		BankApplicationMain ba = new BankApplicationMain(10);
		boolean flag = true;
		while(flag) {
			ba.headTitle();
//			int choice = baMain.inputChoice();
			switch(ba.inputChoice()) {	//바로 초이스에 넣어도 된다.
				case 1: ba.creatBank(); break;
				case 2: ba.list(); break;
				case 3: ba.deposit(); break;
				case 4: ba.withdraw(); break;
				case 5: flag=false; break;
			
			}
		}
	}


	
	
}
