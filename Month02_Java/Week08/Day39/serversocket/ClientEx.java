package serversocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * Ŭ���̾�Ʈ
 * 1. ���� ��û
 * 2. ������ ó�� ��û
 */
public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("���� ��û");
			//1�ܰ� ���� ��û
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("���� ����");
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
