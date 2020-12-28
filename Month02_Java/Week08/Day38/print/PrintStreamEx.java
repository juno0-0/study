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
		
		ps.println("������ ���� ��Ʈ��");
		ps.println(true);
		ps.print(10);
		ps.printf("%d", 100);
		ps.write(500);//2������ �ٲ� �޸��忡�� ���� ����
		
		ps.flush();
		ps.close();
	}
}
