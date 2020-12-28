package serversocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 클라이언트
 * 1. 연결 요청
 * 2. 데이터 처리 요청
 */
public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("연결 요청");
			//1단계 연결 요청
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
