package exception;
//���̵� �������� ������ ������ ����� ���� ���� Ŭ����
public class NotExistIDException extends Exception{
	//�⺻ ������ �����
	public NotExistIDException() {}
	//����� ������ �����
	public NotExistIDException(String msg) {
		super(msg);
	}
}
