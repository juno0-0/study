package p3;
//�������̽�
public interface RemoteControl {
	//���
	static final double PI = 3.14;
	double EARTH_AREA = 5478.651;//�����ص� �ڵ����� static final
	final double EARTH_HEIGTH = 500;//static�� ������ ��
	static double MAX=99999;
	//�߻�޼ҵ�, public abstract�� �����ȴ�.
	public abstract void turnOn();
	void turnOff();//public abstract�� ����
	public void soundOn();//abstract�� ����
	abstract void soundOff();//public�� �����Ǿ��ִ�.
	
	//default�޼ҵ带 1.8�������� �����
	default void setMute() { //�ν��Ͻ� �޼ҵ�
		
	}//�����ڵ� �ۼ�
	default void setMM() {  }
	
	//�����޼ҵ� ��� 1.8�������� �����
	static void aa() {  }//Ŭ���� �޼ҵ�
	
	//������ ����� - x
	//public RemoteControl() { }
	
	//�ʱ�ȭ ��� - x
	//{  }
	
	//���� �ʱ�ȭ ��� - x
	//static {  }
}
