package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
//�ؽ�Ʈ ���� �б� --> �ܼ� ���(�����)
//Ű����� �Է� �޾Ƽ� --> ���Ϸ� ����
//�����ϴ� Ű�� ���� �� ����ϴ� ��
public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\Temp\\test.txt");//���� �ڷ� �б�
		FileWriter fw = new FileWriter("D:\\Temp\\testttt.txt");//���� �ڷ� ����
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
		fw.flush();//���ۿ� �ִ°� ���� ���
		fw.close();
		fr.close();
		
	}
}
