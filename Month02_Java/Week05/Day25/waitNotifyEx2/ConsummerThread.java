package waitNotifyEx2;

public class ConsummerThread extends Thread{
	private DataBox databox;

	public ConsummerThread(DataBox databox) {
		this.databox = databox;
	}
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = databox.getData();
		}
	}
}
