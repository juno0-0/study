package poly;
//�θ�Ŭ������ TV ��뿡 �ʿ��� ������ �κ� ���
public class TV {
	boolean power;//���� on/off
	int channel;
	
	void power() {power = !power;}
	void channelUp() {
		++channel;
		System.out.println("�θ�Ŭ������ ChannelUP = "+channel);
		}
	void channelDown() {
		--channel;
		System.out.println("�θ�Ŭ������ ChannelDown = "+channel);
		}
	
}
