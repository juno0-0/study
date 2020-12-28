package buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//���� ����� �Ͱ� ���� �� �ð� ���ϱ�
public class BufferedEx {
	public static void main(String[] args) throws IOException {
		long start=0;
		long end=0;
		
		FileInputStream fis1 = new FileInputStream("D:\\Temp\\img.jpg");
		start = System.currentTimeMillis();
		while(fis1.read()!=-1) {
			end = System.currentTimeMillis();			
		}
		System.out.println("���۸� ������� ���� ��� �ð� : "+(end-start));
		
		FileInputStream fis2 = new FileInputStream("D:\\Temp\\img.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read()!=-1) {
			end = System.currentTimeMillis();
		}
		System.out.println("���۸� ����� ��� �ð� : "+(end-start));
	}
}
