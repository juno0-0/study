package buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//버퍼 사용한 것과 안한 것 시간 비교하기
public class BufferedEx2 {
	public static void main(String[] args) throws IOException {
		long start=0;
		long end=0;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int dataSize;
		byte[] bytes = new byte[100];
		fis = new FileInputStream("D:\\Temp\\text.txt");
		fos = new FileOutputStream("D:\\Temp\\text.txt");
		start = System.currentTimeMillis();
		while((dataSize=fis.read(bytes))!=-1) {
			fos.write(bytes,0,dataSize);
		}
		fos.flush();
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		fis = new FileInputStream("D:\\Temp\\text.txt");
		fos = new FileOutputStream("D:\\Temp\\text.txt");
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((dataSize=bis.read(bytes))!=-1) {
			bos.write(bytes,0,dataSize);
		}
		bos.flush();
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
		
		
		
	}
}
