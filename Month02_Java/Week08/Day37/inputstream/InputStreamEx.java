package inputstream;


import java.io.*;


public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/Users/����ȣ/Desktop/Study/test/test1.txt");
		//������ ���ų� �� �� �����ϱ� ����ó��
		int readByte;
		int readByteNo;
		byte[] readBytes = new byte[8];//�ѹ��� ���� �� 2����Ʈ�� �о���� ��
		readByteNo = is.read(readBytes,1,4);
		for(int i=0;i<readBytes.length;i++) {
			System.out.println((char)readBytes[i]);
//		while(true) {
//			readByteNo = is.read(readBytes);//2����Ʈ�� ����, �迭 ũ�⸸ŭ �о�´�.
//			if(readByteNo == -1)break;
//			data+=new String(readBytes,0,readByteNo);
			
			
			
			
			//readByte = is.read();//1����Ʈ�� �о�´�. �ѱ��̳� Ư������ �� �����ڵ� �ڷ�� ����
								 				//�ѱ��̳� Ư�����ڴ� 1����Ʈ�� �ѱ� ������
			//if(readByte == -1)break;//�� �о������ ����
			//System.out.print((char)readByte);//�ƽ�Ű �ڵ尪���� ��µǱ� ������ ����ȯ
		}
		is.close();
	}
}
