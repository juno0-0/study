package anonymous;

public class RemoteControlMain {
	public static void main(String[] args) {
		//RemoteControl rc = new RemoteControlRun();
		RemoteControl rc = new RemoteControl() {//�������̽��� new�ϰ� { }; �Ŀ� ��������.���
												//������ü�� �����ϰ� �ٷ� ������
			int a = 10;
			//static int sa =20;
			//static�� Ŭ���������� �����ϴµ� Ŭ������ ��ü�� ��� ����� ���Ѵ�.
			
			@Override
			public void turnOn() {
				System.out.println("�͸�ü �ѱ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("�͸�ü ����");
			}
			
			void ss() {
				System.out.println("�͸�ü �ڽ��� �޼ҵ�");
				
			}
			
		};
		rc.turnOn();
		
		
	}
}
