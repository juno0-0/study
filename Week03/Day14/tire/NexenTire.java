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
			System.out.println(location+"NexenTire ¼ö¸í : "+(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println("***"+location+"NexenTire ÆãÅ©***");
			return false;
		}
	}
}
