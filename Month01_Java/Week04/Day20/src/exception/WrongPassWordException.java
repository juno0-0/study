package exception;
//�н����尡 �߸��� ��� ó���� ����
public class WrongPassWordException extends Exception{
	public WrongPassWordException() {}
	public WrongPassWordException(String msg) {
		super(msg);
	}
}
