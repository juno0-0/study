package daemonEx;

public class DaemonEx {
	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setDaemon(true);//AutoSaveThread�� ���ν������� Daemon���� ����ٴ� �ǹ�
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� ������ ����");
	}
	
}
