package print;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
	public static void main(String[] args) throws Exception {
		//FileOutputStream fos = new FileOutputStream("D:\\Temp\\text3.txt");
		//BufferedOutputStream bos = new BufferedOutputStream(fos);
		//PrintStream ps = new PrintStream(bos);
		PrintStream ps = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream("D:\\Temp\\text3.txt")));
		
		ps.println("프린터 보조 스트림");
		ps.println(true);
		ps.print(10);
		ps.printf("%d", 100);
		ps.write(500);//2진으로 바뀌어서 메모장에서 읽지 못함
		
		ps.flush();
		ps.close();
	}
}
