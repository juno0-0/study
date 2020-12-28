package p2;

public class Account {
	private int balance;
	final int MIN_BALANCE=0;
	final int MAX_BALANCE=1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance&&MAX_BALANCE>=balance) {
			this.balance += balance;	 
		}
	}
	
	
}
