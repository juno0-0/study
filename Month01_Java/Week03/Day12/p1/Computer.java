package p1;

public class Computer {
	public final String[] osType = {"윈도7","애플 OS X","안드로이드"};
	int memory;
	int OS;
	
	public Computer() {}
	
	public Computer(int OS, int memory) {
		this.OS=OS;
		this.memory=memory;
	}
	
	void print() {
		System.out.println("운영체제 : "+osType[OS]+", 메모리 : "+memory);
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
