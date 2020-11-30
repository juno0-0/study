package ex;

public class Account {
	private String owner;
	private long balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Account() {}
	
	public Account(String owner) {
		this.owner = owner;
	}
	
	public Account(long balance) {
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(long balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}
	
	public long deposit(long amount) {
		return balance += amount;
	}
	
	public long withdraw(long amount) {
		if(balance<amount) {
			System.out.println("ÀÜ¾× ºÎÁ·");
			System.out.print("ÀÜ¾× : ");
			return balance;
		}else {
			return balance -= amount;			
			
		}
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(500000);
		a.withdraw(400000);
		System.out.println(a.balance);
	}
}
