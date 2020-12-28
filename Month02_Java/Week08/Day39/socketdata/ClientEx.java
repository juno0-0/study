package socketdata;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//������ ������ Ŭ���̾�Ʈ �κ�
public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[ ���� ��û ]");
			socket.connect(new InetSocketAddress("127.0.0.1",5005));
			//127.0.0.1 = localhost IP
			System.out.println("[ ���� ���� ]");
			
			byte[] bytes = null;
			String message = null;
					
			//������ ������ ��������
			OutputStream os = socket.getOutputStream();
			message = "�ȳ� ���� Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[ ������ ������ ���� ]");
			
			//�������� ������ �о����
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByCount = is.read(bytes);
			message = new String(bytes, 0, readByCount, "UTF-8");//byte[]�� String����
			System.out.println("[ ������ �ޱ� ���� ] "+message);
			
			is.close();os.close();socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//������ ���ܰ� �߻��ϸ� socket�� ������ �ʾƼ� �ؿ��� Ȯ��
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
