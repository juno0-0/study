package systemEx;

import java.io.InputStream;
import java.io.PrintStream;

public class SystemEx {
	public static void main(String[] args) {
		//�ʵ� 
		InputStream is = System.in;//�ܼ��Է�, Ű�����Է�
		PrintStream ps = System.err;//�ֿܼ���, ����ͷ� ������ ǥ���ϴ� ��
		PrintStream ps1 = System.out;//�ܼ����, ��������
		//getProperty()
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		System.out.println(osName);
		System.out.println(userName);
		long ct = System.currentTimeMillis();
		long nt = System.nanoTime();
		System.gc();//������ ���� ��û
	}
}

