package charoutputstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReaderEx {
	public static void main(String[] args) throws IOException{
		Writer writer = new FileWriter("C:\\Users\\방준호\\Desktop\\Study\\test\\fWriter.txt");
		char[] data = "홍길동".toCharArray();
		writer.write("이순신");//매개값으로 바로 String을 넣을 수도 있다.
//		for(int i=0;i<data.length;i++) {
//			writer.write(data,1,2);
//		}
		
		writer.flush();//버퍼안에 들어 있는 자료 모두 출력하기
		writer.close();//File 자원 반납
		
		
	}
}
