package charoutputstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ReaderEx {
	public static void main(String[] args) throws IOException{
		Writer writer = new FileWriter("C:\\Users\\����ȣ\\Desktop\\Study\\test\\fWriter.txt");
		char[] data = "ȫ�浿".toCharArray();
		writer.write("�̼���");//�Ű������� �ٷ� String�� ���� ���� �ִ�.
//		for(int i=0;i<data.length;i++) {
//			writer.write(data,1,2);
//		}
		
		writer.flush();//���۾ȿ� ��� �ִ� �ڷ� ��� ����ϱ�
		writer.close();//File �ڿ� �ݳ�
		
		
	}
}
