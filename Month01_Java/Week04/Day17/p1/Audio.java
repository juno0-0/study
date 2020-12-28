package p1;
//��ü�κ�
public class Audio implements RemoteControl, Searchable{
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) this.volume=RemoteControl.MAX_VOLUME;
		else if(volume<RemoteControl.MIN_VOLUME) this.volume=RemoteControl.MIN_VOLUME;
		else this.volume=volume;
		System.out.println("���� ������� ������ "+this.volume+"�Դϴ�.");
	}
	
	void chatting(String chatting) {
		System.out.println("ä��â�� "+chatting+"�� �Է��մϴ�.");
	}
	
}