package subStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
//InputStream을 Reader로 바꾸기
public class InputStreamReaderEx {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;//시스템이 지원하는 키보드 입력
		Reader r = new InputStreamReader(is);//Reader의 하위 클래스
		//바이트 기반이 문자 기반으로 바뀐 것
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=r.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		r.close();
		is.close();
		
	}
}
