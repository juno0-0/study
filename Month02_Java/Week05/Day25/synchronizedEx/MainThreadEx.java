package synchronizedEx;

public class MainThreadEx {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		User1 u1 = new User1();//�������� NEW ����
		u1.setCalculator(c);
		u1.start();//�������� RUNNABLE ���� --> �����췯(�ü��)�� �����쿡 ���� cpu(core, process)�� �־��ش�. = RUNNING ����
		User2 u2 = new User2();
		u2.setCalculator(c);
		u2.start();
		
		
	}
}
