package poly;
//부모클래스는 TV 사용에 필요한 공통인 부분 명시
public class TV {
	boolean power;//전원 on/off
	int channel;
	
	void power() {power = !power;}
	void channelUp() {
		++channel;
		System.out.println("부모클래스의 ChannelUP = "+channel);
		}
	void channelDown() {
		--channel;
		System.out.println("부모클래스의 ChannelDown = "+channel);
		}
	
}
