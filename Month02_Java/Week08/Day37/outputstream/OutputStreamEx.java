package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Users\\πÊ¡ÿ»£\\Desktop\\Study\\test\\test1.txt");
		byte[] data = "ABCDEF".getBytes();
		os.write(data,1,2);
//		for(int i=0;i<data.length;i++) {
//			os.write(data[i]);
//		}
		os.flush();
		os.close();
	}
}
