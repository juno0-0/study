package waitNotifyEx2;

public class WaitNotifyEx2 {
	public static void main(String[] args) {
		DataBox db = new DataBox();//���� ��ü ����
		ProducerThread pt = new ProducerThread(db);
		ConsummerThread ct = new ConsummerThread(db);
		pt.start();
		ct.start();
		
	}
}
