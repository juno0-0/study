package p1;

public class Computer {
	public final String[] osType = {"����7","���� OS X","�ȵ���̵�"};
	int memory;
	int OS;
	
	public Computer() {}
	
	public Computer(int OS, int memory) {
		this.OS=OS;
		this.memory=memory;
	}
	
	void print() {
		System.out.println("�ü�� : "+osType[OS]+", �޸� : "+memory);
	}
	
	
	public static void main(String[] args) {
		Computer pc = new Computer(0,16);
		Computer apple = new Computer(1,32);
		Computer galaxy = new Computer(2,16);
		pc.print();
		apple.print();
		galaxy.print();
		
	}
}
