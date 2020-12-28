package consoleoutputstream;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleEx2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		OutputStream os = System.out;//콘솔 출력, 모니터 출력
		for(byte b= 48;b<58;b++) {
			os.write(b);
		}
		os.write(10);//System.out.println()과 같다.
		for(byte b=97;b<123;b++) {
			Thread.sleep(150);
			os.write(b);
			os.flush();//이걸 하지 않으면 버퍼에 저장만 되있고 내보내질 않아서 출력이 안된다.
			
		}
		os.write(10);//System.out.println()과 같다.
		
		String hangul = "가나다라마";
		byte[] hangulByte = hangul.getBytes();
		os.write(hangulByte);
		os.flush();//이걸 하지 않으면 버퍼에 저장만 되있고 내보내질 않아서 출력이 안된다.
		os.close();
	}
}
