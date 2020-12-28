package exception;
//아이디가 존재하지 않으면 생성할 사용자 정의 예외 클래스
public class NotExistIDException extends Exception{
	//기본 생성자 만들기
	public NotExistIDException() {}
	//명시적 생성자 만들기
	public NotExistIDException(String msg) {
		super(msg);
	}
}
