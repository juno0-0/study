package exception;
//패스워드가 잘못된 경우 처리할 예외
public class WrongPassWordException extends Exception{
	public WrongPassWordException() {}
	public WrongPassWordException(String msg) {
		super(msg);
	}
}
