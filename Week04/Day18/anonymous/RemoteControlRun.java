package anonymous;
//������ü �����
public class RemoteControlRun implements RemoteControl{
	@Override
	public void turnOff() {
		System.out.println("������ü ����");
	}
	@Override
	public void turnOn() {
		System.out.println("������ü �ѱ�");
	}
}
