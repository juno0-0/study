package file;

import java.io.*;

//파일 복사
public class OutputStreamEx {
	public static void main(String[] args) throws Exception{
		//여기 있는 파일을 2진수 파일로 만들어서 자바로 입력
		String originalFileName = "D:\\Temp\\test.txt";
		//출력은 파일이 없으면 자동으로 만든다.
		String targetFileName = "D:\\Temp\\copytest.txt"; 
		
		FileInputStream is = new FileInputStream(originalFileName);
		FileOutputStream ops = new FileOutputStream(targetFileName);
		
		//동작 메소드 호출 read() write()
		int readByteNo;
		byte[] readBytes = new byte[100];//100개씩 읽는다.
		while((readByteNo=is.read(readBytes))!=-1) {//read(배열) : 배열의 길이만큼 읽고 길이를 리턴
			ops.write(readBytes,0,readBytes.length);
			//읽어올 데이터가 100개가 넘기 때문에 반복문을 사용
		}
		ops.flush();
		ops.close();
		is.close();
		System.out.println("파일을 복사했습니다.");
		
		
		
	}
}
