package charInputstream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) throws IOException{
		Reader reader = new FileReader("C:\\Users\\����ȣ\\Desktop\\Study\\test\\test2.txt");
		int readDate;
		int readCharNo;
		char[] cbuf = new char[2];//�ѹ��� �о���� ����Ʈ ��
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo==-1)break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
		
		
//		//readDate = reader.read();//1���� �о����
//		while(true) {
//			readDate = reader.read();
//			if(readDate == -1)break;
//			System.out.println((char)readDate);
//		}
	}
}
