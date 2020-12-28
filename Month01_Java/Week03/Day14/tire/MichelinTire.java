package tire;

public class MichelinTire extends Tire{
	public MichelinTire() {}
	
	public MichelinTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"MichelinTire ¼ö¸í : "+(maxRotation-accumulatedRotation)+"È¸");
			return true;
		}else {
			System.out.println("***"+location+"NexenTire ÆãÅ©***");
			return false;
		}
	}
}
