package file;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
//�ؽ�Ʈ ���� �б� --> �ܼ� ���(�����)
//Ű����� �Է� �޾Ƽ� --> ���Ϸ� ����
//�����ϴ� Ű�� ���� �� ����ϴ� ��
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
