package consoleoutputstream;

import java.io.IOException;
import java.io.InputStream;

class ConsoleEx {
	public static void main(String[] args) throws IOException {
		System.out.print("입력하세요 : ");
		InputStream is = System.in;
		byte[] datas = new byte[100];
		System.out.print("이름 : ");
		int nameBytes = is.read(datas);
		System.out.println(nameBytes);//한글은 2바이트인데 3글자 입력시 8바이트가 나오는 이유는
							//홍 길 동 + 캐리지리턴(유니코드 13번,\r) + 라인피드(유니코드 10번, \n)
		String name = new String(datas, 0, nameBytes-2);//뒤에 있는 캐리지리턴과 라인피드를 빼는 것
		System.out.println(name);
		
		
		//char inputChar = (char) is.read();//입력 스트림인데 1바이트만 읽어와라
		//read()는 읽은 바이트를 리턴, read(배열) : 읽은 문자수를 리턴
		
		//System.out.println("출력 : "+inputChar);
	}
}
