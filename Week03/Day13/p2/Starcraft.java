package p2;

public class Starcraft {
	public static void main(String[] args) {
		Marine m = new Marine(10, 20);
		m.position();
		m.move();
		m.stop();
		m.stimPack();
		System.out.println();
		Tank t = new Tank(100, 200);
		t.position();
		t.move();
		t.stop();
		t.changeMode();
		System.out.println();
		Dropship d = new Dropship(1000,2000);
		d.position();
		d.move();
		d.stop();
		d.load(m.x,m.y);
		d.unload(d.x,d.y);
		
	}
	
}
