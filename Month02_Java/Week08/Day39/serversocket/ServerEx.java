package serversocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
//����
public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			//1�ܰ� ��Ʈ ���ε�
			serverSocket.bind(new InetSocketAddress("localhost",5001));
												     //IP�ּ�        ��Ʈ��ȣ
			//2�ܰ� accept(), ��ٸ���
			while(true){
				System.out.println("���� ��ٸ���");
				Socket socket = serverSocket.accept();//������ ������ accept()�� ����
				
				//3�ܰ� ServerSocket�� ����� ����
				InetSocketAddress isa = (InetSocketAddress) socket
						.getRemoteSocketAddress();//Ŭ���̾�Ʈ�ʰ� ����
				System.out.println("[���� ������] " + isa.getHostName());
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
