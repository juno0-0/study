package waitNotifyEx2;

public class WaitNotifyEx2 {
	public static void main(String[] args) {
		DataBox db = new DataBox();//공유 객체 생성
		ProducerThread pt = new ProducerThread(db);
		ConsummerThread ct = new ConsummerThread(db);
		pt.start();
		ct.start();
		
	}
}
