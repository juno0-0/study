package p2;
/*
 * Ŭ������ ���� �� �ʵ�� �޼ҵ带 ���� �����Ѵ�.
 * �ʵ� : ���¹�ȣ, ����, �ܾ�
 * �޼ҵ� : �Է�, ���, ����, ���, ���� 
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
