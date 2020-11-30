package hashcodeEx;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key k = (Key)obj;
			if(this.number==k.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	//equals만 재정의하면 Key가 나오지 않는다.
	//hashCode도 재정의를 해주어야 한다.
	//equals에서도 같고 hashCode에서도 같아야 동등객체
}
