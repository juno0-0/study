package p1;
//객체부분
public class Audio implements RemoteControl, Searchable{
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) this.volume=RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOLUME) this.volume=RemoteControl.MIN_VOLUME;
		else this.volume=volume;
		System.out.println("현재 오디오의 볼륨은 "+this.volume+"입니다.");
	}
	
	void chatting(String chatting) {
		System.out.println("채팅창에 "+chatting+"를 입력합니다.");
	}
	
}
