package waitNotifyEx2;
/*
 * 소비자스레드는 일시 정지되어 있다가 생산자스레드가 데이터를 저장하고
 * notify()로 소비자 스레드를 깨우고 wait()로 일시 정지되면,
 * 생산자 스레드가 저장한 데이터를 읽는다.
 */
public class DataBox {
	private String data;

	public synchronized String getData() {//소비자스레드
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : "+returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {//생산자스레드
		if(this.data != null) {//생산자가 데이터를 넣으려는데 이미 있으면 대기
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data=data;
		System.out.println("ProducerThread가 생성한 데이터 : "+data);
		notify();
	}
}
