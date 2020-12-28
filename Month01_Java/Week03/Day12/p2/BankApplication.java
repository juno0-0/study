package p2;
/*
 * 클래스를 만들 때 필드와 메소드를 먼저 생각한다.
 * 필드 : 계좌번호, 성명, 잔액
 * 메소드 : 입력, 목록, 예금, 출금, 종료 
 */
public class BankApplication {
	private String bankNum;
	private String bankName;
	private int money;
	
	public BankApplication() {

	}
	
	public String getBankNum() {
		return bankNum;
	}
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
