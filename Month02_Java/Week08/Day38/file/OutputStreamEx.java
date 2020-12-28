package file;

import java.io.*;

//���� ����
public class OutputStreamEx {
	public static void main(String[] args) throws Exception{
		//���� �ִ� ������ 2���� ���Ϸ� ���� �ڹٷ� �Է�
		String originalFileName = "D:\\Temp\\test.txt";
		//����� ������ ������ �ڵ����� �����.
		String targetFileName = "D:\\Temp\\copytest.txt"; 
		
		FileInputStream is = new FileInputStream(originalFileName);
		FileOutputStream ops = new FileOutputStream(targetFileName);
		
		//���� �޼ҵ� ȣ�� read() write()
		int readByteNo;
		byte[] readBytes = new byte[100];//100���� �д´�.
		while((readByteNo=is.read(readBytes))!=-1) {//read(�迭) : �迭�� ���̸�ŭ �а� ���̸� ����
			ops.write(readBytes,0,readBytes.length);
			//�о�� �����Ͱ� 100���� �ѱ� ������ �ݺ����� ���
		}
		ops.flush();
		ops.close();
		is.close();
		System.out.println("������ �����߽��ϴ�.");
		
		
		
	}
}
