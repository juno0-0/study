package subStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
//OutputStream을 보조 스트림으로 Writer로 바꾸기
public class InputStreamReaderEx2 {
	public static void main(String[] args) throws IOException {
		//바이트 기반의 출력 스트림
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\fileOutput.txt");
		Writer w = new OutputStreamWriter(fos);
		String data = "데이터 출력 스트림을 문자 출력 스트림으로 변환";
		w.write(data);
		w.flush();
		w.close();
		fos.close();
	}
}
