package socketdata;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//데이터 주고 받기 네트워크 서버부분
public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocker = null;//전역변수로 쓰려고 null로 줌
		try {
			serverSocker = new ServerSocket();
			serverSocker.bind(new InetSocketAddress("127.0.0.1",5005));
			//127.0.0.1 = localhost IP
			while(true) {
				System.out.println("[ 연결 기다림 ]");
				Socket socket = serverSocker.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[ 연결 수락함 ] "+isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				//클라이언트에서 주는 데이터를 읽어오기
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[ 데이터 받기 성공 ] "+message);
				
				//클라이언트로 데이터 내보내기
				OutputStream os = socket.getOutputStream();
				message = "안녕 클라이언트 Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[ 데이터 보내기 성공 ]");
				is.close();os.close();socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!serverSocker.isClosed()) {
			try {
				serverSocker.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
