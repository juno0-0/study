package socketdata;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//������ �ְ� �ޱ� ��Ʈ��ũ �����κ�
public class ServerEx {
	public static void main(String[] args) {
		ServerSocket serverSocker = null;//���������� ������ null�� ��
		try {
			serverSocker = new ServerSocket();
			serverSocker.bind(new InetSocketAddress("127.0.0.1",5005));
			//127.0.0.1 = localhost IP
			while(true) {
				System.out.println("[ ���� ��ٸ� ]");
				Socket socket = serverSocker.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[ ���� ������ ] "+isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				//Ŭ���̾�Ʈ���� �ִ� �����͸� �о����
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[ ������ �ޱ� ���� ] "+message);
				
				//Ŭ���̾�Ʈ�� ������ ��������
				OutputStream os = socket.getOutputStream();
				message = "�ȳ� Ŭ���̾�Ʈ Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[ ������ ������ ���� ]");
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
