package consoleoutputstream;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleEx2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		OutputStream os = System.out;//�ܼ� ���, ����� ���
		for(byte b= 48;b<58;b++) {
			os.write(b);
		}
		os.write(10);//System.out.println()�� ����.
		for(byte b=97;b<123;b++) {
			Thread.sleep(150);
			os.write(b);
			os.flush();//�̰� ���� ������ ���ۿ� ���常 ���ְ� �������� �ʾƼ� ����� �ȵȴ�.
			
		}
		os.write(10);//System.out.println()�� ����.
		
		String hangul = "�����ٶ�";
		byte[] hangulByte = hangul.getBytes();
		os.write(hangulByte);
		os.flush();//�̰� ���� ������ ���ۿ� ���常 ���ְ� �������� �ʾƼ� ����� �ȵȴ�.
		os.close();
	}
}
