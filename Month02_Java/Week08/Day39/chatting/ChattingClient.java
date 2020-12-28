package chatting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChattingClient extends Thread implements ActionListener{
	Frame frame;
	TextArea ta;
	TextField tf;
	TextField tf2;
	Dialog dialog;//���â���� �׷� â ���°�, �޽���â ������ ���°�
	Label label;//�Ͼ� ��ȭ�� ����, �۾����� �ؽ�Ʈ�� �����°�
	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;
	String host;
	
	public ChattingClient() {
		launchFrame();//ä��ȭ�� ����
	}
	
	
	
	private void launchFrame() {
		frame = new Frame("�ϴ��� ä�� Ŭ���̾�Ʈ �κ�");//�Ű������� �ִ� ������ ���α׷��̸��κ� ����, x��ư �ִ� �� �̸�
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.PINK);
		ta.setEditable(false);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		//â�� ������ �޼ҵ�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		frame.setSize(500, 300);
		frame.setVisible(true);
		tf.requestFocus();//�Է��ʿ� Ŀ���� �����̰� �ϴ� ��
		
		dialog = new Dialog(frame, "����IP", true);
		label = new Label("������ ���� IP �ּҸ� �Է��ϼ���");
		//�󺧿��� �̹���, ���� �� ���������� �� �� ����
		
		tf2 = new TextField(15);//�Ű������� ������ ����, �׳� �������� �ؽ�Ʈ�ʵ��� ����
								//�Ѿ�� ��©������ ������ ���� ���� 15��
		
		dialog.add(label, BorderLayout.NORTH);//�󺧿� ���� ����
		dialog.add(tf2, BorderLayout.CENTER);//ä���Է�â
		tf2.addActionListener(this);//�̺�Ʈó��
		dialog.pack();
		dialog.show();//dialog�� ȭ�鿡 ��
		
		service(host);//�����ϴ� �κ� ȣ��
		tf2.requestFocus();
		
	}

	//�����ϴ� �޼ҵ�
	private void service(String host) {
		try {
			s1 = new Socket(host, 5432);
			dis = new DataInputStream(s1.getInputStream());
			dos = new DataOutputStream(s1.getOutputStream());
			ta.append("���� �Ϸ�...\n");
			this.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	//ä���� �� �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		if(tf==e.getSource()) {
			String msg = tf.getText();
			ta.append(msg+"\n");
			if(msg.equals("exit")) {
				try {
					ta.append("bye");
					stop = true;
					dos.close();
					s1.close();
					System.exit(0);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else {
				try {
					dos.writeUTF("���� : "+msg);
					tf.setText("");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}else if(tf2==e.getSource()){
			host = tf2.getText().trim();
			if(host.equals("")) {
				host = "localhost";
			}
			dialog.dispose();//dialog â�� �����ִ� ��
		}
	}
	
	@Override
	public void run() {
		System.out.println("Thread Start...\n");
		while(!stop) {
			try {
				ta.append(dis.readUTF()+"\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			dis.close();
			s1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChattingClient();
	}
}
