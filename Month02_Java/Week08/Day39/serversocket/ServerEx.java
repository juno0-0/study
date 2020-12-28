package serversocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
//서버
public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			//1단계 포트 바인딩
			serverSocket.bind(new InetSocketAddress("localhost",5001));
												     //IP주소        포트번호
			//2단계 accept(), 기다리기
			while(true){
				System.out.println("연결 기다리기");
				Socket socket = serverSocket.accept();//연결이 들어오면 accept()가 수락
				
				//3단계 ServerSocket을 만들고 리턴
				InetSocketAddress isa = (InetSocketAddress) socket
						.getRemoteSocketAddress();//클라이언트쪽과 연결
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
