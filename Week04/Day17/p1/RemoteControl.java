package p1;
//����Ŭ������ �θ�� ����� �ʵ峪 �߻� �޼ҵ�
public interface RemoteControl {
	int MAX_VOLUME = 10;
	//static�� ������ Ŭ������(�������̽���).���
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
}

//�������̽��� �θ�Ŭ������ ���ٰ� �����ϸ� �ȴ�.
//�ڽ��� �������̽��� �߻�޼��带 �����ϴ� �κ�
//�θ�Ŭ���� = ������ �κ�
