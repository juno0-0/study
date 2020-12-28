package chatting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer extends Thread implements ActionListener{	
	//�ʵ� ����
	Frame frame;//������â �������� �����ϴ� Ŭ����
	TextArea ta;//ä�õ� ������� ���̴� �κ�
	TextField tf;//ä�� �۾� ���� �κ�
	ServerSocket s;
	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;
	
	public ChattingServer() {
		launchFrame();//ȭ�� ����, ȭ���� ������ �޼ҵ�
		service();//������ �����ϴ� ȭ�� ����
	}
	
	//������ �����ϴ� ȭ���� �����ϴ� �޼ҵ�
	private void service() {
		try {
			ta.append("���� �ϱ� ���ؼ� �غ���...\n");//Textarea�� ���ڸ� �߰��ϴ� ��(���� x)
			s = new ServerSocket(5432);
			ta.append("Ŭ���̾�Ʈ ���� ��� ��...\n");
			s1 = s.accept();//Socket
			ta.append("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�... "+s1.getInetAddress()+"\n");
			dos = new DataOutputStream(s1.getOutputStream());
			dis = new DataInputStream(s1.getInputStream());
			this.start();//������ ȣ��
			dos.writeUTF("ä�� ������ �����Ͻ� ���� ȯ���մϴ�...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		try {
			while(!stop) {
				ta.append(dis.readUTF()+"\n");
			}
			dis.close();s1.close();
		} catch (EOFException e) {
			System.out.println("Ŭ���̾�Ʈ�κ��� ������ ������ϴ�...");
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	//ä�� ȭ���� �����ϴ� �޼ҵ�
	private void launchFrame() {
		frame = new Frame("�ϴ��� ä��");//����?
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.RED);//����, �Ⱥ��̴� ������ ta�� tf�� ������â�� �� ä��� �־
		ta.setEditable(false);//ä�õ� ������� ���̴� �κ��� ������ �� ���� ���� ��
		
		frame.add(ta, BorderLayout.CENTER);//�����ӿ� ���̴� �� 
		//ù��° �Ű������� ��� ���ϰ���, �ι�° �Ű������� frame�� � ��ġ�� ���ϰ���
		//BorderLayout�� �߰�, ��, ��, ��, ��
		
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);//���� �����ߴ� �۾��� ó��
		//tf�� �����̴ϱ� �������� ������ �� �ְ� �����ϴ� ��
		//�Ű������� this�� �� ������ �̹� �׼Ǹ����� �������̽��� Ŭ�������� �޾ƿͼ� �׷�
		//this�� ����Ű�°� actionPerformed()�� �Ű�����
		//���������� �׼Ǹ����ʸ� ������ ��� implement�� ���ϰ� �׳� �Ű������� Actionlistner�� 
		//�͸� ���� ��ü�� �ִ´�.(new Actionlistner(){};)
		
		//â�� ������ �޼ҵ�
		frame.addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            frame.dispose();
	         }
	    });
		
		frame.setSize(500, 300);//ù��° �Ű����� : x, �ι�° �Ű����� : y
	    frame.setVisible(true);//â�� ���̰� �Ҳ���?
	    tf.requestFocus();//�Է��ϴ� ���� Ŀ���� �����̰� �ϱ�
	}

	@Override//ActionListener�� �߻� �޼ҵ�
	public void actionPerformed(ActionEvent e) {
		try {
			String msg = tf.getText();//���ڷ� �޾ƿ´�. set���� ������ ������
			ta.append(msg+"\n");
			if(msg.equals("exit")) {
				ta.append("bye");
				stop = true;//run()���� while()�� ����ȴ�.
					dos.close();
					s1.close();
					System.exit(0);
			}else {
				dos.writeUTF("���� : "+msg);
				tf.setText("");//ä���� ġ�� �Է��� �ǰ� ä���Է����� ������� ��
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChattingServer();
	}
}
