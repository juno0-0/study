package inputstream;


import java.io.*;


public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/Users/방준호/Desktop/Study/test/test1.txt");
		//파일이 없거나 할 수 있으니까 예외처리
		int readByte;
		int readByteNo;
		byte[] readBytes = new byte[8];//한번에 읽을 때 2바이트씩 읽어오는 것
		readByteNo = is.read(readBytes,1,4);
		for(int i=0;i<readBytes.length;i++) {
			System.out.println((char)readBytes[i]);
//		while(true) {
//			readByteNo = is.read(readBytes);//2바이트씩 읽음, 배열 크기만큼 읽어온다.
//			if(readByteNo == -1)break;
//			data+=new String(readBytes,0,readByteNo);
			
			
			
			
			//readByte = is.read();//1바이트씩 읽어온다. 한글이나 특수문자 등 유니코드 자료는 깨짐
								 				//한글이나 특수문자는 1바이트가 넘기 때문에
			//if(readByte == -1)break;//다 읽어왔으면 멈춤
			//System.out.print((char)readByte);//아스키 코드값으로 출력되기 때문에 형변환
		}
		is.close();
	}
}
