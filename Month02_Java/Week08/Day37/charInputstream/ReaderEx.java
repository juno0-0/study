package charInputstream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) throws IOException{
		Reader reader = new FileReader("C:\\Users\\방준호\\Desktop\\Study\\test\\test2.txt");
		int readDate;
		int readCharNo;
		char[] cbuf = new char[2];//한번에 읽어오는 바이트 수
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo==-1)break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
		
		
//		//readDate = reader.read();//1문자 읽어오기
//		while(true) {
//			readDate = reader.read();
//			if(readDate == -1)break;
//			System.out.println((char)readDate);
//		}
	}
}
