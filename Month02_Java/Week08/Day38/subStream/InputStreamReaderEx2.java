package subStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
//OutputStream�� ���� ��Ʈ������ Writer�� �ٲٱ�
public class InputStreamReaderEx2 {
	public static void main(String[] args) throws IOException {
		//����Ʈ ����� ��� ��Ʈ��
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\fileOutput.txt");
		Writer w = new OutputStreamWriter(fos);
		String data = "������ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		w.write(data);
		w.flush();
		w.close();
		fos.close();
	}
}
