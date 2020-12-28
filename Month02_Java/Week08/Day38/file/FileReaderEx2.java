package file;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
//텍스트 파일 읽기 --> 콘솔 출력(모니터)
//키보드로 입력 받아서 --> 파일로 쓰기
//복사하는 키를 만들 때 사용하는 것
public class FileReaderEx2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Writer w = new FileWriter("D:\\Temp\\text.txt");
		w.write(str);
		w.flush();
		w.close();
	}
}
