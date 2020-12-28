package systemEx;

import java.io.InputStream;
import java.io.PrintStream;

public class SystemEx {
	public static void main(String[] args) {
		//필드 
		InputStream is = System.in;//콘솔입력, 키보드입력
		PrintStream ps = System.err;//콘솔에러, 모니터로 에러를 표시하는 것
		PrintStream ps1 = System.out;//콘솔출력, 모니터출력
		//getProperty()
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		System.out.println(osName);
		System.out.println(userName);
		long ct = System.currentTimeMillis();
		long nt = System.nanoTime();
		System.gc();//쓰레기 수집 요청
	}
}

