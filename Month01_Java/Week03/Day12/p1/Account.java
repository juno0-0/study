package p1;

public class Account {
	private String owner;
	private long balance;
	
	public Account() {}
	
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner,long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public Account(long balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}
	
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
	
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	
	public long withdraw(long amount) {
		if(balance>amount) {
			balance -= amount;
			System.out.print("ÇöÀç ÀÜ¾× : ");
			return balance;			
		}else {
			System.out.println("ÀÜ¾× ºÎÁ·");
			System.out.print("ÇöÀç ÀÜ¾× : ");
			return balance;
		}
		
	}
	
	
	public static void main(String[] args) {
		Account a = new Account();
		a.balance=5000;
		a.owner="È«±æµ¿";
		
//		System.out.println(a.deposit(10000));
		System.out.println(a.withdraw(6000));
		
	}
}
