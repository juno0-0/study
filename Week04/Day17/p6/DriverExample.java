package p6;

public class DriverExample {
	public static void main(String[] args) {
		Driver d = new Driver();
		Vehicle v1= new Bus();
		Vehicle v2 = new Taxi();
		Vehicle v3 = new Vehicle() {
			
			@Override
			public void run() {
				//익명객체
				System.out.println("달린다.");
			}
		};
		
		
		d.driver(v1);
		d.driver(v2);
		
	}
}
