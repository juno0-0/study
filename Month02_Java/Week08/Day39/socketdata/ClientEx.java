package socketdata;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//데이터 보내기 클라이언트 부분
public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[ 연결 요청 ]");
			socket.connect(new InetSocketAddress("127.0.0.1",5005));
			//127.0.0.1 = localhost IP
			System.out.println("[ 연결 성공 ]");
			
			byte[] bytes = null;
			String message = null;
					
			//서버로 데이터 내보내기
			OutputStream os = socket.getOutputStream();
			message = "안녕 서버 Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[ 데이터 보내기 성공 ]");
			
			//서버에서 데이터 읽어오기
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByCount = is.read(bytes);
			message = new String(bytes, 0, readByCount, "UTF-8");//byte[]를 String으로
			System.out.println("[ 데이터 받기 성공 ] "+message);
			
			is.close();os.close();socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//위에서 예외가 발생하면 socket가 닫히지 않아서 밑에서 확인
			if(!socket.isClosed()) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
		
	}
}
