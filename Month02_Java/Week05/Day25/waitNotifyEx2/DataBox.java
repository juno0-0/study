package waitNotifyEx2;
/*
 * �Һ��ڽ������ �Ͻ� �����Ǿ� �ִٰ� �����ڽ����尡 �����͸� �����ϰ�
 * notify()�� �Һ��� �����带 ����� wait()�� �Ͻ� �����Ǹ�,
 * ������ �����尡 ������ �����͸� �д´�.
 */
public class DataBox {
	private String data;

	public synchronized String getData() {//�Һ��ڽ�����
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������ : "+returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {//�����ڽ�����
		if(this.data != null) {//�����ڰ� �����͸� �������µ� �̹� ������ ���
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data=data;
		System.out.println("ProducerThread�� ������ ������ : "+data);
		notify();
	}
}
