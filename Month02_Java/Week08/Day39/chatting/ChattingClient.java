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
	Dialog dialog;//경고창같은 그런 창 띄우는거, 메시지창 같은거 띄우는거
	Label label;//하얀 도화지 한장, 글씨같은 텍스트가 나오는거
	Socket s1;
	DataOutputStream dos;
	DataInputStream dis;
	boolean stop;
	String host;
	
	public ChattingClient() {
		launchFrame();//채팅화면 띄우기
	}
	
	
	
	private void launchFrame() {
		frame = new Frame("일대일 채팅 클라이언트 부분");//매개변수로 넣는 문구는 프로그램이름부분 설정, x버튼 있는 쪽 이름
		ta = new TextArea();
		tf = new TextField();
		frame.setBackground(Color.PINK);
		ta.setEditable(false);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		//창이 꺼지는 메소드
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		
		frame.setSize(500, 300);
		frame.setVisible(true);
		tf.requestFocus();//입력쪽에 커서가 깜빡이게 하는 것
		
		dialog = new Dialog(frame, "서버IP", true);
		label = new Label("접속할 서버 IP 주소를 입력하세요");
		//라벨에는 이미지, 문자 등 여러가지가 들어갈 수 있음
		
		tf2 = new TextField(15);//매개변수는 지정된 길이, 그냥 보여지는 텍스트필드의 길이
								//넘어가도 안짤리지만 가지고 들어가는 값은 15개
		
		dialog.add(label, BorderLayout.NORTH);//라벨에 적은 문구
		dialog.add(tf2, BorderLayout.CENTER);//채팅입력창
		tf2.addActionListener(this);//이벤트처리
		dialog.pack();
		dialog.show();//dialog가 화면에 뜸
		
		service(host);//연결하는 부분 호출
		tf2.requestFocus();
		
	}

	//연결하는 메소드
	private void service(String host) {
		try {
			s1 = new Socket(host, 5432);
			dis = new DataInputStream(s1.getInputStream());
			dos = new DataOutputStream(s1.getOutputStream());
			ta.append("접속 완료...\n");
			this.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	//채팅할 때 이벤트 처리
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
					dos.writeUTF("서버 : "+msg);
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
			dialog.dispose();//dialog 창을 내려주는 것
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
