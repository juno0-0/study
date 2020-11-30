package tire;

public class NexenTire extends Tire{
	public NexenTire() {}
	
	public NexenTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"NexenTire ���� : "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"NexenTire ��ũ***");
			return false;
		}
	}
}
