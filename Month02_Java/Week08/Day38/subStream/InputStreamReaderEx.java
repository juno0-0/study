package subStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
//InputStream�� Reader�� �ٲٱ�
public class InputStreamReaderEx {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;//�ý����� �����ϴ� Ű���� �Է�
		Reader r = new InputStreamReader(is);//Reader�� ���� Ŭ����
		//����Ʈ ����� ���� ������� �ٲ� ��
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
