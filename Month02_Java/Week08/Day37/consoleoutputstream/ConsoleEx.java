package consoleoutputstream;

import java.io.IOException;
import java.io.InputStream;

class ConsoleEx {
	public static void main(String[] args) throws IOException {
		System.out.print("�Է��ϼ��� : ");
		InputStream is = System.in;
		byte[] datas = new byte[100];
		System.out.print("�̸� : ");
		int nameBytes = is.read(datas);
		System.out.println(nameBytes);//�ѱ��� 2����Ʈ�ε� 3���� �Է½� 8����Ʈ�� ������ ������
							//ȫ �� �� + ĳ��������(�����ڵ� 13��,\r) + �����ǵ�(�����ڵ� 10��, \n)
		String name = new String(datas, 0, nameBytes-2);//�ڿ� �ִ� ĳ�������ϰ� �����ǵ带 ���� ��
		System.out.println(name);
		
		
		//char inputChar = (char) is.read();//�Է� ��Ʈ���ε� 1����Ʈ�� �о�Ͷ�
		//read()�� ���� ����Ʈ�� ����, read(�迭) : ���� ���ڼ��� ����
		
		//System.out.println("��� : "+inputChar);
	}
}
