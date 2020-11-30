package ex;

public class AccountTest {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(10000);
		System.out.println(a.withdraw(20000));
	}
}
