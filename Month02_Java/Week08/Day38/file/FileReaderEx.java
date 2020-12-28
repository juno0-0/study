package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
//텍스트 파일 읽기 --> 콘솔 출력(모니터)
//키보드로 입력 받아서 --> 파일로 쓰기
//복사하는 키를 만들 때 사용하는 것
public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\Temp\\test.txt");//문서 자료 읽기
		FileWriter fw = new FileWriter("D:\\Temp\\testttt.txt");//문서 자료 쓰기
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] cbuf2 = str.toCharArray();
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!=-1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
			fw.write(cbuf,0,readCharNo);
		}
		fw.write(cbuf2);
		fw.flush();//버퍼에 있는거 전부 출력
		fw.close();
		fr.close();
		
	}
}
